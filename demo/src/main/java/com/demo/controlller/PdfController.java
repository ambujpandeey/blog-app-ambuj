package com.demo.controlller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.services.ExcelWriter;
import com.demo.services.PdfService;
//import com.demo.services.PdfServices;
import com.itextpdf.text.DocumentException;

@Controller
@RequestMapping("/pdf")
public class PdfController {

//	@Autowired
//	private PdfServices pdfServices;

	@Autowired
	private PdfService pdfService;
	@Autowired
	private ExcelWriter excelWriter;

	//http://localhost:9090/pdf/createPdf
	@GetMapping("/createPdf")
	public ResponseEntity<InputStreamResource> createPDF() throws DocumentException, IOException, ParseException {

		ByteArrayInputStream pdf = pdfService.createPdf();

		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("Content-Disposition", "inline;file=lcwd.pdf");

		return ResponseEntity.ok().headers(httpHeaders).contentType(MediaType.APPLICATION_PDF)
				.body(new InputStreamResource(pdf));
	}

//	@GetMapping("/createExcel")
//	public ResponseEntity<InputStreamResource> createExcel() throws InvalidFormatException, IOException {
//
//
//		ByteArrayInputStream pdf = excelWriter.mainnn();
//
//		HttpHeaders httpHeaders = new HttpHeaders();
//		httpHeaders.add("Content-Disposition", "inline;file=lcwd.pdf");
//
//		return ResponseEntity.ok().headers(httpHeaders).contentType(MediaType.APPLICATION_PDF)
//				.body(new InputStreamResource(pdf));
//	}




//	http://localhost:9090/pdf/getfacilityAgreement/12345
	@RequestMapping(value = {
			"/getfacilityAgreement/{loanId}" }, method = RequestMethod.GET, produces = MediaType.APPLICATION_PDF_VALUE)
	public ResponseEntity<InputStreamResource> getfacilityAgreement(@PathVariable("loanId") Integer loanId)
			throws IOException, DocumentException, ParseException, MalformedURLException {
		
		String dataModel = "Ambuj";
		int arr[] = {1,2,3,4,5,};
		List<?> repaymentData = Arrays.asList(arr);
		
		InputStream bis = null;
		bis = PdfService.getFacilityAgreementPdf(dataModel, repaymentData);
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "inline; filename=" + loanId + "LegalPage.pdf");
		return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF)
				.body(new InputStreamResource(bis));
	}
	
	
}