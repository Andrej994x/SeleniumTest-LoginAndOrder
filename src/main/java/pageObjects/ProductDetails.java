package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ProductDetails extends BasePage {
		
	public WebDriver driver;
	
	
	By AddToCartProdOne = By.cssSelector("[name='add-to-cart-sauce-labs-backpack']");
	By AddToCarProdTwo = By.cssSelector("[name='add-to-cart-sauce-labs-bike-light']");
	By AddToCartProdThree = By.cssSelector("[name='add-to-cart-sauce-labs-bolt-t-shirt']");
	By AddToCartProdFour = By.cssSelector("[name='add-to-cart-sauce-labs-fleece-jacket']");
	By AddToCartProdFive = By.cssSelector("[name='add-to-cart-sauce-labs-onesie']");
	By AddToCartProdSix = By.cssSelector("[name='add-to-cart-test\\.allthethings\\(\\)-t-shirt-\\(red\\)']");
	By BackBtnToShopPage = By.cssSelector("[name='back-to-products']");
	
	public ProductDetails() throws IOException {
		super();
	}
	
	
	
	public WebElement getAddToCardProdOne() throws IOException {
		this.driver = getDriver();
		return driver.findElement(AddToCartProdOne);
	}
	public WebElement getAddToCarProdTwo() throws IOException {
		this.driver = getDriver();
		return driver.findElement(AddToCarProdTwo);
	}
	
	public WebElement getAddToCartProdThree() throws IOException {
		this.driver = getDriver();
		return driver.findElement(AddToCartProdThree);
	}
	public WebElement getAddToCartProdFour() throws IOException {
		this.driver = getDriver();
		return driver.findElement(AddToCartProdFour);
	}
	public WebElement getAddToCartProdFive() throws IOException {
		this.driver = getDriver();
		return driver.findElement(AddToCartProdFive);
		
	}
	
	public WebElement getAddToCartProdSix() throws IOException {
		this.driver = getDriver();
		return driver.findElement(AddToCartProdSix);
		
	}
	
	
	public WebElement getBackBtnToShopPage() throws IOException {
		this.driver = getDriver();
		return driver.findElement(BackBtnToShopPage);
	}
}
