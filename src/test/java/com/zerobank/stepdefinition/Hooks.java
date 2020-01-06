package com.zerobank.stepdefinition;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void setUp(){
        System.out.println("\tThis is runner before scenario");
    }
    @After
    public void tearDown(Scenario scenario){
        System.out.println("\tThis is runner after scenario\n");

        // if scenario fails, take a screenshot
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "img/png");
        }

        BrowserUtils.waitFor(2);
        Driver.closeDriver();
    }
}
