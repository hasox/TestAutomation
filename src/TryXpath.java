import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TryXpath {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = AllBrowsersClass.invokeChrome();

        driver.get("http://www.flypgs.com");
        Thread.sleep(3000);

        // We have to close the pop-up in order to be able to click the radio button.
        driver.findElement(By.xpath("//*[@id='hypeCookieDiv']/a[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[@for='one_way']")).click();






    }

}
