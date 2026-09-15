# Disney Selenium Automation

Selenium WebDriver automation framework for testing Disney+ using Java, TestNG, and Maven.

## Tech Stack

* **Java 17**
* **Selenium WebDriver 4.35.0**
* **TestNG 7.11.0**
* **Maven**
* **Chrome**
* **Page Object Model (POM)**

## Project Structure

```text
disney-selenium-automation/
├── pom.xml
├── README.md
├── .gitignore
└── src/
    ├── main/
    │   └── java/
    │       └── com/
    │           └── heliocastro/
    │               └── pages/
    │                   ├── BasePage.java
    │                   ├── HomePage.java
    │                   ├── ExplorePage.java
    │                   └── PrivacyPage.java
    └── test/
        └── java/
            └── com/
                └── heliocastro/
                    └── DisneyTest.java
```

## Framework Design

The project follows the **Page Object Model** to separate test scenarios from page-specific implementation.

### BasePage

Contains common Selenium functionality shared across page objects, including:

* WebDriver initialization
* Explicit waits
* Reusable element interactions

### HomePage

Contains elements and actions specific to the Disney+ home page.

### ExplorePage

Contains elements and actions specific to the Disney+ Explore page.

### PrivacyPage

Contains information and functionality specific to the Disney+ Privacy page.

### Tests

TestNG test classes contain the test scenarios and assertions.

The overall flow is:

```text
TestNG Test
     ↓
Page Object
     ↓
BasePage
     ↓
Selenium WebDriver
```

## Test Scenarios

The automation covers navigation across Disney+ pages and validates expected page URLs.

### Privacy Page

1. Open Disney+
2. Navigate to the privacy page
3. Verify navigation to the expected Privacy Policy URL
4. Close the browser

### Explore Page

1. Open Disney+
2. Navigate to the Explore page
3. Verify navigation to the expected Explore URL
4. Close the browser

## Prerequisites

Before running the project, make sure you have:

* Java 17 or higher
* Maven
* Google Chrome
* Git

Selenium Manager automatically manages the required browser driver.

## Running the Tests

Clone the repository:

```bash
git clone <repository-url>
```

Navigate to the project directory:

```bash
cd disney-selenium-automation
```

Run the tests:

```bash
mvn clean test
```

A successful execution should display:

```text
BUILD SUCCESS
```

## Notes

The framework uses explicit waits rather than fixed sleeps to improve test stability and reduce unnecessary waiting.

TestNG is used as the test framework, while Maven manages project dependencies and test execution.
