package a220107;

import java.util.Scanner;

public class LeapYear { //윤년계산 2월이 29일
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);	
			
	System.out.print("숫자를 입력하세요");
	int year = Integer.parseInt(scanner.nextLine());
	String result = ((year%4==0 && year%100!=0) || year%400==0) ? "윤년" : "평년" ;
	System.out.printf("입력하신 숫자는 %s입니다", result); 
	/*
	 * 삼항연산자 쓸것.
	 * boolean타입 나오게
	 */
	
	//쌤이 원하는답
	int year1 = 400;
//1
	System.out.println( year1 % 4 == 0 && year1 % 100 != 0 || year1 % 400==0 ? "윤년" : "평년");
//2
	if(year1 % 4 == 0 && year1 % 100 != 0 || year1 % 400==0) {
		System.out.println("윤년");
	}
	else {
		System.out.println("평년");
	}
	
	
	//4년마다 윤년 100년마다 아니고 400년마다 윤년
//	System.out.println( year = (year%4==0) && (year%100!=0) || (year%400==0) ? 1 : 0);
	
	
//	if ( year%4==0 ) {
//		System.out.print( year + " 은 윤년입니다");
//	} else if ( year%400==0) {
//		System.out.print( year + " 은 윤년 입니다");
//	} else if ( year%100==0 ) {
//		System.out.print( year + " 은 윤년이 아닙니다");
//	} else {
//		System.out.println(year + " 은 윤년이 아닙니다");
//	}
	
	
	
	

	
	
	scanner.close();
	}
}
