package com.LabCorp.cukeRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/LabCorp/stepDefinition",
        features = "src/test/resources/features"
)
public class FailedCukesRunner {
}
