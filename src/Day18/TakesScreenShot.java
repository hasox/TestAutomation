package Day18;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import TestCases.Browsers;

import java.io.File;
import java.io.IOException;

public class TakesScreenShot {
    public static void main(String[] args) throws IOException {
        WebDriver driver = Browsers.invokeChrome();
        driver.get("http://www.amazon.com");

        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("C:\\work\\myScreenshot.bmp"));
        // this is an Apache Commons io feature



    }
}
