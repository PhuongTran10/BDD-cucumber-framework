package nopCommerce.stepDefinitions;

import commons.BasePage;
import commons.PageGeneratorManager;
import cucumberOptions.Hooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.nopCommerce.user.UserHomePageObject;
import pageObjects.nopCommerce.user.UserRegisterPageObject;
import utilities.DataHelper;

public class RegisterPageSteps {
    WebDriver driver;
    static String username, pass;
    static String email;
    DataHelper dataTest;
    UserHomePageObject homePage;
    UserRegisterPageObject registerPage;
    BasePage commonPage;

    public RegisterPageSteps() {
        this.driver = Hooks.openAndQuitBrowser();
        homePage = PageGeneratorManager.getUserHomePage(driver);
        homePage.clickToRegisterLink();
        registerPage = PageGeneratorManager.getUserRegisterPage(driver);
        commonPage = BasePage.getBasePageObject();
        dataTest = DataHelper.getDataHelper();
        email = dataTest.getEmailAddress();
        pass = dataTest.getPassword();
    }

    @When("Input to First name")
    public void inputToFirstName() {
        registerPage.inputToFirstnameTextbox(dataTest.getFirstName());
    }

    @When("Input to Last name")
    public void inputToLastName() {
        registerPage.inputToLastnameTextbox(dataTest.getLastName());
    }

    @When("Input to Email")
    public void inputToEmail() {
        registerPage.inputToEmailTextbox(email);
    }

    @When("Input to Password")
    public void inputToPassword() {
        registerPage.inputToPasswordTextbox(pass);
    }

    @When("Input to Confirm password")
    public void inputToConfirmPassword() {
        registerPage.inputToConfirmPasswordTextbox(pass);
    }

    @When("Click to Register button")
    public void clickToRegisterButton() {
        registerPage.clickToRegisterButton();
    }

    @Then("Registration completed message displayed")
    public void registrationCompletedMessageDisplayed() {
        registerPage.getRegisterSuccessMessage();
    }

    @When("Input to {string} textbox with value {string}")
    public void inputToTextboxWithValue(String fieldID, String value) {
        if(fieldID.equalsIgnoreCase("Email")){
            value = email;
        } else if(fieldID.equals("Password")){
            pass = value;
        }
        commonPage.inputToTextboxByID(driver, value, fieldID);
    }

    @When("Click to {string} button")
    public void clickToButton(String buttonText) {
        commonPage.clickToButtonByText(driver, buttonText);
    }

}
