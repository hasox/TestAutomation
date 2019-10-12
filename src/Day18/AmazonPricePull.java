package Day18;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import TestCases.Browsers;

import java.io.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AmazonPricePull {

    public static void main(String[] args) throws IOException, InterruptedException {


        File file = new File("C:\\work\\test2.xlsx");
        FileInputStream fs = new FileInputStream(file);
        Workbook wb = new XSSFWorkbook(fs);
        Sheet sh = wb.getSheet("test");

        WebDriver driver = Browsers.invokeChrome();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://www.amazon.com/s?k=air+conditioner&ref=nb_sb_noss_2");
        driver.manage().window().maximize();

        List<WebElement> price = driver.findElements(By.cssSelector(".a-section.a-spacing-medium .a-price-whole"));
        int size =driver.findElements(By.cssSelector(".a-size-medium.a-color-base.a-text-normal")).size();
        List<WebElement> productName = driver.findElements(By.cssSelector(".a-size-medium.a-color-base.a-text-normal"));
        System.out.println(size);


        for(int i=0;i<size;i++){
            sh.getRow(i).createCell(0).setCellValue(productName.get(i).getText());
            sh.getRow(i).createCell(1).setCellValue(price.get(i).getText());
        }
        fs.close();
        FileOutputStream fos = new FileOutputStream(file);
        wb.write(fos);
        fos.close();

       /* System.out.println(size);
        for(int i=0;i<size;i++) {
            System.out.println(driver.findElement(By.cssSelector("[data-index='" + i + "'] .a-price-whole")).getText());
        }*/
    }

}
