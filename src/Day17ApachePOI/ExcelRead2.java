package Day17ApachePOI;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead2 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\work\\test.xls");
        FileInputStream fs = new FileInputStream(file);

        Workbook wb = new HSSFWorkbook(fs);
        System.out.println(wb.getSheet("TestSheet").getRow(8).getCell(0));
        int totalRows = wb.getSheetAt(1).getLastRowNum();
        System.out.println(totalRows);

    }
}
