# SauceDemo Test Automation (Selenium, TestNG)

A small test automation project that tests the login and add-to-cart flows of
[saucedemo.com](https://www.saucedemo.com) using Java, Selenium WebDriver and TestNG.

## Test cases
| Class | Test | Checks |
|-------|------|--------|
| LoginTests | validLoginShowsProductsPage | Valid login opens the Products page |
| LoginTests | invalidPasswordShowsError | Wrong password shows an error message |
| LoginTests | lockedOutUserShowsError | Locked-out user shows an error message |
| CartTests | addItemToCartUpdatesCartCount | Adding an item sets the cart count to 1 |

## Tech
Java 11+, Selenium WebDriver 4, TestNG, Maven, Page Object Model, explicit waits

## Structure
```
src/test/java/
  base/BaseTest.java        browser setup and teardown
  pages/LoginPage.java      login page actions
  pages/InventoryPage.java  products page actions
  tests/LoginTests.java
  tests/CartTests.java
testng.xml                  test suite
```

## How to run
Requirements: JDK 11 or newer, Maven, Google Chrome.

```
mvn test                       # opens Chrome and runs the suite
mvn test -Dheadless=true       # runs without a browser window
```
Reports are created in `target/surefire-reports/`.
