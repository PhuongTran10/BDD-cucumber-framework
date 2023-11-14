package nopCommerce.stepDefinitions;

import commons.PageGeneratorManager;
import cucumberOptions.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import nopCommerce.HomePageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.nopCommerce.user.UserHomePageObject;
import pageObjects.nopCommerce.user.UserLoginPageObject;

public class HomePageSteps {
    WebDriver driver;
    UserHomePageObject homePage;
    public HomePageSteps(){
        this.driver = Hooks.openAndQuitBrowser();
        homePage = PageGeneratorManager.getUserHomePage(driver);
    }
    @When("Click to Login link")
    public void clickToLoginLink() {
        homePage.clickToLoginLink();
    }
    @Then("Home page displayed")
    public void homePageDisplayed() {
        Assert.assertTrue(homePage.isMyAccountLinkDisplayed());
    }

}
