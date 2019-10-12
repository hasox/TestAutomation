package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class QM_1_ValidateHotelReservation {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Browsers.invokeChrome();
        driver.get("http://www.tatilsepeti.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        WebElement hotel = driver.findElement(By.id("bolge"));
        hotel.sendKeys("cesme");
        Thread.sleep(3000); // WebDriverWait is recommended here instead of Thread Sleep
        hotel.sendKeys(Keys.ARROW_DOWN);
        hotel.sendKeys(Keys.ENTER);

        driver.findElement(By.id("giris-tarihi")).click();
        driver.findElements(By.cssSelector(".ui-datepicker-group.ui-datepicker-group-first [data-handler='selectDay']")).get(0).click();

        driver.findElement(By.id("cikis-tarihi")).click();
        driver.findElements(By.cssSelector(".ui-datepicker-group.ui-datepicker-group-last [data-handler='selectDay']")).get(0).click();

        driver.findElement(By.id("searchBtn")).click();

        driver.findElement(By.cssSelector("button.btn.btn-default[data-val='fiyat;yon:asc']")).click();

        Iterator<WebElement> price = driver.findElements(By.cssSelector(".discount-price")).iterator();
        Iterator<WebElement> hotelName = driver.findElements(By.cssSelector("#HotelList .panel-heading a[href][title]")).iterator();

        while(hotelName.hasNext()){
            System.out.println(
                   "Hotel Name: "  + hotelName.next().getText() +
                           " ------------- Price: " + price.next().getText()
            );
        }
    }
}
