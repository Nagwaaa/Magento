package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	
	static FileInputStream fis=null;
	
	public  FileInputStream getFile()
	{
		String path=System.getProperty("user.dir")+"\\src\\test\\java\\data\\userDat.xlsx";
		File sfile=new File(path);
		try {
			fis=new FileInputStream(sfile);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		return fis;
		
	}
	
	
	public Object[][] getExcellData() throws IOException
	{
		fis=getFile();
		XSSFWorkbook wk=new XSSFWorkbook(fis);
		XSSFSheet sheet=wk.getSheetAt(0);
		int row=sheet.getLastRowNum()+1;
		int col=5;
		String[][] arr=new String[row][col];
		for(int x=0;x<row;x++)
		{
			for(int i=0;i<col;i++)
			{
				XSSFRow xr=sheet.getRow(x);
				arr[x][i]=xr.getCell(i).toString();
				
			}
		}
		wk.close();
		return arr;
		
	}

}
