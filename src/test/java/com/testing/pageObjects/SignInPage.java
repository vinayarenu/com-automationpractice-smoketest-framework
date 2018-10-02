package com.testing.pageObjects;

import com.testing.helpers.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SignInPage extends BasePage {



    public String isOnSignInPage() {
        return driver.getCurrentUrl();
    }

    public void emailAddress(String email){
        driver.findElement(By.cssSelector("input[name='email_create']")).sendKeys(email);
    }

    public void createAnAccount(){
        driver.findElement(By.cssSelector("button[name='SubmitCreate']")).click();
    }

    public void title() {
        List<WebElement> radBtn = driver.findElements(By.cssSelector("input[type='radio']"));
        boolean selected = radBtn.get(0).isSelected();
        if (selected) {
            radBtn.get(0).click( );
        } else {
            radBtn.get(1).click( );
        }

    }
    public void personalFirstName(String firstName){
        driver.findElement(By.cssSelector("input[name='customer_firstname']")).sendKeys(firstName);

    }

    public void personalLastName(String lastName){
        driver.findElement(By.cssSelector("input[name='customer_lastname']")).sendKeys(lastName);
    }

    public void password(String pwd){
        driver.findElement(By.cssSelector("input[id='passwd']")).sendKeys(pwd);
    }

    public void dateOfBirth(){
        WebElement days = driver.findElement(By.cssSelector("select[id='days']"));
        select = new Select(days);
        select.selectByValue("1");

        WebElement months = driver.findElement(By.cssSelector("select[id='months']"));
        select = new Select(months);
        select.selectByValue("1");

        WebElement years = driver.findElement(By.cssSelector("select[id='years']"));
        select = new Select(years);
        select.selectByValue("1999");

    }

    public void checkBox(){
        List<WebElement> chkBoxBtns = driver.findElements(By.cssSelector("input[type='checkbox']"));
        int size = chkBoxBtns.size( );
        for (int i=0;i<size;i++){
            chkBoxBtns.get(i).click();
        }

    }



    public void address(String add){
        driver.findElement(By.cssSelector("input[id='address1']")).sendKeys(add);
    }

    public void city(String cityName){
        driver.findElement(By.cssSelector("input[name='city']")).sendKeys(cityName);
    }

    public void state(){
        WebElement states = driver.findElement(By.cssSelector("select[name='id_state']"));
        select = new Select(states);
        select.selectByVisibleText("Illinois");

    }
    public void zip(String zipCode){
        driver.findElement(By.cssSelector("input[id='postcode']")).sendKeys(zipCode);
    }

    public void country(){
        WebElement country = driver.findElement(By.cssSelector("select[name='id_country']"));
        select = new Select(country);
        select.selectByVisibleText("United States");

    }
    public void mobile(String mobPhone){
        driver.findElement(By.cssSelector("input[name='phone_mobile']")).sendKeys(mobPhone);
    }

    public void addressAlias(String alias){
        driver.findElement(By.cssSelector("input[name='alias']")).sendKeys(alias);
    }

    public void register(){
        driver.findElement(By.cssSelector("button[id='submitAccount']")).click();
    }

    public void signIn(String email, String pwd){
        driver.findElement(By.cssSelector("input[id='email']")).sendKeys(email);
        driver.findElement(By.cssSelector("input[id='passwd']")).sendKeys(pwd);
        driver.findElement(By.cssSelector("button[name='SubmitLogin']")).click();

    }









    }








