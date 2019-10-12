package Day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import TestCases.Browsers;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SwitchWindow2 {
    public static void main(String[] args) {
        WebDriver driver = Browsers.invokeChrome();

        driver.get("http://accounts.google.com/signup");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()='Terms']")).click();
        Set<String> id = driver.getWindowHandles();
        //Iterator<String> myWin = id.iterator();

        for(String currentWindow : id){
            driver.switchTo().window(currentWindow);
            System.out.println(driver.getTitle());
        }
    }
}
