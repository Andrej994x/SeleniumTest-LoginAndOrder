package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ReviewOrderBeforeCheckOut extends BasePage {
		
	public WebDriver driver;
	
	By RemoveFromCartProdOne = By.cssSelector("[name='remove-sauce-labs-backpack']");
	By RemoveFromCartProdTwo = By.cssSelector("[name='remove-sauce-labs-bike-light']");
	By RemoveFromCartProdThree = By.cssSelector("[name='remove-sauce-labs-bolt-t-shirt']");
	By RemoveFromCartProdFour = By.cssSelector("[name='remove-sauce-labs-fleece-jacket']");
	By RemoveFromCartProdFive = By.cssSelector("[name='remove-sauce-labs-onesie']");
	By RemoveFrokCartProdSix = By.cssSelector("[name='remove-test\\.allthethings\\(\\)-t-shirt-\\(red\\)']");
	By BackToShopPage = By.cssSelector("[name='continue-shopping']");
	By CheckOutBtn = By.cssSelector("[name='checkout']");
		
		public  ReviewOrderBeforeCheckOut() throws IOException {
			super();
		}
		
		public WebElement getRemoveFromCartProdOne() throws IOException {
			this.driver = getDriver();
			return driver.findElement(RemoveFromCartProdOne);
		}
		
		public WebElement getRemoveFromCartProdTwo() throws IOException {
			this.driver = getDriver();
			return driver.findElement(RemoveFromCartProdTwo);
		}
		public WebElement getRemoveFromCartProdThree() throws IOException {
			this.driver = getDriver();
			return driver.findElement(RemoveFromCartProdThree);
		}
		
		public WebElement getRemoveFromCartProdFour() throws IOException {
			this.driver = getDriver();
			return driver.findElement(RemoveFromCartProdFour);
		}
		public WebElement getRemoveFromCartProdFive() throws IOException {
			this.driver = getDriver();
			return driver.findElement(RemoveFromCartProdFive);
		}
		public WebElement getRemoveFrokCartProdSix() throws IOException {
			this.driver = getDriver();
			return driver.findElement(RemoveFrokCartProdSix);
		}
		
		
		
		public WebElement getBackToShopPage() throws IOException {
			this.driver = getDriver();
			return driver.findElement(BackToShopPage);
		}
		public WebElement getCheckOutBtn() throws IOException {
			this.driver = getDriver();
			return driver.findElement(CheckOutBtn);
		}
		
		
}
