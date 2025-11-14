package org.prog.session12;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import lombok.SneakyThrows;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.prog.session12.steps.DBSteps;
import org.prog.session12.steps.WebSteps;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.URL;
import java.sql.DriverManager;
import java.sql.SQLException;

//TODO: Move previous HW to cucumber BDD, make amount of phones request a step param

@CucumberOptions(
        features = "src/test/resources/features/session11",
        glue = "org.prog.session12.steps",
        plugin = {
                "pretty",
                "json:target/cucumber-reports/Cucumber.json",
                "html:target/cucumber-report.html"}
)
public class CucumberRunner extends AbstractTestNGCucumberTests {

    @SneakyThrows
    @BeforeSuite
    public void beforeSuite() throws SQLException {
        DBSteps.connection = DriverManager.getConnection(
                "jdbc:mysql://mysql-db-1:3306/db", "root", "password");
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        WebSteps.driver = new RemoteWebDriver(new URL("http://selenium-hub:4444"), options);
    }

    @AfterSuite
    public void afterSuite() throws SQLException {
        DBSteps.connection.close();
        WebSteps.driver.quit();
    }
}