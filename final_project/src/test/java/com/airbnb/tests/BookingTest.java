package com.airbnb.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.airbnb.model.pages.HomePage;

import org.junit.jupiter.api.Test;

public class BookingTest extends BaseTest{
	@Test
	public void validateBookingDetails() {
		var resultsPage = open(HomePage.class)
			.setLocation("Sydney")
			.setFlexibility("weekend", "july")
			.clickSearch();
		
		var stay = resultsPage.getStay(s -> s.getTitle().equals("Long Stay Special- Studio Apartment"));
		var stayPage = stay.click();

		assertEquals(stayPage.getPrice(), stay.getPrice()); 
		assertEquals(stayPage.getTitle(), stay.getTitle()); 
		assertEquals(stayPage.getNumGuests(), stay.getNumGuests()); 

		stayPage
			.setCheckInDate(3, "jun") 
			.setCheckOutDate(4, "jul"); 
		assertEquals(stayPage.getTotal(), 1054.50); 
	}

	public void validateConfirmAndPayDetails() {
		var resultsPage = open(HomePage.class)
			.setLocation("Sydney")
			.setFlexibility("weekend", "july")
			.clickSearch();
		var stay = resultsPage.getStay(s -> s.getTitle().equals("Long Stay Special- Studio Apartment"));
		var stayPage = stay.click();
		stayPage
			.setCheckInDate(3, "jun") 
			.setCheckOutDate(4, "jul"); 
		var payPage = stayPage.clickReserve(); 

		// validate details here
		assertEquals(stayPage.getTotal(), payPage.getTotal());
		assertEquals(stayPage.getDates(), payPage.getDates()); 
		assertEquals(stayPage.getNumGuests(), payPage.getGuests()); 
	}

	public void invalidCardDetails() {
		var resultsPage = open(HomePage.class)
			.setLocation("Sydney")
			.setFlexibility("weekend", "july")
			.clickSearch();
		var stay = resultsPage.getStay(s -> s.getTitle().equals("Long Stay Special- Studio Apartment"));
		var stayPage = stay.click();
		stayPage
			.setCheckInDate(4, "jan") 
			.setCheckOutDate(5, "feb"); 
		var payPage = stayPage.clickReserve(); 
		var cardModal = payPage.clickPayWithCredit();
		cardModal.clickDone();

		assertEquals(cardModal.getCardError(), "Check your card number"); 
		assertEquals(cardModal.getPostCodeError(), "This is required"); 
	}

}
