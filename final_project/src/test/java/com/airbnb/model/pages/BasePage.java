package com.airbnb.model.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BasePage<T> {
    
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    @SuppressWarnings("unchecked")
    public LoginDialog<T> clickLoginMenu() {
        driver.findElement(By.cssSelector("#nav-login a")).click();
        return new LoginDialog<T>(driver.findElement(By.className("popup")), (T)this);
    }
}
