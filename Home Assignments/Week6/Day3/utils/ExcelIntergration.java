package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntergration {

	public static String[][] readExcel(String fileName) throws IOException {
		// TODO Auto-generated method stub
		//open the excel workbook
				XSSFWorkbook wb=new XSSFWorkbook("./data/"+fileName+".xlsx");
				//go to the specific sheet in workbook by sheet name/index
				//wb.getSheet("createlead");
				XSSFSheet sheetAt = wb.getSheetAt(0);
				//enter specific row
				//XSSFRow row=sheetAt.getRow(1);
				//enter specific column
				//XSSFCell cell=row.getCell(3);
				
				//to retrieve value
				//String singledata=cell.getStringCellValue();
				//System.out.println(singledata);

				
				//find row count
				int lastRowNum = sheetAt.getLastRowNum();
				System.out.println("row count is: " +lastRowNum);
				//find column count
				int lastCellNum = sheetAt.getRow(0).getLastCellNum();
				System.out.println("col count is: " +lastCellNum);
				
				String[][] data=new String[lastRowNum][lastCellNum];
				
				for(int i=1;i<=lastRowNum;i++)
				{
					XSSFRow row2 = sheetAt.getRow(i);
					for(int j=0;j<lastCellNum;j++)
					{
						XSSFCell cell2 = row2.getCell(j);
						String stringCellValue2 = cell2.getStringCellValue();
						System.out.println(stringCellValue2);
						data[i-1][j]=stringCellValue2;
					}
					
				}
				wb.close();
				return data;


	}

}
