package tst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class BankRateTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Browsers.invokeChrome();

        driver.get("https://www.bankrate.com/");
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
       // actions.moveToElement(driver.findElement(By.xpath("//a[text()='Banking']"))).perform();
        // Thread.sleep(3000);
        WebElement myElement2 = driver.findElement(By.xpath("//a[text()='Banking']"));
        WebElement myElement= driver.findElement(By.xpath("//a[text()='  Savings calculator ']"));


        Action actionSequence = actions.moveToElement(myElement2).moveToElement(myElement).click().build();
        actionSequence.perform();
        Thread.sleep(3000);
        WebElement myElement3= driver.findElement(By.cssSelector("input#text-4"));
        myElement3.clear();
        Thread.sleep(3000);
        myElement3.sendKeys("20000");
        Thread.sleep(3000);
        WebElement myElement4 = driver.findElement(By.cssSelector("span.numeral.--alpha"));
        String value = myElement4.getText();

        value = value.replaceAll("\\D+","");

        int number = Integer.parseInt(value);

        System.out.println(number);









    }
}
