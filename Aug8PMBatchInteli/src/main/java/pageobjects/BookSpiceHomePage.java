package pageobjects;

import org.openqa.selenium.By;
import resuable.BaseCode;

public class BookSpiceHomePage extends BaseCode {

    public static void selectValueFromDropdown(int ul , int li){
        driver.findElement(By.xpath("//div[@id='dropdownGroup1']/descendant::ul["+ul+"]/child::li["+li+"]")).click();
    }

    public static void byText(String cityName){
        driver.findElement(By.xpath("//a[text()='"+cityName+"']")).click();
    }
}
