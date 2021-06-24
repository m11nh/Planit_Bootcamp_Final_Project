package com.airbnb.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage<HomePage> {

    public HomePage(WebDriver driver) {
        super(driver);
    }

	public HomePage clickLogin() {
        driver.findElement(By.cssSelector("ng-login a")).click(); 
        return this; 
	}

    public HomePage setUsername(String username) {
        driver.findElement(By.id("loginUserName")).sendKeys(username);
        return this;
    }

	public HomePage setPassword(String password) {
        driver.findElement(By.id("loginPassword")).sendKeys(password);
        return this;
	}

    public HomePage clickFormLogin() {
        driver.findElement(By.cssSelector(".btn-primary")).click();
        return this; 
    }

	public String getUsername() {
        return driver.findElement(By.cssSelector(".user")).getText(); 
	}
}
