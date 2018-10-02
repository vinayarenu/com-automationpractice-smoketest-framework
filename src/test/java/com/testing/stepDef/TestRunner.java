package com.testing.stepDef;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:\\Users\\vinay\\MyAutomationPracticeProject\\src\\test\\resources"},
        glue={"com.testing\\stepDef"},
        format = {"pretty", "html:target/cucumber.html"},
        dryRun = false,
        strict = false,
        tags = {}
                )
public class TestRunner {
}
