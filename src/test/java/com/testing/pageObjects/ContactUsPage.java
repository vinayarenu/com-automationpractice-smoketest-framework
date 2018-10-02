package com.testing.pageObjects;

import com.testing.helpers.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage extends BasePage {

    public void selectContactUsLink(){
        driver.findElement(By.linkText("Contact us")).click();

    }

    public String isOnContactUsPage(){
        return driver.getCurrentUrl();
    }


    public void subjectHeading(){
        WebElement subHead = driver.findElement(By.cssSelector("select[name='id_contact']"));
        select = new Select(subHead);
        select.selectByValue("2");
    }

    public void emailAddress(String email){
        driver.findElement(By.cssSelector("input[id='email']")).sendKeys(email);
    }

    public void orderReference(String ref){
        driver.findElement(By.cssSelector("input[name='id_order']")).sendKeys(ref);
    }

    public void attachFile(){
        driver.findElement(By.cssSelector("input[id='fileUpload']")).sendKeys("C:\\Users\\vinay\\OneDrive\\Desktop\\notes\\Practice\\orderRef.txt");
    }

    public void message(String msg){
        driver.findElement(By.cssSelector("textarea[id='message']")).sendKeys(msg);
    }

    public void selectSendButton(){
        driver.findElement(By.cssSelector("button[id='submitMessage']")).click();
    }

    public String confirmationMessage(){
        //Your message has been successfully sent to our team.
        return driver.findElement(By.cssSelector("p.alert")).getText();


    }


}
