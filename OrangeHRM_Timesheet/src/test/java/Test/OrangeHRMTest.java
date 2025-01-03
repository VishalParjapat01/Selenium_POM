package Test;

// Import necessary classes for testing.
import org.testng.annotations.Test;

// Import all the Page Classes (LoginPage, HomePage, AddCustomersPage, ProjectPage) and the BaseTest class.
import PageClasses.AddCustomersPage;
import PageClasses.HomePage;
import PageClasses.LoginPage;
import PageClasses.ProjectPage;
import generics.BaseTest;

// This class contains test cases for the OrangeHRM application and extends BaseTest to reuse the setup and teardown methods.
public class OrangeHRMTest extends BaseTest {

    // Declare objects for different page classes.
    LoginPage Lpage;       // For login functionality.
    HomePage Hpage;        // For homepage-related functionality.
    AddCustomersPage AddCpage; // For adding customer-related functionality.
    ProjectPage Projpage;  // For project-related functionality.

    // The BaseTest class (parent class) handles the setup (browser initialization) and cleanup (browser close).

    // Test case 1: Log in to the application.
    @Test(priority = 0) // The priority ensures this test runs first.
    public void Logintest() {
        // Create an object of the LoginPage class.
        Lpage = new LoginPage(driver);

        // Call the login method to enter the username and password and log in.
        // `user` and `pass` values are fetched from the configuration file.
        Lpage.Login();
    }

    // Test case 2: Verify that the dashboard page is displayed after login.
    @Test(priority = 1) // This test runs after the login test.
    public void DeshbordAssert() {
        // Create an object of the HomePage class.
        Hpage = new HomePage(driver);

        // Verify if the dashboard page is displayed using an assertion.
        Hpage.dashAssertion();
    }

    // Test case 3: Navigate through the Time module in the homepage.
    @Test(priority = 2) // Runs after the dashboard verification.
    public void Hometest() {
        // Create an object of the HomePage class.
        Hpage = new HomePage(driver);

        // Perform navigation to the Time module using the Time method.
        Hpage.Time();
    }

    // Test case 4: Add a new customer to the application.
    @Test(priority = 3) // Runs after the homepage test.
    public void AddCustomerM() {
        // Create an object of the AddCustomersPage class.
        AddCpage = new AddCustomersPage(driver);

        // Add a new customer using the CustomerAdd method.
        AddCpage.CustomerAdd();
    }

    // Test case 5: Add a new project under the Project module.
    @Test(priority = 4) // Runs after the Add Customer test.
    public void ProjectM() throws InterruptedException {
        // Create an object of the ProjectPage class.
        Projpage = new ProjectPage(driver);

        // Add a new project using the project method.
        Projpage.project();
    }
}
