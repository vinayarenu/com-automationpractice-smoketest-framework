package com.testing.pageObjects;

import com.testing.helpers.BasePage;
import org.openqa.selenium.By;

public class MyAccountPage extends BasePage {

    public String isOnMyAcountPage(){

        return driver.getCurrentUrl();
//http://automationpractice.com/index.php?controller=my-account
    }

    public String welcomeMessage(){
        return driver.findElement(By.cssSelector("p[class='info-account']")).getText();
    }//Welcome to your account. Here you can manage all of your personal information and orders.

    public void signOut(){
        driver.findElement(By.linkText("Sign out")).click();
    }
}
