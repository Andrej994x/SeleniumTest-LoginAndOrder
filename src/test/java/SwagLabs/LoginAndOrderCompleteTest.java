package SwagLabs;

import java.io.IOException;


import org.testng.Assert;

import org.testng.annotations.Test;


import base.Hooks;
import pageObjects.CheckOut_InformationPage;
import pageObjects.CheckOut_OverView;
import pageObjects.LoginPage;
import pageObjects.ProductDetails;
import pageObjects.ProductPage;
import pageObjects.ReviewOrderBeforeCheckOut;

public class LoginAndOrderCompleteTest extends Hooks {

	public LoginAndOrderCompleteTest() throws IOException {
		super();
		
	}
		
	
	
	@Test
	public void endToEndTest() throws InterruptedException, IOException {
		LoginPage login = new LoginPage();
		login.getUserName().sendKeys("standard_user"); 
		Thread.sleep(200);
		login.getPassword().sendKeys("secret_sauce");
		Thread.sleep(200);
		login.getloginBtn().click();
		Thread.sleep(200);
		
		//Select product and move to cart
		ProductPage product = new ProductPage();
		ProductDetails details = new ProductDetails();
		product.getProductOne().click();
		
		Thread.sleep(2000);
		details.getAddToCardProdOne().click();
		
		
		details.getBackBtnToShopPage().click();
		Thread.sleep(2000);
		product.getProductTwo().click();
		Thread.sleep(2000);
		details.getAddToCarProdTwo().click();
		details.getBackBtnToShopPage().click();
		Thread.sleep(2000);
		
		product.getProductThree().click();
		Thread.sleep(2000);
		details.getAddToCartProdThree().click();
		Thread.sleep(2000);
		details.getBackBtnToShopPage().click();
		Thread.sleep(2000);
		product.getCartIcon().click();
		Thread.sleep(2000);
		
		//Remove product from cart
		
		ReviewOrderBeforeCheckOut removeProd = new ReviewOrderBeforeCheckOut();
		removeProd.getRemoveFromCartProdThree().click();
		Thread.sleep(2000);
		removeProd.getCheckOutBtn().click();
		Thread.sleep(2000);

		
		//Information part
		CheckOut_InformationPage info = new CheckOut_InformationPage();
		
		info.getFirstName().sendKeys("Andrej");
		Thread.sleep(200);
		info.getLastName().sendKeys("Nestorov");
		Thread.sleep(200);
		info.getPostalCode().sendKeys("1060");
		Thread.sleep(200);
		info.getContinueBtn().click();
		Thread.sleep(200);
		
		//Checkout overview
		
		CheckOut_OverView pay = new CheckOut_OverView();
		System.out.println(pay.getTotalAmount().getText());
		Assert.assertEquals(pay.getTotalAmount().getText(), "Total: $43.18");
		
		
		
		pay.getFinishOrderBtn().click();
		Thread.sleep(2000);
		
		
	
		
		
		
		

		
		
		
	}



	
}
