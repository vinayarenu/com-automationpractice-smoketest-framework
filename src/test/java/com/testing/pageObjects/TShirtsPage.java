package com.testing.pageObjects;

import com.testing.helpers.BasePage;
import org.openqa.selenium.By;

public class TShirtsPage extends BasePage {

    public void selectTShirtsPage(){
        driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[3]/a")).click();
    }

    public String isOnTShirtsPage(){
        return driver.getCurrentUrl();
    }

    public String viewTShirtsCount(){
        return driver.findElement(By.xpath("//div[@id='center_column']/h1/span[2]")).getText();
    }
}
