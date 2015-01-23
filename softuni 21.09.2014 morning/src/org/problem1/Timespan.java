package org.problem1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Timespan {

	public static void main(String[] args) {

		Scanner line = new Scanner(System.in);
		String[] firstline = line.nextLine().split(":");
		String[] secondline = line.nextLine().split(":");
		DecimalFormat df = new DecimalFormat("00");
		
		long start = Long.parseLong(firstline[0])*3600+Long.parseLong(firstline[1])*60+Long.parseLong(firstline[2]);
		long end = Long.parseLong(secondline[0])*3600+Long.parseLong(secondline[1])*60+Long.parseLong(secondline[2]);
		
		long result = start - end;
		
		System.out.println(result / 3600 + ":" + df.format((result % 3600) / 60) + ":" + df.format((result % 3600) % 60));
		line.close();
	}

}
