package com.epam.core;

import org.testng.TestNG;
import org.testng.xml.Parser;
import org.testng.xml.XmlSuite;

import java.io.IOException;
import java.util.List;


public class Runner {
    public static void main(String[] args) {

        TestNG testNG = new TestNG();
        try {
            List<XmlSuite> suite = (List<XmlSuite>) (new Parser("src/main/resources/testng.xml")).parse();
            testNG.setXmlSuites(suite);
            testNG.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }

}
