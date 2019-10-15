package Day20HeadlessChrome;

import TestCases.Browsers;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ChromeHeadlessExpedia {
    public static void main(String[] args) {
        WebDriver driver = Browsers.invokeChromeHeadless();
        System.out.println(1);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        System.out.println(2);
        driver.get("http://www.expedia.com");
        System.out.println(3);
        System.out.println(driver.getTitle());
        System.out.println(4);

    }
}
