package a220111;

public class Ch4_01 {
	public static void main(String[] args) {
		int x = 10;
//		컴파일 에러 안나게 일단 식 써두면 좋다
//		int 형 변수 x 가 10보다 크고 20보다 작을때 true인 조건식
		boolean b1 = x > 10 && x < 20 ;
		System.out.println(b1);
//		char형 변수 ch가 공백이나 탭이 아닐때 true 인 조건식
		char ch = ' ';
		boolean b2 = ch != ' ' || ch != '\t';
		System.out.println(b2);
//		char형 변수 ch가 'x'또는 'X'일때 true 인 조건식
		boolean b3 = ch =='x' || ch == 'X';
		System.out.println(b3);
//		char형 변수 ch가 숫자('0'~'9')일때 true 인 조건식
		boolean b4 = ch >= '0' && ch <= '9';
		System.out.println(b4);
//		char형 변수 ch가 영문자(대문자 또는 소문자)일때 true 인 조건식
		boolean b5 = ch >= 'A' && ch <='Z' || ch >= 'a' && ch <= 'z';
		System.out.println(b5);
		boolean b6 = ch >= 'A' && ch <= 90 || ch >= 'a' && ch <= 'Z'+32;
		System.out.println(b6);
//		int형 변수 year가 400으로 나눠 떨어지거나 4로 떨어지고 100으로 나눠떨어지지않을때 트로
		int year = 0;
		boolean b7 = year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
		System.out.println(b7);
//		boolean 형 변수 powerOn가 false일때 true 인 조건식
		boolean powerOn = !(1 > 3);
		System.out.println(powerOn);
		/*
		 * 쌤 답
		 * boolean powerOn = false;
		 * boolean b8 = !powerOn;
		 */
//		문자열 참조변수 str이 yes 일때 true인 조건식
//		int a = 3;
//		String str = a >= 3 ? "yes" : "false"; 
//		System.out.println(str);
//		String str = "yes";
//		boolean b9 = str.equals("yes");
		
//		int value = (int)(Math.random() * 6) + 1 ;		
	}
}
