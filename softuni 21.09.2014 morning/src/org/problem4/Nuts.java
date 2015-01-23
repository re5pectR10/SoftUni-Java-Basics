package org.problem4;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Nuts {

	public static void main(String[] args) {

		Scanner line =new Scanner(System.in);
		TreeMap<String, LinkedHashMap<String, ArrayList<Integer>>> companies = new TreeMap<>();
		String[] input;
		int rowsCount = line.nextInt();
		line.nextLine();
		
		for (int i = 0; i < rowsCount; i++) {
			input = line.nextLine().split(" ");
			if (companies.containsKey(input[0])) {
				LinkedHashMap<String, ArrayList<Integer>> currentCompany = companies.get(input[0]);
				if (!currentCompany.containsKey(input[1])) {
					currentCompany.put(input[1], new ArrayList<Integer>());
				}
				
				currentCompany.get(input[1]).add(Integer.parseInt((String) input[2].subSequence(0, input[2].length() - 2)));
			} else {
				ArrayList<Integer> amount = new ArrayList<>();
				amount.add(Integer.parseInt((String) input[2].subSequence(0, input[2].length() - 2)));
				LinkedHashMap<String, ArrayList<Integer>> nuts = new LinkedHashMap<>();
				nuts.put(input[1], amount);
				companies.put(input[0], nuts);
			}
		}
		
		for(Entry<String, LinkedHashMap<String, ArrayList<Integer>>> entry : companies.entrySet()) {
			String output = entry.getKey() + ": ";
			LinkedHashMap<String, ArrayList<Integer>> nuts = entry.getValue();
			for (Entry<String, ArrayList<Integer>> nut : nuts.entrySet()) {
				output += nut.getKey() + "-";
				int sum = 0;
				ArrayList<Integer> amounts = nut.getValue();
				for (int i = 0; i < amounts.size(); i++) {
					sum += amounts.get(i);
				}
				
				output += sum + "kg, ";
			}
			
			System.out.println(output.substring(0, output.length() - 2));;
		}

		line.close();
	}

}
