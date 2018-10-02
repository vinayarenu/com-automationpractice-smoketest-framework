package com.testing.pageObjects;

import com.testing.helpers.BasePage;
import org.openqa.selenium.By;

public class ShoppingCartPage extends BasePage {

    public void selectCartLink(){
        driver.findElement(By.cssSelector("a[title='View my shopping cart']")).click();

    }

    public String isOnCartPage(){

        return driver.getCurrentUrl();
    }


    public String cartSummary(){
        return driver.findElement(By.cssSelector("p.alert")).getText();
    }
}
