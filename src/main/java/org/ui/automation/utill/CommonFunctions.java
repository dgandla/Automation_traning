package org.ui.automation.utill;

import org.openqa.selenium.By;

import static org.ui.automation.Base.BaseClass.driver;

public class CommonFunctions {
    public static void Click_WebElement(By webElement){
        driver.findElement(webElement).click();
    }
    public static void Enter_Text_In_Input(By webElement,String text){
        driver.findElement(webElement).sendKeys(text);
    }

    public static String Get_Text(By webElement){
        return driver.findElement(webElement).getText();
    }


}
