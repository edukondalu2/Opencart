package testCases;



import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {


	@Test(groups= {"sanity","master"})
	public void verify_accountRefistration()  {
		
		logger.info("****** stating TC001_AccountRegistrationTest ******");
		try
		{
				HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		
		logger.info("clicked on myaccount link");
		hp.clickRegister();
		logger.info("clicked on register");
		
		AccountRegistrationPage rp=new AccountRegistrationPage(driver);
		logger.info("providing customer details");
		rp.setFirstname(randomString());
		rp.setLastname(randomString());
		rp.setEmail(randomString()+"@gamil.com");
		rp.setPhonenumber(randomNumber()); 
		
		String  pwd=randomPassword();
		rp.setPassword(pwd);
		rp.setconformPassword(pwd);
		rp.setPrivoicypolicy();
		rp.clickbtnContinue();
		
		logger.info("validating expected message");
	String confmsg=	rp.getConformationMsg();
	Assert.assertEquals(confmsg,"Your Account Has Been Created!");
	
		}
		catch (Exception e){
			logger.error(" Test failed");
			logger.debug("debug logs");
			Assert.fail();
			
		}
		logger.info("****** finished TC001_AccountRegistrationTest ******");
	}
	
}
