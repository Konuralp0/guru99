package com.guruProject99.pages;

import org.apache.poi.hssf.record.UserSViewBegin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class guru99Insurance {
    WebDriver driver;

    public guru99Insurance(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//*[.='Consent']")
    public WebElement consentButton;


    @FindBy(partialLinkText = "Register")
    public WebElement registerbUtton;

    @FindBy(xpath = "//*[.='Accept All']")
    public WebElement acceptAllButton;

    @FindBy(id = "user_firstname")
    public WebElement name;

    @FindBy(id = "user_surname")
    public WebElement surname;

    @FindBy(id = "user_phone")
    public WebElement phoneNumber;

    @FindBy(id = "user_dateofbirth_1i")
    public WebElement yearOfBirth;

    @FindBy(id = "user_dateofbirth_2i")
    public WebElement monthOfBirth;

    @FindBy(id = "user_dateofbirth_3i")
    public WebElement dayOfBirth;

    @FindBy(id = "user_licenceperiod")
    public WebElement license;

    @FindBy(id = "user_occupation_id")
    public WebElement occupation;

    @FindBy(id = "user_address_attributes_street")
    public WebElement street;

    @FindBy(id = "user_address_attributes_city")
    public WebElement city;

    @FindBy(id = "user_address_attributes_county")
    public WebElement country;

    @FindBy(id = "user_address_attributes_postcode")
    public WebElement postCode;

    @FindBy(id = "user_user_detail_attributes_email")
    public WebElement email;

    @FindBy(id ="user_user_detail_attributes_password" )
    public WebElement password;

    @FindBy(id = "user_user_detail_attributes_password_confirmation")
    public WebElement passwordConfirmation;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement createButton;












}
