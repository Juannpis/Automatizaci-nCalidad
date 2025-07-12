package com.calidadjp.stepDefinitions.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class Hooks {

    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        setTheStage(new OnlineCast());
    }


    @After
    public void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }



}
