package com.airbnb.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HostPage extends BasePage<HostPage> {

    public HostPage(WebDriver driver)  {
        super(driver);
    }

    public String validateTitle(){
        return driver.findElement(By.className("_vam468")).getText();
    }

    public HostPage setEmail(String email){
        driver.findElement(By.id("email")).sendKeys(email);
        return this;
    }

    public HostPage clickSignUpBtn(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.className("_ntakbds"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        element.click();
        return this;
    }

    public String getSuccessfulEmailMessage(){
        return driver.findElement(By.className("_1m2bjic")).getText();
    }




    
}
