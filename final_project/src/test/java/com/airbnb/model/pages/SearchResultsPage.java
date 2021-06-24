package com.airbnb.model.pages;

import com.airbnb.model.components.Stay;
import com.google.common.base.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage extends BasePage<SearchResultsPage>{
    public SearchResultsPage(WebDriver driver) {
        super(driver);
	}

    public String getSearchTitle() {
        return driver.findElement(By.className("_14i3z6h")).getText(); 
    }

	public Integer getResultsLength() {
		return Integer.parseInt(driver.findElement(By.className("_1snxcqc")).getText().replace("+ stays", ""));
	}

	public String getDates() {
        // TO-DO
        return ""; 
	}

	public Object getMonths() {
		return null;
	}

	public Stay getStay(Function<Stay, Boolean> strategy) {
		var elements = driver.findElements(By.className("_uhpzdny"));
		return elements.stream()
			.map(s -> new Stay(s, this))
			.filter(s -> strategy.apply(s))
			.findFirst()
			.orElseThrow();
	}

	public WebDriver getDriver() {
		return driver;
	}
	
}
