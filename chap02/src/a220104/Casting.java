package a220104;

public class Casting { //형변환(casting)
	public static void main(String[] args) {
		/*
		 * 형변환 : 변수 또는 상수의 타입을 다른 타입으로 변환하는 것
		 * 형변환 방법 : (type)피연산자 
		 * 
		 * int score = d; type missmatch라고 나옴 >> double이 int보다 크기때문
		 * 
		 */
		
		double  d = 85.4;
		int score = (int)d; // double type 변수d를 int type으로 casting
		
		System.out.println("score=" + score); // 변수d를 int type casting 
		System.out.println("d=" + d);		  // casting 결과 85를 변수 score save
		// 형변환 후에도 피연산자에는 아무런 변화가 없다.
		
		int ch = (int)'A';
		System.out.println(ch);
		
				  // (string)d  --> 참조형과 기본형간의 형변환 불가
		String str = d + ""; // ""를 더해서 문자열 화 시킨다 ..a220103 StringEx 참고
	  // String str = String.valueOf(d); 를 써도 같은 값 나옴
		System.out.println(str);
	  // str > double
		double d2 = Double.parseDouble(str); //scanner part 복습 해보기
		
		System.out.println("===정수형간의 형변환===");
		System.out.println(300);
		System.out.println((byte)300); //p75
		System.out.println(d2);
		
		byte b = -2;
		int  i = b; // int보다 byte가 작아서 가능
		
		System.out.println(i);
		
		// 명시적 형변환 / 묵시적 형변환
		// 				   →실제로 형변환이 일어났을때 문제가 없는 경우는 생략이 가능하다

		int   i2 = 10;
		//1010 = 1.01 * 2^3 (소수점3개 움직임)
		//      가수 지수 어케계산하누
		float f  = i2; //10.0f , 형변환 연산자 사용 x
		float f2 = 3.14f; 
		
		System.out.println(f);
		System.out.println(f2); //실수형을 정수형으로 형변환하면 반올림 x
		
		int i3 = (int)f;
		
		System.out.println(i3);
		
		/* long(8byte) > float(4byte) : 크기상으로는 long이 더 큰데 정수타입으로만 가능해서
		 *								묵시가능
		 * float(4byte) > long(8byte)
		 * 
		 */
		
		long  l  = (long)f;
		float f3 = l;
		
		System.out.println(l);
		System.out.println(f3);
		
		/*
		 * char <> short 간의 형변환도 조심 (상호간 2바이트라 같지만 표현값의 범위가 다름)
		 * → 서로 형변환 필요
		 */
		
		// p83 기본형의 자동 형변환이 가능한 방향 확인
		
		// 1. boolean을 제외한 나머지 7개의 기본형은 서로 형변환이 가능하다.
		// 2. 기본형과 참조형은 서로 형변환할 수 없다.
		// 3. 서로 다른 타입의 변수간의 연산은 형변환을 하는것이 원칙이지만,
		//    값의 범위가 작은 타입에서 큰 타입으로의 형변환은 생략할 수 있다.
		// 연습문제는 코드초보스터디 cafe.naver.com/javachobostudy.cafe 에서 피뎊제공
		
		
	}
}
