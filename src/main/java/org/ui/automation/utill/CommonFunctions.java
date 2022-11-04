package org.ui.automation.utill;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.ui.automation.Base.BaseClass.driver;

public class CommonFunctions {
    public static void Click_WebElement(By webElement){
        driver.findElement(webElement).click();
    }
    public static void Enter_Text_In_Input(By webElement,String text){
        driver.findElement(webElement).sendKeys(text);
    }

    public static void Select_Value_From_DropDown(By WebElement,String value){
        Select daysDropDown = new Select(driver.findElement(WebElement));
        daysDropDown.selectByValue(value);
    }
}
