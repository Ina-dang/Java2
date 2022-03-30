package a220330;

import java.io.IOException;
import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) throws IOException {
		//스캐너 클래스 이전 시스템in으로 받기
		int b = 0;
//		while(( b = System.in.read()) != -1) {
//			System.out.println("input : " + b + "," + (char)b);
//		}
		String input = nextLine("값을 하나 입력하세요>>");
		System.out.println(input);
	}
	
	static String nextLine(String msg) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		return str;
	}
}
