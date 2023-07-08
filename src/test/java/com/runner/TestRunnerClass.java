package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.ReportingClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature\\Loginpageon.feature",
glue = "com.step", dryRun = false,
monochrome = true, snippets = SnippetType.CAMELCASE,

		plugin = { 
				"json:C:\\Users\\YKP\\eclipse-workspace\\A_Cucumber3Day\\target\\reportJson1.json" })

public class TestRunnerClass {

	@AfterClass
	public static void tc01() {
		ReportingClass.generateReport(
				"C:\\Users\\YKP\\eclipse-workspace\\A_Cucumber3Day\\target\\reportJson.json");
	}
}
