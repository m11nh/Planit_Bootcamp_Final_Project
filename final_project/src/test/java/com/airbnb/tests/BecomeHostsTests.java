package com.airbnb.tests;

import com.airbnb.model.pages.HomePage;

import org.junit.jupiter.api.Test;

public class BecomeHostsTests extends BaseTest{

    @Test
    public void validateBecomingHost(){
        var user = open(HomePage.class)
        .clickBecomeHostMenu();
            
        


    }
}
