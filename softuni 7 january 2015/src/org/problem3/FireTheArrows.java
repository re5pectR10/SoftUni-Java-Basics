package org.problem3;

import java.util.Scanner;

public class FireTheArrows {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		input.nextLine();
		char[][] field = new char[size][size];
		boolean noResult = true;
		
		for (int i = 0; i < size; i++) {
			field[i] = input.nextLine().toCharArray();
		}

		while (noResult) {
			noResult = false;
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < field[i].length; j++) {
					if (field[i][j] == 111) {
						continue;
					}
					
					if (field[i][j] == 60) {
						if (j != 0){
							if (field[i][j - 1] == 111) {
								field[i][j - 1] = 60;
								field[i][j] = 111;
								noResult = true;
							}
						}
					} else if (field[i][j] == 62) {
						if (j != field[i].length - 1){
							if (field[i][j + 1] == 111) {
								field[i][j + 1] = 62;
								field[i][j] = 111;
								noResult = true;
							}
						}
					} else if (field[i][j] == 94) {
						if (i != 0){
							if (field[i - 1][j] == 111) {
								field[i - 1][j] = 94;
								field[i][j] = 111;
								noResult = true;
							}
						}
					} else {
						if (i != size - 1){
							if (field[i + 1][j] == 111) {
								field[i + 1][j] = 118;
								field[i][j] = 111;
								noResult = true;
							}
						}
					}
				}
			}
		}
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < field[i].length; j++) {
				System.out.print(field[i][j]);
			}
			
			System.out.println();
		}
		
		input.close();
	}
}
