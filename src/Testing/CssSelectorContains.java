package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import TestCases.Browsers;

public class CssSelectorContains {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Browsers.invokeChrome();

        driver.get("http://www.facebook.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Forgot account?']")).click();
        //driver.findElement(By.linkText("Forgot account?")).click();

    }
}
