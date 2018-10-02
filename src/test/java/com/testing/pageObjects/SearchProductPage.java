package com.testing.pageObjects;

import com.testing.helpers.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SearchProductPage extends BasePage {

    public void search(String searchProduct){
        driver.findElement(By.cssSelector("input[id='search_query_top']")).sendKeys(searchProduct);
        driver.findElement(By.cssSelector("input[id='search_query_top']")).sendKeys(Keys.ENTER);

    }

    public String isOnProductPage(){
       return driver.getCurrentUrl();
    }

    public String viewProductCount(){
      return  driver.findElement(By.xpath("//*[@id='center_column']/h1/span[2]")).getText();
    }

}
