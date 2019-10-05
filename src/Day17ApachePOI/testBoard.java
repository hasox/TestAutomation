package Day17ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class testBoard {
    public static void main(String[] args) {
        Workbook wb = new XSSFWorkbook();
        Sheet sh = wb.getSheet("Sheet2");

        Row rw = sh.getRow(1);
        Cell emailInput =  rw.getCell(0);
        Cell pwInput = rw.getCell(1);

        System.out.println(emailInput.getStringCellValue());
        System.out.println(pwInput.getStringCellValue());

    }
}
