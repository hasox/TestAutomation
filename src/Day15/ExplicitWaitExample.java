package Day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import TestCases.Browsers;

public class ExplicitWaitExample {
    public static void main(String[] args) {
        WebDriver driver = Browsers.invokeChrome();
        driver.findElement(By.id("tab-flight-tab-hp")).click();

        WebDriverWait wait=new WebDriverWait(driver,20);




    }




}
