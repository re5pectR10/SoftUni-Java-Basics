

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;

public class _9_CardDeck {

	public static void main(String[] args) throws IOException, DocumentException {

		char[] suits = { '\u2660', '\u2663', '\u2666', '\u2665' };
		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		Document pdf = new Document(PageSize.A4, 50, 50, 50, 50);
		PdfPTable table = new PdfPTable(13);
		table.setWidthPercentage(100);
		PdfPCell cell;

		PdfWriter.getInstance(pdf, new FileOutputStream("deck.pdf"));
		BaseFont bf = BaseFont.createFont("font/l_10646.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
		Font font = new Font(bf, 12f, 0, BaseColor.BLACK);
		pdf.addSubject("Deck of cards");
		pdf.open();
		for (int i = 0; i < suits.length; i++) {
			if (i == 2) {
				pdf.add(table);
				font.setColor(BaseColor.RED);
				table.flushContent();
			}

			for (int j = 0; j < ranks.length; j++) {
				cell = new PdfPCell(new Paragraph(ranks[j] + " " + suits[i], font));
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell.setFixedHeight(100);
				table.addCell(cell);
			}
		}

		pdf.add(table);
		pdf.close();
	}
}
