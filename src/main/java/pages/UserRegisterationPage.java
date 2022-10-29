package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegisterationPage extends pageBase {

	public UserRegisterationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "firstname")
	WebElement fname;
	
	@FindBy(id = "lastname")
	WebElement lname;
	
	@FindBy(id = "email_address")
	WebElement mail;
	
	@FindBy(id = "password")
	WebElement pass;
	
	@FindBy(id = "confirmation")
	WebElement cpass;
	
	@FindBy(xpath = "//button[@title='Register']")
	WebElement reg;
	
	@FindBy(tagName = "h1")
	public WebElement mess;
	
	public void userRegister(String firstn,String lastn,String email,String password,String cpassword)
	{
		SetElement(fname, firstn);
		SetElement(lname, lastn);
		SetElement(mail, email);
		SetElement(pass, password);
		SetElement(cpass, cpassword);
		clickElement(reg);
	}

}
