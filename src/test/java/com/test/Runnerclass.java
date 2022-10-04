package com.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="com.test",snippets=SnippetType.CAMELCASE,
dryRun=false,plugin= {"html:target\\report",
		              "json:target\\report\\bala.json",
		                "junit:target\\report\\login.xml"})
public class Runnerclass {

	@AfterClass
	public static  void tc2() {
		
Reporting.data(System.getProperty("user.dir")+"\\target\\report\\bala.json");



	}
	
	
	
	
	
}
