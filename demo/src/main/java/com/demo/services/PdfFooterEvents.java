package com.demo.services;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.commons.compress.utils.IOUtils;
import org.springframework.core.io.ClassPathResource;

import com.demo.model.LendboxDataModel;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfFooterEvents extends PdfPageEventHelper{
	
	Font blacknsfonts = new Font(Font.FontFamily.TIMES_ROMAN, 8, Font.NORMAL, new BaseColor(0, 0, 0));
	ByteArrayOutputStream out;
	LendboxDataModel dataModel;

	
	public PdfFooterEvents(ByteArrayOutputStream out,LendboxDataModel  dataModel) {
		this.out = out;
		this.dataModel = dataModel;
	}
	
	@Override
	public void onEndPage(PdfWriter writer, Document document) {
		try {
			addFooterImproved(writer, document);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void addFooterImproved(PdfWriter writer, Document document) throws DocumentException, MalformedURLException, java.io.IOException {
		// TODO Auto-generated method stub

		PdfPTable footer = new PdfPTable(2);
		 footer.setWidthPercentage(70.0f);
		 footer.setTotalWidth(500);
		int arrSpace2[] = { 35, 35 };
		footer.setWidths(arrSpace2);
		
		 System.out.println("footer:::"+footer);
		 
		 PdfContentByte canvas = writer.getDirectContent();
		// ColumnText.showTextAligned(canvas, Element.ALIGN_LEFT, new Phrase(String.format("Page %d", writer.getPageNumber()),blacknsfonts), (document.left() + document.right())/2 , document.bottom()-20, 0);

		 Image tickimg;
		 tickimg = Image.getInstance(IOUtils.toByteArray(new ClassPathResource("images/tick.png").getInputStream()));
			 tickimg.scaleAbsolute(15.0f, 15.0f);     
			 PdfPCell cell=new PdfPCell();
	 Paragraph para = null;
	if(dataModel.getCflClients()!=null &&dataModel.getCflClients().intValue()==9 )
	  para = new Paragraph("Accepted with OTP confirmation:\nName:"+dataModel.getClientName()+"\nLocation: "+dataModel.getBranchname()+"\nReason: Capital Trust Ltd. loan documentation"+"\nDate: "+dataModel.getTermsConditionSignSl()+"\n",blacknsfonts);
	if(dataModel.getCflClients()!=null &&dataModel.getCflClients().intValue()==11 )
		para = new Paragraph("Digitally Signed by:\nName:"+dataModel.getClientName()+"\nLocation: "+dataModel.getBranchname()+"\nReason: Kaleidofin Capital loan documentation"+"\nDate: "+dataModel.getTermsConditionSignSl()+"\nDevice Id: "+dataModel.getDeviceId()+"\nLatitude: "+dataModel.getLatitude()+"\nLongitude: "+dataModel.getLongitude()+"\n",blacknsfonts);
	else
		  para = new Paragraph("Digitally Signed by:\nName:"+dataModel.getClientName()+"\nLocation: "+dataModel.getBranchname()+"\nReason: Capital Trust Ltd. loan documentation"+"\nDate: "+dataModel.getTermsConditionSignSl()+"\nDevice Id: "+dataModel.getDeviceId()+"\nLatitude: "+dataModel.getLatitude()+"\nLongitude: "+dataModel.getLongitude()+"\n",blacknsfonts);

	para.setAlignment(Element.ALIGN_LEFT);
	cell.addElement(para);
	cell.addElement(tickimg);
	cell.setBorder(Rectangle.NO_BORDER);
	footer.addCell(cell);//

	cell = new PdfPCell();
	if(dataModel.getCflClients()!=null &&dataModel.getCflClients().intValue()==9 )
	para = new Paragraph("Accepted with OTP confirmation:\nName:"+dataModel.getCoborrowername()+"\nLocation: "+dataModel.getBranchname()+"\nReason: Capital Trust Ltd. loan documentation"+"\nDate: "+dataModel.getTermsConditionSignSl()+"\n",blacknsfonts);	        
	if(dataModel.getCflClients()!=null &&dataModel.getCflClients().intValue()==11 )
		para = new Paragraph("Digitally Signed by:\nName:"+dataModel.getCoborrowername()+"\nLocation: "+dataModel.getBranchname()+"\nReason: Kaleidofin Capital loan documentation"+"\nDate: "+dataModel.getTermsConditionSignSl()+"\nDevice Id: "+dataModel.getDeviceId()+"\nLatitude: "+dataModel.getLatitude()+"\nLongitude: "+dataModel.getLongitude()+"\n",blacknsfonts);
	else
		para = new Paragraph("Digitally Signed by:\nName:"+dataModel.getCoborrowername()+"\nLocation: "+dataModel.getBranchname()+"\nReason: Capital Trust Ltd. loan documentation"+"\nDate: "+dataModel.getTermsConditionSignSl()+"\nDevice Id: "+dataModel.getDeviceId()+"\nLatitude: "+dataModel.getLatitude()+"\nLongitude: "+dataModel.getLongitude()+"\n",blacknsfonts);	        

	cell.addElement(para);
	para.setAlignment(Element.ALIGN_LEFT);
	cell.setBorder(Rectangle.NO_BORDER);
	cell.addElement(tickimg);
	footer.addCell(cell);//
	footer.completeRow();
		 
		canvas.beginMarkedContentSequence(com.itextpdf.text.pdf.PdfName.ARTIFACT);
		footer.writeSelectedRows(0, -1, 50, 140,canvas); //50 is space from left to the footer text  and 140 is the space from bottom of page to up like end of footer text means last line
		canvas.endMarkedContentSequence();
		
	}
}

