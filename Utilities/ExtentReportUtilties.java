package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.File;
import java.io.FileInputStream;

public class ExtentReportUtilties {
    static ExtentSparkReporter reporter;
    static ExtentReports reports;
    static ExtentTest test;
    public static String report_pageName;

    public static ExtentReports report() {
        if (report_pageName.equalsIgnoreCase("forms")) {

            File f = new File("D:/Cucumber_LetCode_Automation/Execution_Reports/Automation_Report_Form.html");

            if (reports == null) {

                reporter = new ExtentSparkReporter(f);
                reports = new ExtentReports();
                reports.attachReporter(reporter);

            }

        }
        if (report_pageName.equalsIgnoreCase("Buttons")) {

            File f = new File("D:/Cucumber_LetCode_Automation/Execution_Reports/Automation_Report_button.html");

            if (reports == null) {

                reporter = new ExtentSparkReporter(f);
                reports = new ExtentReports();
                reports.attachReporter(reporter);

            }

        }return reports;}
        public static void createTest (String testName){
            test = report().createTest(testName);
        }
        public static ExtentTest test() {
            return test;
        }

}
