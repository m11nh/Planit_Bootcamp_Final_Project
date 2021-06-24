package com.airbnb.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.airbnb.model.pages.HomePage;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.Sleeper;

public class LoginTests extends BaseTest {

    @Test
    public void validateSuccessfulLogin(){
        var user = open(HomePage.class)
        .clickLoginMenu()
        .clickContinueEmailBtn()
        .setEmail("claudiasanabria@gmail.com")
        .clickContinueBtn()
        .setPassword("TRYONE11@")
        .clickNotRobot();  
    }

    
    
}
