package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserLoginPage extends pageBase{

	public UserLoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "email")
	WebElement mail;
	
	@FindBy(id = "pass")
	WebElement password;
	
	@FindBy(id = "send2")
	WebElement login;
	
	

	public void UserLogin(String mal,String pass)
	{
		SetElement(mail, mal);
		SetElement(password, pass);
		clickElement(login);
	}
}
