package com.airbnb.model.components.dialogs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginDialog<T> {
    
    private WebElement rootElement;
    private T parent;

    public LoginDialog(WebElement rootElement, T parent){
        this.rootElement = rootElement;
        this.parent = parent;
    }

    public LoginDialog<T> clickContinueEmailBtn(){
            rootElement.findElement(By.className("_bc4egv")).click();
            return this;
    }

    public LoginDialog<T> setEmail(String username){
        rootElement.findElement(By.id("email-login-email")).sendKeys(username);
        return this;
    }

    public LoginDialog<T> clickContinueBtn(){
        rootElement.findElement(By.className("_m9v25n")).click();
        return this;
    }

    public LoginDialog<T> setPassword(String password){
        rootElement.findElement(By.id("email-signup-password")).sendKeys(password);
        return this;
    }

    public T clickNotRobot() {
        rootElement.findElement(By.id("recaptcha-anchor-label")).click();
        return parent;
    }

    

    

    
}
