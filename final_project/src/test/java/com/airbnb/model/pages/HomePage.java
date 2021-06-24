package com.airbnb.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
<<<<<<< HEAD
=======

>>>>>>> 221689f6af5f6a20e724deab28480b2bcb39f1b0

public class HomePage extends BasePage<HomePage> {

    public HomePage(WebDriver driver) {
        super(driver);
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

	public SearchResultsPage clickSearch() {
        driver.findElement(By.className("_1mzhry13")).click(); 
        // TO-DO
		return new SearchResultsPage(driver);
	}

    public HomePage setLocation(String location) {
        var inputField = driver.findElement(By.className("_1xq16jy"));
        inputField.sendKeys(location);
        return this;
    }

    public HomePage setCheckIn(int day, String month) {
        // TO-DO
        return this; 
    }

    public HomePage setCheckOut(int day, String month) {
        // TO-DO 
        return this; 
    }

    public HomePage clickAddAdultGuests() {
        driver.findElement(By.className("_37ivfdq")); 
        return this;
    }

	public HomePage setFlexibility(String string, String string2) {
        // TO-DO
        return this; 
	}
}
