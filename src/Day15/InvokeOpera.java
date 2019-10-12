package Day15;

import org.openqa.selenium.WebDriver;
import TestCases.Browsers;

public class InvokeOpera {

    public static void main(String[] args) {
        WebDriver driver = Browsers.invokeOpera();

        driver.get("http://www.amazon.com");
    }
}
