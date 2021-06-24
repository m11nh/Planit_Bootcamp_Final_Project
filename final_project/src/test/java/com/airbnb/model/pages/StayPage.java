package com.airbnb.model.pages;

import org.openqa.selenium.WebDriver;

public class StayPage extends BasePage<StayPage>{
	public StayPage(WebDriver driver) {
        super(driver);
	}

	public Double getPrice() {
		return null;
	}

	public Integer getNumGuests() {
		return null;
	}

	public String getTitle() {
		return null;
	}

	public StayPage setCheckInDate(int i, String string) {
		
		return this; 
	}

	public StayPage setCheckOutDate(int i, String string) {

		return this; 
	}

	public Double getTotal() {
		return null;
	}

	public PayPage clickReserve() {


		return new PayPage(driver); 
	}

	public Short getDates() {
		return null;
	}

}
