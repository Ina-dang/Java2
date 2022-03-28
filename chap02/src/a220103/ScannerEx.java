package a220103;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
	/*
	 * Scanner 클래스를 사용하려면
	 * import java.util.*; 를 입력하면 된다
	 * 참조형 변수를 객체라고 부름
	 * 
	 * nextInt, nextFloat 버그있으니 쓰지마셈
	 * 
	 */
	
		Scanner scanner = new Scanner(System.in); //외우기! scanner 객체(변수) 생성
		
		System.out.print("두자리 정수를 하나 입력해주세요 >>");
		String input = scanner.nextLine(); // nextLing() 입력 대기상태 > 입력한 값을 input에 저장	
		int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환 
										   // String 타입의 input을 int 타입의 num으로 변환
		
		System.out.println("입력내용 :" + input);
		System.out.printf("num=%d%n", num);
		
		scanner.close();
	}
}
