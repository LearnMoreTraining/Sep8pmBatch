package stepdefinationfile;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.tr.Ama;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pageobjects.AmazonHomePage;
import pageobjects.AmazonSignInPage;
import pageobjects.BookSpiceHomePage;
import resuable.BaseCode;

public class AmazonSteps extends BaseCode {

    @Given("user should navigate to url")
    public void launchUrl(){

        BaseCode.browserInvocation();
    }


    @When("user enter the search keyword {string} and click on search icon")
    public void enterSearchKeyword(String keyword) {

        AmazonHomePage.enterSearchKeyword(keyword);
        AmazonHomePage.clickSearchButton();

    }

    @Then("user validate the message")
    public void validateMessage() {

    }


    @When("user clicks the login button on homepage")
    public void clicklogin() {

        AmazonHomePage.clickSignInButton();

    }

    @And("user enter the credi")
    public void userEnterTheCredi() {

        AmazonSignInPage.enterMailId("an.aravinth22@gmail.com");
        AmazonSignInPage.clickContinueButton();
        AmazonSignInPage.enterPassword("1234");
        AmazonSignInPage.clickSignIn();



    }

    @When("user selects the value from category dropdown")
    public void selectCategaory() {

        AmazonHomePage.handelByValue("");
        for(int i =0 ; i < AmazonHomePage.getDropdownSize() ; i++){
          String val =  AmazonHomePage.getDropdownValues(i);
            System.out.println(val);
        }

    }

    @Given("user selects the value from from and to dropdown")
    public void userSelectsTheValueFromFromAndToDropdown() {

        driver.findElement(By.xpath("//span[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXTaction']/following-sibling::input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']")).click();
        BookSpiceHomePage.selectValueFromDropdown(2,2);
    }

    @Given("user clicks the baby wishlist")
    public void userClicksTheBabyWishlist() {

        WebElement signInElement = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions a = new Actions(driver);
        a.clickAndHold(signInElement).build().perform();
        driver.findElement(By.linkText("Baby Wishlist")).click();
      //  driver.findElement(By.partialLinkText("aby Wish")).click();

    }

    @Then("verify whether the user naviages to baby wishlist page")
    public void verifyWhetherTheUserNaviagesToBabyWishlistPage() {

        Assert.assertEquals(": Baby Wish List",driver.getTitle());
        if(driver.getTitle().equals(": Baby Wish List")){

            Assert.assertTrue(true);
        }
        else{

            Assert.assertTrue(false);
        }
    }


}
