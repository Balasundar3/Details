package com.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {

	public static void data(String json ) {

		File f = new File("target\\report\\JVMreport");

		Configuration c = new Configuration(f, "Shopbop");
		List<String> l = new ArrayList<String>();

		l.add(json);
		
		c.addClassifications("windins", "os");
		ReportBuilder r= new ReportBuilder(l, c); 
		r.generateReports();
		
		
	}

}
