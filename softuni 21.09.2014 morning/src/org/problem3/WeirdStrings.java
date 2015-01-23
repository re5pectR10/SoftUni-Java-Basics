package org.problem3;

import java.util.Scanner;

public class WeirdStrings {

	public static void main(String[] args) {

		Scanner line = new Scanner(System.in);
		String input = line.nextLine();
		String[] words;
		int maxSum = 0;
		int currentSum = 0;
		int previousSum = 0;
		String result = "";
		String previousWord = "";
		line.close();
		
		input = input.replaceAll("[)(/\\\\|\\s]+", "");
		words = input.trim().split("[^a-zA-Z]", -1);
		for (int i = 0; i < words.length; i++) {
			if (words[i].isEmpty()) {
				continue;
			}
			
			currentSum = 0;
			for (int j = 0; j < words[i].length(); j++) {
				currentSum += words[i].toLowerCase().charAt(j) - 96;
			}
			
			if (currentSum + previousSum > maxSum) {
				maxSum = currentSum + previousSum;
				result = previousWord + "\r\n" + words[i];
			}
			
			previousWord = words[i];
			previousSum = currentSum;
		}
		
		System.out.println(result);
	}
}
