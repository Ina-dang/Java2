package a220110;

import java.util.Scanner;

public class FlowEx6 {
	public static void main(String[] args) {
		System.out.print("현재 월을 입력하세요. >>");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		switch(month/3) {
		case 1:
			System.out.println("현재의 계절은 봄입니다.");
			break;
		case 2:
			System.out.println("현재의 계절은 여름입니다.");
			break;
		case 3:
			System.out.println("현재의 계절은 가을입니다.");
			break;
		default : 
			System.out.println("현재의 계절은 겨울입니다.");	
		
			scanner.close();
			/*
			 * /3
			 * 3 4 5   ..1
			 * 6 7 8   ..2
			 * 9 10 11 ..3
			 */
		}
	}    
}
