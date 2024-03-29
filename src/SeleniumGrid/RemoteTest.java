package SeleniumGrid;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteTest {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setBrowserName(BrowserType.CHROME);
        dc.setPlatform(Platform.WINDOWS);

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dc);
        driver.get("http://expedia.com");

    }
}
