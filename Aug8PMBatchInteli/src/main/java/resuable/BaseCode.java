package resuable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseCode {

    public static WebDriver driver;  //null //chrome
    public static void browserInvocation(){

        driver = new EdgeDriver();
        driver.navigate().to("https://en.wikipedia.org/wiki/Ernst_%26_Young");
        driver.manage().window().maximize();

    }

}
