# eBay Selenium Automation Test

A simple UI automation test for eBay using **Java, Selenium WebDriver, and TestNG**.

## Test Scenario

The test:

* Opens eBay using Microsoft Edge.
* Verifies the eBay homepage.
* Searches for **"mazda mx-5"**.
* Verifies search results.
* Print the number of search results.
* Opens the first result.
* Verifies the item details page.
* Closes the browser.

## Requirements

* Java JDK
* Maven
* Microsoft Edge
* Internet connection

## How to Run

1. Clone the repository:

```bash
git clone <repository-url>
```

2. Open the project in IntelliJ IDEA or Eclipse.

3. Make sure Maven dependencies are installed.

4. Run the test:

```bash
mvn test
```

Or run `EbayTest.java` directly from your IDE as a **TestNG test**.

## Technologies

* Java
* Selenium WebDriver
* TestNG
* Maven
* Microsoft Edge

## Demo Video

<video src="./AutomationTask.mp4" controls width="800"></video>
