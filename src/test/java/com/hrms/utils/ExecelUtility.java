package com.hrms.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// we are creating 

public class ExecelUtility {
	private static Workbook wbook;
	private static Sheet sheet;

	/**
	 * this method will open excel file and specified sheet
	 * 
	 * @param filePath
	 * @param sheetName
	 */
	public static void openExcel(String filePath, String sheetName) {

		try {
			FileInputStream fis = new FileInputStream(filePath);
			wbook = new XSSFWorkbook(fis);
			sheet = wbook.getSheet(sheetName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static int rowCount() {
		return sheet.getPhysicalNumberOfRows();

	}

	public static int cellCount(int rowN) {
		return sheet.getRow(rowN).getLastCellNum();
	}

	public static String getCellData(int rowIndex, int cellIndex) {
		return sheet.getRow(rowIndex).getCell(cellIndex).toString();
	}

	/**
	 * this method will read any excel file and return data in 2d arrray
	 * 
	 * @param filePath
	 * @param sheetName
	 * @return
	 */
	public static Object[][] exelIntoArray(String filePath, String sheetName) {
		openExcel(filePath, sheetName);
		int rows = rowCount();
		int cols = cellCount(0);

		Object[][] data = new Object[rows - 1][cols];
		for (int r = 1; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				data[r - 1][c] = getCellData(r, c);

			}

		}
		return data;

	}

	/**
	 * this method will grap the data from excel file and transfer it into a List of
	 * Maps
	 * 
	 * @param filepth
	 * @param sheetName
	 * @return List of Maps
	 */

	public static List<Map<String, String>> excelToLisOfMaps(String filepth, String sheetName) {

		openExcel(filepth, sheetName);

		List<Map<String, String>> excelList = new ArrayList<Map<String, String>>();
		Map<String, String> excelmap;

		for (int r = 1; r < rowCount(); r++) {
			excelmap = new LinkedHashMap<>();
			for (int c = 0; c < cellCount(r); c++) {

				excelmap.put(getCellData(0, c), getCellData(r, c));

			}

			excelList.add(excelmap);

		}
		return excelList;

	}

}
