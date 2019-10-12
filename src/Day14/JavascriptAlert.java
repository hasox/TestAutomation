package Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import TestCases.Browsers;

import java.util.concurrent.TimeUnit;

public class JavascriptAlert {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Browsers.invokeChrome();
        driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("input[type='button']")).click();

        String expectedString = "Are you sure you want to give us the deed to your house?";
        if(expectedString.contains(driver.switchTo().alert().getText())){
            driver.switchTo().alert().accept();
        }






    }
}
