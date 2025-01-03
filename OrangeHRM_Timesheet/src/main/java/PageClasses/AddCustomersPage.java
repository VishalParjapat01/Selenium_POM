package PageClasses;

// Import necessary classes for browser interactions.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomersPage {

    // WebDriver is used to control the browser.
    WebDriver driver;

    // Constructor: This method runs when we create an object of the AddCustomersPage class.
    public AddCustomersPage(WebDriver driver) {
        // Save the browser driver passed to this class so we can use it for browser actions.
        this.driver = driver;

        // Initialize the elements (like text fields, buttons) on the page using Selenium's PageFactory.
        PageFactory.initElements(driver, this);
    }

    // Use @FindBy to locate web elements (like text boxes and buttons) on the webpage.

    // Find the "Customer Name" input field by its position in the list of similar elements.
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement custName;

    // Find the "Description" input box by its placeholder text.
    @FindBy(css = "[placeholder='Type description here']")
    private WebElement descriptionText;

    // Find the "Save" button by its text on the page.
    @FindBy(xpath = "//button[.=' Save ']")
    private WebElement saveButton;

    // Getter methods to access private elements. These methods return the web elements.

    public WebElement getCustName() {
        return custName;
    }

    public WebElement getDescriptionText() {
        return descriptionText;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

    // This method performs the action of adding a new customer to the system.
    public void CustomerAdd() {
        // Enter the customer's name into the "Customer Name" input field.
        custName.sendKeys("Punit");

        // Enter a description for the customer into the "Description" input box.
        descriptionText.sendKeys("QA for team A");

        // Click the "Save" button to save the new customer details.
        saveButton.click();
    }
}
