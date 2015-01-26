import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class _7_DaysBetweenTwoDates {

	public static void main(String[] args) {

		Scanner line = new Scanner(System.in);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("d-MM-yyyy");
		LocalDate start = LocalDate.parse(line.nextLine(), format);
		LocalDate end = LocalDate.parse(line.nextLine(), format);	
		line.close();
		System.out.println(Math.abs(start.toEpochDay() - end.toEpochDay())); 

	}

}
