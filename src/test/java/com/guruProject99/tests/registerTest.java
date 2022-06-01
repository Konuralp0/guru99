package com.guruProject99.tests;

import com.guruProject99.pages.guru99Insurance;
import com.guruProject99.utilities.ConfigurationReader;
import com.guruProject99.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class registerTest {






    @Test
    public void test(){
        guru99Insurance page = new guru99Insurance(Driver.getDriver());
        Driver.getDriver().get(ConfigurationReader.getProperty("link"));
        guvenlikDuvarlari();
        page.registerbUtton.click();
        guvenlikDuvarlari();
        page.name.sendKeys(ConfigurationReader.getProperty("firstName"));
        page.surname.sendKeys(ConfigurationReader.getProperty("surname"));
        page.phoneNumber.sendKeys(ConfigurationReader.getProperty("phone"));


        new Select(page.yearOfBirth).selectByVisibleText(ConfigurationReader.getProperty("birthYear"));
        new Select(page.monthOfBirth).selectByVisibleText(ConfigurationReader.getProperty("birthMonth"));
        new Select(page.dayOfBirth).selectByVisibleText(ConfigurationReader.getProperty("birthDay"));
        new Select(page.license).selectByVisibleText(ConfigurationReader.getProperty("licensePeriod"));
        new Select(page.occupation).selectByVisibleText(ConfigurationReader.getProperty("occupation"));
        page.street.sendKeys(ConfigurationReader.getProperty("addressStreet"));
        page.city.sendKeys(ConfigurationReader.getProperty("city"));
        page.country.sendKeys(ConfigurationReader.getProperty("country"));
        page.postCode.sendKeys(ConfigurationReader.getProperty("postcode"));
        page.email.sendKeys(ConfigurationReader.getProperty("email"));
        page.password.sendKeys(ConfigurationReader.getProperty("password"));
        page.passwordConfirmation.sendKeys(ConfigurationReader.getProperty("password"));
        page.createButton.click();


















    }


    public void guvenlikDuvarlari(){
        try {
            new guru99Insurance(Driver.getDriver()).consentButton.click();
            new guru99Insurance(Driver.getDriver()).acceptAllButton.click();
        }catch (Exception e){
            System.out.println(" Button did not appear");
        }


    }
}
