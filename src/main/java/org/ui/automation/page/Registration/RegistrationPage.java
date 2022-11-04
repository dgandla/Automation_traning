package org.ui.automation.page.Registration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static org.ui.automation.Base.BaseClass.driver;
import static org.ui.automation.utill.CommonFunctions.*;

public class RegistrationPage {
    static By Create_Account_Email_Input_Box = By.xpath("//input[@id='email_create']");
    static By Create_Account_Button = By.xpath("//button[@id='SubmitCreate']");

    static By Create_Account_Error_Message = By.xpath("//div[@id='create_account_error']");

    static By Your_Personal_Information_heading =By.xpath("//h3[contains(text(),'Your personal information')]");

    static By Click_Register_Button = By.xpath("//button[@id = 'submitAccount']");

    static By Title_RadioButton_MR = By.xpath("//label[@for='id_gender1']");

    static By Title_RadioButton_MRS = By.xpath("//label[@for='id_gender2']");

    static By Customer_FirstName = By.xpath("//input[@id='customer_firstname']");

    static By Customer_LastName = By.xpath("//input[@id='customer_lastname']");

    static By Password = By.xpath("//input[@id='passwd']");

    static By Select_Days = By.xpath("//select[@id='days']");

    static By Select_Month = By.xpath("//select[@id='value']");

    static By Select_Year = By.xpath("//select[@id='years']");

    static By Select_NewsLetter_CheckBox = By.xpath("//div[@id='uniform-newsletter']");

    static By Address_FirstName = By.xpath("//input[@id='firstname']");

    static By Address_LastName = By.xpath("//input[@id='lastname']");

    static By Company = By.xpath("//input[@id='company']");

    static By Address_Field_1 = By.xpath("//input[@id='address1']");

    static By Address_Field_2 = By.xpath("//input[@id='address2']");

    static By City = By.xpath("//input[@id='city']");

    static By State = By.xpath("//select[@id='id_state']");

    static By Postal_Code= By.xpath("//input[@id='postcode']");

    static By County= By.xpath("//select[@id='id_country']");

    static By Additional_Information= By.xpath("//textarea[@id='other']");

    static By Home_Phone= By.xpath("//input[@id='phone']");

    static By Mobile_Phone= By.xpath("//input[@id='phone_mobile']");

    static By Address_Alias= By.xpath("//input[@id='alias']");




    public static void Enter_Email_In_Create_Account_Box(String email){
        Enter_Text_In_Input(Create_Account_Email_Input_Box,email);
    }

    public static void Click_Create_Account_button(){
        Click_WebElement(Create_Account_Button);
    }

    public static boolean is_Error_Message_Displayed(){
        return driver.findElement(Create_Account_Error_Message).isDisplayed();

    }
    public static boolean is_Registation_heading_Displayed(){
        return driver.findElement(Your_Personal_Information_heading).isDisplayed();

    }

    public static void Click_Register_Button(){
        Click_WebElement(Click_Register_Button);
    }

    public static void Select_Day_From_DropDown(String value){
        Select_Value_From_DropDown(Select_Days, value);
    }

}
