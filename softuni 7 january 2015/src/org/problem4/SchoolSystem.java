package org.problem4;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class SchoolSystem {

	public static void main(String[] args) {

		Scanner line = new Scanner(System.in);
		int rowsCount=line.nextInt();
		line.nextLine();
		String[] input = new String[rowsCount];
		String[] currenLine = new String[4];
		String[] previousLine = new String[4];
		float currentScore = 0;
		int scoresPerSubject = 1;
		DecimalFormat df = new DecimalFormat("####0.00");

		for (int i = 0; i < rowsCount; i++) {
			input[i] = line.nextLine();
		}
		
		Arrays.sort(input);
		
		for (int i = 0; i < input.length; i++) {
			currenLine = input[i].split(" ");
			if (!(currenLine[0] + " " + currenLine[1]).equals(previousLine[0] + " " + previousLine[1])) {
				if (i != 0) {
					System.out.println(df.format(currentScore / scoresPerSubject) + "]");
				}
				
				System.out.print(currenLine[0] + " " + currenLine[1] + ": [" + currenLine[2] + " - ");
				currentScore = Float.parseFloat(currenLine[3]);
				scoresPerSubject = 1;
			} else {
				if (currenLine[2].equals(previousLine[2])) {
					scoresPerSubject++;
					currentScore += Float.parseFloat(currenLine[3]);
				} else {
					System.out.print(df.format(currentScore / scoresPerSubject) + ", " + currenLine[2] + " - ");					
					currentScore = Float.parseFloat(currenLine[3]);
					scoresPerSubject = 1;
				}
			}
			
			if (i == input.length - 1) {
				System.out.println(df.format(currentScore / scoresPerSubject) + "]");
			}
			
			for (int j = 0; j < currenLine.length; j++) {
				previousLine[j] = currenLine[j];
			}
		}
		
		line.close();
	}
}
