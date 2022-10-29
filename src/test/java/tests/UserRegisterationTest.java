package tests;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;
import pages.HomePage;
import pages.UserLoginPage;
import pages.UserRegisterationPage;

public class UserRegisterationTest extends testBase{
	
	HomePage hpage;
	UserRegisterationPage upage;
	UserLoginPage lpage;
	
	
	@DataProvider(name="excel")
	public Object[][] UserRegisterData() throws IOException
	{
		ExcelReader er=new ExcelReader();
		return er.getExcellData();
		
	}
	
	
	@Test(dataProvider = "excel")
	public void UserCanRegister(String fname,String lname,String mail,String pass,String cpass) throws InterruptedException
	{
		hpage=new HomePage(driver);
		upage=new UserRegisterationPage(driver);
		lpage=new UserLoginPage(driver);
		hpage.PressOnMyaccount();
		hpage.PressOnRegister();
		upage.userRegister(fname,lname,mail,pass,cpass);
		Thread.sleep(2000);
		System.out.println("messgae qual "+upage.mess.getText());
		assertTrue(upage.mess.getText().contains("MY DASHBOARD"));
		
		hpage.PressOnMyaccount();
		hpage.PressOnLogout();
		
		hpage.PressOnMyaccount();
		hpage.PressOnLogin();
		lpage.UserLogin(mail,pass);
		assertTrue(upage.mess.getText().contains("MY DASHBOARD"));
		
		hpage.PressOnMyaccount();
		hpage.PressOnLogout();
		
	}
	

	
	

}
