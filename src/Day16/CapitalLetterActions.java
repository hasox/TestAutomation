package Day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import TestCases.Browsers;

import java.util.concurrent.TimeUnit;

public class CapitalLetterActions {
    public static void main(String[] args) {
        WebDriver driver = Browsers.invokeChrome();

        driver.get("http://www.facebook.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions myActions = new Actions(driver);

        WebElement myElement = driver.findElement(By.cssSelector("#email"));

        // To be continued, code is not completed.

    }
}
