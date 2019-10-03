package Day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tst.Browsers;

public class ActionDragAndDrop {
    public static void main(String[] args) {
        WebDriver driver = Browsers.invokeChrome();

        driver.get("http://demo.guru99.com/test/drag_drop.html");
        WebDriverWait wait= new WebDriverWait(driver,10);   //System checks condition every 500 milliseconds, so it can check 20 times.
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()=' BANK ']")));

        WebElement bankButton = driver.findElement(By.xpath("//a[text()=' BANK ']"));
        WebElement target = driver.findElement(By.cssSelector("#bank>li"));

        Actions action = new Actions(driver);
        action.dragAndDrop(bankButton,target).build().perform();

    }
}
