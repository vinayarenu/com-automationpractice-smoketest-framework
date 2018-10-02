package com.testing.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class BasePage {

    public static WebDriver driver;
    public static Select select;


    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinay\\Downloads\\drivers\\chromedriver.exe");
        driver = new ChromeDriver( );

        driver.manage( ).window( ).maximize( );
        driver.manage( ).timeouts( ).implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage( ).timeouts( ).pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage( ).deleteAllCookies( );
        driver.get("http://automationpractice.com/index.php");
    }

    public void closeBrowser() {
        driver.quit( );

    }


}
