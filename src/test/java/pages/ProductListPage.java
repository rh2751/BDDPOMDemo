package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListPage {
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	WebElement itemOne;
	
	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	WebElement itemTwo;
	
	@FindBy(id = "shopping_cart_container")
	WebElement cartIcon;
	
	@FindBy(xpath = "//span[contains(text(), 'Products')]")
	WebElement productTitle;
	
	//Actions
	public ProductListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//add to cart
	public void addToCart() {
		itemOne.click();
		itemTwo.click();
	}
	
	//view cart
	public void viewCart() {
		cartIcon.click();
	}
	
	//verify on checkout page
	public boolean isOnProducts() {
		return productTitle.isDisplayed();
	}

}
