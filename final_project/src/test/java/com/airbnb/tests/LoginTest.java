package com.airbnb.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.airbnb.model.pages.HomePage;

import org.junit.jupiter.api.Test;

<<<<<<< HEAD:final_project/src/test/java/com/airbnb/tests/LoginTests.java
public class LoginTests extends BaseTest {
=======

public class LoginTest extends BaseTest {

>>>>>>> 221689f6af5f6a20e724deab28480b2bcb39f1b0:final_project/src/test/java/com/airbnb/tests/LoginTest.java
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
