package org.problem2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TerroristsWin {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		char[] charachters = input.toCharArray();
		int charSum = 0;
		int bombOffset = 0;
		boolean isBomb = false;
		int bombCharCount = 0;
		int startIndex = 0;
		
		for (int i = 0; i < charachters.length; i++) {
			if (charachters[i] == '|' && isBomb == false) {
				isBomb = true;
				charSum = 0;
				bombCharCount = 0;
				startIndex = i;
				continue;
			} else if (charachters[i] == '|') {
				isBomb = false;
				bombOffset = 0;
				bombOffset = charSum % 10; 
				
				int start = 0;
				int end = charachters.length;
				if (startIndex - bombOffset >= 0) {
					start = startIndex - bombOffset;
				}
				
				if (startIndex + 2 + bombCharCount + bombOffset < charachters.length) {
					end = startIndex + 2 + bombCharCount + bombOffset;
				}
				
				for (int j = start; j < end; j++) {
					charachters[j] = '.';
				}
			}
			
			if (isBomb) {
				charSum += charachters[i];
				bombCharCount++;
			}
		}

		for (int i = 0; i < charachters.length; i++) {
			System.out.print(charachters[i]);
		}
	}

}
