package org.ui.automation.Test.BaseTest;

import org.testng.annotations.AfterSuite;

import static org.ui.automation.Base.BaseClass.driver;

public class BaseTest {
    public static void Kill_Application(){
        driver.quit();
    }
}
