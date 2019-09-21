import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class XpathPositiveFacebook {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = AllBrowsersClass.invokeChrome();

        driver.get("http://www.facebook.com");
        Thread.sleep(2000);
        // Inputs are totally random just to test if the sendKeys function works.

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Hasan Can");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("password");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[contains(@id='ema')]")).clear();



    }
}
