package com.airbnb.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.airbnb.model.pages.HomePage;

import org.junit.jupiter.api.Test;


public class LoginTest extends BaseTest {

    @Test
    public void validateSuccessfulLogin(){  //In production
        var user = open(HomePage.class)
        .clickLoginMenu()
        .clickContinueEmailBtn()
        .setEmail("claudiasanabria@gmail.com")
        .clickContinueBtn()
        .setPassword("TRYONE11@")
        .clickNotRobot();  

        assertEquals("image", user);
    }

    
    
}
