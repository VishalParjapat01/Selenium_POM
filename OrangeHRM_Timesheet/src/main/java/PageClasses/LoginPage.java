package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// This class represents the login page of a website or application.
public class LoginPage {

    // This is the WebDriver instance used to control the browser.
    WebDriver driver;

    // Constructor: This method runs when we create an object of the LoginPage class.
    public LoginPage(WebDriver driver) {
        // Save the browser driver passed as a parameter to this class so we can use it.
        this.driver = driver;

        // Initialize the elements (like text fields, buttons) on the page using Selenium's PageFactory.
        PageFactory.initElements(driver, this);
    }

    // Use @FindBy to locate web elements (like username, password fields, and login button) on the webpage.

    // Find the username field by its name attribute on the web page.
    @FindBy(name = "username")
    private WebElement username;

    // Find the password field by its name attribute on the web page.
    @FindBy(name = "password")
    private WebElement password;

    // Find the login button by its type attribute with CSS selector.
    @FindBy(css = "[type='submit']")
    private WebElement loginButton;

    // These are getter methods that allow us to access the private elements.
    // These methods return the elements like username, password, or login button.

    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    // This method performs the login action on the web page.
    public void Login() {
        // Type the username into the username field.
        username.sendKeys("Admin");

        // Type the password into the password field.
        password.sendKeys("admin123");

        // Click the login button to submit the login form.
        loginButton.click();

        
    }
}
