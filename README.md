# OrangeHRM Timesheet Module Automation Selenium_POM
### Introduction
This project automates the Timesheet module of the OrangeHRM application using Selenium WebDriver. It encompasses end-to-end flows such as entering and submitting timesheets, recording attendance, generating reports, and managing project information. The framework is designed with the Page Object Model (POM) pattern, utilizing TestNG for test management, and Maven for build automation.

### Project Type
Automation Testing (End-to-End)

### Application Under Test
OrangeHRM Demo: https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

Directory Structure
css
Copy code
OrangeHRM-Timesheet-Automation/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── orangehrm/
│   │   │           ├── pages/
│   │   │           │   ├── LoginPage.java
│   │   │           │   ├── TimesheetPage.java
│   │   │           │   ├── AttendancePage.java
│   │   │           │   ├── ReportsPage.java
│   │   │           │   └── ProjectInfoPage.java
│   │   │           └── utils/
│   │   │               ├── ConfigReader.java
│   │   │               ├── WebDriverManager.java
│   │   │               └── TestUtil.java
│   └── test/
│       ├── java/
│       │   └── com/
│       │       └── orangehrm/
│       │           └── tests/
│       │               ├── LoginTest.java
│       │               ├── TimesheetTest.java
│       │               ├── AttendanceTest.java
│       │               ├── ReportsTest.java
│       │               └── ProjectInfoTest.java
│       └── resources/
│           └── testng.xml
├── screenshots/
├── extent-reports/
├── pom.xml
└── README.md
### Features
Timesheet Management: Automates the process of entering and submitting timesheets.
Attendance Recording: Automates attendance entry workflows.
Report Generation: Automates the generation and validation of various reports.
Project Information Management: Automates the management of project-related information.
Assertions and Validations: Incorporates assertions to validate expected outcomes at each step.
Screenshot Capture: Captures screenshots at specified steps for documentation and debugging.
Extent Reports: Generates comprehensive test execution reports.
Design Decisions
Page Object Model (POM): Implemented to enhance code modularity and reusability.
TestNG Framework: Utilized for test execution management and reporting.
Maven Integration: Employed for dependency management and build automation.
Configuration Management: Application URLs and other configurable parameters are managed via property files.
Explicit Waits: Applied to handle dynamic web elements effectively.
Assertions: Used to validate test outcomes and ensure reliability.
Screenshot Capture: Implemented to capture screenshots upon test failures for debugging purposes.
Extent Reports: Integrated to provide detailed and visually appealing test reports.
Installation & Getting Started
Clone the Repository:

bash
Copy code
git clone https://github.com/YourUsername/OrangeHRM-Timesheet-Automation.git
Navigate to the Project Directory:

bash
Copy code
cd OrangeHRM-Timesheet-Automation
Install Dependencies: Ensure that Maven is installed on your system. Then, execute:

bash
Copy code
mvn clean install
Configure Application Properties: Update the config.properties file located in src/main/resources with the appropriate URL and credentials for the OrangeHRM application.

Execute Tests: Run the test suite using Maven:

bash
Copy code
mvn test
View Reports: After execution, access the generated Extent Reports located in the extent-reports directory for detailed insights.

### Technology Stack
Selenium WebDriver: For browser automation.
Java: Programming language for scripting.
TestNG: Testing framework for managing test cases.
Maven: Build automation and dependency management tool.
Extent Reports: For generating detailed test execution reports.
Code Structure and Testing
Page Objects: Each web page is represented by a corresponding class in the pages package, encapsulating the elements and actions pertinent to that page.
Test Classes: Located in the tests package, these classes contain test methods that execute various user scenarios by interacting with the page objects.
Utilities: The utils package includes helper classes for configuration reading, WebDriver management, and common test utilities.
TestNG Configuration: The testng.xml file defines the test suite and facilitates the execution of test classes.
### Commenting
The codebase is thoroughly commented to elucidate the functionality of classes, methods, and critical code segments, enhancing readability and maintainability.
