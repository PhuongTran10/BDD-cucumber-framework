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
    public LoginPageSteps(){
        this.driver = Hooks.openAndQuitBrowser();
        loginPage = PageGeneratorManager.getUserLoginPage(driver);
    }

    @When("Submit valid infor to login form")
    public void submitValidInforToLoginForm() {
System.out.println(RegisterPageSteps.email+RegisterPageSteps.pass);
        loginPage.loginAsUser(RegisterPageSteps.email,RegisterPageSteps.pass);
    }


}
