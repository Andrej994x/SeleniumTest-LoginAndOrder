package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class LoginPage extends BasePage {
		
	public WebDriver driver;
	
	By UserName = By.cssSelector("input#user-name");
	By Password = By.cssSelector("#password");
	By loginBtn = By.cssSelector("[name='login-button']");
	
	public LoginPage() throws IOException {
	
	super();
	
	}
	
	 public WebElement getUserName() throws IOException {
		 this.driver = getDriver();
		 return driver.findElement(UserName);
	 }
	 
	 public WebElement getPassword() throws IOException {
		 this.driver = getDriver();
		 return driver.findElement(Password);
	 }
	 
	 public WebElement getloginBtn() throws IOException {
		 this.driver = getDriver();
		 return driver.findElement(loginBtn);
	 }
	
}
