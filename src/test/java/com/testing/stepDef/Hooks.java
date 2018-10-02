package com.testing.stepDef;

import com.testing.helpers.BasePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;



public class Hooks {

    BasePage basePage = new BasePage();

    @Before
    public void setUp(){
        basePage.openBrowser();

    }

    @After
    public void tearDown(){
        //basePage.closeBrowser();
    }

}
