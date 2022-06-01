package com.guruProject99.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {
    // abstract classlardan nesne olusturulamaz
    // diger classlardan miras almak icin bu sekilde olusturduk

    //private => sadece ayni class
    //default => sadece ayni paket
    //protected =>  ayni paket + child classlarda
    // public => her yerden gorunur
    protected static WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

    }

    @AfterClass
    public void tearDown(){
        driver.close();


    }

}
