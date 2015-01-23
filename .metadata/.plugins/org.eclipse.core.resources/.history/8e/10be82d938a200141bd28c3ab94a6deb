
import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class _09_GeneratePDFByExternalLibrary {

	public static void main(String[] args) throws DocumentException, Exception {




		
			Document doc = new Document();
			PdfWriter.getInstance(doc, new FileOutputStream("DeckOfCards.pdf"));

			doc.open();  

			PdfPTable table = new PdfPTable(4);
			table.setWidthPercentage(100);
			

			for (int face = 2; face <= 14; face++) {
				
				for (int suit = 0; suit < 4; suit++) {

					String card = "";
					
					switch (face) {
					case 11:
						card += "J";
						break;
					case 12:
						card += "Q";
						break;
					case 13:
						card += "K";
						break;
					case 14:
						card += "A";
						break;
					default:
						card += face;
						break;
					}

					switch (suit) {
					case 0:
						card += '\u2660';

						break;
					case 1:
						card += '\u2665';

						break;
					case 2:
						card += '\u2663';

						break;
					case 3:
						card += '\u2666';

						break;
					}
					
					
					PdfPTable nestedTable = new PdfPTable(1);
					PdfPCell nestedCell = new PdfPCell();	
					nestedCell.setFixedHeight(150);
					nestedCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
					
					BaseFont baseFont = BaseFont.createFont("lucida.ttf", BaseFont.IDENTITY_H, true);
					
					Font color;
					
					if (suit % 2 == 0 ) {
						color = new Font(baseFont, 25f, 0, BaseColor.BLACK);
					}
					else {
						 color = new Font(baseFont, 25f, 0, BaseColor.RED);
					}
					
					Paragraph text = new Paragraph(card, color);
					text.setAlignment(Element.ALIGN_CENTER);
					
					nestedCell.setBorderWidth(2f);
					nestedCell.addElement(text); 
					nestedTable.addCell(nestedCell);
					
					PdfPCell cell = new PdfPCell();
					cell.setBorderColor(BaseColor.WHITE);
					cell.addElement(nestedTable);
					table.addCell(cell);
				}
				//System.out.println(card);
			}
			
			doc.add(table);
			doc.close();
	}
}
