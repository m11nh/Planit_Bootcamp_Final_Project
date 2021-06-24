package com.airbnb.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class SearchTest extends BaseTest {
    @Test
	public void invalidatEmptyInput() {
		open(HomePage.class)
			.clickSearch(); 
		assertEquals(Page.pageName(), "HomePage");
	}

	public void validateInvalidLocation() {
		var searchResultsPage = open(HomePage.class)
			.setLocation("asjdklfajkl")
			.setFlexibility("weekend", "july")
			.setGuests(1, 2, 0); 
			.clickSearch();

		assertEquals(searchResultsPage.getSearchTitle(), "Travel the world with Airbnb");
		assertEquals(searchResultsPage.getResultsLength(), "300+"); 
		assertEquals(searchResultsPage.getMonths(), "Jul, Aug");
	} 
	
	public void validateValidLocation() {
		var searchResultsPage = open(HomePage.class)
			.setLocation("Sydney")
			.setFlexibility("weekend", "july")
			.setGuests(1, 2, 0); 
			.clickSearch();

		assertEquals(searchResultsPage.getSearchTitle(), "Stays in Sydney");
		assertEquals(searchResultsPage.getResultsLength(), "300+"); 
		assertEquals(searchResultsPage.getMonths(), "Jul, Aug");
	} 
}