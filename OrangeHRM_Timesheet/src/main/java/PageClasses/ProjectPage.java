package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProjectPage {

    // This is the WebDriver instance used to control the browser.
    WebDriver driver;

    // WebDriverWait helps us wait for elements to load on the page before interacting with them.
    WebDriverWait wait;

    // Constructor: This method runs when we create an object of the ProjectPage class.
    public ProjectPage(WebDriver driver) {
        // Save the browser driver passed to this class so we can use it.
        this.driver = driver;

        // Initialize the web elements on the page using Selenium's PageFactory.
        PageFactory.initElements(driver, this);
    }

    // Use @FindBy to locate web elements (like buttons, text fields) on the webpage.

    // Find the "Project Info" menu item by its text on the page.
    @FindBy(xpath = "//span[.='Project Info ']")
    private WebElement projectinfo;

    // Find the "Projects" link by its text on the page.
    @FindBy(xpath = "//a[.='Projects']")
    private WebElement projectclick;

    // Find the "Add Customer" button by its CSS class.
    @FindBy(css = "[class='oxd-button oxd-button--medium oxd-button--secondary']")
    private WebElement addcusto;

    // Find the "Project Name" input field by its position in the list of similar elements.
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement ProjName;

    // Find the "Customer Name" input field by its placeholder text.
    @FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")
    private WebElement custoName;

    // Find the "Project Admin" input field by its placeholder text.
    @FindBy(xpath = "(//input[@placeholder='Type for hints...'])[2]")
    private WebElement projAdmin;

    // Find the "Save" button by its text on the page.
    @FindBy(xpath = "//button[.=' Save ']")
    private WebElement saveButton;

    // Getter methods to access the private elements. These methods return the web elements.

    public WebElement getProjectinfo() {
        return projectinfo;
    }

    public WebElement getProjectclick() {
        return projectclick;
    }

    public WebElement getAddcusto() {
        return addcusto;
    }

    public WebElement getProjName() {
        return ProjName;
    }

    public WebElement getCustoName() {
        return custoName;
    }

    public WebElement getProjAdmin() {
        return projAdmin;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

    // This method performs the action of creating a project on the webpage.
    public void project() {
        // Click on the "Project Info" menu to open it.
        projectinfo.click();

        // Click on the "Projects" link to go to the projects page.
        projectclick.click();

        // Click on the "Add Customer" button to start adding a new project.
        addcusto.click();

        // Enter the project name in the "Project Name" input field.
        ProjName.sendKeys("CLaster");

        // Enter the customer name in the "Customer Name" input field.
        // This might be part of a dropdown that shows suggestions as we type.
        custoName.sendKeys("abc");

        // Enter the project admin name in the "Project Admin" input field.
        // This might also show suggestions dynamically.
        projAdmin.sendKeys("punit");

        // Click the "Save" button to save the project details.
        saveButton.click();
    }
}
