package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//input[@id='input-firstname']
	//input[@id='input-lastname']
	//input[@id='input-email']
	//input[@id='input-telephone']
	//input[@id='input-password']
	//input[@id='input-confirm']
	//label[normalize-space()='Yes']
	//input[@name='agree']
	//input[@value='Continue']
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtFirstname; 
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtLastname;
	@FindBy(xpath="//input[@id='input-email']")	
	WebElement txtEmail;
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txtPhone;
	@FindBy(xpath="//input[@id='input-password']")	
	WebElement txtPassword;
	@FindBy(xpath="//input[@id='input-confirm']")	
	WebElement txtConformpassword;
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkPolicy;
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnContinue;
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConformations;
	
	public void setFirstname(String fname) {
		txtFirstname.sendKeys(fname);
	}
	public void setLastname(String lname) {
		txtLastname.sendKeys(lname);
	}
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	public void setPhonenumber(String phone) {
		txtPhone.sendKeys(phone);
	}
	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
	public void setconformPassword(String password)
	{
		txtConformpassword.sendKeys(password);
	}
	public void setPrivoicypolicy() {
		chkPolicy.click();
		
		
	}
	
	public void clickbtnContinue() {
		//sol1
		btnContinue.click();
		//sol2
		//btnContinue.submit();
		
		//sol3
		//Actions act=new Actions(driver);
		//act.movieToelement(btnContinue).click().perform();
		
		//sol4
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("argument[0]".click();",btnContinue);
		
		//sol5
		//btncontinue.sendKeys(keys.RETURN);
		
		//sol6
		//WebDriverWait mywait=new WebDriverWait(driver,Duration.ofseconds(10));
		//mywait.unnit(ExcpectedConditions.elementToBeClcikable(btnContinue.click();
		
	}
	public String getConformationMsg() {
		try {
			return (msgConformations.getText());
			
		}
		catch(Exception e) {
			return (e.getMessage());
			
		}
	}
	

}
