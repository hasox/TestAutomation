import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NameLocator {
    public static void main(String[] args) {
        WebDriver driver = AllBrowsersClass.invokeChrome();
        driver.get("http://www.facebook.com");
        driver.findElement(By.name("firstname")).sendKeys("Hasan");





    }
}
