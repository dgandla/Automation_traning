package org.ui.automation.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import static org.ui.automation.utill.Configuration.*;

public class BaseClass {
    public static WebDriver driver;

    public static WebDriver getBrowserDriver() {
        if (getTestBrowser().equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", getWebDriverLocation() + "/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (getTestBrowser().equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", getWebDriverLocation() + "/geckodriver.exe");
            driver = new FirefoxDriver();
        }else {
            System.err.println("Given " +getTestBrowser()+" browser is not supported..!" );
            System.exit(1);
        }
        driver.get(getApplicationUrl());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }


}
