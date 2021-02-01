package page;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;

public class Registration extends Base {
	
	WebDriver driver;
	
	public Registration(WebDriver driver){
		this.driver=driver;
	}
	
		By loginBtn=By.id("dLabellogin");
		By signUpbtn=By.id("jqSignup"); 
		By email=By.id("txtEmail");
		By userName=By.id("txtUserName");
		By password = By.id("txtPassword");
		By conpassword=By.id("txtCnfPassword");
		By fname=By.id("txtFirstName");
		By lname=By.id("txtLastName");
		By address=By.xpath("(//input[@class='form-control'])[7]");
		By creatbtn = By.id("btnRegister");
		
		
		public void getLoginBtn() {
			WebDriverWait wait = new WebDriverWait(driver, 10); 
			wait.until(ExpectedConditions.presenceOfElementLocated(loginBtn)).click();
			//WebElement element=driver.findElement(loginBtn);
			
			
			
		}
		
		public void getRegiElement(String Email,String uname,String pass,
				String c_pass,String f_name,String l_name,String addr) {
			driver.findElement(signUpbtn).click();
		
			driver.findElement(email).sendKeys(Email);
			driver.findElement(userName).sendKeys(uname);
			driver.findElement(password).sendKeys(pass);
			driver.findElement(conpassword).sendKeys(c_pass);
			driver.findElement(fname).sendKeys(f_name);
			driver.findElement(lname).sendKeys(l_name);
			driver.findElement(address).sendKeys(addr);
			//driver.findElement(creatbtn).click();
			
			
		}

	

}
