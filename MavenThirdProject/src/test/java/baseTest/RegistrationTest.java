package baseTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;
import page.Login;
import page.Registration;

public class RegistrationTest extends Base{
	
	WebDriver driver;
	Base base;
	Registration Res;
	
	
	

	@BeforeTest
	public void loginsetup() {
		base = new Base();
		driver=base.getMontro2("chrome");
		Res =new Registration(driver);
}	
	
  
  @Test
  public void regis() {
	
	 Random random = new Random();
	 int rm =random.nextInt(200);
	 int rdm = random.nextInt(300);
	  
	Res.getLoginBtn();
	Res.getRegiElement("abcd112"+rm+"@gmail.com", "Tuhin120"+rdm, "abcd1230", "abcd1230","Tuhin", "Khan","NewYork");
	
	  
  }
  
   @AfterTest
  public void close() {
  driver.quit();
  }
  
}
