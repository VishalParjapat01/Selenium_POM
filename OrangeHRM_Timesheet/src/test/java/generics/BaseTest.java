package generics;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {

    public WebDriver driver; // To control the browser
    public static ExtentReports extent; // Main report instance for Extent Reports
    public static ExtentTest test; // For logging steps into the report

    @BeforeClass
    public void Setup() throws IOException {
        // 1. Setting up the Extent Report
        ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReports/OrangeHRMReport.html");
        spark.config().setReportName("OrangeHRM Test Report"); // Name of the report
        spark.config().setDocumentTitle("Automation Test Report"); // Title of the report
        extent = new ExtentReports(); // Creating an instance of ExtentReports
        extent.attachReporter(spark); // Attaching the Spark Reporter

        // 2. Setting up the browser
        driver = new ChromeDriver(); // Starting the Chrome browser

        // 3. Reading data from a configuration file
        Properties propert = new Properties();
        FileInputStream file = new FileInputStream("src/test/resources/config.properties"); // File with URL, username, password
        propert.load(file); // Loading the file into Properties

        // 4. Getting the URL from the config file and opening it in the browser
        String origin = propert.getProperty("url");
        driver.get(origin);

        // 5. Setting browser options
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6)); // Waiting time for elements
        driver.manage().window().maximize(); // Maximizing the browser window

        // Logging this information into the Extent Report
        test = extent.createTest("Setup Test").info("Browser setup completed and navigated to URL: " + origin);
    }

    @AfterClass
    public void teardown() throws InterruptedException {
        // Waiting for a few seconds before closing the browser
        Thread.sleep(3000);
        driver.close(); // Closing the browser

        // Writing all the information into the report file
        extent.flush();
    }
}
