package org.ui.automation.Test.SignTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.ui.automation.Base.BaseClass.getBrowserDriver;
import static org.ui.automation.Test.BaseTest.BaseTest.Kill_Application;
import static org.ui.automation.Test.utils.Constants.*;
import static org.ui.automation.page.SignIn.SignInPage.*;

public class SignInTest {
    @BeforeClass
    public static void setUp(){
        getBrowserDriver();
    }

    @AfterClass
    public static void Destroy(){
        Kill_Application();
    }

    @Test(priority = 2)
    private static void Enter_Invalid_UserName_Password() {
        //Click SignIn Button
        Click_SignIn_Navigation_Button();
        //Enter invalid Email Id
        Enter_SignIn_Email_id(INVALID_USER_NAME);
        //Enter invalid password
        Enter_SignIn_Password(INVALID_PASSWORD);
        //Enter Sign In button
        Click_SignIn_Button();
        //Validate
        Assert.assertTrue(Is_Error_Banner_Displayed());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test(priority = 3)
    private static void Valid_Email_Invalid_password(){
        //Click SignIn Button
        Click_SignIn_Navigation_Button();
        //Enter invalid Email Id
        Enter_SignIn_Email_id(VALID_EMAIL);
        //Enter invalid password
        Enter_SignIn_Password(INVALID_PASSWORD);
        //Enter Sign In button
        Click_SignIn_Button();
        //Validate
        Assert.assertEquals(Get_Error_Message(),ERROR_MESSAGE_AUTH_FAILED);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test(priority = 5)
    private static void Valid_Email_Valid_Password(){
        //Click SignIn Button
        Click_SignIn_Navigation_Button();
        //Enter invalid Email Id
        Enter_SignIn_Email_id(VALID_EMAIL);
        //Enter invalid password
        Enter_SignIn_Password(VALID_PASSWORD);
        //Enter Sign In button
        Click_SignIn_Button();
        //Validate
        //Assert.assertEquals(Get_Error_Message(),ERROR_MESSAGE_AUTH_FAILED);
        Assert.assertTrue(Is_MyAccount_Text_Displayed());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test(priority = 1)
    private static void  Empty_Email_Empty_Password(){
        Click_SignIn_Navigation_Button();
        Enter_SignIn_Email_id("");
        Enter_SignIn_Password("");
        Click_SignIn_Button();
        Assert.assertEquals(Get_Error_Message(),EMPTY_EMAIL_AND_PASSWORD);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test(priority = 4)
    private  static void Valid_Email_Empty_Password(){
        Click_SignIn_Navigation_Button();
        Enter_SignIn_Email_id(VALID_EMAIL);
        Enter_SignIn_Password("");
        Click_SignIn_Button();
        Assert.assertEquals(Get_Error_Message(),VALID_EMAIL_EMPTY_PASSWORD_ERROR_MESSAGE);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

}
