package com.demo.services;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Service
public class PdfService {

	

// PDF CODE 
	public static ByteArrayInputStream createPdf() throws DocumentException, IOException, ParseException {

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		Document document = new Document();

		PdfWriter.getInstance(document, out);

		document.open();

		try {
			
			BaseFont base = null;
			final Font normalFont = new Font(Font.FontFamily.TIMES_ROMAN, 7, Font.NORMAL,
					new BaseColor(0, 0, 0));
			final Font boldFont = new Font(Font.FontFamily.TIMES_ROMAN, 7, Font.BOLD,
					new BaseColor(0, 0, 0));
			final Font italicFont = new Font(Font.FontFamily.TIMES_ROMAN, 7, Font.ITALIC,
					new BaseColor(0, 0, 0));
			final Font bold9Font = new Font(Font.FontFamily.TIMES_ROMAN, 9, Font.BOLD, new BaseColor(0, 0, 0));

			
			Paragraph para = new Paragraph("WHEREAS :", bold9Font);
			PdfPCell c1 = new PdfPCell();
			Phrase p1 = new Phrase();
			Phrase p2 = new Phrase();
			Phrase p3 = new Phrase();
			Phrase p4 = new Phrase();
			List list = new List();
			ListItem listItem = new ListItem();

			
			para.setAlignment(Element.ALIGN_LEFT);
			para.setSpacingAfter(6.0f);
			document.add(para);

			
			list = new List(List.BODY);
			list.setListSymbol("        A.");
			p1 = new Phrase();
			p2 = new Phrase();
			listItem = new ListItem(
					"The Parties are desirous of entering into an arrangement whereby the Lender shall provide financial assistance in the nature of income generation loan to the Borrower(s) for the Purpose as defined in Clause 1.3 of this Agreement (“",
					normalFont);
			p1.add(new Chunk("Facility", boldFont));
			listItem.add(p1);

			p2.add(new Chunk(
					"”). The Guarantor(s) shall guarantee the said Facility to the fullest in the manner and as per the terms and conditions set out in this Agreement. \n\n",
					normalFont));
			listItem.add(p2);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			document.add(list);
			
			list = new List(List.BODY);
			list.setListSymbol("        B.");
			p1 = new Phrase();
			p2 = new Phrase();
			listItem = new ListItem(
					"The Parties are entering into the Agreement to record the terms and conditions under which the Facility will be granted to the Borrower(s) by the Lender. ",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			document.add(list);
			
			p1 = new Phrase();
			para = new Paragraph();
			p1.add(new Chunk("       NOW, THEREFORE, ", boldFont));
			p1.add(new Chunk(
					"in consideration of the mutual covenants and agreements set forth herein, the Parties hereto, intending to be legally bound, agree as follows: \n\n",
					normalFont));
			para.add(p1);
			document.add(para);

//************************************************************************************			
			// code for tables for Page1

			PdfPTable table = new PdfPTable(2);
			table.setWidthPercentage(100.0f);
			int arrSpace17[] = { 50, 50 };
			table.setWidths(arrSpace17);

			list = new List(List.ORDERED);
			list.setFirst(1);
			listItem = new ListItem("FACILITY AND TERMS OF THE FACILITY\n\n", bold9Font);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			list.add(listItem);
			c1.addElement(list);

			
			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".1");
			p1 = new Phrase();
			listItem = new ListItem(
					" ",
					normalFont);
			p1.add(new Chunk(" Definitions ", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);
			
			list = new List(List.PARAGRAPH);
			p1 = new Phrase();
			para = new Paragraph();
			p1.add(new Chunk(
					"In this Agreement, the following capitalized terms shall have the meaning as defined herein. Any other capitalized term unless specifically defined shall have the meaning as set out against such term in ",
					normalFont));
			p1.add(new Chunk("Annexure II", boldFont));
			para.add(p1);
			listItem = new ListItem(para);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.PARAGRAPH);
			p1 = new Phrase();
			para = new Paragraph();
			p1.add(new Chunk("“Affiliate” ", boldFont));
			p1.add(new Chunk(
					"means, in relation to any person (i) a subsidiary of that person or a holding company of that person or any other subsidiary of that holding company; and/or (ii) a relative (in case the person is an individual) or related party as defined under the Companies Act (as defined below).",
					normalFont));
			para.add(p1);
			listItem = new ListItem(para);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.PARAGRAPH);
			p1 = new Phrase();
			para = new Paragraph();
			p1.add(new Chunk("“Credit Bureau Agency” ", boldFont));
			p1.add(new Chunk(
					"shall mean the RBI approved credit information companies viz.  TransUnion CIBIL Limited, Equifax, CRIF High Mark and Experian. ",
					normalFont));
			para.add(p1);
			listItem = new ListItem(para);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.PARAGRAPH);
			listItem = new ListItem(
					"“Claims” shall mean the claims due from the Borrower(s) as defined in Clause 10.1 of this Agreement.",
					boldFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.PARAGRAPH);
			listItem = new ListItem("“Code” shall mean the Insolvency and Bankruptcy Code, 2016.", boldFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.PARAGRAPH);
			p1 = new Phrase();
			para = new Paragraph();
			p1.add(new Chunk("“Companies Act” ", boldFont));
			p1.add(new Chunk("means the Companies Act, 2013 as amended from time to time. ", normalFont));
			para.add(p1);
			listItem = new ListItem(para);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.PARAGRAPH);
			p1 = new Phrase();
			para = new Paragraph();
			p1.add(new Chunk("“Demand Promissory Note” ", boldFont));
			p1.add(new Chunk(
					"means the demand promissory note to be issued by the Borrower(s) in favour of the Lender in a form as substantially set out in ",
					normalFont));
			p1.add(new Chunk("Schedule 1 ", boldFont));
			p1.add(new Chunk("this Agreement. ", normalFont));
			para.add(p1);
			listItem = new ListItem(para);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.PARAGRAPH);
			p1 = new Phrase();
			para = new Paragraph();
			p1.add(new Chunk("“Drawdown Notice” ", boldFont));
			p1.add(new Chunk("shall mean the notice as defined under Clause 1.6.1 of this Agreement.", normalFont));
			para.add(p1);
			listItem = new ListItem(para);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.PARAGRAPH);
			p1 = new Phrase();
			para = new Paragraph();
			p1.add(new Chunk("“ECS” ", boldFont));
			p1.add(new Chunk("shall mean Electronic Clearing System.", normalFont));
			para.add(p1);
			listItem = new ListItem(para);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.PARAGRAPH);
			p1 = new Phrase();
			para = new Paragraph();
			p1.add(new Chunk("“Event of Default” ", boldFont));
			p1.add(new Chunk("means any event or circumstance specified as such in Clause 7.1 (Events of Default).",
					normalFont));
			para.add(p1);
			listItem = new ListItem(para);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.PARAGRAPH);
			p1 = new Phrase();
			para = new Paragraph();
			p1.add(new Chunk("“Facility” ", boldFont));
			p1.add(new Chunk(
					"means the rupee term loan facility made available under this Agreement as described in Recital A, amount of which is set out in Annexure II ",
					normalFont));
			para.add(p1);
			listItem = new ListItem(para);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.PARAGRAPH);
			p1 = new Phrase();
			para = new Paragraph();
			p1.add(new Chunk("“Guarantor(s)” ", boldFont));
			p1.add(new Chunk(
					"means an individual of repute and standing as identified by the Borrower(s) as set out in this Agreement in ",
					normalFont));
			p1.add(new Chunk("Annexure I ", boldFont));
			p1.add(new Chunk(
					"and who will assume the liability associated with this Agreement, jointly and severally with the Borrower(s) and other Guarantor(s) as applicable in the event there is any delay or default on the payments or terms under the Agreement including the Outstandings (as defined below). ",
					normalFont));
			para.add(p1);
			listItem = new ListItem(para);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.PARAGRAPH);
			p1 = new Phrase();
			para = new Paragraph();
			p1.add(new Chunk("“Increased Costs” ", boldFont));
			p1.add(new Chunk("has the meaning assigned to it in Clause 1.4.5. (Increased Costs). ", normalFont));
			para.add(p1);
			listItem = new ListItem(para);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.PARAGRAPH);
			p1 = new Phrase();
			para = new Paragraph();
			p1.add(new Chunk("“Interest” ", boldFont));
			p1.add(new Chunk("means interest payable on the Facility as laid down in Clause 1.4.1. ", normalFont));
			para.add(p1);
			listItem = new ListItem(para);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.PARAGRAPH);
			p1 = new Phrase();
			para = new Paragraph();
			p1.add(new Chunk("“Interest Payment Date” ", boldFont));
			p1.add(new Chunk("shall mean the date as defined in Clause 1.4.3 of this Agreement.", normalFont));
			para.add(p1);
			listItem = new ListItem(para);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.PARAGRAPH);
			p1 = new Phrase();
			para = new Paragraph();
			p1.add(new Chunk("“IU” ", boldFont));
			p1.add(new Chunk("shall mean the information utility as defined in Clause 6.2.1 (ii) of this Agreement.",
					normalFont));
			para.add(p1);
			listItem = new ListItem(para);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.PARAGRAPH);
			p1 = new Phrase();
			para = new Paragraph();
			p1.add(new Chunk("“NACH” ", boldFont));
			p1.add(new Chunk("shall mean National Automated Clearing House. ", normalFont));
			para.add(p1);
			listItem = new ListItem(para);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.PARAGRAPH);
			p1 = new Phrase();
			para = new Paragraph();
			p1.add(new Chunk("“Outstandings” ", boldFont));
			p1.add(new Chunk(
					"shall include, at any time, all amounts payable by the Borrower(s) or the Guarantor(s) to the Lender pursuant to the Transaction Documents including but not limited to the present and future obligations and liabilities of the Borrower(s) or the Guarantor(s) to pay/ repay without limitation the principal amount of the Facility, Interest and additional interest thereon and all stamp duties, taxes, expenses, fees, indemnities, costs, charges and expenses including without limitation any expenses incurred in relation to any exercise by Lender of its right, together with legal fees and court costs.",
					normalFont));
			para.add(p1);
			listItem = new ListItem(para);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.PARAGRAPH);
			p1 = new Phrase();
			para = new Paragraph();
			p1.add(new Chunk("“RBI” ", boldFont));
			p1.add(new Chunk("means the Reserve Bank of India constituted under the Reserve Bank of India Act, 1934.",
					normalFont));
			para.add(p1);
			listItem = new ListItem(para);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.PARAGRAPH);
			p1 = new Phrase();
			para = new Paragraph();
			p1.add(new Chunk("“Term” ", boldFont));
			p1.add(new Chunk("shall mean the term of this Agreement as defined in Clause 1.6.1(v) of this Agreement.",
					normalFont));
			para.add(p1);
			listItem = new ListItem(para);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.PARAGRAPH);
			p1 = new Phrase();
			para = new Paragraph();
			p1.add(new Chunk("“Transaction Documents” ", boldFont));
			p1.add(new Chunk("shall have the meaning laid down in Clause 1.2.1 of this Agreement.\n\n", normalFont));
			para.add(p1);
			listItem = new ListItem(para);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c1.addElement(list);

			
			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".2");
			p1 = new Phrase();
			listItem = new ListItem(
					" ",
					normalFont);
			p1.add(new Chunk(" Facility ", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.PARAGRAPH);
			p1 = new Phrase();
			para = new Paragraph();
			p1.add(new Chunk(
					"Based upon the Borrower’s request, representations, warranties, covenants, and undertakings as contained herein and in the Application Form, the Demand Promissory Note and any other documents executed or tendered or agreed to be executed or tendered at a future date in respect of the Facility including but not limited to this Agreement including the schedules appended hereunder and other documents, as set out in ",
					normalFont));
			p1.add(new Chunk("Schedule 1 (“Transaction Documents”)", boldFont));
			p1.add(new Chunk(
					", executed by the Borrower(s) in relation to the Facility, the Lender has agreed to make available to the Borrower(s) and the Borrower(s) agree to avail from the Lender, the Facility in the manner and on the terms and conditions as provided hereof in this Agreement.\n",
					normalFont));
			para.add(p1);
			listItem = new ListItem(para);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.PARAGRAPH);
			p1 = new Phrase();
			para = new Paragraph();
			p1.add(new Chunk("The Facility shall be granted for the tenure as provided in ", normalFont));
			p1.add(new Chunk("Annexure I ", boldFont));
			p1.add(new Chunk("hereof. ", normalFont));
			para.add(p1);
			listItem = new ListItem(para);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c1.addElement(list);

		
			table.addCell(c1);

			PdfPCell c2 = new PdfPCell();

			list = new List(List.PARAGRAPH);
			listItem = new ListItem(
					"In consideration of the Facility being provided by the Lender, the Borrower(s) agree to unconditionally abide by and observe all the terms and conditions hereinafter set out and as may be stipulated by the Lender from time to time. The Borrower(s) further agrees that the rights, entitlements, and privileges of the Lender can be extended to any agent(s) duly appointed by the Lender at any point in time.",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".2.1");
			listItem = new ListItem(
					" Subject to the other terms of this Agreement and other Transaction Documents, the Facility may be disbursed in one or more tranches, and each such tranche of the Facility shall be deemed to be a separate and independent facility and each such tranche shall be referred to as a Facility. Each such Facility shall constitute a separate and distinct set of obligations of the Borrower(s), capable of being separately and distinctly assigned and enforced in accordance with the terms and conditions of the Transaction Documents.\n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);
			
			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".3");
			p1 = new Phrase();
			listItem = new ListItem(
					" ",
					normalFont);
			p1.add(new Chunk(" Purpose of Facility", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			// ORDERED
			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".3.1");
			p1 = new Phrase();
			p2 = new Phrase();

			listItem = new ListItem(
					" The Borrower(s) covenant that the Facility or amount advanced has been granted for the purposes as provided for in ",
					normalFont);

			p1.add(new Chunk("Annexure II (“Purpose”) ", boldFont));
			listItem.add(p1);
			p2.add(new Chunk("and for no other purpose. ", normalFont));
			listItem.add(p2);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".3.2");
			listItem = new ListItem(
					" The Borrower(s) confirm that he / she shall not use the Facility (or any part thereof) for any speculative, improper or illegal, or unlawful purposes/activities. It is clarified that the Lender shall have the right but shall not be obligated to enquire into the utilization of the Facility, subject to any applicable law.\n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);
			
			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".4");
			p1 = new Phrase();
			listItem = new ListItem(
					" ",
					normalFont);
			p1.add(new Chunk(" Interest ", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			
			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".4.1");
			p1 = new Phrase();
			p2 = new Phrase();
			listItem = new ListItem(
					" The Borrower(s) agree to pay to the Lender interest on the Facility or such sum as may be due by the Borrower(s) to the Lender from time to time at the rate and periodicity as mentioned in ",
					normalFont);
			p1.add(new Chunk("Annexure II (“Interest”) ", boldFont));
			listItem.add(p1);
			p2.add(new Chunk("hereunder till the entire Outstandings is repaid by the Borrower(s).", normalFont));
			listItem.add(p2);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".4.2");
			listItem = new ListItem(
					" The Borrower(s) further agree that the Lender shall be entitled to change the rate of Interest, additional interest and/or the periodicity of charging of Interest, etc. as mentioned herein at any time having regard to any change in the cost of funds of the Lender or depending on the directives of RBI from time to time /market conditions/ downward revision in the credit score of the Borrower(s) by a credit bureau, unforeseen extraordinary circumstance or any other reason by giving notice to the Borrower(s) and/or notifying on the notice board of the Lender or in the local newspaper or on the Lender's website www.kaleidofin.com, and shall thereafter be entitled to charge Interest at the changed rate / rests as if the same was provided for in this Agreement.",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".4.3");
			p1 = new Phrase();
			p2 = new Phrase();
			listItem = new ListItem(
					" All Interest payable under this Agreement shall accrue on the basis and be calculated on the basis and in the manner and shall be payable by the Borrower(s) with such rests and in such manner as mentioned in ",
					normalFont);
			p1.add(new Chunk("Annexure III (“Interest Payment Date”) ", boldFont));
			listItem.add(p1);
			p2.add(new Chunk(
					"and this Agreement shall be construed as if such terms were already mentioned in this Agreement. The Borrower(s) shall reimburse or pay to the Lender such amount as may have been paid or payable by the Lender to the central or state government on account of any tax levied on Interest (and/or other charges) on the Facility by the central or state government. The Borrower(s) shall make the reimbursement or payment as and when called upon to do so by the Lender. ",
					normalFont));
			listItem.add(p2);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".4.4");
			p1 = new Phrase();
			listItem = new ListItem(
					" ",
					normalFont);
			p1.add(new Chunk(" Additional Interest:", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.PARAGRAPH);
			p1 = new Phrase();
			para = new Paragraph();
			p1.add(new Chunk(
					"On the occurrence of any Event of Default including delay or failure of the Borrower(s) to pay any amount on the due date as provided in ",
					normalFont));
			p1.add(new Chunk("Annexure III, ", boldFont));
			p1.add(new Chunk("the Lender reserves the right to impose additional interest at such rate as provided in ",
					normalFont));
			p1.add(new Chunk("Annexure II (“Additional Interest”)", boldFont));
			p1.add(new Chunk(
					". Such obligation to pay the Additional Interest shall arise without the need for any notice or demand thereof. Such Additional Interest shall be computed from the date of occurrence of such delay or failure of the Borrower(s) to pay any amount on the due date till such time as the same is cured and shall become payable on demand and if no demand is made, on the Interest Payment Date immediately following the date of the occurrence of such delay or failure to pay. It is hereby clarified that payment of any Additional Interest shall not entitle the Borrower(s) to delay the payments towards the amounts due in respect of the Facility. The Lender’s right to charge Additional Interest shall not, in any manner whatsoever, impair or hinder the Lender’s rights to seek recourse to any other remedies available with the Lender on occurrence of an Event of Default. The Borrower(s) hereby agree and acknowledge that the Additional Interest represents a genuine pre-estimate of the damages the Lender shall suffer on account of any delay or failure in payment of dues under this Facility.",
					normalFont));
			para.add(p1);
			listItem = new ListItem(para);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c2.addElement(list);

			table.addCell(c2);

			document.add(table);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////

			// page 2 started

			c1 = new PdfPCell();
			table = new PdfPTable(2);
			table.setWidthPercentage(100.0f);
			int arrSpace1[] = { 50, 50 };
			table.setWidths(arrSpace1);
			
			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".4.5");
			p1 = new Phrase();
			listItem = new ListItem(
					" ",
					normalFont);
			p1.add(new Chunk(" Increased Cost: ", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.PARAGRAPH);
			listItem = new ListItem(
					"The Borrower(s) agree to pay to the Lender, the amount of any cost incurred by the Lender or any of its Affiliates as a result of: (a) the introduction of, or any change in, or any change in the interpretation, administration or application of, any law or regulation; and/or (b) compliance with any law or regulation made effective after the date of this Agreement; and/or (c) additional solicitors and lawyer’s fees or introduction of new or additional stamp duty, registration charges and other incidental expenses incurred or levied in connection with the Facility. The terms “law” and “regulation” in this clause shall include, without limitation, any law or regulation, circular or notification concerning capital adequacy, prudential limits, liquidity, reserve assets or tax.\n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".5");
			p1 = new Phrase();
			listItem = new ListItem(
					" ",
					normalFont);
			p1.add(new Chunk(" Fees, Charges, Duties and Taxes ", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".5.1");
			p1 = new Phrase();
			p2 = new Phrase();
			listItem = new ListItem(
					" It has been agreed between the Parties that processing fees and such other charges and fee payable as are specified in ",
					normalFont);
			p1.add(new Chunk("Annexure II ", boldFont));
			listItem.add(p1);
			p2.add(new Chunk("shall be payable on the Facility amount by the Borrower(s).", normalFont));
			listItem.add(p2);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".5.2");
			listItem = new ListItem(
					"  The Borrower(s) shall bear and pay all such imposts, duties and taxes (including interest, stamp duty and other taxes, if any) as may be levied from time to time by any government or other authority with the sanction of law, pertaining to or in respect of the Facility amount. ",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".5.3");
			listItem = new ListItem(
					"  All sums payable by the Borrower(s) under this Agreement including the Outstandings shall be paid free of any restriction or condition and free and clear of and without any counterclaim, set-off, deduction or withholding, whether on account of tax payments, charges, stamp duty, liability or impost or otherwise, if any, and the Borrower(s) agree as follows: (a) it shall make all payments to be made by it without any tax deduction unless a tax deduction is required by law; (b) it shall promptly upon becoming aware that it must make a tax payment (or that there is any change in the rate or the basis of a tax deduction) notify the Lender accordingly; (c) if any tax is required to be paid under law by the Borrower(s), the amount of the payment due from the Borrower(s) shall be increased to an amount which (after paying such tax) leaves an amount equal to the payment which would have been due if no such tax was paid by the Borrower(s); (d) if the Borrower(s) are required to make a tax deduction, the Borrower(s) shall make that tax deduction and any payment required in connection with that tax deduction within the time allowed and in the minimum amount required by law; and (e) within 30 (thirty) days of making either a tax deduction or any payment required in connection with that tax deduction, the Borrower shall deliver to the Lender evidence reasonably satisfactory to the Lender that the tax deduction has been made or (as applicable) any appropriate payment paid to the relevant taxing authority. ",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".5.4");
			listItem = new ListItem(
					"  The Borrower(s) shall reimburse all sums paid and/or expenses incurred by the Lender in relation to the Facility within 30 (thirty) days as and when called upon the do so by the Lender or the Lender shall be entitled to include such amounts into the principal amount of the Facility and modify the Instalment and/or tenure of the Facility as may be decided by the Lender. ",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".5.5");
			listItem = new ListItem(
					"  All fees, charges, and other monies payable/paid by the Borrower(s) in relation to the Transaction Documents including under the Application Form, all writings and other documents executed or entered into, by the Borrower(s), or the case may be by any other person(s) in relation or pertaining to the Facility are non-refundable in nature. \n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);
			
			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".6");
			p1 = new Phrase();
			listItem = new ListItem(
					" ",
					normalFont);
			p1.add(new Chunk(" Drawdown/Disbursement ", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".6.1");
			p1 = new Phrase();
			p2 = new Phrase();
			p3 = new Phrase();
			p4 = new Phrase();
			listItem = new ListItem(
					" The Lender shall disburse the Facility as per the Sanction letter disbursement schedule provided in ",
					normalFont);
			p1.add(new Chunk("Annexure II ", boldFont));
			listItem.add(p1);
			p2.add(new Chunk(
					"hereto either in one lump sum or in suitable tranches after a disbursal request form is sent by the Borrower(s) to the Lender or MIS is received by the Lender ",
					normalFont));
			listItem.add(p2);
			p3.add(new Chunk("(“Drawdown Notice”)", boldFont));
			listItem.add(p3);
			p4.add(new Chunk(". The Drawdown Notice should specify the following:", normalFont));
			listItem.add(p4);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			p1 = new Phrase();
			para = new Paragraph();
			p1.add(new Chunk("i.      the drawdown date;", normalFont));
			para.add(p1);
			listItem = new ListItem(para);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			p1 = new Phrase();
			para = new Paragraph();
			p1.add(new Chunk("ii.     the amount to be drawn; ", normalFont));
			para.add(p1);
			listItem = new ListItem(para);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			p1 = new Phrase();
			para = new Paragraph();
			p1.add(new Chunk("iii.    details of the Borrower’s account to be credited", normalFont));
			para.add(p1);
			listItem = new ListItem(para);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			p1 = new Phrase();
			para = new Paragraph();
			p1.add(new Chunk(
					"iv.    details of the fee, if any, to be adjusted from the loan amount to be\n        disbursed;",
					normalFont));
			para.add(p1);
			listItem = new ListItem(para);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			p1 = new Phrase();
			para = new Paragraph();
			p1.add(new Chunk(
					"v.     the period of the Facility which shall be an acceptable duration to the\n        Lender not exceeding the duration /term/tenor as mentioned in attached ",
					normalFont));
			p1.add(new Chunk("\n        Annexure II ", boldFont));
			p1.add(new Chunk("(the “", normalFont));
			p1.add(new Chunk("Term", boldFont));
			p1.add(new Chunk("”);", normalFont));
			para.add(p1);
			listItem = new ListItem(para);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c1.addElement(list);


			list = new List(List.BODY);
			p1 = new Phrase();
			para = new Paragraph();
			p1.add(new Chunk(
					"vi.    that no Event of Default has occurred and/or is in existence or\n        continuing; and",
					normalFont));
			para.add(p1);
			listItem = new ListItem(para);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			p1 = new Phrase();
			para = new Paragraph();
			p1.add(new Chunk("vii.   the additional conditions (if any) have been complied with.", normalFont));
			para.add(p1);
			listItem = new ListItem(para);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.PARAGRAPH);
			listItem = new ListItem(
					"           Pursuant to the Drawdown Notice, disbursement shall be made in such mode\n           ANNEXURE II. ",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".6.2");
			listItem = new ListItem(
					" It is clarified that the disbursement shall be as per the sole discretion of the Lender and the Lender may at its sole discretion satisfy itself of the other conditions before disbursement including appropriate insurance policies covering the Borrower(s). It is further agreed that the disbursement amount may be net of the processing fee, insurance premium amount, or such other amount owed by the Borrower(s) to the Lender or to a third party as set out ANNEXURE II. Any insurance premium collected by the Lender will be forwarded to the relevant third party and the Lender will not be liable to pay out any claims under such insurance. ",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);


			table.addCell(c1);

			c2 = new PdfPCell();

			list = new List(List.PARAGRAPH);
			listItem = new ListItem(
					"Further, any amounts by way of insurance claim received by the Lender will be forwarded to the Borrower(s) after setting off any outstanding dues that may be payable to the Lender by the Borrower(s). In case of natural death of the Borrowers, the third party shall pay the insured amount to the surviving insured person or the nominee, if the Lender receives any amount from the third party then the same shall be paid to the nominee after setting of any outstanding dues. In case of natural death of the Borrowers, the third party shall pay the insured amount to the surviving insured person or the nominee, if the Lender receives any amount from the third party then the same shall be paid to the nominee after setting of any outstanding dues.  ",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".6.3");
			listItem = new ListItem(
					"  It is further agreed between the Parties that where the declared end use or any integral part thereof, during the subsistence of this Agreement, is declared illegal or becomes illegal on account of any promulgation, amendment, modification or re-enactment of any statute, notification, circular or order etc., then this Agreement shall stand terminated from the date from which the declared end use or any integral part thereof has become illegal, and the Borrower(s) shall be liable to repay the entire Outstandings along with accrued interest, costs, charges, levies, etc. forthwith to the Lender. ",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".6.4");
			listItem = new ListItem(
					"  On the execution of this Agreement, the Borrower(s) shall no longer be entitled to cancel the Facility or refuse to accept the disbursement of the Facility, except with the approval of the Lender and on payment to the Lender, of such cancellation charges or foreclosure charges as stipulated by the Lender. The Lender shall however have the right to terminate all and/or any undrawn part of the Facility without giving notice to the Borrower(s). The Borrower(s) shall be informed and intimated by the Lender of such termination of the undrawn the Facility as soon as practicable by the Lender. On the termination of the Facility by the Lender, the Lender may in its sole discretion refund any amounts paid by the Borrower(s) for availing the Facility including and not limited to any stamp duty charges and processing fees.\n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);
			
			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".7");
			p1 = new Phrase();
			listItem = new ListItem(
					" ",
					normalFont);
			p1.add(new Chunk(" Guarantors  ", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".7.1");
			listItem = new ListItem(
					"  The Guarantor(s) guarantee the due performance and compliance by the Borrower(s) of all terms, conditions, and covenants contained in the Transaction Documents in terms thereof, in particular, Borrower’s obligation to pay, repay or reimburse, as the case may be, the Outstandings owed to the Lender, and/or their agents or representatives under the Transaction Documents, including without limitation all costs, charges and expenses (including the stamp duty charges payable), the costs, legal expenses, and costs. ",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".7.2");
			listItem = new ListItem(
					"  The Guarantor(s) shall be jointly and severally liable for paying any Outstandings including but not limited to the Facility and in the event of any default on the part of the Borrower(s) in payment, repayment, and in reimbursement of the Outstandings referred to above, and/or on the occurrence of an Event of Default in terms of the Transaction Documents, the Guarantor(s) shall, upon demand, forthwith pay to the Lender or such other person as the Lender may determine, without protest or demur, all the amounts payable by the Borrower to the Lender under or in terms of the Transaction Documents. ",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".7.3");
			listItem = new ListItem(
					"  The Lender is at the liberty to reject Guarantor(s) if they are not comfortable with the financial standing of the Guarantor(s) at any point in time. Upon occurrence of the foregoing, the Borrower(s) shall replace such Guarantor(s) with new guarantor(s) and shall procure such Guarantor(s) to execute such documentation as may be required by the Lender at its sole discretion. ",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".7.4");
			listItem = new ListItem(
					"  On the occurrence of any delay or failure of the Borrower(s) to make a payment within a period of 5 (five) days post the due date of the loan instalment or any charges associated with the loan, the Lender shall have the right to send a notice to the Guarantor(s) for recovery of such Outstandings. ",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".7.5");
			listItem = new ListItem(
					"  Upon issuance of such notice to the Guarantor(s) by the Lender, repayment of the Outstandings including Facility shall be accelerated, irrespective of schedule of repayment and shall become forthwith payable by the Guarantor(s) on behalf of the Borrower(s) to the Lender and the guarantee executed shall forthwith become enforceable in accordance with the terms of this Agreement and the Transaction Documents and nothing herein contained shall be deemed to affect or prejudice the rights or powers of the Lender to demand repayment of the Facility and all monies due and payable by the Borrower(s) under this Agreement.",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".7.6");
			listItem = new ListItem(
					"  Nothing contained under this Clause 1.7 shall be construed as a waiver, rest or termination of the Borrower’s liability under the Facility and the Borrower(s) shall continue to be liable to repay all amounts due under the Facility until such time that all Outstandings under the Facility have been fully repaid.  ",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".7.7");
			listItem = new ListItem(
					"  The liability of the Guarantor(s) under this Agreement shall in no manner be affected by any variations, acts or forbearance, or by reason of time extended to the Borrower(s), or of any other forbearance act or omission or by any other matters or things whatsoever which under the law relating to sureties would but for this provision have the effect of so releasing the Guarantor(s).",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".7.8");
			listItem = new ListItem(
					"  Any variance made without the Guarantor's consent, in the terms of this Agreement, shall not discharge the Guarantor(s) from his / its obligations under this Agreement or as to terms subsequent to such variance.",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".7.9");
			listItem = new ListItem(
					"  The Guarantor(s) shall not be discharged by any contract between the Lender and the Borrower(s), by which the Borrower(s) are released, or by any act or omission of the Lender, the legal consequence of which is the discharge of the Borrower(s).",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			table.addCell(c2);

			document.add(table);

/////////////////////////////////////////////////////////////////////////////////////////////			
			// page 3 started

			c1 = new PdfPCell();
			table = new PdfPTable(2);
			table.setWidthPercentage(100.0f);
			int arrSpace3[] = { 50, 50 };
			table.setWidths(arrSpace3);

			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".7.10");
			listItem = new ListItem(
					"  Any contract between the Lender and the Borrower(s), without the consent of the Guarantor(s), by which the Lender make a composition with, or promises to give time, or not to sue the Borrower(s), shall not discharge the Guarantor(s).",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".7.11");
			listItem = new ListItem(
					"  The Guarantor(s) are liable to repay the Facility along with Interest in terms of the Annexure III and the liability of the Guarantor(s) shall be co-terminus with that of the Borrower(s).",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".7.12");
			listItem = new ListItem(
					"  The Guarantor’s liability hereunder shall not be affected, terminated, or prejudiced in the event of death of the Guarantor(s), but such liability shall continue in full force and effect and shall be binding on the Guarantor’s respective successors and assigns.",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(1);
			list.setPostSymbol(".7.13");
			listItem = new ListItem(
					"  Representations and Warranties: The representations and warranties as set out in Clause 5 below shall mutatis mutandis apply to the Guarantor(s). \n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(2);
			listItem = new ListItem("  REPAYMENT / PREPAYMENT\n\n", bold9Font);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.PARAGRAPH);
			listItem = new ListItem("Repayment:", boldFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(2);
			list.setPostSymbol(".1.1");
			p1 = new Phrase();
			listItem = new ListItem(
					" The Outstandings including the Facility shall be repayable by the Borrower(s) to the Lender or to its agents/partners as appointed by the Lender from time to time at the place and in the manner provided in ",
					normalFont);
			p1.add(new Chunk("Annexure III (“Instalment”).", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);


			list = new List(List.ORDERED);
			list.setFirst(2);
			list.setPostSymbol(".1.2");
			listItem = new ListItem(
					"  The Instalment amount payable at its periodicity/frequency shall be arrived as to comprise repayment of principal and payment of interest calculated on the basis of the interest rate, periodicity of compounding, periodicity of repayment, periodicity of effecting credits in the account so as to aim repayment of the entire liability under the Facility at the end of its tenure and the Borrower(s) agree to continue paying instalment until all amounts due under the Facility have been repaid in full to the Lender. ",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(2);
			list.setPostSymbol(".1.3");
			listItem = new ListItem(
					"  The Borrower(s) shall at all times, until maturity date, maintain sufficient funds in his/her/their bank account(s) to ensure that the standing instruction/ECS /NACH/post-dated cheques/undated cheques, if any, issued by the Borrower(s) is not dishonored and the Instalments are received/realized by the Lender before the applicable due date. The Borrower(s) shall honor all payments without fail on the first presentation/due date, and the Borrower(s) shall not instruct their bankers to stop payment towards and/or countermand any of the above instructions /mandates/instruments of payment.  ",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(2);
			list.setPostSymbol(".1.4");
			listItem = new ListItem(
					"  The Borrower(s) shall also not instruct the Lender to withhold depositing the above instructions/mandates/instruments. Any non-presentation/delayed presentation of the above-mentioned instructions/mandates/instruments due to any reason will not affect the liability of the Borrower(s) to pay the instalments on time. The Borrower(s) shall replace the instructions/mandates/instruments or issue fresh instructions/mandates/instruments, if required by the Lenders. The Lenders shall be entitled to re-compute the repayment schedule if there is an increase in the Interest. In the event, the Lender does not for any reason deposit the instructions/mandates/instruments before the expiry of the validity of the instructions/mandates/instruments, the Borrower(s) shall deliver to the Lenders within 7 (seven) days of a request by the Lenders in this regard, new instructions /mandates/instruments of a like amount.",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(2);
			list.setPostSymbol(".1.5");
			p1 = new Phrase();
			listItem = new ListItem(
					" No notice, reminder, or intimation shall be given to the Borrower(s) regarding its obligation to pay the amount payable hereunder on the due date and it shall be entirely the Borrower’s responsibility to ensure prompt and regular payment of the amount payable by the Borrower(s) to the Lender on the due date and in the manner provided in ",
					normalFont);
			p1.add(new Chunk("Annexure III.", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(2);
			list.setPostSymbol(".1.6");
			listItem = new ListItem(
					"  All sums payable by the Borrower(s) under this Agreement shall be paid free of any restriction or condition and free and clear of and without any counterclaim, set off, whether on account of tax or otherwise (unless required under law).  If the Borrower(s) are obliged by law to make any tax payments on any such sum, then the sum payable by the Borrower(s) shall be increased to the extent necessary to ensure that, after making the tax payment, the Lender receives and retains (free from any liability except for tax on overall net income) a net sum equal to what the Lender would have received and so retained if no such tax payment had been required or made.\n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(2);
			list.setPostSymbol(".1.7");
			p1 = new Phrase();
			listItem = new ListItem(
					" ",
					normalFont);
			p1.add(new Chunk(" Prepayment:  ", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("          i.");
			listItem = new ListItem(
					"The Lender may, in its sole discretion and on such terms as to pre-payment fees, etc., as it may prescribe, permit pre-payment/acceleration of Instalments or pre-payment at the request of the Borrower(s), subject to any minimum amount of prepayment/amounts payable on account of acceleration of instalments that the Lender may specify from time to time. If permitted by the Lender, the Borrower(s) shall give prior written notice of its intention to pre-pay the full amount of the Facility and pay to the Lender, such pre-payment charges as may be prescribed by the Lender from time to time.",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("          ii.");
			listItem = new ListItem(
					"Any pre-payment of any part of the Facility has to be made in accordance with the conditions specified by the Lender and subject to applicable prepayment charges which shall be levied on the Borrower(s) by the Lender. Notwithstanding the above, if the Borrower(s) pay any amount to the Lender before the due date, the Lender shall be entitled to appropriate the same in such manner as it deems fit. The Lender will give the Borrower(s) credit for the same only on the due date and not before. ",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			
			table.addCell(c1);

			c2 = new PdfPCell();

			list = new List(List.BODY);
			list.setListSymbol("          iii.");
			listItem = new ListItem(
					"In the event, the Lender permits any pre-payment, the repayment schedule may be altered by the Lender at the request of the Borrower(s) and the Borrower(s) agree to adhere to the altered repayment schedule. \n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			
			list = new List(List.ORDERED);
			list.setFirst(2);
			list.setPostSymbol(".1.8");
			p1 = new Phrase();
			listItem = new ListItem(
					" ",
					normalFont);
			p1.add(new Chunk(" Borrower’s Liability:   ", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.PARAGRAPH);
			listItem = new ListItem(
					"The Borrower’s liability hereunder shall not be affected, terminated, or prejudiced in the event of death of the Borrower(s), but such liability shall continue in full force and effect and shall be binding on the Borrower’s respective successors and assigns. \n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.setListSymbol("    ");
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(3);
			listItem = new ListItem("  CONDITIONS PRECEDENT \n\n", bold9Font);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(3);
			list.setPostSymbol(".1");
			p1 = new Phrase();
			listItem = new ListItem(
					" The Lender shall have the discretion to not disburse at any time, any amount under the Facility unless the following conditions are complied with in the sole discretion of the Lender: ",
					normalFont);
			p1.add(new Chunk(" ", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(3);
			list.setPostSymbol(".1.1");
			p1 = new Phrase();
			listItem = new ListItem(
					" This Agreement and such other Transaction Documents including the Demand Promissory Note are duly executed and delivered to the Lender by the Borrower(s) and each of the Guarantor(s).",
					normalFont);
			p1.add(new Chunk(" ", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(3);
			list.setPostSymbol(".1.2");
			p1 = new Phrase();
			listItem = new ListItem(
					" The Borrower(s) shall have provided such information as may be called by the Lender in order to verify the creditworthiness of the Borrower(s) and the Guarantor(s).",
					normalFont);
			p1.add(new Chunk(" ", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(3);
			list.setPostSymbol(".1.3");
			p1 = new Phrase();
			listItem = new ListItem(" ", normalFont);
			p1.add(new Chunk(
					" The Borrower(s) submit to the satisfaction of the Lender, all such documents for verification as are required to be provided under the Lender’s policies.",
					normalFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(3);
			list.setPostSymbol(".1.4");
			p1 = new Phrase();
			listItem = new ListItem(
					" The Borrower(s) submit to the Lender, ECS mandate/NACH/SI towards repayment of all the instalments. ",
					normalFont);
			p1.add(new Chunk(" ", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(3);
			list.setPostSymbol(".1.5");
			p1 = new Phrase();
			listItem = new ListItem(
					" The Borrower(s) submit to the Lender, any other documents or writing including power of attorney in favor of the Lender, as the Lender may require in its sole discretion. ",
					normalFont);
			p1.add(new Chunk(" ", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(3);
			list.setPostSymbol(".1.6");
			p1 = new Phrase();
			listItem = new ListItem(
					" All consents, approvals, permissions, authorizations and resolutions required for the Facility have been obtained by the Borrower(s). ",
					normalFont);
			p1.add(new Chunk(" ", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(3);
			list.setPostSymbol(".1.7");
			p1 = new Phrase();
			listItem = new ListItem(
					" The Drawdown Notice is received in the form and manner set out in this Agreement. ", normalFont);
			p1.add(new Chunk(" \n\n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(3);
			list.setPostSymbol(".2");
			p1 = new Phrase();
			listItem = new ListItem(
					" The Lender may not, having disbursed any amount previously, disburse any further amount under the Facility unless the following conditions are complied with at the sole discretion of the Lender before such further disbursement: ",
					normalFont);
			p1.add(new Chunk(" ", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(3);
			list.setPostSymbol(".2.1");
			p1 = new Phrase();
			listItem = new ListItem(" No Event of Default as specified in clause 7.1 hereinafter shall have occurred.",
					normalFont);
			p1.add(new Chunk(" ", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(3);
			list.setPostSymbol(".2.2");
			p1 = new Phrase();
			listItem = new ListItem(
					" The Borrower(s) shall have produced evidence of the utilization of prior disbursements and also in respect of proposed disbursements if required by the Lender. ",
					normalFont);
			p1.add(new Chunk(" ", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(3);
			list.setPostSymbol(".2.3");
			p1 = new Phrase();
			listItem = new ListItem(
					" No extraordinary circumstances shall have occurred, which in the sole opinion of the Lender may make it improbable for the Borrower(s) or otherwise adversely affect their capability of fulfilling any of the terms and conditions contained in this Agreement. ",
					normalFont);
			p1.add(new Chunk(" \n\n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(4);
			listItem = new ListItem("  CONDITIONS AND COVENANTS  \n\n", bold9Font);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(4);
			list.setPostSymbol(".1");
			p1 = new Phrase();
			listItem = new ListItem(
					" In consideration of the Lender having advanced the Facility to the Borrower(s), the Borrower(s) hereby undertake that he/she shall comply with the following conditions and covenants during the tenure of this Agreement and until full repayment of the amounts due under this Agreement:",
					normalFont);
			p1.add(new Chunk(" \n\n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			
			list = new List(List.ORDERED);
			list.setFirst(4);
			list.setPostSymbol(".1.1");
			p1 = new Phrase();
			listItem = new ListItem(
					" ",
					normalFont);
			p1.add(new Chunk(" Affirmative Covenants \n\n ", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.PARAGRAPH);	
			list.setListSymbol(" ");
			p1 = new Phrase();
			listItem = new ListItem(" The Borrower(s) shall comply with the following: ", normalFont);
			p1.add(new Chunk(" \n\n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("      i.");
			listItem = new ListItem(
					"use the said Facility for the Purpose for which it is sanctioned. In case the Borrower(s) fail for any reason to utilise the Facility for the said Purpose or utilizes any part of the said Facility for any purpose other than the said Purpose, the Lender shall be entitled to rescind this Agreement on that ground and to recall the Facility. \n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("      ii.");
			listItem = new ListItem("promptly give written notice to the Lender of: \n", normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("             a.");
			listItem = new ListItem(
					"all litigation /dispute/action from/against the Borrower(s) from anyone (including any governmental or regulatory authority) materially affecting the Borrower(s), which is threatened and/or likely to be filed and/or filed;",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("             b.");
			listItem = new ListItem(
					"any Event of Default under the terms of this Agreement or of any document provided for herein; and ",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("             c.");
			listItem = new ListItem("in the event of death of the C0-Borrower(s) or any of the Guarantor(s).\n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("      iii.");
			listItem = new ListItem(
					"pay such stamp duty, legal charges, registration fees, other duties, taxes, charges, and other penalties if and when the Borrower(s) are required to pay the same according to the laws for the time being in force, and in the event of the Borrower(s) failing to pay such stamp duty, other duties, taxes, and penalties, as aforesaid, the Lender shall be at the liberty (but shall not be obliged) to pay the same and the Borrower(s) shall reimburse the same to the Lender on demand with Interest thereon at the same rate as on defaulted instalments in respect of the ",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			table.addCell(c2);

			document.add(table);

/////////////////////////////////////////////////////////////////////////////////////////////			
			// page4 started

			c1 = new PdfPCell();
			table = new PdfPTable(2);
			table.setWidthPercentage(100.0f);
			int arrSpace4[] = { 50, 50 };
			table.setWidths(arrSpace4);

			list = new List(List.PARAGRAPH);
			list.setListSymbol(" ");
			listItem = new ListItem(
					"Facility as specified hereinabove with monthly rests from the date of payment and until such reimbursement by the Borrower(s). The Borrower(s) shall pay the processing fees and all other charges as applicable under the Facility. \n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("      ii.");
			listItem = new ListItem(
					"pay such stamp duty, legal charges, registration fees, other duties, taxes, charges, and other penalties if and when the Borrower(s) are required to pay the same according to the laws for the time being in force, and in the event of the Borrower(s) failing to pay such stamp duty, other duties, taxes, and penalties, as aforesaid, the Lender shall be at the liberty (but shall not be obliged) to pay the same and the Borrower(s) shall reimburse the same to the Lender on demand with Interest thereon at the same rate as on defaulted instalments in respect of the Facility as specified hereinabove with monthly rests from the date of payment and until such reimbursement by the Borrower(s). The Borrower(s) shall pay the processing fees and all other charges as applicable under the Facility. \n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("      iii.");
			listItem = new ListItem(
					"the Borrower(s) shall ensure strict compliance with all applicable laws and statutory/regulatory requirements, permissions, approvals, sanctions, conditions, and requirements of the state or central government/local authorities. \n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("      iv.");
			listItem = new ListItem(
					"the Borrower(s) shall furnish to the Lender all such information, statements, particulars, estimates, and reports as the Lender may require from time to time as to the compliance with the terms of this Agreement. \n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("      v.");
			listItem = new ListItem(
					"the Borrower(s) hereby agree and authorize the Lender and/or its regulator(s) or any third parties appointed by the Lender and/or its regulator(s) to inspect the Borrower’s premises and/or books of accounts. The Borrower(s) shall reimburse all costs and expenses incurred by the Lender, its regulator(s), third parties appointed by the Lender, or its regulator(s) for such purposes. \n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("      vi.");
			listItem = new ListItem(
					"the Borrower(s) hereby agree, acknowledge and confirm that it has voluntarily issued the undated cheques.\n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("      vii.");
			listItem = new ListItem(
					"the Borrower(s) hereby agree, acknowledge and confirm Lender is hereby authorized to recover the Outstandings by way of submitting/depositing the post-dated cheques or the undated cheques.\n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("      viii.");
			listItem = new ListItem(
					"the Borrower(s) agree, acknowledge and confirm that until the maturity date, it shall ensure that sufficient funds are available in account to which post-dated cheques or undated cheques relate, to enable the Lender to the present time.\n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("      ix.");
			listItem = new ListItem(
					"the Borrower(s) agree, acknowledge and confirm that the Borrower shall honour all the post-dated cheques or undated cheques when presented for payment by Lender and it shall not take any steps which in any way are likely to affect the payment thereunder to the Lender including without limited to ‘stop payment instructions’. Further, the prior written consent of the Lender shall be required by the Borrower(s) for changing the authorized signatories for the relevant bank account(s) of the Borrower to which the post-dated cheques or undated cheques relate. In the event that the Borrower so changes the authorised signatories for its relevant bank account(s), the Borrower shall either give unconditional and irrevocable instructions to the bank on whom the post-dated cheques have been drawn to clear and honour all such post-dated cheques or undated cheques (details of which shall be provided to the Lender) bearing the signatures of the authorised signatories before the change or, in the alternative, the Borrower(s) shall issue fresh post-dated cheque or undated cheques, inchoate and duly signed cheques to the Lender bearing the signatures of the new authorised signatories.\n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("      x.");
			listItem = new ListItem(
					"the Borrower(s) shall provide information to the Lender in respect of the credit facilities enjoyed by it from other banks/ financial institutions as per the guidelines issued by RBI and other applicable law, from time to time; and\n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("      xi.");
			listItem = new ListItem(
					"the Borrower(s) shall ensure that the Facility ranks pari passu with other similar loan facilities that the Borrower has availed or may avail in the future from other banks and financial institutions.\n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("      xii.");
			listItem = new ListItem(
					"the Borrower(s) shall ensure that the Facility ranks pari passu with other similar loan facilities that the Borrower has availed or may avail in the future from other banks and financial institutions. ",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			
			table.addCell(c1);

			c2 = new PdfPCell();

			
			list = new List(List.ORDERED);
			list.setFirst(4);
			list.setPostSymbol(".1.2");
			p1 = new Phrase();
			listItem = new ListItem(
					" ",
					normalFont);
			p1.add(new Chunk(" Negative covenants: ", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("  ");
			listItem = new ListItem(
					"Except with the prior written consent of the Lender, the Borrower(s) shall not: \n", normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("          i.");
			listItem = new ListItem(
					"Enter into any contractual obligations of a long-term nature affecting the Borrower(s) financially to a significant extent; ",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("          ii.");
			listItem = new ListItem(
					"Use the Borrower’s funds towards unrelated activity or invest the Borrower’s funds in shares, debentures, deposits or other instruments of any entity; ",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("          iii.");
			listItem = new ListItem(
					"Do or voluntarily suffer or permit to be done any act or thing whereby the payment of the principal amount of the Loan, Interest or Penal Interest would be hindered or delayed.",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("          iv.");
			listItem = new ListItem(
					"The Borrower covenants, not to- (a) close the account in relation to which the post-dated cheques or undated cheques are issued pursuant to Cl. 4.1.1 (vi); and (b) issue stop payment instructions to his/her banker(s) in relation to the post-dated cheques or undated cheques (as referred to into Cl. 2.1.3.",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(4);
			list.setPostSymbol(".2");
			p1 = new Phrase();
			listItem = new ListItem(
					" Notwithstanding what has been stated herein or elsewhere, the Lender shall have the right to review the Facility and/or any of the terms and conditions of this Agreement and/or any of the Transaction Documents at such intervals as the Lender may deem fit in its absolute discretion.",
					normalFont);
			p1.add(new Chunk(" \n\n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(5);
			listItem = new ListItem("  BORROWER’S REPRESENTATIONS AND WARRANTIES   \n\n", bold9Font);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(5);
			list.setPostSymbol(".1");
			p1 = new Phrase();
			listItem = new ListItem(
					" Save and except to the extent already disclosed under this Agreement, the Borrower(s) hereby represent, warrant and undertake jointly and severally as follows:  ",
					normalFont);
			p1.add(new Chunk(" \n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("          i.");
			listItem = new ListItem(
					"All information furnished by the Borrower(s) to the Lender from time to time, is true and correct and shall be deemed to form part of the representations and warranties on the basis of which the Lender has agreed to provide the said Facility. The Borrower(s) shall notify in writing to the Lender of any circumstances affecting the correctness of any of the particulars provided by the Borrower to the Lender, immediately on the happening or occurrence of such circumstance. \n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("          ii.");
			listItem = new ListItem(
					"There are no litigation/proceedings pending or threatened against the Borrower(s) and the Borrower(s) are not at present aware of any facts likely to give rise to such litigation/proceedings or to material claims.\n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("          iii.");
			listItem = new ListItem(
					"The Borrower(s) are qualified and has the authority to execute this Agreement and the Transaction Documents. The obligations expressed as being assumed by the Borrower(s) hereunder and under the Transaction Documents by the Borrower(s) constitute and will constitute valid legal and binding obligations of the Borrower(s) enforceable against the Borrower(s) in accordance with their terms.\n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("          iv.");
			listItem = new ListItem(
					"Neither the execution and delivery hereof and of the Transaction Documents by the Borrower(s) nor the performance or observance of any of obligations of the Borrower(s) thereunder shall conflict with or result in any breach of law, statute, rule, order, trust, agreement or other instruments, arrangement, obligation or duty by which the Borrower(s) are bound. \n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("          v.");
			listItem = new ListItem(
					"The Borrower is not in default under any law, rule, regulation, order, mortgage, trust, instrument, agreement or other instruments, arrangement, obligation or duty by which the Borrower are bound.\n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("          vi.");
			listItem = new ListItem(
					"The Borrower represents and warrants that the post-dated cheques or undated cheques issued by him/her pursuant to Cl. 4.1.1 (vii) are for the discharge or his/her obligations to repay the Outstandings and not merely a ‘security’.\n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("          vii.");
			listItem = new ListItem(
					"The Borrower(s) his/her  are of good financial standing and in a position to meet their ongoing obligations and have not been served with (or threatened with) a notice of insolvency or bankruptcy and no petition has been filed or action initiated by the Borrower(s) or any of the Borrower’s creditors or any outside party towards the Borrower’s insolvency or bankruptcy.\n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("          viii.");
			listItem = new ListItem(
					"the Borrower(s) have not been included in any list of defaulters by any regulatory/statutory authority and/or banks and/or financial institutions and/or non-banking financial companies etc.\n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("          ix.");
			listItem = new ListItem(
					"The Borrower(s) have obtained the necessary permissions, sanctions, approvals, and consents for carrying on its business. The said permissions, approvals, and consents are in force and subsisting and the Borrower(s) undertakes to strictly comply with all such permissions.\n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("          x.");
			listItem = new ListItem(
					"No Event of Default (as defined hereinafter) or potential Event of Default has occurred and/or is in existence or continuing.\n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("          xi.");
			listItem = new ListItem(
					"The Borrower(s) undertake to the Lender that the Borrower(s) shall make arrangements satisfactory to the Lender for meeting shortfall, if any, in the financial resources of the Borrower(s) for repayment of the said Facility.",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			table.addCell(c2);

			document.add(table);

/////////////////////////////////////////////////////////////////////////////////////////////			
			// page5 started

			c1 = new PdfPCell();
			table = new PdfPTable(2);
			table.setWidthPercentage(100.0f);
			int arrSpace5[] = { 50, 50 };
			table.setWidths(arrSpace5);

			list = new List(List.ORDERED);
			list.setFirst(5);
			list.setPostSymbol(".2");
			p1 = new Phrase();
			listItem = new ListItem(
					" The Borrower(s) shall be deemed to repeat the representations and warranties contained in this clause on each day until the date of repayment of the entire Outstandings hereunder. Each of the representations and warranties shall survive the execution of this Agreement and the making of the drawdowns under the Transaction Documents and shall continue to be made and remain true, valid and correct on each day until the full repayment of the Facility and the Outstandings.",
					normalFont);
			p1.add(new Chunk(" \n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(5);
			list.setPostSymbol(".3");
			p1 = new Phrase();
			listItem = new ListItem(
					" The Borrower(s) hereby agree, undertake, record, declare, admit, assure, promise, acknowledge and confirm to abide by, accept, satisfy, fulfill, carry out, perform and comply fully with all the terms, conditions, requirements, sanctions, provisions and stipulations or any amendments or modifications therein made or to be made by the Lender at any time or from time to time in its discretion concerning any of the Facility limits or accounts without any reference, notice or intimation by the Lender in that behalf. ",
					normalFont);
			p1.add(new Chunk(" \n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(5);
			list.setPostSymbol(".4");
			p1 = new Phrase();
			listItem = new ListItem(
					" The Borrower(s) agrees and acknowledges, that without prejudice to any rights of the Lender, all acts/ steps as are necessary for the Lender to take in order to monitor the Facility and utilization thereof and/or the obligations of the Borrower(s) and /or the Borrower’s compliance with the terms thereof and/or to recover amounts due to the Lender or any part or portion thereof, shall and/or maybe carried out by and/or through such other person (including a company, a firm or body corporate) as may from time to time be appointed by the Lender. The Borrower(s) further agree that the Lender will at all times be entitled to share with any such other person that may thus be appointed by the Lender, all documents statements of accounts, and other information of whatsoever nature pertaining to the Borrower(s) and/or the said Facility. Further, the Borrower(s) expressly recognizes and accepts that the Lender shall, without prejudice to its rights to perform such activities either itself or through its officers or servants, be absolutely entitled and have full power and authority to appoint one or more third parties of the Lender’s choice and to transfer or delegate to such third parties, the right and authority to collect on behalf of the Lender, all unpaid amounts and to perform and execute all acts, deeds, matters and things connected therewith or incidental thereto including receiving the amounts due, and generally performing all lawful acts as the third party may consider appropriate for such purposes. ",
					normalFont);
			p1.add(new Chunk(" \n\n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(6);
			listItem = new ListItem("  INSPECTION AND DISCLOSURE OF INFORMATION    \n\n", bold9Font);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			
			list = new List(List.ORDERED);
			list.setFirst(6);
			list.setPostSymbol(".1");
			p1 = new Phrase();
			listItem = new ListItem(
					" ",
					normalFont);
			p1.add(new Chunk(" Inspection  ", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(6);
			list.setPostSymbol(".1.1");
			p1 = new Phrase();
			listItem = new ListItem(
					" As from the date of this Agreement and so long as any amount under the Facility remains outstanding, the Borrower(s) shall permit the Lender and its authorized representatives to carry out periodical inspection from time to time by the officers of the Lender and/or independent consultant and to carry out legal inspections. Any such representatives of the Lender shall after giving reasonable notice to the Borrower(s), have access to any part of the Borrower’s premises, godowns, places and to its records, registers, and accounts and shall receive full co-operation and assistance from the Borrower(s). The Borrower(s) shall reimburse all costs and expenses incurred by the Lender, its representatives, third parties appointed by the Lender or its regulator(s) for such purposes",
					normalFont);
			p1.add(new Chunk(" \n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			
			list = new List(List.ORDERED);
			list.setFirst(6);
			list.setPostSymbol(".2");
			p1 = new Phrase();
			listItem = new ListItem(
					" ",
					normalFont);
			p1.add(new Chunk(" Disclosure of information  ", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(6);
			list.setPostSymbol(".2.1");
			p1 = new Phrase();
			listItem = new ListItem(
					" The Borrower(s) consent to the disclosure by the Lender of information and data relating to the Borrower(s), the said Facility, the obligations assumed or to be assumed by the Borrower(s) in relation to the said Facility and default, if any, committed by the Borrower(s) in discharge thereof and accordingly: ",
					normalFont);
			p1.add(new Chunk(" \n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("          i.");
			listItem = new ListItem(
					"agree and consent to the disclosure by the Lender of all or any such information and data relating to them, the Facility, and default, if any, committed by it in the discharge of such obligations as the Lender may deem appropriate and necessary to disclose and furnish to RBI or to any Credit Bureau Agency; ",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("          ii.");
			listItem = new ListItem(
					"give specific consent to the Lender for disclosing/submitting the ‘financial information’ as defined in Section 3 (13) of the Code  read with the relevant regulations/ rules framed under the Code, as amended and in force from time to time, in respect of the Credit/ financial facilities availed from the Lenders, to any ‘Information Utility’ (“IU”) as defined in Section 3 (21) of the Code, in accordance with the relevant regulations framed under the Code, and directions issued by RBI to the banks from time to time and hereby specifically agree to promptly authenticate the ‘financial information submitted by the Lender, as and when requested by the concerned ‘IU’; ",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("          iii.");
			listItem = new ListItem(
					"undertake that RBI, or any Credit Bureau Agency so authorized may use and process the said information and data disclosed by the Lender in the manner as deemed fit by them and furnish for consideration, the processed information and data or products thereof prepared by them, to banks/financial institutions and other credit grantors or registered users, as may be specified by the RBI in this behalf. ",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(6);
			list.setPostSymbol(".2.2");
			p1 = new Phrase();
			listItem = new ListItem(
					" The Borrower(s) agree and undertake that RBI, or Credit Bureau Agency so authorized may use and process the said information and data disclosed by the Lender in the manner as deemed fit by them and furnish for consideration, the processed information and data or products thereof prepared by them, to banks/financial institutions and other credit grantors or registered users, as may be specified by the RBI in this behalf.",
					normalFont);
			p1.add(new Chunk(" \n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			
			table.addCell(c1);

			c2 = new PdfPCell();

			list = new List(List.ORDERED);
			list.setFirst(7);
			listItem = new ListItem("  EVENTS OF DEFAULT    \n\n", bold9Font);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(7);
			list.setPostSymbol(".1");
			p1 = new Phrase();
			p2 = new Phrase();
			p3 = new Phrase();
			p4 = new Phrase();
			listItem = new ListItem(
					" Notwithstanding anything contained herein or in any Transaction Documents executed by/ to be executed by the Borrower(s) in the Lender's favour, the Lender shall at its option declare the said Facility and all of the obligations of the Borrower(s) to the Lender hereunder, immediately due and payable, without the necessity of any demand upon or notice to the Borrower(s), all of which is hereby expressly waived by the Borrower(s), irrespective of any agreed maturity, upon the happening of any of the following events (“",
					normalFont);
			p1.add(new Chunk("Events of Default", boldFont));
			listItem.add(p1);

			p2.add(new Chunk(
					"”). In any of the following Events of Default, the Lender shall be entitled to demand payment of the entire Outstandings in respect of the said Facility, as if the period for repayment has expired and shall also be entitled, on failure to pay the interest at the end of each month to debit it to the Borrower’s accounts and capitalize the amount of such interest as if such amount was a fresh loan advanced by the Lender to the Borrower(s) and shall be entitled to charge like interest thereon, in addition to charging Additional Interest at the rate mentioned in ",
					normalFont));
			listItem.add(p2);
			p3.add(new Chunk("Schedule 1 ", boldFont));
			listItem.add(p3);

			p4.add(new Chunk(
					"from the date of default to the date of payment of entire  overdue amount with interest. The following event/s, either singly or together on the part of any or all of the Borrower(s) shall constitute an Event of Default: - \n\n",
					normalFont));
			listItem.add(p4);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(7);
			list.setPostSymbol(".1.1");
			p1 = new Phrase();
			listItem = new ListItem(
					" Breach of any of the terms, conditions, and covenants herein contained or having made any misrepresentation to the Lender. ",
					normalFont);
			p1.add(new Chunk(" \n\n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(7);
			list.setPostSymbol(".1.2");
			p1 = new Phrase();
			listItem = new ListItem(
					" The Lender is of the view that there is a possible and/ or actual deterioration in the creditworthiness and repayment capacity of the Borrower(s).",
					normalFont);
			p1.add(new Chunk(" \n\n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(7);
			list.setPostSymbol(".1.3");
			p1 = new Phrase();
			listItem = new ListItem(
					" Default in payment by the Borrower(s) of any or all Instalments of the principal amount, Interest, commission, service charges, expenses or any other monies due and payable and/or any amount due under this Agreement, on-demand by the Lender.",
					normalFont);
			p1.add(new Chunk(" \n\n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(7);
			list.setPostSymbol(".1.4");
			p1 = new Phrase();
			listItem = new ListItem(
					" Any representation or information given by the Borrower(s) in terms of the Agreement, the Transaction Documents or as may be called upon by the Lender and any representations or statements, made or deemed to be made, or any undertaking(s) given by the Borrower(s) is found to be misleading, incorrect or false, materially affecting the continuation of the Facility or the Borrower(s) commits or threatens to commit any breach or repudiate or threaten to repudiate or there is a default in performance of any other covenant, condition or stipulation on the part of the Borrower(s) under this Agreement or any Transaction Documents.",
					normalFont);
			p1.add(new Chunk(" \n\n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(7);
			list.setPostSymbol(".1.5");
			p1 = new Phrase();
			listItem = new ListItem(
					" Any proceeding or imminent threat of proceeding initiated against the Borrower(s), by any party under laws of insolvency or under any other statutory provision(s) or the law(s) applicable to the Borrower(s) being declared as insolvent.",
					normalFont);
			p1.add(new Chunk(" \n\n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(7);
			list.setPostSymbol(".1.6");
			p1 = new Phrase();
			listItem = new ListItem(" The Borrower(s) have become unable to pay their debts.", normalFont);
			p1.add(new Chunk(" \n\n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(7);
			list.setPostSymbol(".1.7");
			p1 = new Phrase();
			listItem = new ListItem(" Death of the Borrower(s).", normalFont);
			p1.add(new Chunk(" \n\n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(7);
			list.setPostSymbol(".1.8");
			p1 = new Phrase();
			listItem = new ListItem(
					" If any attachment, distress, execution, or other process is enforced, initiated, or levied upon the Borrower(s) or their properties.",
					normalFont);
			p1.add(new Chunk(" \n\n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(7);
			list.setPostSymbol(".1.9");
			p1 = new Phrase();
			listItem = new ListItem(
					" If there is a commission of an act of bankruptcy, insolvency, general assignment for the benefit of creditors, if the Borrower(s) suspend payment to any creditors or threaten to do so, any petition in bankruptcy of by, or against the Borrower(s) is filed.",
					normalFont);
			p1.add(new Chunk(" \n\n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(7);
			list.setPostSymbol(".1.10");
			p1 = new Phrase();
			listItem = new ListItem(
					" If any governmental or other licenses, approval, authorization, consent, or exception, required to enable the Borrower(s) to perform any of their obligations under this Agreement, is withdrawn or modified or if it becomes unlawful for the Borrower(s) to perform any of their obligations under this Agreement.",
					normalFont);
			p1.add(new Chunk(" \n\n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(7);
			list.setPostSymbol(".1.11");
			p1 = new Phrase();
			listItem = new ListItem(
					" A moratorium, standstill, or similar suspension of payments in respect of the indebtedness, whether internal or external, of the Borrower(s), have been or may in the reasonably foreseeable future be declared by the government, RBI, or any other governmental agency of the Borrower(s) or the Lender.",
					normalFont);
			p1.add(new Chunk(" \n\n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(7);
			list.setPostSymbol(".1.12");
			p1 = new Phrase();
			listItem = new ListItem(
					" If the Facility or any part thereof is utilized for any purpose other than the Purpose.",
					normalFont);
			p1.add(new Chunk(" \n\n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(7);
			list.setPostSymbol(".1.13");
			p1 = new Phrase();
			listItem = new ListItem(" Cross Default:  ", normalFont);
			p1.add(new Chunk(" \n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("          i.");
			listItem = new ListItem(
					"If the Borrower(s) default or threaten to default in discharging their liability, under any other agreement or other writing between the Borrower(s) and the Lender, or under any other agreement with other creditors, or in the performance of any covenant, term, or undertaking thereunder, or ",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("          ii.");
			listItem = new ListItem(
					"suspend or threaten to suspend any payment to any creditor when due or any creditor of the Borrower(s) become entitled to declare any sums due and payable prior to the date on which it would otherwise have become due, or ",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("          iii.");
			listItem = new ListItem(
					"any guarantee or indemnity or collateral given, or other support agreement entered into by the Borrower(s) is not honoured when due and called upon;",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			table.addCell(c2);
			document.add(table);

/////////////////////////////////////////////////////////////////////////////////////////////			
			// page6 started

			c1 = new PdfPCell();
			table = new PdfPTable(2);
			table.setWidthPercentage(100.0f);
			int arrSpace6[] = { 50, 50 };
			table.setWidths(arrSpace6);

			list = new List(List.BODY);
			list.setListSymbol("          iv.");
			p1 = new Phrase();
			p2 = new Phrase();
			listItem = new ListItem(
					"any financial indebtedness including any money borrowed or raised, receivables sold or discounted or any other transaction entered into by the Borrower(s) having the commercial effect of borrowing or any guarantee or indemnity given by the Borrower(s) (hereinafter together collectively referred to as “",
					normalFont);
			p1.add(new Chunk("financial indebtedness", boldFont));
			listItem.add(p1);
			p2.add(new Chunk("”) is/are not paid when due nor within any originally applicable grace period; or ",
					normalFont));
			listItem.add(p2);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("          v.");
			listItem = new ListItem(
					"any commitment for any financial indebtedness of the Borrower(s) is cancelled or suspended by a creditor as a result of an event of default (howsoever described.  ",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(7);
			list.setPostSymbol(".1.14");
			p1 = new Phrase();
			listItem = new ListItem(
					" If the post-dated cheques or undated cheques issued by the Borrower(s) is dishonored by the bank. ",
					normalFont);
			p1.add(new Chunk(" \n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(7);
			list.setPostSymbol(".1.15");
			p1 = new Phrase();
			listItem = new ListItem(
					" If the financial institutions and/or banks with whom the Borrower(s) have entered into or shall be entering into agreements for financial assistance have refused to disburse the monies or any part thereof or have recalled the same under their respective agreements with the Borrower(s).",
					normalFont);
			p1.add(new Chunk(" \n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(7);
			list.setPostSymbol(".1.16");
			p1 = new Phrase();
			listItem = new ListItem(
					" The Borrower(s) cause to undertake any action, event or step, which directly or indirectly, causes any change in the representations and warranties made by the Borrower(s) under this Agreement or any other Transaction Documents without the prior written approval of the Lender, or there are any circumstances which in the sole judgment of the Lender are prejudicial to the interest of the Lender.",
					normalFont);
			p1.add(new Chunk(" \n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(7);
			list.setPostSymbol(".2");
			p1 = new Phrase();
			listItem = new ListItem(" Consequences of default ", normalFont);
			p1.add(new Chunk(" \n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.PARAGRAPH);
			list.setListSymbol("   ");
			listItem = new ListItem(
					"The Borrower(s) agree and acknowledge that the following consequences shall forthwith ensue upon the occurrence of an Event of Default: ",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("          i.");
			listItem = new ListItem(
					"The Lender’s commitment to advance any undrawn balance of the Facility shall cease and all the amounts due under the Facility will become repayable forthwith on demand in writing being made by the Lender at any time;",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("          ii.");
			listItem = new ListItem(
					"The Lender shall be entitled to invoke its rights against the Guarantor(s) and the Guarantor(s) shall be liable for making the entire payment of the Outstandings to the Lender",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("          iii.");
			listItem = new ListItem(
					"Repayment of the Facility shall be accelerated and all amounts due including the entire amount of the Outstandings, irrespective of schedule of repayment shall become forthwith payable by the Borrower(s) to the Lender and the guarantees executed with Guarantor(s) shall forthwith become enforceable in accordance with the terms of this Agreement and the Transaction Documents and nothing herein contained shall be deemed to affect or prejudice the rights or powers of the Lender to demand repayment of the Facility and all monies due and payable by the Borrower(s) under this Agreement;",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("   ");
			listItem = new ListItem(
					"In addition to the above, the Lender shall be entitled to adopt criminal and/ or civil proceedings against the Borrower(s)/ Guarantor(s), including but not limited to for dishonour of negotiable instruments including cheques under Section 138 of the Negotiable Instruments Act; or any other remedy available under applicable law/regulations. ",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("          iv.");
			listItem = new ListItem(
					"Upon the occurrence of an Event of Default, the Lender, RBI, and any Credit Bureau Agency will have the unqualified right to disclose the details of the default and the name of the Borrower(s), as defaulters in such manner and through such medium as the Lender, RBI or any Credit Bureau Agency, in their sole discretion may deem fit. The  Borrower(s) hereby agrees that the Lender shall be entitled to disclose the name of the Borrower(s) under the special mention accounts and/or as non-cooperative borrowers and /or provide such information on Central Repository of Information on Large Credits’ (CRILC) in compliance of RBI Circular dated March 21, 2014 on Early Recognition of Financial Distress, Prompt Steps for Resolution and Fair Recovery for Lenders, as amended, modified, supplemented, replaced, substituted and updated from time to time.",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("          v.");
			p1 = new Phrase();
			p2 = new Phrase();
			listItem = new ListItem(
					"in case of payment defaults including but not limited to default in payment of principal amount and interest, the Borrower(s) would be classified as an special mention account (“",
					normalFont);
			p1.add(new Chunk("SMA", boldFont));
			listItem.add(p1);
			p2.add(new Chunk("”) account or a non-performing asset in the following manner: ", normalFont));
			listItem.add(p2);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("             a.");
			listItem = new ListItem(
					"as SMA-0 if the payment default continues for a period up to 30 days from the respective due date; ",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("             b.");
			listItem = new ListItem(
					"as SMA-1 if the payment default continues for a period more than 30 days up to 60 days from the respective due date; and",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("             c.");
			listItem = new ListItem(
					"as SMA-2 if the payment default continues for a period more than 60 days up to 90 days from the respective due date, and as NPA if the payment default continues for a period more than 90 days from the respective due date.",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("   ");
			listItem = new ListItem("Illustrative Representation:", italicFont);
			listItem.setAlignment(Element.ALIGN_CENTER);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("   ");
			listItem = new ListItem(
					"If a due date for repayment of the Facility is March 31, 2023, and full dues are not received before the Facility’s run the day-end process for this date, the date of overdue shall be March 31, 2023. If it continues to remain overdue, then the Borrower’s loan account shall get tagged as SMA-1 upon running day-end process on April 30, 2023 i.e,. upon completion of 30 days of being continuously overdue. Accordingly, the date of SMA-1 classification for the Borrower’s loan account shall be April 30, 2023. ",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.BODY);
			list.setListSymbol("   ");
			listItem = new ListItem(
					"Similarly, if the Borrower’s loan account continues to remain overdue, it shall get tagged as SMA-2 upon running day-end process on May 30, 2023 and if continues to remain overdue further, it shall get classified as non-performing ",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			table.addCell(c1);

			c2 = new PdfPCell();

			list = new List(List.BODY);
			list.setListSymbol("   ");
			listItem = new ListItem("asset upon running day-end process on June 29, 2023.", normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(7);
			list.setPostSymbol(".3");
			p1 = new Phrase();
			listItem = new ListItem(
					" Nothing herein contained shall prejudice any right or remedy available to the Lender against the Borrower(s), Guarantor(s), or other persons liable to pay or contribute towards the recovery of the monies due by the Borrower(s) to the Lender hereunder. Provided further that, the above rights shall be available to the Lender in addition to the charging of additional interest on the dues.",
					normalFont);
			p1.add(new Chunk(" \n\n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(8);
			listItem = new ListItem("  ATTORNEY   \n\n", bold9Font);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(8);
			list.setPostSymbol(".1");
			p1 = new Phrase();
			listItem = new ListItem(
					" For all or any of the aforesaid purposes, on the occurrence of an Event of Default, the Borrower(s) hereby irrevocably appoint the Lender as their attorney or attorneys, and in the name and on behalf of the Borrower(s), to execute and do all acts, deeds, and things which the Borrower(s) are authorized to execute and do under the covenants and provisions herein contained and generally to use the name of the Borrower(s) in the exercise of all or any of the powers under this Agreement and the Transaction Documents or by law conferred upon the Lender and also to execute on behalf of the Borrower(s) at the cost of the Borrower(s), such documents and deeds as may be necessary to give effect to the provisions referred to hereinabove. ",
					normalFont);
			p1.add(new Chunk(" \n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(8);
			list.setPostSymbol(".2");
			p1 = new Phrase();
			listItem = new ListItem(
					" The Borrower(s) covenant with the Lender to ratify and confirm all acts or things made, done, or executed by any attorney as contemplated by clause 8.1 above. ",
					normalFont);
			p1.add(new Chunk(" \n\n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(9);
			listItem = new ListItem("  LENDER’S LIEN / SET OFF /RIGHT TO DEBIT    \n\n", bold9Font);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(9);
			list.setPostSymbol(".1");
			p1 = new Phrase();
			listItem = new ListItem(
					" The rights, powers, and remedies given to the Lender by this Agreement shall be in addition to all rights, powers, and remedies given to the Lender by virtue of any other security, statute, or rule of law. The Lender may exercise a  lien or right of set-off against all monies and other property of the Borrower(s) and documents now or hereafter in the possession of or on deposit with the Lender, whether held in a general or special account or deposit or for safekeeping or otherwise; and every such lien and right of set-off may be exercised without demand upon or notice to the Borrower(s) with respect to any obligation of the Borrower(s) to the Lender in the same manner as if the obligation were unsecured and shall have a lien on all property/credit balance in any other account of the Borrower(s) or securities of the Borrower(s) in the Lender’s possession or custody whether for safe-keeping or otherwise. If upon demand by the Lender, the amounts due under the Facility are not repaid within the prescribed time, then the credit balance in any account of the Borrower(s) may be adjusted towards the amounts due. In case of any deficit, the deficit amount may be recovered by the Lender from the Borrower(s). ",
					normalFont);
			p1.add(new Chunk(" \n\n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(10);
			listItem = new ListItem("  INDEMNITY     \n\n", bold9Font);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(10);
			list.setPostSymbol(".1");
			p1 = new Phrase();
			p2 = new Phrase();
			p3 = new Phrase();
			p4 = new Phrase();
			listItem = new ListItem(
					" The Borrower(s) undertake to indemnify and keep the Lender and its officers/employees fully indemnified and harmless, from and against all the consequences of breach of any of the terms, conditions, statements, undertakings representations, and warranties of this Agreement as also of any of its representations or warranties not being found to be true at any point of time, including any actions, suits, claims, proceedings, damages, liabilities, losses, expenses or costs and also any and all loss, damage or other consequences which may arise or result from giving the Facility to the Borrower(s) or performing any service to the Borrower(s) thereunder (hereinafter referred to as “",
					normalFont);
			p1.add(new Chunk("Claims", boldFont));
			listItem.add(p1);
			p2.add(new Chunk(
					"”), faced, suffered or incurred by the Lender. The Borrower(s) hereby accept and acknowledge that he/she has clearly agreed and understands that this indemnity would cover all acts and omissions on the part of the warranties and/or representations of the Borrower(s). Similarly, in the event of any Claims being made on the Lender, on account of any breach of warranty, representation, non-compliance of any applicable law, unauthorized act, fraud, deed or thing done or omitted to be done or undertaking made by Borrower(s) or its employees, agents, being false, the Borrower(s) undertake to pay on first demand made by the Lender of any amount on this account without any demur, reservation, contest, protest whatsoever within seven working days of the demand being made. \n\n",
					normalFont));
			listItem.add(p2);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(11);
			listItem = new ListItem("  CANCELLATION AND TERMINATION      \n\n", bold9Font);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(11);
			list.setPostSymbol(".1");
			p1 = new Phrase();
			listItem = new ListItem(
					" The Lender may in its sole discretion cancel and terminate the Facility and recall the entire amount due, without any prior intimation to the Borrower(s), if in the opinion of the Lender, any Event of Default has occurred or is likely to occur, or if it becomes unlawful for the Lender to disburse or continue the Facility to the Borrower(s) or if it becomes unlawful for the Borrower(s) to comply with any of its obligations under any of the Transaction Documents. The disbursement having been made by the Lender, the Borrower(s) shall not be entitled to cancel and/or terminate this Agreement. ",
					normalFont);
			p1.add(new Chunk(" \n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(11);
			list.setPostSymbol(".2");
			p1 = new Phrase();
			listItem = new ListItem(
					" As regards the Borrower(s), this Agreement shall be in full force and effect and shall not be terminated till the Facility account is closed and all outstanding thereon satisfied in full, nor shall it be treated as merged into, or modified or altered due to execution of any other documents hereafter. ",
					normalFont);
			p1.add(new Chunk(" \n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);


			table.addCell(c2);
			document.add(table);

/////////////////////////////////////////////////////////////////////////////////////////////			
			// page7 started

			c1 = new PdfPCell();
			table = new PdfPTable(2);
			table.setWidthPercentage(100.0f);
			int arrSpace7[] = { 50, 50 };
			table.setWidths(arrSpace7);

			list = new List(List.ORDERED);
			list.setFirst(12);
			listItem = new ListItem("  LENDER’S RIGHT TO ASSIGN      \n\n", bold9Font);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(12);
			list.setPostSymbol(".1");
			p1 = new Phrase();
			listItem = new ListItem(
					" The Borrower(s) shall not assign or transfer any of its rights, duties, or obligations under this Agreement except with the prior written permission of the Lender. The Borrower(s) expressly recognize and accept that the Lender shall be absolutely entitled and shall have full power and authority to sell, assign or transfer by novation or otherwise, in any manner, in whole or in part this Agreement/Transaction Documents, and in such manner and on such terms as the Lender may decide, (including reserving a right to the Lender to retain its power thereunder to proceed against the Borrower(s) on behalf of the purchaser, assignee or transferee) and any or all Outstandings of the Borrower(s) to any third party of the Lender’s choice without any further reference or intimation to the Borrower(s). Any such action and any such sale, assignment, or transfer shall bind the Borrower(s) to accept such third party as creditor exclusively or as a joint creditor with the Lender as the case may be. ",
					normalFont);
			p1.add(new Chunk(" \n\n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(13);
			listItem = new ListItem("  WAIVER      \n\n", bold9Font);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(13);
			list.setPostSymbol(".1");
			p1 = new Phrase();
			listItem = new ListItem(" ", normalFont);
			p1.add(new Chunk(" No implied waiver or impairment ", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.PARAGRAPH);
			list.setListSymbol(" ");
			listItem = new ListItem(
					"No delay or omission of the Lender in exercising any right, power or remedy accruing to the Lender upon any default hereunder or under any Transaction Documents shall impair any such right, power or remedy or be construed to be a waiver thereof or any acquiescence in such default, nor shall the action or inaction of the Lender in respect of any default or any acquiescence by it in any default, affect or impair any right, power or remedy of the Lender in respect of any other defaults, nor shall any single or partial exercise of any such right, power or remedy preclude any further exercise thereof or the exercise of any other right, power or remedy. The rights and remedies of the Lender herein provided are cumulative and not exclusive of any rights or remedies provided by law, in equity, or in any of the other documents. \n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(13);
			list.setPostSymbol(".2");
			p1 = new Phrase();
			listItem = new ListItem(" ", normalFont);
			p1.add(new Chunk(" Express Waiver  \n", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.PARAGRAPH);
			list.setListSymbol(" ");
			listItem = new ListItem(
					"A waiver or consent granted by the Lender under this Agreement will be effective only if given in writing and then only in the instance and for the purpose for which it is given. \n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(14);
			listItem = new ListItem("  AMENDMENT       \n\n", bold9Font);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.PARAGRAPH);
			list.setListSymbol(" ");
			listItem = new ListItem(
					"The Lender shall have the right to withdraw/modify all/any of the sanction conditions or stipulate fresh conditions under intimation to the Borrower(s). This Agreement and any other documents referred to herein, integrate all the terms and conditions mentioned herein or incidental hereto and supersede all oral negotiations and prior writings in respect of the subject matter hereof, except for those provisions of the agreements, security documents (if any) issued or executed prior to this Agreement which is in addition to and complement to, and is not the same or in conflict with, the terms of this Agreement. \n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(15);
			listItem = new ListItem("  RECORDS        \n\n", bold9Font);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.PARAGRAPH);
			list.setListSymbol(" ");
			listItem = new ListItem(
					" The Lender has a right to hold all the Transaction Documents and any other information exchanged between the Lender and the Borrower(s) under this Agreement even after expiry or termination of this Agreement or for such period as may be specified from time to time for fulfilling any regulatory/internal policy obligations/ guidelines including anti-money laundering related requirements. \n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(16);
			listItem = new ListItem("  NOTICES         \n\n", bold9Font);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.PARAGRAPH);
			list.setListSymbol(" ");
			p1 = new Phrase();
			p2 = new Phrase();
			p3 = new Phrase();
			listItem = new ListItem(
					"Any demand or notice to be made or given to the Borrower(s) may be made or given by leaving the same at or posting the same by post in an envelope under certificate of posting addressed to the Borrower(s) at their place of business, residence, or office as captured in ",
					normalFont);
			p1.add(new Chunk("Annexure I ", boldFont));
			listItem.add(p1);
			p2.add(new Chunk(
					"and every such demand or notice shall be deemed to be received as the case may be at the time at which it is left or at the time at which it should have been delivered in the ordinary course of post. ",
					normalFont));
			listItem.add(p2);
			p3.add(new Chunk("\n\n", boldFont));
			listItem.add(p3);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(17);
			listItem = new ListItem("  HEADINGS          \n\n", bold9Font);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			list = new List(List.PARAGRAPH);
			list.setListSymbol(" ");
			listItem = new ListItem(
					"The headings of the clauses are inserted for convenience of reference only and shall not be deemed to affect the construction of the provisions of this Agreement. ",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c1.addElement(list);

			table.addCell(c1);

			c2 = new PdfPCell();

			list = new List(List.ORDERED);
			list.setFirst(18);
			listItem = new ListItem("  PROVISIONS SEVERABLE           \n\n", bold9Font);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.PARAGRAPH);
			list.setListSymbol(" ");
			listItem = new ListItem(
					"Every provision contained in this Agreement shall be severable and distinct from every other such provision and if at any time any one or more of such provisions is or becomes invalid, illegal, or unenforceable in any respect under any law, the validity, legality and enforceability of the remaining provisions hereof shall not be in any way affected or impaired thereby. \n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(19);
			listItem = new ListItem("  GOVERNING LAW & JURISDICTION            \n\n", bold9Font);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(19);
			list.setPostSymbol(".1");
			p1 = new Phrase();
			p2 = new Phrase();
			listItem = new ListItem(" ", normalFont);
			p1.add(new Chunk("Arbitration: ", boldFont));
			listItem.add(p1);
			p2.add(new Chunk(
					"If any dispute arises between the Parties hereto during the subsistence of this Agreement or thereafter, in connection with the validity, interpretation, implementation or alleged breach of any provision of this Agreement, the dispute shall be referred to a sole arbitrator to be appointed mutually by the Lender and the Borrower(s). \n\n",
					normalFont));
			listItem.add(p2);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(19);
			list.setPostSymbol(".2");
			p1 = new Phrase();
			p2 = new Phrase();
			listItem = new ListItem(" ", normalFont);
			p1.add(new Chunk("Venue: ", boldFont));
			listItem.add(p1);
			p2.add(new Chunk(
					"The venue of arbitration shall be Ahmedabad, India. The arbitration proceeding shall be governed by the Indian Arbitration and Conciliation Act, 1996, or any statutory amendment or re-enactment thereof for the time being in force. The arbitration proceedings shall be conducted in English and the arbitral award shall be recorded in writing.\n\n",
					normalFont));
			listItem.add(p2);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(19);
			list.setPostSymbol(".3");
			p1 = new Phrase();
			p2 = new Phrase();
			listItem = new ListItem(" ", normalFont);
			p1.add(new Chunk("Award: ", boldFont));
			listItem.add(p1);
			p2.add(new Chunk(
					"The arbitration award shall be final and binding on all of the Parties, and the Parties agree to be bound thereby and to act accordingly. The arbitrator shall have the power to award interest on any sums awarded and cost of award. The arbitrator may award to a Party that substantially prevails on the merits, its costs, and expenses, including reasonable fees of its advisors/counsel. \n\n",
					normalFont));
			listItem.add(p2);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(19);
			list.setPostSymbol(".4");
			p1 = new Phrase();
			listItem = new ListItem(
					" Judgment upon the award rendered may be entered in any court having jurisdiction, or application may be made to such court for a judicial recognition of the award or an order of enforcement thereof, as the case may be and to the extent permissible under the Applicable Laws the Parties unconditionally waive their rights to challenge the award rendered by the arbitrator.\n",
					normalFont);
			p1.add(new Chunk("  ", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(19);
			list.setPostSymbol(".5");
			p1 = new Phrase();
			p2 = new Phrase();
			listItem = new ListItem(" ", normalFont);
			p1.add(new Chunk("Costs: ", boldFont));
			listItem.add(p1);
			p2.add(new Chunk(
					"Each Party agrees to bear its own costs of arbitration and to equally share the fees of the arbitration tribunal, unless the arbitration tribunal decides otherwise. \n\n",
					normalFont));
			listItem.add(p2);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(19);
			list.setPostSymbol(".6");
			p1 = new Phrase();
			listItem = new ListItem(
					" This Agreement and the Transaction Documents shall be governed and construed in accordance with the Applicable Laws of India. The Parties hereby submit to the exclusive jurisdiction of courts at Ahmedabad\n\n",
					normalFont);
			p1.add(new Chunk("  ", boldFont));
			listItem.add(p1);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(20);
			listItem = new ListItem("  RELATIONSHIP             \n\n", bold9Font);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.PARAGRAPH);
			list.setListSymbol(" ");
			listItem = new ListItem(
					"The relationship between the Lender and the Borrower(s) as lender and borrower shall commence from the date of this Agreement and subsist until all monies due and payable by the Borrower(s) to the Lender under this Agreement and in all other documents pursuant hereto shall have been fully paid to and received by the Lender. ",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.PARAGRAPH);
			list.setListSymbol(" ");
			listItem = new ListItem(
					"All rights and powers conferred on the Lender by this Agreement shall be in addition and supplemental to any rights the Lender has as a creditor against the Borrower(s) under any law for the time being in force and shall not be in derogation thereof. \n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(21);
			listItem = new ListItem("  STAMP DUTY       \n\n", bold9Font);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.PARAGRAPH);
			list.setListSymbol(" ");
			listItem = new ListItem(
					"The Borrower(s) alone shall be responsible for and shall bear and pay the stamp duty and registration charges, if any, on all the Transaction Documents including this Agreement.\n\n",
					normalFont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.ORDERED);
			list.setFirst(22);
			listItem = new ListItem("  INCONSISTENCY       \n\n", bold9Font);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			list = new List(List.PARAGRAPH);
			list.setListSymbol(" ");
			p1 = new Phrase();
			p2 = new Phrase();
			listItem = new ListItem("This Agreement shall always be read with  ", normalFont);
			p1.add(new Chunk("Schedule 1", boldFont));
			listItem.add(p1);
			p2.add(new Chunk(
					", and all other agreements and documents executed or to be executed by the parties hereto and interpreted accordingly. It is expressly agreed that the other Transaction Documents shall be read as part and parcel of this Agreement and all such covenants, stipulations and obligations as are required to be performed or observed by the Borrower(s) in pursuance of the other Transaction Documents and all such powers and rights as are conferred upon the Lender thereunder shall be deemed to be set out, required or conferred by this Agreement. ",
					normalFont));
			listItem.add(p2);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			c2.addElement(list);

			table.addCell(c2);
			document.add(table);

		} catch (DocumentException ex) {
			ex.printStackTrace();
		}
		document.close();
		return new ByteArrayInputStream(out.toByteArray());
	}
	
	
	// later use this
	public static ByteArrayInputStream getFacilityAgreementPdf(String  dataModel,
			java.util.List<?> repaymentData) throws DocumentException, MalformedURLException, IOException {
	
		ByteArrayOutputStream out = new ByteArrayOutputStream();

		Document document = new Document();
		PdfWriter writer = PdfWriter.getInstance(document, out);

		document.setPageSize(PageSize.A4);
		document.setMargins(50, 45, 50, 135); // left,right,top,bottom (will add space on all sides of text like
												// padding) and here we are setting bottom high not to collapse with the
												// footer
		document.setMarginMirroring(false);
		Rectangle rect = new Rectangle(30, 30, 80, 80);// x,y,width,height
		writer.setBoxSize("art", rect);
//		PdfFooterEvents event = new PdfFooterEvents(out, dataModel);
//		writer.setPageEvent(event);
		
		document.open();
		
		document.newPage();
		out = witness(document, out, writer, dataModel, repaymentData);

		document.close();
		return new ByteArrayInputStream(out.toByteArray());
	}
	
	public static ByteArrayOutputStream witness(Document document, ByteArrayOutputStream out, PdfWriter writer,
			String dataModel, java.util.List<?> repaymentData)
			throws DocumentException, MalformedURLException, IOException {

		try {
			Font blacknfont = new Font(Font.FontFamily.TIMES_ROMAN, 9, Font.NORMAL, new BaseColor(0, 0, 0));
			Font blackblfont = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD, new BaseColor(0, 0, 0));
			Font blackbdfont = new Font(Font.FontFamily.TIMES_ROMAN, 9, Font.BOLD, new BaseColor(0, 0, 0));
			Font underlineNormalfont9 = new Font(Font.FontFamily.TIMES_ROMAN, 9, Font.NORMAL | Font.UNDERLINE,
					new BaseColor(0, 0, 0));
			Font underlineBoldfont9 = new Font(Font.FontFamily.TIMES_ROMAN, 9, Font.BOLD | Font.UNDERLINE,
					new BaseColor(0, 0, 0));
			Font underlineBoldfont13 = new Font(Font.FontFamily.TIMES_ROMAN, 13, Font.BOLD | Font.UNDERLINE,
					new BaseColor(0, 0, 0));

			List list = new List();
			ListItem listItem = new ListItem();
			Phrase p1 = new Phrase();
			Phrase p2 = new Phrase();
			Phrase p3 = new Phrase();

			Paragraph para = new Paragraph("BEFORE MR. GAURAV MEENA, ADVOCATE", blackblfont);
			para.setAlignment(Element.ALIGN_CENTER);
			para.setLeading(10, 0);
			para.setSpacingAfter(9.5f);
			document.add(para);

			para = new Paragraph("SOLE ARBITRATOR", blackblfont);
			para.setAlignment(Element.ALIGN_CENTER);
			para.setLeading(10, 0);
			para.setSpacingAfter(9.5f);
			document.add(para);

			para = new Paragraph("CHAMBER NO. 625A, 2nd FLOOR WESTERN WING TIS HAZARI COURTS ", blackblfont);
			para.setAlignment(Element.ALIGN_CENTER);
			para.setLeading(10, 0);
			para.setSpacingAfter(9.5f);
			document.add(para);

			para = new Paragraph("DELHI-64 ", blackblfont);
			para.setAlignment(Element.ALIGN_CENTER);
			para.setLeading(10, 0);
			para.setSpacingAfter(9.5f);
			document.add(para);

			para = new Paragraph("ARBITRATION CASE NO. ", blacknfont);
			para.setAlignment(Element.ALIGN_CENTER);
			para.setLeading(10, 0);
			para.setSpacingAfter(9.5f);
			document.add(para);

			para = new Paragraph("IN THE MATTER OF:", underlineNormalfont9);
			para.setAlignment(Element.ALIGN_LEFT);
			para.setLeading(10, 0);
			para.setSpacingAfter(9.5f);
			document.add(para);

			para = new Paragraph("CAPITAL TRUST LIMITED", blacknfont);
			para.setAlignment(Element.ALIGN_LEFT);
			para.setLeading(10, 0);
			para.setSpacingAfter(9.5f);
			document.add(para);

			para = new Paragraph("205 Centrum Mall, Sultanpur, New Delhi "
					+ "                                                                                                                          .....CLAIMANT",
					blacknfont);
			para.setAlignment(Element.ALIGN_LEFT);
			para.setLeading(10, 0);
			para.setSpacingAfter(9.5f);
			document.add(para);

			para = new Paragraph("\n", blacknfont);
			para.setAlignment(Element.ALIGN_LEFT);
			document.add(para);

			para = new Paragraph("VERSUS", blacknfont);
			para.setAlignment(Element.ALIGN_CENTER);
			para.setLeading(10, 0);
			para.setSpacingAfter(9.5f);
			document.add(para);

			list = new List(List.BODY);
			list.setListSymbol("        1.");
			p1 = new Phrase();
			listItem = new ListItem("Ali Medical Store" + " (Borrower)", blacknfont);

			p1.add(new Chunk(
					"\n" + "R/o :- "
							+ "Hamdard Nagar B Near Barelvi Masjid Jamalpur, Koil, Aligarh, Uttar Pradesh, Pin:202001",
					blacknfont));
			listItem.add(p1);

			p2 = new Phrase();
			p2.add(new Chunk("\n" + "Ph:- " + "8989898989", blacknfont));
			listItem.add(p2);

			list.add(listItem);
			document.add(list);

			para = new Paragraph("\n", blacknfont);
			para.setAlignment(Element.ALIGN_LEFT);
			document.add(para);

			list = new List(List.BODY);
			list.setListSymbol("        2.");
			p1 = new Phrase();
			listItem = new ListItem("Nasa" + " (Co- Borrower)", blacknfont);

			p1.add(new Chunk("\n" + "R/o :- " + "544, Jamalapur Maphi, Aligarh, aligarh, uttar Pradesh, 202001",
					blacknfont));
			listItem.add(p1);

			p2 = new Phrase();
			p2.add(new Chunk("\n" + "Ph:- " + "9090909090", blacknfont));
			listItem.add(p2);

			list.add(listItem);
			document.add(list);

			para = new Paragraph("\n", blacknfont);
			para.setAlignment(Element.ALIGN_LEFT);
			document.add(para);

			list = new List(List.BODY);
			list.setListSymbol("        3.");
			p1 = new Phrase();
			listItem = new ListItem("Anessa Khan" + " (Co- Borrower B)", blacknfont);

			p1.add(new Chunk("\n" + "R/o :- " + "222, Jamalapur Maphi, Aligarh, aligarh, uttar Pradesh, 202001",
					blacknfont));
			listItem.add(p1);

			p2 = new Phrase();
			p2.add(new Chunk("\n" + "Ph:- " + "1010101010 "
					+ "                                                                                                                                       ……  RESPODENTS",
					blacknfont));
			listItem.add(p2);

			list.add(listItem);
			document.add(list);

			para = new Paragraph("\n\n", blacknfont);
			para.setAlignment(Element.ALIGN_LEFT);
			document.add(para);

			para = new Paragraph("STATEMENT OF CLAIM ON BEHALF OF THE CLAIMANT FOR RECOVERY OF RS. " + " Total Due/- " // total due
					+ " ALONG WITH PENDENT-LITE AND FUTURE INTEREST", underlineBoldfont13);
			para.setAlignment(Element.ALIGN_LEFT);
			para.setLeading(15, 0);
			para.setSpacingAfter(10);
			document.add(para);

			para = new Paragraph("The claimant above named respectfully showeth as: -", blacknfont);
			para.setAlignment(Element.ALIGN_LEFT);
			document.add(para);

			para = new Paragraph("\n", blacknfont);
			para.setAlignment(Element.ALIGN_LEFT);
			document.add(para);

			list = new List(List.BODY);
			list.setListSymbol("        1.");
			p1 = new Phrase();
			listItem = new ListItem(
					"The claimant is a company incorporated under the Companies Act, 1956 having its Head Office at 205 Centrum Mall, Sultanpur, New Delhi and is engaged in the business of providing financial credit facilities in the form of various kind of loans.",
					blacknfont);

			list.add(listItem);
			document.add(list);

			para = new Paragraph("\n", blacknfont);
			para.setAlignment(Element.ALIGN_LEFT);
			document.add(para);

			list = new List(List.BODY);
			list.setListSymbol("        2.");
			p1 = new Phrase();
			listItem = new ListItem(
					"The Board of Directors of the claimant company Vide Power of Attorney dated 02nd September 2019 has authorized Shri "
							+ "KULDEEP KUMAR" // client Name
							+ ", Legal Officer to represent the company and to sign verify and present pleadings on behalf of the claimant, institute, prosecute and to do all acts deeds for due prosecution of the present claim. He is well conversant with the facts and circumstances of the present case as per information received and derived from the records and the books of the claimant maintained in usual course of business. The present claim has been signed, verified and instituted by Shri "
							+ "KULDEEP KUMAR" // client Name
							+ " who is authorized by the claimant. The copy of the Power of Attorney is annexed herewith as  ",
					blacknfont);

			p1.add(new Chunk("Annexure-A.", blackbdfont));
			listItem.add(p1);
			list.add(listItem);
			document.add(list);

			para = new Paragraph("\n", blacknfont);
			para.setAlignment(Element.ALIGN_LEFT);
			document.add(para);

			list = new List(List.BODY);
			list.setListSymbol("        3.");
			p1 = new Phrase();
			listItem = new ListItem(
					"The Respondents as borrowers approached the claimant company for availing financial assistance for Small Enterprises loan. On the request of the respondent the claimant granted a loan of Rs. "
							+ "SANCTION AMOUNT" // SANCTION AMOUNT
							+ "/- and the respondents agreed to repay the loan amount in " + "NUMBERS OF INSTALLMENTS " // NUMBERS OF INSTALLMENTS
							+ "equated monthly installments of Rs. " + "AMOUNT OF INSTALLMENTS" // AMOUNT OF INSTALLMENTS
							+ "/- each with interest and other charges. An Agreement bearing No " + "LOAN ID " // loan id
							+ " dated " + "SANCTION DATE" // SANCTION DATE
							+ " was duly executed and was signed by the respondents after going through the term and condition of the same. As per the terms and conditions of the Agreement the respondent has to pay the installments on due dates and in case of any default, he is liable whole amount standing due there and these in lump sum. The copy of the Agreement is annexed herewith as ",
					blacknfont);

			p1.add(new Chunk("Annexure-B.", blackbdfont));
			listItem.add(p1);
			list.add(listItem);
			document.add(list);

			para = new Paragraph("\n", blacknfont);
			para.setAlignment(Element.ALIGN_LEFT);
			document.add(para);

			list = new List(List.BODY);
			list.setListSymbol("        4.");
			p1 = new Phrase();
			listItem = new ListItem("That an amount of Rs. " + "SANCTION AMOUNT" // Sanction Amount
					+ "/- was released in favour of the respondent and with this amount the respondent has to promote his Business and the same was under the exclusive hypothecation of the claimant.",
					blacknfont);

			list.add(listItem);
			document.add(list);

			para = new Paragraph("\n", blacknfont);
			para.setAlignment(Element.ALIGN_LEFT);
			document.add(para);

			list = new List(List.BODY);
			list.setListSymbol("        5.");
			p1 = new Phrase();
			listItem = new ListItem(
					"After having availed of the loan the respondents has failed to abide by the terms of the agreement and defaulted in making the payment of EMI to the claimant.",
					blacknfont);

			list.add(listItem);
			document.add(list);

			para = new Paragraph("\n", blacknfont);
			para.setAlignment(Element.ALIGN_LEFT);
			document.add(para);

			list = new List(List.BODY);
			list.setListSymbol("        6.");
			p1 = new Phrase();
			listItem = new ListItem(
					"As per the terms of Agreement the claimant sent a Demand Notice dated 21-Feb-23 to the respondent calling upon the respondent to pay the outstanding amount but despite the receipt of the notice the respondent has neglected and failed to pay the same. Original Demand notice dated 21-Feb-23 and Postal receipt are annexed herewith as ",
					blacknfont);

			p1.add(new Chunk("Annexure- C & D.", blackbdfont));
			listItem.add(p1);
			list.add(listItem);
			document.add(list);

			para = new Paragraph("\n", blacknfont);
			para.setAlignment(Element.ALIGN_LEFT);
			document.add(para);

			list = new List(List.BODY);
			list.setListSymbol("        7.");
			p1 = new Phrase();
			listItem = new ListItem(
					"Thereafter the claimant company sent an Invocation notice dated 06-Mar-23 to the respondent calling upon them to clear their outstanding or else the matter will be referred to the Sole Arbitrator for adjudication of claim to resolve the dispute/difference between the parties. Copy of Invocation notice dated 06-Mar-23 and postal receipt are annexed herewith as ",
					blacknfont);

			p1.add(new Chunk("Annexure - E & F.", blackbdfont));
			listItem.add(p1);

			p2 = new Phrase();
			p2.add(new Chunk(
					"However, despite of the said notice, the respondent did not clear the dues. Consequently, the claimant referred the present claim / dispute for arbitration vide reference dated 20.04.2023 to the arbitrator. Copy of reference letter dated 20.04.2023 is annexed herewith as ",
					blacknfont));
			listItem.add(p2);

			p3 = new Phrase();
			p3.add(new Chunk("Annexure - G.", blackbdfont));
			listItem.add(p3);
			list.add(listItem);
			document.add(list);

			para = new Paragraph("\n", blacknfont);
			para.setAlignment(Element.ALIGN_LEFT);
			document.add(para);

			list = new List(List.BODY);
			list.setListSymbol("        8.");
			p1 = new Phrase();
			listItem = new ListItem(
					"The as per the books of account maintained by the claimant the respondent liable to pay an amount of Rs. "
							+ "TOTAL DUE" // total due
							+ "/- as on " + "DATE OF TOTAL DUE" // date of total due
							+ " along with pendent-lite and future interest @ 24% p.a. Copy of Statement of Account is annexed herewith as ",
					blacknfont);

			p1.add(new Chunk("Annexure -H.", blackbdfont));
			listItem.add(p1);

			list.add(listItem);
			document.add(list);

			para = new Paragraph("\n", blacknfont);
			para.setAlignment(Element.ALIGN_LEFT);
			document.add(para);

			list = new List(List.BODY);
			list.setListSymbol("        9.");
			p1 = new Phrase();
			listItem = new ListItem(
					"That on the basis of facts and circumstances mentioned herein above, it is evident that the respondent has failed to adhere to the financial discipline and defaulted in the payment of dues and he has no intention to repay the outstanding amount of Rs. "
							+ "TOTAL DUE" // total due
							+ "/- as on " + "DATE OF TOTAL DUE" // date of total due
							+ ".",
					blacknfont);

			list.add(listItem);
			document.add(list);

			para = new Paragraph("\n", blacknfont);
			para.setAlignment(Element.ALIGN_LEFT);
			document.add(para);

			list = new List(List.BODY);
			list.setListSymbol("        10.");
			p1 = new Phrase();
			listItem = new ListItem(
					"That the cause of action in respect of the present claim accrued in favour of the claimant and against the respondents on "
							+ "DATE OF LOAN AGGREMENT" // DATE OF LOAN AGGREMENT
							+ " When the respondent executed the Loan Agreement No. " + "Loan Id " // loan id
							+ "The cause of action further arose against the respondents when they defaulted in making the payment of EMI. The cause of action also arose on all the dates when the claimant drew the attention of the respondents towards his liabilities in favour of the claimant. It also arose when despite the service of Demand notice the respondents had failed to make the payment to the claimant. The cause of action is subsisting and continues to subsist till such time there is an outstanding amount against the respondent. Since the dispute/claim has arisen between the aforesaid parties, the claimant is constrained to file this petition for recovery of Rs. "
							+ "Total Due" // TOTAL DUE
							+ "/-",
					blacknfont);

			list.add(listItem);
			document.add(list);

			para = new Paragraph("\n", blacknfont);
			para.setAlignment(Element.ALIGN_LEFT);
			document.add(para);

			para = new Paragraph("Prayer", blackbdfont);
			para.setAlignment(Element.ALIGN_CENTER);
			para.setLeading(10, 0);
			para.setSpacingAfter(9.5f);
			document.add(para);

			list = new List(List.BODY);
			list.setListSymbol("          a.");
			listItem = new ListItem(
					"It is prayed before the Hon'ble Sole Arbitrator may graciously be pleased to:- Pass an Award directing the Respondents to pay the amount of Rs. "
							+ "Total Due" // TOTAL DUE
							+ "/- together with interest @ 24% p. a. from the date of filing this claim petition till the date of realization of the amount.",
					blacknfont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			document.add(list);

			para = new Paragraph("\n", blacknfont);
			para.setAlignment(Element.ALIGN_LEFT);
			document.add(para);

			list = new List(List.BODY);
			list.setListSymbol("          b.");
			listItem = new ListItem(
					"Pass an award directing the respondents to pay an Installment Due and unpaid amount which amounts to Rs. "
							+ "Unpaid Amount as closuer statement" // Unpaid Amount as closuer statement
							+ "/- The same is shown at closure statement of the respondent.",
					blacknfont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			document.add(list);

			para = new Paragraph("\n", blacknfont);
			para.setAlignment(Element.ALIGN_LEFT);
			document.add(para);

			list = new List(List.BODY);
			list.setListSymbol("          c.");
			listItem = new ListItem(
					"Pass an Award to directing the bank of the respondents to block the Bank Account the respondents. ",
					blacknfont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			document.add(list);

			para = new Paragraph("\n", blacknfont);
			para.setAlignment(Element.ALIGN_LEFT);
			document.add(para);

			list = new List(List.BODY);
			list.setListSymbol("          d.");
			listItem = new ListItem(
					"Pass an Award to advice the concerned Sub-Registrar not no alienate any of the property of respondents and also not to alienate the below property details:-",
					blacknfont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			document.add(list);

			para = new Paragraph("\n", blacknfont);
			para.setAlignment(Element.ALIGN_LEFT);
			document.add(para);

			list = new List(List.BODY);
			list.setListSymbol("          e.");
			listItem = new ListItem(
					"The claimant may be allowed to sell the property, mortgage by deposit of Title Deed Against Loan and adjusting the said loan amount and proceed for the shortfall, if any through execution.",
					blacknfont);
			listItem.setAlignment(Element.ALIGN_JUSTIFIED);
			listItem.setLeading(10, 0);
			list.add(listItem);
			document.add(list);

			document.newPage();

			para = new Paragraph("Award costs of the proceedings", blackbdfont);
			para.setAlignment(Element.ALIGN_LEFT);
			para.setLeading(10, 0);
			para.setSpacingAfter(12);
			document.add(para);

			para = new Paragraph(
					"      Grant such other relief or reliefs as the Hon'ble Tribunal deemed fit and proper under circumstances of the case and pass such other order or orders in the interest of justice.",
					blacknfont);
			para.setAlignment(Element.ALIGN_LEFT);
			para.setLeading(10, 0);
			para.setSpacingAfter(12);
			document.add(para);

			para = new Paragraph("\n", blacknfont);
			para.setAlignment(Element.ALIGN_LEFT);
			document.add(para);

			para = new Paragraph("CLAIMANT", blackbdfont);
			para.setAlignment(Element.ALIGN_RIGHT);
			para.setLeading(10, 0);
			para.setSpacingAfter(12);
			document.add(para);

			para = new Paragraph("\n\n\n", blacknfont);
			para.setAlignment(Element.ALIGN_LEFT);
			document.add(para);
			
			
			
			PdfPTable table = new PdfPTable(2);
			table.setWidthPercentage(100.0f);
			int arrSpace17[] = { 50, 50 };
			table.setWidths(arrSpace17);
			PdfPCell c1 = new PdfPCell();
			PdfPCell c2 = new PdfPCell();
			
			para = new Paragraph("Future Principal", blacknfont);
			para.setAlignment(Element.ALIGN_CENTER);
			para.setLeading(10, 0);
			para.setSpacingAfter(12);
			c1.addElement(para);
			table.addCell(c1);
			document.add(table);
			
			para = new Paragraph(""+ 11111, blacknfont);
			para.setAlignment(Element.ALIGN_CENTER);
			para.setLeading(10, 0);
			para.setSpacingAfter(12);
			c2.addElement(para);
			table.addCell(c1);
			document.add(table);
			
			PdfPTable table2 = new PdfPTable(2);
			table2.setWidthPercentage(100.0f);
			int arrSpace2[] = { 50, 50 };
			table2.setWidths(arrSpace2);
			PdfPCell c3 = new PdfPCell();
			PdfPCell c4 = new PdfPCell();
			
			para = new Paragraph("Principal", blacknfont);
			para.setAlignment(Element.ALIGN_CENTER);
			para.setLeading(10, 0);
			para.setSpacingAfter(12);
			c3.addElement(para);
			table2.addCell(c3);
			document.add(table2);
			
			para = new Paragraph(""+ 11111, blacknfont);
			para.setAlignment(Element.ALIGN_CENTER);
			para.setLeading(10, 0);
			para.setSpacingAfter(12);
			c4.addElement(para);
			table2.addCell(c4);
			document.add(table2);
			
			
			para = new Paragraph("\n\n\n", blacknfont);
			para.setAlignment(Element.ALIGN_LEFT);
			document.add(para);

			para = new Paragraph("Through", blacknfont);
			para.setAlignment(Element.ALIGN_CENTER);
			para.setLeading(10, 0);
			para.setSpacingAfter(12);
			document.add(para);

			para = new Paragraph("\n", blacknfont);
			para.setAlignment(Element.ALIGN_LEFT);
			document.add(para);

			para = new Paragraph("Counsel", blacknfont);
			para.setAlignment(Element.ALIGN_RIGHT);
			para.setLeading(10, 0);
			para.setSpacingAfter(9);
			document.add(para);

			para = new Paragraph("TARUN SONI & ASSOCIATES", blackbdfont);
			para.setAlignment(Element.ALIGN_RIGHT);
			para.setLeading(10, 0);
			para.setSpacingAfter(9);
			document.add(para);

			para = new Paragraph("ADVOCATES & CONSULTANTS", blacknfont);
			para.setAlignment(Element.ALIGN_RIGHT);
			para.setLeading(10, 0);
			para.setSpacingAfter(9);
			document.add(para);

			para = new Paragraph("PH. 8800106808, 8700318693", blacknfont);
			para.setAlignment(Element.ALIGN_RIGHT);
			para.setLeading(10, 0);
			para.setSpacingAfter(9);
			document.add(para);

			para = new Paragraph("E-mail: advtarunsoni@gmail.com", blacknfont);
			para.setAlignment(Element.ALIGN_RIGHT);
			para.setLeading(10, 0);
			para.setSpacingAfter(9);
			document.add(para);

			para = new Paragraph("\n\n\n", blacknfont);
			para.setAlignment(Element.ALIGN_LEFT);
			document.add(para);

			para = new Paragraph("VERIFICATION: -", underlineBoldfont9);
			para.setAlignment(Element.ALIGN_LEFT);
			para.setLeading(10, 0);
			para.setSpacingAfter(12);
			document.add(para);

			para = new Paragraph(
					"Verified at Delhi on this Pass an Award to that the contents of paras 1 - 10 are true and correct as per information received from the claimant.",
					blacknfont);
			para.setAlignment(Element.ALIGN_LEFT);
			para.setLeading(10, 0);
			para.setSpacingAfter(9);
			document.add(para);

			para = new Paragraph("\n\n", blacknfont);
			para.setAlignment(Element.ALIGN_LEFT);
			document.add(para);

			para = new Paragraph("CLAIMANT", blackbdfont);
			para.setAlignment(Element.ALIGN_RIGHT);
			para.setLeading(10, 0);
			para.setSpacingAfter(9);
			document.add(para);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return out;
	}

}
