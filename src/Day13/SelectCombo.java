package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import TestCases.Browsers;

public class SelectCombo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver ibrahimHocaIsTheBest =Browsers.invokeChrome();
        ibrahimHocaIsTheBest.get("http://www.expedia.com");
        Thread.sleep(3000);
        WebElement preferredClass = ibrahimHocaIsTheBest.findElement(By.cssSelector("#package-advanced-preferred-class-hp-package"));
        Select s = new Select(preferredClass);
        s.selectByValue("p");
        Thread.sleep(3000);
        s.selectByIndex(0);
        Thread.sleep(3000);
        s.selectByVisibleText("Business");

    }
}
