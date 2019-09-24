package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tst.Browsers;

public class CssSelector {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = Browsers.invokeChrome();

        driver.get("http://www.amazon.com");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("asd");

    }

}
