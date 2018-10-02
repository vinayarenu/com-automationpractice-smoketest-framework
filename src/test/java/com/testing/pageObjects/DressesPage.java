package com.testing.pageObjects;

import com.testing.helpers.BasePage;
import org.openqa.selenium.By;

public class DressesPage extends BasePage {
    public void selectDressesLink(){
        driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[2]/a")).click();
    }

    public String isOnDressesPage(){
        return driver.getCurrentUrl();
    }

    public String viewDressCount(){
        return driver.findElement(By.xpath("//div[@id='center_column']/h1/span[2]")).getText();
    }
}
