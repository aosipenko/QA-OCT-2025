package org.prog.session12;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.prog.session12.steps.DBSteps;
import org.prog.session12.steps.WebSteps;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.sql.DriverManager;
import java.sql.SQLException;

//TODO: Move previous HW to cucumber BDD, make amount of phones request a step param

@CucumberOptions(
        features = "src/test/resources/features/session11",
        glue = "org.prog.session12.steps"
)
public class CucumberRunner extends AbstractTestNGCucumberTests {

    @BeforeSuite
    public void beforeSuite() throws SQLException {
        DBSteps.connection = DriverManager.getConnection(
                "jdbc:mysql://mysql-db-1:3306/db", "root", "password");
        WebSteps.driver = new ChromeDriver();
    }

    @AfterSuite
    public void afterSuite() throws SQLException {
        DBSteps.connection.close();
        WebSteps.driver.quit();
    }
}