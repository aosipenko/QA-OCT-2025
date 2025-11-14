package org.prog.session11;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.prog.session11.steps.DBSteps;
import org.prog.session11.steps.WebSteps;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.sql.DriverManager;
import java.sql.SQLException;

//TODO: Move previous HW to cucumber BDD, make amount of phones request a step param

@CucumberOptions(
        tags = "@regression or @bug and not @skip",
        features = "src/test/resources/features/session12",
        glue = "org.prog.session12.steps",
        plugin = {
                "pretty",
                "json:target/cucumber-reports/Cucumber.json",
                "html:target/cucumber-report.html",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        }
)
public class CucumberRunner extends AbstractTestNGCucumberTests {

    @BeforeSuite
    public void beforeSuite() throws SQLException {
        DBSteps.connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db", "root", "password");
        WebSteps.driver = new ChromeDriver();
    }

    @AfterSuite
    public void afterSuite() throws SQLException {
        DBSteps.connection.close();
        WebSteps.driver.quit();
    }
}