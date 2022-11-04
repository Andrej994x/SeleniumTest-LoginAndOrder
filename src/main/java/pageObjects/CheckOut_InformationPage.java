package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class CheckOut_InformationPage extends BasePage {
		
	public WebDriver driver;
	
	
	By FirstName = By.cssSelector("input#first-name");
	By LastName = By.cssSelector("input#last-name");
	By PostalCode = By.cssSelector("input#postal-code");
	By CancelBtn = By.cssSelector("button#cancel");
	By ContinueBtn = By.cssSelector("input#continue");
	
	
	public CheckOut_InformationPage() throws IOException {
		super();
	}
	
	public WebElement getFirstName() throws IOException {
		this.driver = getDriver();
		return driver.findElement(FirstName);
	}
	
	public WebElement getLastName() throws IOException {
		this.driver = getDriver();
		return driver.findElement(LastName);
	}
	
	public WebElement getPostalCode() throws IOException {
		this.driver = getDriver();
		return driver.findElement(PostalCode);
	}
	public WebElement getCancelBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(CancelBtn);
	}
	public WebElement getContinueBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(ContinueBtn);
	}
}
