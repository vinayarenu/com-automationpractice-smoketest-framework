package com.testing.pageObjects;

import com.testing.helpers.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    public String isOnHomePage(){
         return driver.getCurrentUrl();

    }

    public void selectSignInLink(){
        driver.findElement(By.linkText("Sign in")).click();
    }
}
