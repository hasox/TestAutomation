package tst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InstagramLikeTest {
    public static void main(String[] args) throws InterruptedException {
        String password = "EnterAPasswordHere";
        String username = "EnterAUserNameHere";


        WebDriver driver = Browsers.invokeChrome();
        driver.get("https://www.instagram.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\'react-root\']/section/main/article/div[2]/div[1]/div/form/div[1]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("m_login_email")).sendKeys(username);
        Thread.sleep(2000);
        driver.findElement(By.id("m_login_password")).sendKeys(password);
        Thread.sleep(2000);
        driver.findElement(By.name("login")).click();
        Thread.sleep(3500);
        driver.findElement(By.xpath("//button[text()='Not Now']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("span[aria-label='Profile']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='react-root']/section/main/div/div[3]/article/div[1]/div/div[1]/div[1]/a/div/div[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("span[aria-label='Like']")).click();

    }
}
