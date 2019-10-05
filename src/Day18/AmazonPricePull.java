package Day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tst.Browsers;

import java.util.concurrent.TimeUnit;

public class AmazonPricePull {

    public static void main(String[] args) {
        WebDriver driver = Browsers.invokeChrome();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.amazon.com/s?k=air+conditioner&ref=nb_sb_noss_2");
        driver.manage().window().maximize();
        System.out.println();
        System.out.println(driver.findElements(By.cssSelector(".sg-row .a-size-medium.a-color-base.a-text-normal")).size());
        int size =driver.findElements(By.cssSelector("[data-index] .a-price-whole")).size();
        for(int i=0;i<size-5;i++) {
            System.out.println(driver.findElement(By.cssSelector("[data-index='" + i + "'] .a-price-whole")).getText());
        }
    }
    // To Be continued
}
