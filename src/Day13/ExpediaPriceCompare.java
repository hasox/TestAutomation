package Day13;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import tst.Browsers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExpediaPriceCompare {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Browsers.invokeChrome();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://www.expedia.com");
        driver.manage().window().maximize();

       // Thread.sleep(2000);
        driver.findElement(By.cssSelector("#tab-flight-tab-hp")).click();

       // Thread.sleep(3000);
        driver.findElement(By.cssSelector("#flight-origin-hp-flight")).click();
        driver.findElement(By.cssSelector("#flight-origin-hp-flight")).sendKeys("hou");
        //Thread.sleep(2000);
        driver.findElement(By.cssSelector("#flight-origin-hp-flight")).sendKeys(Keys.TAB);
       // Thread.sleep(2000);
        driver.findElement(By.cssSelector("#flight-destination-hp-flight")).click();
        driver.findElement(By.cssSelector("#flight-destination-hp-flight")).sendKeys("mia");

        driver.findElement(By.cssSelector("#flight-destination-hp-flight")).sendKeys(Keys.TAB);
        //Thread.sleep(2000);
        driver.findElement(By.cssSelector("#flight-departing-hp-flight")).sendKeys("01/01/2020");
        //Thread.sleep(3000);
        //driver.findElement(By.cssSelector("#flight-departing-hp-flight")).sendKeys(Keys.TAB);

        driver.findElement(By.cssSelector("#flight-returning-hp-flight")).click();
        driver.findElement(By.cssSelector("#flight-returning-hp-flight")).sendKeys(Keys.chord(Keys.LEFT_CONTROL,"a",Keys.DELETE));

        driver.findElement(By.cssSelector("#flight-returning-hp-flight")).sendKeys("03/03/2020");

        driver.findElement(By.cssSelector("#wizard-tabs")).click();

        driver.findElement(By.cssSelector("#gcw-flights-form-hp-flight .btn-primary.btn-action.gcw-submit")).click();

        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,6000)","");

        //System.out.println(driver.findElements(By.xpath("/g/*[span]")).get(30).getText());
        System.out.println(driver.findElements(By.cssSelector("li span.medium-bold")).size());
       /* List <WebElement> test = driver.findElements(By.cssSelector("#flightModuleList [data-test-id='listing-price-dollars']"));
        System.out.println(test.size());
        int array[] = new int[test.size()];

        for(int i=0; i<test.size();i++) {
            array[i] = Integer.parseInt(test.get(i).getText().replaceAll("\\D+", ""));
        }

        System.out.println(Arrays.toString(array));
*/







    }
}
