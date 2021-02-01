package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;

public class Login extends Base {
	//WebDriver driver;
	  public Login(WebDriver driver) {
		this.driver=driver;
		
	}

	By loginBtn=By.id("dLabellogin");
	   By userName= By.id("username");
	   By passWord= By.id("password");
	   By loginButton= By.id("jqLogin");
	   By logo = By.xpath("//img[@class='img-responsive']");
	   By signup = By.id("jqSignup");
	   By acces =By.xpath("(//div[@id='category_list']/a)[1]");
	   
	   public void getLogin() {
		   driver.findElement(loginBtn).click();
		   driver.findElement(userName).sendKeys("tuhin2020");
		   driver.findElement(passWord).sendKeys("xyz123");
		   driver.findElement(loginButton).click();
	   }
	   public boolean verifylogo() {
		  return  driver.findElement(logo).isDisplayed();
		 		
	   }
	   public String getaccessorioce() {
		  String str= driver.findElement(acces).getText();
		  System.out.println(str);
		  return str;
		
	   }
	   
	   public String getTitle() {
		   String text = driver.getTitle();
		   System.out.println(text);
		   return text;
		   
		   
	   }
	   
	   
	   
	   
	   
	   
	   
	   public void Chaining() {
		   driver.findElement(loginButton).click();
		   driver.findElement(signup).click();
		   new Registration (driver);
	   }
	   
	   
}
