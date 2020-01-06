package com.zerobank.stepdefinition;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginStepDefinition {


    @Given("the User is on the login page")
    public void the_User_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        LoginPage loginPage = new LoginPage();
        loginPage.signIn.click();
    }

    @When("User logs in with valid credentials")
    public void user_logs_in_with_valid_credentials() {
        LoginPage loginPage = new LoginPage();
        BrowserUtils.waitFor(1);
        loginPage.userName.sendKeys("username");
        loginPage.password.sendKeys("password");
        loginPage.submit.click();
        WebElement error = Driver.get().findElement(By.xpath("//*[@id=\"login_form\"]/div[1]"));
        if (! loginPage.userName.equals("username") && ! loginPage.password.equals("password")){
            Assert.assertEquals( "Login and/or password are wrong.", error );
        }

    }

    @Then("Account summary page should be displayed")
    public void account_summary_page_should_be_displayed() {

    }

}
