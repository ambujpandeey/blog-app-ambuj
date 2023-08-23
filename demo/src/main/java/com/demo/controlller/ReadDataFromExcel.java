package com.demo.controlller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.demo.model.Excel;

@RestController
@RequestMapping("/api")
public class ReadDataFromExcel {

// Send the response in JSON and as a List<>
	@PostMapping("/reapExcelDataFile")
	public ResponseEntity<List<Excel>> mapExcelDataToDB(@RequestParam("file") MultipartFile reapExcelDataFile)
			throws IOException {

		List<Excel> tempExcelList = new ArrayList<Excel>();
		XSSFWorkbook workbook = new XSSFWorkbook(reapExcelDataFile.getInputStream());
		XSSFSheet worksheet = workbook.getSheetAt(0);

		for (int i = 1; i < worksheet.getPhysicalNumberOfRows(); i++) {
			Excel tempExcel = new Excel();

			XSSFRow row = worksheet.getRow(i);

			tempExcel.setAppClientId((int) row.getCell(0).getNumericCellValue());
			tempExcel.setLoanId((int) row.getCell(1).getNumericCellValue());
			tempExcel.setUserid((int) row.getCell(2).getNumericCellValue());

			// if excel value is in string format then use this
//			tempStudent.setContent(row.getCell(1).getStringCellValue());

			tempExcelList.add(tempExcel);
		}
		return ResponseEntity.ok(tempExcelList);
	}

// its working 	
	@PostMapping("/excelReader")
	public String excelReader(@RequestParam("file") MultipartFile excel) {

		try {
			XSSFWorkbook workbook = new XSSFWorkbook(excel.getInputStream());
			XSSFSheet sheet = workbook.getSheetAt(0);

			for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
				XSSFRow row = sheet.getRow(i);
				for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {

					System.out.print(row.getCell(j).toString() + " ");
				}
				System.out.println("");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "Success";
	}

}
