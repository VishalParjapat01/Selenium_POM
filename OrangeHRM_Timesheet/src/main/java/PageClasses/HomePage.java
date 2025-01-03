package PageClasses;

// Import necessary classes for browser interactions, assertions, and web element handling.
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    // WebDriver is used to control the browser.
    WebDriver driver;

    // SoftAssert is used for testing purposes to verify if the page is correct.
    SoftAssert softAssert = new SoftAssert();

    // Constructor: This method runs when we create an object of the HomePage class.
    public HomePage(WebDriver driver) {
        // Save the browser driver passed to this class so we can use it for browser actions.
        this.driver = driver;

        // Initialize the elements (like buttons and links) on the page using Selenium's PageFactory.
        PageFactory.initElements(driver, this);
    }

    // Use @FindBy to locate elements on the web page by their properties (like text or position).

    // Find the "Time" link by its unique property.
    @FindBy(xpath = "//a[@href='/web/index.php/time/viewTimeModule']")
    private WebElement timeLink;

    // Find the "Project Info" section by its text.
    @FindBy(xpath = "//span[.='Project Info ']")
    private WebElement projectinfo;

    // Find the "Customers" link by its text.
    @FindBy(xpath = "//a[.='Customers']")
    private WebElement customerclick;

    // Find the "Add Customer" button by its position on the page.
    @FindBy(xpath = "(//*[.=' Add '])[1]")
    private WebElement addcusto;

    // Find the "Dashboard" header element for validation.
    @FindBy(xpath = "//h6[.='Dashboard']")
    private WebElement dashAssert;

    // Getter methods to access private elements. These methods return the web elements.

    public WebElement getTimeLink() {
        return timeLink;
    }

    public WebElement getProjectinfo() {
        return projectinfo;
    }

    public WebElement getCustomerclick() {
        return customerclick;
    }

    public WebElement getAddcusto() {
        return addcusto;
    }

    public WebElement getSoftAssert() {
        return dashAssert;
    }

    // This method verifies that the Dashboard page is displayed correctly.
    public void dashAssertion() {
        // Get the actual text from the Dashboard header element.
        String actualText = dashAssert.getText();

        // Check if the actual text matches the expected text "Dashboard".
        softAssert.assertEquals(actualText, "Dashboard");

        // Call assertAll to ensure all soft assertions are verified.
        softAssert.assertAll();

        // Print a success message to the console.
        System.out.println("Success");
    }

    // This method automates navigation to the "Time" section and adding a customer.
    public void Time() {
        // Click on the "Time" link to go to the Time section.
        timeLink.click();

        // Click on the "Project Info" section to open it.
        projectinfo.click();

        // Click on the "Customers" link to view customer details.
        customerclick.click();

        // Click on the "Add Customer" button to add a new customer.
        addcusto.click();
    }
}
