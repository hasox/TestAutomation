package Day17ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import TestCases.Browsers;

import java.io.*;

public class DataTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        File file = new File("C:\\work\\book1.xlsx");
        FileInputStream fs = new FileInputStream(file);


        WebDriver driver = Browsers.invokeChrome();
        driver.get("http://www.facebook.com");
        Thread.sleep(2000);
        WebElement email = driver.findElement(By.id("email"));
        WebElement pw = driver.findElement(By.id("pass"));


        Workbook wb = new XSSFWorkbook(fs);
        Sheet sh = wb.getSheet("Sheet2");

        int totalRows = sh.getLastRowNum()+1;
        System.out.println(totalRows);

        for(int i=1;i<totalRows;i++){
            Row rw = sh.getRow(i);
            Cell emailInput =  rw.getCell(0);
            Cell pwInput = rw.getCell(1);

            email.sendKeys(emailInput.getStringCellValue());
            pw.sendKeys(pwInput.getStringCellValue());

            Cell result = rw.createCell(2);
            result.setCellValue("passed");
            fs.close();
            FileOutputStream fos = new FileOutputStream(file);
            wb.write(fos);
            fos.close();

        }
    }
}

