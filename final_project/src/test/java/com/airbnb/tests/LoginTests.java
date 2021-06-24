package com.airbnb.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LoginTests extends BaseTest {

    @Test
    public void validateSuccessfulLogin(){
        var user = open(HomePage.class)
        .clickLoginMenu()
        .clickLogIn()
        .clickContinueEmailBtn()
        .setEmail()
        .clickContinueBtn()
        .setPassword()
        .clickLogInBtn();
        
        assertEquals("image", user);
    }

    
}
