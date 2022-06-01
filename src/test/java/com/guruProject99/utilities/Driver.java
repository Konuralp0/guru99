package com.guruProject99.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    // Eger bir classtan nesne uretilmesini istemiyorsaniz, constructori private olusturursunuz (Singleton class)

    private Driver(){
    }
    //Webdriver nesnemizi static olarak olusturduk, cunku proje baslar baslamaz hafizada yer almasini istiyoruz
    // bu sekilde yaptigimiz zaman yeniden driver nesnesi olusturmak zorunda degiliz
    static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver == null) {  // eger bossa driver olustur degilse yeni bir tane daha olusturma
            switch (ConfigurationReader.getProperty("browser")){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                    case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;
                case "safari":
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver = new SafariDriver();
                    break;
                case "headless-chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
            }


        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;



    }



    public static void closeDriver(){
        // Eger driver nesnesi null degilse, yani hafizada olusturulduysa
        if(driver != null){
            driver.quit();// driveri kapatiyor
            driver = null; // driveri hafizadan siliyoruz
        }




    }


}
