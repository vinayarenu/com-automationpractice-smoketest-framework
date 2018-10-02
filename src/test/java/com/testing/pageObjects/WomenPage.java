package com.testing.pageObjects;

import com.testing.helpers.BasePage;
import org.openqa.selenium.By;

public class WomenPage extends BasePage {

    public void selectWomenLink(){
        driver.findElement(By.linkText("Women")).click();
    }

    public String isOnWomenPage(){
        return driver.getCurrentUrl();
    }

    public String viewWomenCount(){
        return driver.findElement(By.xpath("//div[@id='center_column']/h1/span[2]")).getText();
    }
}
