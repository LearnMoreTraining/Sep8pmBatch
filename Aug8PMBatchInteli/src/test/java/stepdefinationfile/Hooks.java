package stepdefinationfile;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import resuable.BaseCode;

public class Hooks {

    @Before()
    public void setup(){
        System.out.println("Browser Starts.....");
        BaseCode.browserInvocation();
    }

    @After()
    public void tearDown(){
        System.out.println("Browser close....");
    }

}
