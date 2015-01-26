import java.util.Scanner;

public class ArrayTest_Broken {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);	
		
		int sizeOfArray = scn.nextInt();
		long[] array = new long[sizeOfArray];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = scn.nextLong(); 
		}
		
		String command = scn.next();

		while (!command.equals("stop")) {
			String[] line = scn.nextLine().trim().split("\\s+");
			int[] params = new int[2];

			if(command.equals("add") || command.equals("subtract") || command.equals("multiply")) {
				params[0] = Integer.parseInt(line[0]);
				params[1] = Integer.parseInt(line[1]);

				performAction(array, command, params);
			} else {
				performAction(array, command, params);
			}

			printArray(array);
			System.out.print('\n');
			
			command = scn.next();			
		}		
	}
	
	static void performAction(long[] array, String action, int[] params){
		int pos = params[0];
		int value = params[1];

		switch (action) {
		case "multiply":
			array[pos - 1] *= value;
			break;
		case "add":
			array[pos - 1] += value;
			break;
		case "subtract":
			array[pos - 1] -= value;
			break;
		case "lshift":
			arrayShiftLeft(array);
			break;
		case "rshift":
			arrayShiftRight(array);
			break;
		}
	}

	private static void arrayShiftRight(long[] array) {
		long lastNumber = array[array.length - 1];
		for (int i = array.length-1; i >= 1 ; i--) {
			array[i] = array[i - 1];
		}
		
		array[0] = lastNumber;
	}

	private static void arrayShiftLeft(long[] array) {
		long firstNumber = array[0];
		for (int i = 0; i < array.length - 1; i++) {
			array[i] = array[i+1];
		}
		
		array[array.length - 1] = firstNumber;
	}

	private static void printArray(long[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}