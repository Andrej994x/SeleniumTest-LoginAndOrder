package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class CheckOut_OverView extends BasePage {
	
	public WebDriver driver;
	
	By CancelBtn = By.cssSelector("[name='cancel']");
	By FinishOrderBtn = By.cssSelector("[name='finish']");
	By TotalAmount = By.cssSelector("div.summary_total_label");
	//By TotalAmount = By.xpath("//div[contains(@class,\"summary_total_label\")]]");
	
	
	
	
	public CheckOut_OverView() throws IOException {
		super();
	}
	
	public WebElement getCancelBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(CancelBtn);
	}
	
	public WebElement getFinishOrderBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(FinishOrderBtn);
	}
	
	public WebElement getTotalAmount() throws IOException {
		this.driver = getDriver();
		return driver.findElement(TotalAmount);
		
		
		
	}
	
	
}
