package com.airbnb.model.pages;

import com.airbnb.model.components.dialogs.CardDialog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PayPage extends BasePage<PayPage> {
    public PayPage(WebDriver driver) {
        super(driver);
	}

	public Short getDates() {
		return null;
	}

	public Short getGuests() {
		return null;
	}

	public Double getTotal() {
		return null;
	}

	public CardDialog clickPayWithCredit() {
		var root = driver.findElement(By.className(""));
		return new CardDialog(root, driver);
	}
}
