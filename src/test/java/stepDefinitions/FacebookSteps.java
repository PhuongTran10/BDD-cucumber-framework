package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class FacebookSteps {
    private WebDriver driver;

    @Before("@datatable")
    public void open_facebook_application() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }

    @After("@datatable")
    public void close_application() {
        driver.quit();
    }

    @Then("Verify email textbox is displayed")
    public void verify_email_textbox_is_displayed() {
        Assert.assertTrue(driver.findElement(By.xpath("//input[@name='email']")).isDisplayed());
    }

    @Then("Input to Username textbox")
    public void input_to_username_textbox() {
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("automationtest@gmail.com");
    }

    @Then("Verify password textbox is displayed")
    public void verify_password_textbox_is_displayed() {
        Assert.assertTrue(driver.findElement(By.xpath("//input[@name='pass']")).isDisplayed());
    }

    @Then("Input to Username textbox with {string}")
    public void input_to_username_textbox_with(String email) {
        driver.findElement(By.xpath("//input[@name='email']")).clear();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
    }

    @Then("Input password textbox with {string}")
    public void input_password_textbox_with(String password) {
        driver.findElement(By.xpath("//input[@name='pass']")).clear();
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
    }

    @Then("Input to Username textbox with automationtest@gmail.com")
    public void input_to_username_textbox_with_automationtest_gmail_com() {
        driver.findElement(By.xpath("//input[@name='email']")).clear();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("automationtest@gmail.com");
    }

    @Then("Input password textbox with {int}")
    public void input_password_textbox_with(Integer password) {
        driver.findElement(By.xpath("//input[@name='pass']")).clear();
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password.toString());
    }

    @Then("Input to Username textbox with {string} and password textbox with {string}")
    public void inputToUsernameTextboxWithAndPasswordTextboxWith(String email, String password) {
        driver.findElement(By.xpath("//input[@name='email']")).clear();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@name='pass']")).clear();
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
    }

    @Then("^Input to password textbox$")
    public void inputToPasswordTextbox(DataTable dataTable) {
        driver.findElement(By.xpath("//input[@name='pass']")).clear();
//        List<Map<String, String>> customer = dataTable.asMaps(String.class, String.class);
//        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(customer.get(0).get("Password"));
        for (Map<String, String> loginInfor : dataTable.asMaps(String.class, String.class)) {
            driver.findElement(By.xpath("//input[@name='pass']")).clear();
            driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(loginInfor.get("Password"));
        }
    }

    @Then("Click to Submit button")
    public void click_to_submit_button() {
        driver.findElement(By.name("login")).click();
    }


}
