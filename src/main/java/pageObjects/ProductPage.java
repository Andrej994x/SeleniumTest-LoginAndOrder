package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ProductPage extends BasePage {

	public WebDriver driver;

	By ProductOne = By.xpath("/html//div[@id='inventory_container']/div/div[@id='inventory_container']/div/div[1]/div[@class='inventory_item_img']/a[@href='#']/img[@alt='Sauce Labs Backpack']");
	By ProductTwo = By.xpath("/html//div[@id='inventory_container']/div/div[@id='inventory_container']/div/div[2]/div[@class='inventory_item_img']/a[@href='#']/img[@alt='Sauce Labs Bike Light']");
	By ProductThree = By.xpath("/html//div[@id='inventory_container']/div/div[@id='inventory_container']/div/div[3]/div[@class='inventory_item_img']/a[@href='#']/img[@alt='Sauce Labs Bolt T-Shirt']");
	By ProductFour = By.xpath("/html//div[@id='inventory_container']/div/div[@id='inventory_container']/div/div[4]/div[@class='inventory_item_img']/a[@href='#']/img[@alt='Sauce Labs Fleece Jacket']");
	By ProductFive = By.xpath("/html//div[@id='inventory_container']/div/div[@id='inventory_container']/div/div[5]/div[@class='inventory_item_img']/a[@href='#']/img[@alt='Sauce Labs Onesie']");
	By ProductSix = By.xpath("/html//div[@id='inventory_container']/div/div[@id='inventory_container']/div/div[6]/div[@class='inventory_item_img']/a[@href='#']/img[@alt='Test.allTheThings() T-Shirt (Red)']");
	By CartIcon = By.cssSelector(".shopping_cart_badge");
	
	
	public ProductPage() throws IOException {
		super();
	}

	public WebElement getProductOne() throws IOException {
		this.driver = getDriver();
		return driver.findElement(ProductOne);
	}

	public WebElement getProductTwo() throws IOException {
		this.driver = getDriver();
		return driver.findElement(ProductTwo);
	}

	public WebElement getProductThree() throws IOException {
		this.driver = getDriver();
		return driver.findElement(ProductThree);
	}

	public WebElement getProductFour() throws IOException {
		this.driver = getDriver();
		return driver.findElement(ProductFour);
	}

	public WebElement getProductFive() throws IOException {
		this.driver = getDriver();
		return driver.findElement(ProductFive);

	}

	public WebElement getProductSix() throws IOException {
		this.driver = getDriver();
		return driver.findElement(ProductSix);
	}
	public WebElement getCartIcon() throws IOException {
		this.driver = getDriver();
		return driver.findElement(CartIcon);
	}
	
	

}
