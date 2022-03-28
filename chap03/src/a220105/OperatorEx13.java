package a220105;

import java.util.Calendar;

public class OperatorEx13 {
	public static void main(String[] args) {
		char c1 = 'a';
//		final char c1 = 'a'; //고정값 상수 final을 추가할 경우엔 c1+1 가넝 | 컴파일러에 의해서 판단 
		
//		char c2 = c1  + 1; //Type mismatch - 변수와 리터럴간의 연산
		char c2 = 'a' + 1; //리터럴 간의 연산
//		char c2 = 97  + 1;//가넝
		
		System.out.println(c1);
		System.out.println(c2);
		
//		D-day 계산 : 현재 날짜로부터 대상 날짜 사이간의 간격 계산
		Calendar cal = Calendar.getInstance();
		cal.set(2022, 5, 18);
		System.out.println(cal);
		
//		예정시간 - 현재 
		//System.currentTimeMillis();
		System.out.println(System.currentTimeMillis());
		
		long dDay = cal.getTimeInMillis();
		long now = System.currentTimeMillis();
		
		long result = dDay - now;
		System.out.println(result);
		System.out.println(result / 1000);
		System.out.println((result / 1000) / 60);
		System.out.println((result / 1000) / 60 / 60);
		System.out.println((result / 1000) / 60 / 60 / 24);
	}
}
