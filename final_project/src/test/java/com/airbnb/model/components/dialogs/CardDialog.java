package com.airbnb.model.components.dialogs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CardDialog<T> {
    
    private WebElement rootElement;
    private T parent;

    public CardDialog(WebElement rootElement, T parent){
        this.rootElement = rootElement;
        this.parent = parent;
    }

	public void clickDone() {

	}

	public String getCardError() {
		return "";
	}

	public String getPostCodeError() {
		return "";
	}
}
