package com.airbnb.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.airbnb.model.pages.HomePage;

import org.junit.jupiter.api.Test;

public class HostTest extends BaseTest{

    @Test
    public void validateHostPageTitle(){
        var title = open(HomePage.class)
        .clickHostMenu()
        .validateTitle();

        assertEquals("BECOME A HOST", title);
    }

    @Test
    public void validateSuccessfulEmailMessage(){
        var hostPage = open(HomePage.class)
        .clickHostMenu()
        .setEmail("dfal@dafa.com")
        .clickSignUpBtn();

        assertEquals("Thanks! We’ll be in touch soon about hosting.", hostPage.getSuccessfulEmailMessage());

    }
}
