import java.io.*;
import java.util.Scanner;

import org.apache.batik.dom.svg.SVGDOMImplementation;
import org.apache.batik.svggen.SVGGraphics2D;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class _10_HouseSVG {

	public static void main(String[] args) throws IOException {

		int linesCount = 6;
		int cellSize = 50;
		Scanner line = new Scanner(System.in);
		int pointsCount = line.nextInt();
		float x;
		float y;
		boolean inTriangle;
		DOMImplementation domImpl = SVGDOMImplementation.getDOMImplementation();
		String svgNS = SVGDOMImplementation.SVG_NAMESPACE_URI;
		Document document = domImpl.createDocument(svgNS, "svg", null);

		// Create an instance of the SVG Generator
		SVGGraphics2D g2d = new SVGGraphics2D(document);

		Element root = document.getDocumentElement();
		root.setAttributeNS(null, "width", "320");
		root.setAttributeNS(null, "height", "350");
		root.setAttributeNS(null, "style", "display:block;margin:auto");
		float numbers = 10;
		Element e;
		for (int i = 40; i < linesCount * cellSize; i += cellSize) {
			e = document.createElementNS(svgNS, "text");
			e.setTextContent(String.valueOf(numbers));
			e.setAttributeNS(null, "x", String.valueOf(i - 10));
			e.setAttributeNS(null, "y", "40");
			root.appendChild(e);
			numbers += 2.5;

			e = document.createElementNS(svgNS, "line");
			e.setAttributeNS(null, "x1", String.valueOf(i));
			e.setAttributeNS(null, "y1", "50");
			e.setAttributeNS(null, "x2", String.valueOf(i));
			e.setAttributeNS(null, "y2", "350");
			e.setAttributeNS(null, "style", "stroke:blue;stroke-width:0.5;stroke-dasharray:1,1");
			root.appendChild(e);
		}

		numbers = 3.5f;
		for (int i = 50; i <= linesCount * cellSize; i += cellSize) {
			e = document.createElementNS(svgNS, "text");
			e.setTextContent(String.valueOf(numbers));
			e.setAttributeNS(null, "x", "0");
			e.setAttributeNS(null, "y", String.valueOf(i + cellSize / 2 + 5));
			root.appendChild(e);
			numbers += 2.5;

			e = document.createElementNS(svgNS, "line");
			e.setAttributeNS(null, "x1", "30");
			e.setAttributeNS(null, "y1", String.valueOf(i + cellSize / 2));
			e.setAttributeNS(null, "x2", "300");
			e.setAttributeNS(null, "y2", String.valueOf(i + cellSize / 2));
			e.setAttributeNS(null, "style", "stroke:blue;stroke-width:0.5;stroke-dasharray:1,1");
			root.appendChild(e);
		}

		e = document.createElementNS(svgNS, "rect");
		e.setAttributeNS(null, "x", "90");
		e.setAttributeNS(null, "y", "175");
		e.setAttributeNS(null, "width", "100");
		e.setAttributeNS(null, "height", "100");
		e.setAttributeNS(null, "style", "fill:gray;opacity: 0.4;stroke:blue;stroke-width:2");
		root.appendChild(e);

		e = document.createElementNS(svgNS, "rect");
		e.setAttributeNS(null, "x", "240");
		e.setAttributeNS(null, "y", "175");
		e.setAttributeNS(null, "width", "50");
		e.setAttributeNS(null, "height", "100");
		e.setAttributeNS(null, "style", "fill:gray;opacity: 0.4;stroke:blue;stroke-width:2");
		root.appendChild(e);

		e = document.createElementNS(svgNS, "polygon");
		e.setAttributeNS(null, "points", "190,75,90,175,290,175");
		e.setAttributeNS(null, "style", "fill:gray;opacity: 0.4;stroke:blue;stroke-width:2");
		root.appendChild(e);
		
		for (int i = 0; i < pointsCount; i++) {
			e = document.createElementNS(svgNS, "circle");
			x = line.nextFloat();
			y = line.nextFloat();
			inTriangle = (17.5 - 12.5) * (y - 8.5) - (3.5 - 8.5) * (x - 12.5) >= 0 &&
					(17.5 - 22.5) * (y - 8.5) - (3.5 - 8.5) * (x - 22.5) <= 0 &&
					y <= 8.5 && y >= 3.5;
			if (inTriangle || 
					(x >= 12.5 && x <= 17.5 && y >= 8.5 && y <= 13.5) ||
					(x >= 20 && x <= 22.5 && y >= 8.5 && y <= 13.5)) {
				e.setAttributeNS(null, "style", "fill:black;");
			} else {
				e.setAttributeNS(null, "style", "fill:gray;stroke:black;stroke-width:0.5");
			}
			
			x = (x - 7.5f) * 20 - 10;
			y = (y - 1.5f) * 20 + 35;
			e.setAttributeNS(null, "cx", String.valueOf(x));
			e.setAttributeNS(null, "cy", String.valueOf(y));
			e.setAttributeNS(null, "r", "5");
			root.appendChild(e);
		}
		
		line.close();

		// Write svg file
		OutputStream outputStream = new FileOutputStream("house.html");
		Writer out = new OutputStreamWriter(outputStream, "UTF-8");
		g2d.stream(root, out, true, false);
		outputStream.flush();
		outputStream.close();

	}

}
