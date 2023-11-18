package nopCommerce.stepDefinitions;

import commons.PageGeneratorManager;
import cucumberOptions.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.nopCommerce.user.UserLoginPageObject;
import pageObjects.nopCommerce.user.UserRegisterPageObject;

public class LoginPageSteps {

    WebDriver driver;
    UserLoginPageObject loginPage;
    TextContext testContext;
    String email, pass;

    public LoginPageSteps(TextContext testContext) {
        this.driver = Hooks.openAndQuitBrowser();
        this.testContext = testContext;
        loginPage = PageGeneratorManager.getUserLoginPage(driver);
        email = (String) testContext.getDataContext().getContext(Context.EMAIL);
        pass = (String) testContext.getDataContext().getContext(Context.PASSWORD);
    }

    @When("Submit valid infor to login form")
    public void submitValidInforToLoginForm() {
        System.out.println(pass);
        loginPage.loginAsUser(email, pass);
    }


}
