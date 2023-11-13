package pageObjects.nopCommerce.user;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.nopCommerce.user.UserCustomerInforPageUI;

public class UserCustomerInforPageObject extends BasePage{
	private WebDriver driver;
	public UserCustomerInforPageObject(WebDriver driver) {
		this.driver = driver;
	}
	public boolean isCustomerInforHeaderDisplayed() {
		waitForElementVisible(driver, UserCustomerInforPageUI.CUSTOMER_INFOR_HEADER);
		return isElementDisplayed(driver, UserCustomerInforPageUI.CUSTOMER_INFOR_HEADER);		
	}
	
	
}
