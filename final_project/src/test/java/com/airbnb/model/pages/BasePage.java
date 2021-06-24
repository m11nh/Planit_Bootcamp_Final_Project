package com.airbnb.model.pages;


import java.util.concurrent.TimeUnit;

import com.airbnb.model.components.dialogs.LoginDialog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BasePage<T> {
    
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public HostHomesPage clickBecomeHostMenu(){
        driver.findElement(By.className("_q730rga")).click();
        return new HostHomesPage(driver);
    }

    @SuppressWarnings("unchecked")
    public LoginDialog<T> clickLoginMenu() {
        driver.findElement(By.id("field-guide-toggle")).click();
        driver.findElement(By.className("_ojs7nk")).click();
        return new LoginDialog<T>(driver.findElement(By.cssSelector(locator)), (T)this);
    }

    
    


}
