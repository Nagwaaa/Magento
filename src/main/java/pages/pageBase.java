package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class pageBase {
	
	public static WebDriver driver;
	public pageBase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickElement(WebElement ele)
	{
		ele.click();
	}

	public void SetElement(WebElement ele,String txt)
	{
		ele.sendKeys(txt);
	}
}
