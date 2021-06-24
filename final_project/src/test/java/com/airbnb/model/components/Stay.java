package com.airbnb.model.components;

import com.airbnb.model.pages.SearchResultsPage;
import com.airbnb.model.pages.StayPage;

import org.openqa.selenium.WebElement;

public class Stay {
	private WebElement rootElement; 
	private SearchResultsPage parent; 

	public Stay(WebElement rootElement, SearchResultsPage parent) {
		this.rootElement = rootElement; 
		this.parent = parent; 
	}

	public Integer getNumGuests() {
		// TODO
		return null;
	}

	public Integer getPrice() {
		// TODO
		return null;
	}

	public Integer getNumBedrooms() {
		// TODO
		return null;
	}

	public String getTitle() {
		// TODO
		return null;
	}

	public StayPage click() {
		new StayPage(parent.getDriver()); 
	}


}
