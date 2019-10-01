package tst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class Browsers {
    public static WebDriver invokeChrome(){
        System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
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
