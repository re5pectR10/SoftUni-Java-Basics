package org.problem2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MagicSum {

	public static void main(String[] args) {

		Scanner line = new Scanner(System.in);
		int divider = line.nextInt();
		line.nextLine();
		List<Integer> numbers = new ArrayList<Integer>();
		String currentInput;
		int maxSum = Integer.MIN_VALUE;
		String currentOutput = " ";
		boolean noResult = true;
		
		while (!(currentInput = line.nextLine()).equals("End")) {
			numbers.add(Integer.parseInt(currentInput));
		}
		
		for (int i = 0; i < numbers.size(); i++) {
			for (int j = 0; j < numbers.size(); j++) {
				for (int k = 0; k < numbers.size(); k++) {
					if (i == j || i == k || j == k) {
						continue;
					}
					
					if ((numbers.get(i) + numbers.get(j) + numbers.get(k)) % divider == 0 && numbers.get(i) + numbers.get(j) + numbers.get(k) > maxSum) {
						currentOutput = "(" + numbers.get(i) + " + " + numbers.get(j) + " + " + numbers.get(k) + ") % " + divider + " = 0";
						maxSum = numbers.get(i) + numbers.get(j) + numbers.get(k);
						noResult = false;
					}
				}
			}
		}

		if (noResult) {
			System.out.println("No");
		} else {
			System.out.println(currentOutput);
		}
		
		line.close();
	}
}
