package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	@FindBy(css = "div.cart_item")
	WebElement cartList;
	
	@FindBy(id = "remove-sauce-labs-backpack")
	WebElement rmvBtn;
	
	@FindBy(css = "button[data-test='continue-shoping']")
	WebElement contBtn;
	
	@FindBy(css = "button[data-test='checkout']")
	WebElement chkoutBtn;
	
	//Actions
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//verify element is added
	public boolean isItemAdded() {
		return cartList.isDisplayed();
	}
	
	//remove item
	
	//continue shopping
	
	//checkout
	public void chkoutItems() {
		chkoutBtn.click();
	}

}
