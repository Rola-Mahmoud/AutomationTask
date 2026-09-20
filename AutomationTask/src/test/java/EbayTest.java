import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;


public class EbayTest {
    WebDriver driver;
    @Test
    public void ebay() throws InterruptedException {

        //Open browser
        driver = new EdgeDriver();
        driver.manage().window().maximize();

        //Navigate to ebay
        driver.get("https://www.ebay.com/");
        Thread.sleep(3000);

        //Verify home page
        Assert.assertTrue(driver.findElement(By.id("ebayLogoTitle")).isDisplayed(), "eBay home page is not displayed");

        //Search for "mazda mx-5"
        WebElement searchBox = driver.findElement(By.id("gh-ac"));
        searchBox.sendKeys("mazda mx-5");
        searchBox.submit();
        Thread.sleep(3000);


        //Verify search results
        List<WebElement> searchResults = driver.findElements(By.cssSelector(".srp-results > .s-card"));
        System.out.println("Number of search results: " + searchResults.size());

        //Open first search result
        WebElement firstElement = searchResults.get(0).findElement(By.tagName("a"));
        String firstElementHref = firstElement.getAttribute("href");
        firstElement.click();
        Thread.sleep(3000);

        //Verify item details page
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        Assert.assertEquals(driver.getCurrentUrl(),firstElementHref,"Item details page isn't displayed");

        //Close browser
        driver.quit();
    }
}