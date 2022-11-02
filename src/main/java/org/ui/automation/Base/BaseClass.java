package org.ui.automation.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.ui.automation.utill.Configuration.getApplicationUrl;
import static org.ui.automation.utill.Configuration.getWebDriverLocation;

public class BaseClass {
    public static  WebDriver driver;
    public static WebDriver getBrowserDriver(){
        System.setProperty("webdriver.chrome.driver",getWebDriverLocation());
        driver = new ChromeDriver();
        System.out.println(getApplicationUrl());
        driver.get(getApplicationUrl());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }




}
