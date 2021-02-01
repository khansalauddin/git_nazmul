package baseTest;

import javax.swing.Spring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import page.Login;

public class LoginTest extends Base{
	 WebDriver driver;
	 Login login;
	 Base base;
	
	@BeforeMethod
	public void loginsetup() {
		base = new Base();
		driver=base.getMontro2("chrome");
		login =new Login(driver);
	
		
	}
	@Test(priority=4)
	public void signin() {
		login.getLogin();
		
		
	}
	@Test(priority=1)
	public void verifylogoTest() {
		login.verifylogo();
		Assert.assertEquals(login.verifylogo(), true);
	}
	@Test(priority=2)
	public void title() {
		
		Assert.assertEquals(login.getTitle(), "WildFire Cart");
		}
	@Test(priority=3)
	public void cetagory () {
	;
	Assert.assertEquals(login.getaccessorioce(),"ACCESSORIES");
		
	}
	
	
	  @AfterMethod
	  public void quit() {
		  driver.quit();
	  }
	   
}
