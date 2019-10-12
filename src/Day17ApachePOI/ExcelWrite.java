package Day17ApachePOI;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.*;

public class ExcelWrite {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\work\\test.xls");
        FileInputStream fs = new FileInputStream(file);
        Workbook wb = new HSSFWorkbook(fs);
        Sheet sh = wb.getSheet("TestSheet");



        for(int i=-0;i<6;i++){
            Row rw = sh.getRow(i);
            Cell cell = rw.createCell(0, CellType.STRING);
            cell.setCellValue("updated");
        }

        fs.close();
        FileOutputStream fos = new FileOutputStream(file);
        wb.write(fos);
        fos.close();


    }
}
