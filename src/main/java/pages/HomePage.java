package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends pageBase{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath  = "//span[@class='label'][normalize-space()='Account']")
	WebElement account;
	
	@FindBy(linkText = "Register")
	WebElement register;
	
	@FindBy(linkText = "Log Out")
	WebElement logout;
	
	@FindBy(linkText = "Log In")
	WebElement login;
	
	public void PressOnLogin()
	{
		clickElement(login);
	}
	
	public void PressOnMyaccount()
	{
		clickElement(account);
	}
	
	public void PressOnRegister()
	{
		clickElement(register);
	}
	
	public void PressOnLogout()
	{
		clickElement(logout);
	}

}
