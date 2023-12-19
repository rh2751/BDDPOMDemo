package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	
	@FindBy(css = "input[data-test='firstName']")
	WebElement firstName;
	
	@FindBy(css = "input[data-test='lastName']")
	WebElement lastName;
	
	@FindBy(css = "input[data-test='postalCode']")
	WebElement postalCode;
	
	@FindBy(id = "continue")
	WebElement contBtn;
	
	@FindBy(css = "div.checkout_summary_container")
	WebElement chkoutSummary;
	
	@FindBy(id = "finish")
	WebElement finBtn;
	
	@FindBy(css = "div.checkout_complete_container")
	WebElement chkoutComplete;
	
	//Actions
	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//enter & submit info
	public void submitInfo(String fname, String lname, String pcode) {
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		postalCode.sendKeys(pcode);
		contBtn.click();
	}
	
	//verify checkout Summary page
	public boolean onchkoutSummary() {
		return chkoutSummary.isDisplayed();
	}
	
	//complete order
	public void submitOrder() {
		finBtn.click();
	}
	
	//verify order complete
	public boolean orderComplete() {
		return chkoutComplete.isDisplayed();
	}

}
