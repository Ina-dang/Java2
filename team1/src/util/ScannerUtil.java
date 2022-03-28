package util;

import java.util.Scanner;

public class ScannerUtil {
	private static Scanner scanner = new Scanner(System.in);
	
	public static String nextLine(String input) {
		System.out.print(input);
		return scanner.nextLine();
	}
	
	public static int nextInt(String input) {
		return Integer.parseInt(nextLine(input));
	}
	

	public static int nextInt(String string, int i, int j) {
		return 0;
	}
	
	public int nextInt() {
		return 0;
	}

}

