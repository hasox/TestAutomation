package Day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import TestCases.Browsers;

public class DragAndDropPractice {
    public static void main(String[] args) {
        WebDriver driver = Browsers.invokeChrome();

        driver.get("https://jqueryui.com/droppable/");
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("iframe.demo-frame")));
        driver.manage().window().maximize();
       // driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
        Actions drag = new Actions(driver);

        WebElement source = driver.findElement(By.cssSelector("#draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        drag.dragAndDrop(source,target).build().perform();
        driver.switchTo().defaultContent();


    }
}
