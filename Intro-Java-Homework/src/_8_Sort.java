import java.util.Scanner;

public class _8_Sort {

	public static void main(String[] args) {

		Scanner line = new Scanner(System.in);
		int count = line.nextInt();
		line.nextLine();
		String[] elements = new String[count];
		
		for (int i = 0; i < count; i++) {
			elements[i] = line.nextLine();
		}

		insertionSort(elements);
		for (int i = 0; i < elements.length; i++) {
			System.out.println(elements[i]);
		}
		
		line.close();
	}
	
	public static void insertionSort(String[] elements) {
		String temp;
		for (int i = 1; i < elements.length; i++) {
			for (int j = i; j >= 1 && elements[j].compareTo(elements[j - 1]) < 0; j--) {
				temp = elements[j - 1];
				elements[j - 1] = elements[j];
				elements[j] = temp;
			}
		}
	}
}
