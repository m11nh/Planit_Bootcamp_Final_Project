package com.airbnb.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.airbnb.model.pages.HomePage;
import com.airbnb.model.pages.SearchResultsPage;

import org.junit.jupiter.api.Test;

public class SearchTest extends BaseTest {
    @Test
	public void invalidatEmptyInput() {
		var page = open(HomePage.class)
			.clickSearch(); 
		assertEquals(page.instanceOf(SearchResultsPage), false);
	}

	public void validateInvalidLocation() {
		var searchResultsPage = open(HomePage.class)
			.setLocation("asjdklfajkl")
			.setCheckIn(24, "Jun")
			.setCheckOut(12, "Jul") 
			.clickAddAdultGuests() 
			.clickSearch();

		assertEquals(searchResultsPage.getSearchTitle(), "Stays around the world");
		assertEquals(searchResultsPage.getResultsLength(), "300+"); 
		assertEquals(searchResultsPage.getDates(), "24 June - 14 July");
	} 

	public void validateValidLocation() {
		var searchResultsPage = open(HomePage.class)
			.setLocation("Sydney")
			.setFlexibility("weekend", "july")
			.clickSearch();

		assertEquals(searchResultsPage.getSearchTitle(), "Stays in Sydney");
		assertEquals(searchResultsPage.getResultsLength(), "300+"); 
		assertEquals(searchResultsPage.getMonths(), "Jul, Aug");
	} 

	public void validateStayDetails() {
		var resultsPage = open(HomePage.class)
			.setLocation("Sydney")
			.clickSearch();
			
		var stay = resultsPage
			.getStay(s -> s.getTitle().equals("Long Stay Special- Studio Apartment")); 
		
		assertEquals(stay.getNumGuests(), 2);
		assertEquals(stay.getPrice(), 80);
		assertEquals(stay.getNumBedrooms(), 1); 
		assertEquals(stay.getNumBedrooms(), 1); 
	}
}