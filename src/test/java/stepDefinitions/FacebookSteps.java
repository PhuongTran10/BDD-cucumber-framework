package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FacebookSteps {
    private WebDriver driver;
    @Given("Open facebook application")
    public void open_facebook_application() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }
    @Then("Verify email textbox is displayed")
    public void verify_email_textbox_is_displayed() {
        Assert.assertTrue(driver.findElement(By.xpath("//input[@name='email']")).isDisplayed());
    }
    @Then("Verify password textbox is displayed")
    public void verify_password_textbox_is_displayed() {
        Assert.assertTrue(driver.findElement(By.xpath("//input[@name='pass']")).isDisplayed());
    }
    @Then("Close application")
    public void close_application() {
        driver.quit();
    }
}
