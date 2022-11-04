package org.ui.automation.Test.RegistrationTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.ui.automation.Base.BaseClass.getBrowserDriver;
import static org.ui.automation.Test.BaseTest.BaseTest.Kill_Application;
import static org.ui.automation.Test.utils.Constants.*;
import static org.ui.automation.page.Registration.RegistrationPage.*;
import static org.ui.automation.page.SignIn.SignInPage.Click_SignIn_Navigation_Button;
import static org.ui.automation.page.SignIn.SignInPage.Is_Error_Banner_Displayed;

public class RegistrationTest {

    @BeforeClass
    public static void setUp(){
        getBrowserDriver();
    }

    @AfterClass
    public static void Destroy(){
        //Kill_Application();
    }

    @Test(priority = 1)
    public static void  Create_Account_With_Registrated_Email_Id() throws InterruptedException {
        Click_SignIn_Navigation_Button();
        Enter_Email_In_Create_Account_Box(VALID_EMAIL);
        Click_Create_Account_button();
        Thread.sleep(5000);
        Assert.assertTrue(is_Error_Message_Displayed());
    }

    @Test(priority = 2)
    public static void  Create_Account_With_InValid_Email_Id() throws InterruptedException {
        Click_SignIn_Navigation_Button();
        Enter_Email_In_Create_Account_Box(INVALID_USER_NAME);
        Click_Create_Account_button();
        Thread.sleep(5000);
        Assert.assertTrue(is_Error_Message_Displayed());
    }


    @Test(priority = 3)
    public static void  Create_Account_With_UnRegistred_Email_Id() throws InterruptedException {
        Click_SignIn_Navigation_Button();
        Enter_Email_In_Create_Account_Box(UNREGISTERED_EMAIL_ADDRESS);
        Click_Create_Account_button();
        Thread.sleep(5000);
        Assert.assertTrue(is_Registation_heading_Displayed());
    }

    @Test(priority = 4)
    public static void  Click_Register_Button_Without_Entering_Values() throws InterruptedException {
        Create_Account_With_UnRegistred_Email_Id();
        //Select_Day_From_DropDown();
        Click_Register_Button();
        Assert.assertTrue(Is_Error_Banner_Displayed());
    }


}
