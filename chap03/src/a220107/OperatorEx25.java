package a220107;

// C언어 시작 #include <studio.h> c언어는 이게없으면 출력이안됨
//import java.lang*;//자바는 필요없는이유 컴파일러가 자동출력해줌

import java.util.Scanner; 

public class OperatorEx25 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
									//표준입력
		char ch = ' ';
		System.out.printf("문자를 하나 입력하세요. >>");
		
		String input = scanner.nextLine();
		ch = input.charAt(0);
		//charAt(0) 은 "abcde"를 입력하면 0번째 글자위치 a를 출력 해석한다는 뜻
		//여러글자 입력해도 첫번째만 인식
		
		
		if('0'<= ch && ch <= '9') { //if에는 조건식이 들어간다 - boolean 타입
			System.out.printf("입력하신 문자는 숫자입니다. %n");
		}	//표준출력
		
		if(('a'<= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.printf("입력하신 문자는 영문자입니다. %n");
		}
		
		
		///////////////////////////////////////////////////////////////////
		
		System.out.printf("문자를 하나 입력하세요. >>");
		String input1 = scanner.nextLine();
		ch = input1.charAt(0);
		
				if('0'<= ch && ch <= '9') {
			System.out.printf("입력하신 문자는 숫자입니다. %n");
		}
		
		if(('a'<= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.printf("입력하신 문자는 영문자입니다. %n");
		}
		scanner.close();
	}
}
