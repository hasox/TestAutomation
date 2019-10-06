package tst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Browsers {
    public static WebDriver invokeChrome(){
        DesiredCapabilities dc = DesiredCapabilities.chrome();
        //dc.acceptInsecureCerts();
        dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
        ChromeOptions co = new ChromeOptions();
        co.merge(dc);
        System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(co);
        return driver;
    }

    public static WebDriver invokeOpera(){

        OperaOptions option = new OperaOptions();
        option.setBinary("C:\\Users\\HasanCanInci\\AppData\\Local\\Programs\\Opera\\63.0.3368.94\\opera.exe");
        System.setProperty("webdriver.opera.driver","C:\\work\\operadriver.exe");
        WebDriver driver = new OperaDriver(option);
        return driver;

    }
}
