import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClassLocator {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = AllBrowsersClass.invokeChrome();

        driver.get("https://www.turkishairlines.com");
        Thread.sleep(2000);
        driver.findElement(By.className("thyHeaderLink")).click();

    }
}
