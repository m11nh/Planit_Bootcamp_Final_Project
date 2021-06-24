package com.airbnb.tests;

import org.junit.jupiter.api.Test;

public class BecomeHosts extends BaseTest{

    @Test
    public void validateBecomingHost(){
        var user = open(HomePage.class)
            .clickBecomeHostMenu()
            .clickGetStartedBtn()
            .clickContinueEmailBtn()
            .setEmail()
            .clickContinueEmailBtn()
            .setPassword()
            .selectPropertyTypeGroup()
            .clickNextBtn()
            .selectPropertyType()
            .clickNextBtn
            .selectPrivacyType()
            .clickNextBtn()
            .location()
            .clickLooksGoodBtn()
            .



    }
}
