package stepdefinationfile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.SalesForceLoginPage;
import resuable.BaseCode;

public class LoginSalesForceSteps {



    @And("user clicks the login button")
    public void clickLogin(){

      SalesForceLoginPage.clickLoginButton();
    }

    @Given("user navigates to salesforce application")
    public void lauchUrl(){

        BaseCode.browserInvocation();
    }


    @When("user enters the username {string} and password {string}")
    public void enterUserAndPassword(String a , String b){

        SalesForceLoginPage.enterUserName(a);
        SalesForceLoginPage.enterPassword(b);
    }

    @Then("user validate the error message")
    public void errorMessageValidation() {

        String expectedResult = "check your username and password. If you still can't log in, contact your Salesforce administrator.";

       // Assert.assertEquals(expectedResult,SalesForceLoginPage.getErrorMessage());

        if (SalesForceLoginPage.getErrorMessage().equals(expectedResult)){

            Assert.assertTrue(true);

        }else{

            Assert.assertFalse(true);

        }

    }

    @Then("user should navigate to homepage")
    public void homePageValidation() {

    }

    @Given("sample")
    public void sample() {
    }

    @When("demo")
    public void demo() {

    }
}
