package org.problem1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pyramid {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int resultNumber = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		String result = "";
		int currentNumber = 0;
		boolean hasResult = false;
		
		for (int i = 0; i < rows; i++) {
			String[] input = br.readLine().trim().split("\\s+");
			if (i == 0) {
				resultNumber = Integer.parseInt(input[0]);
				result += resultNumber + ", ";
				continue;
			}
			
			int maxNumber = Integer.MAX_VALUE;
			for (int j = 0; j < input.length; j++) {
				currentNumber = Integer.parseInt(input[j]);
				if (currentNumber > resultNumber && currentNumber <= maxNumber) {
					maxNumber = currentNumber;
					hasResult = true;
				}
			}
			
			if (hasResult) {
				hasResult = false;
				result += maxNumber + ", ";
				resultNumber = maxNumber;
			} else {
				resultNumber++;
			}
		}
		
		result = result.substring(0, result.length() - 2);
		System.out.println(result);
	}
}
