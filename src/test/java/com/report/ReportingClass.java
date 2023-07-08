package com.report;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import org.junit.AfterClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportingClass {

	public static void generateReport(String json) {
		File file = new File("C:\\Users\\YKP\\eclipse-workspace\\A_Cucumber3Day\\target");

		Configuration con = new Configuration(file, "Adaction_Login_Testing");
		con.addClassifications("UserStory_Number", "US1001");
		con.addClassifications("Java-Version", "1.8");
		con.addClassifications("Excution-Tool", "Eclipse");

		List<String> li = new LinkedList<String>();
		li.add(json);

		ReportBuilder r = new ReportBuilder(li, con);
		r.generateReports();

	}

}
