package com.airbnb.tests;

import org.junit.jupiter.api.Test;

public class BookingTest extends BaseTest{
	@Test
	public void validateBookingDetails() {
		var searchResultsPage = open(HomePage.class)
			.setLocation("Sydney")
			.setFlexibility("weekend", "july")
			.setGuests(1, 2, 0); 
			.clickSearch();
	}

}
