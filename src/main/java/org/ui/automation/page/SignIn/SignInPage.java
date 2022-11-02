package org.ui.automation.page.SignIn;
import org.openqa.selenium.By;
import org.ui.automation.Base.BaseClass;

import static org.ui.automation.utill.CommonFunctions.*;

public class SignInPage extends BaseClass {

    static By SignIn_Navigation_Button = By.xpath("//a[contains(text(),'Sign in')]");

    static By SignIn_EmailID = By.xpath("//input[@id='email']");

    static By SignIn_Password = By.xpath("//input[@id='passwd']");

    static By SignIn_Button = By.xpath("//button[@id='SubmitLogin']");

    static By Error_Message_one = By.xpath("//div[@class ='alert alert-danger']/ol[1]/li[1]");

    static By Error_Message_Banner = By.xpath("//div[@class ='alert alert-danger']");

    static By Dashboard_MyAccount_Text = By.xpath("//h1[contains(text(),'My account')]");

    public static void Click_SignIn_Navigation_Button()  {
        Click_WebElement(SignIn_Navigation_Button);
    }

    public static void Enter_SignIn_Email_id(String emailId)  {
        Enter_Text_In_Input(SignIn_EmailID,emailId);
    }

    public static void Enter_SignIn_Password(String password)  {
        Enter_Text_In_Input(SignIn_Password,password);
    }
    public static void Click_SignIn_Button()  {
        Click_WebElement(SignIn_Button);
    }
    public static boolean Is_Error_Banner_Displayed(){
       return driver.findElement(Error_Message_Banner).isDisplayed();
    }

    public static String Get_Error_Message(){
        return driver.findElement(Error_Message_one).getText();
    }

    public static boolean Is_MyAccount_Text_Displayed(){
        return driver.findElement(Dashboard_MyAccount_Text).isDisplayed();
    }
}
