package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import resuable.BaseCode;

public class AmazonHomePage extends BaseCode {

    private static WebElement categoryElement =  driver.findElement(By.id("searchDropdownBox"));
    public static void enterSearchKeyword(String productName){

         driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);
    }

    public static void clickSearchButton(){

        driver.findElement(By.id("nav-search-submit-button")).click();

    }

    public static void clickSignInButton(){

        driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();

        driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();

    }

    public static void handelByIndex(int indexValue){
        Select category = new Select(categoryElement);
        category.selectByIndex(indexValue);
    }

    public static void handelByValue(String value){
        Select category = new Select(categoryElement);
        category.selectByValue(value);
    }

    public static int getDropdownSize(){

      int v= categoryElement.findElements(By.tagName("option")).size();
      return v;
    }

    public static String getDropdownValues(int index){
        return categoryElement.findElements(By.tagName("option")).get(index).getText();
    }



}
