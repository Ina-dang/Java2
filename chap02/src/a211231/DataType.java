package a211231;

public class DataType {  //상수와 리터럴(constant & literal)
	public static void main(String[] args) {
		
//		int val3 = 10;
//		val3 = 20;
		
//		final int val3 = 10;
//		val3 = 20;
		
	/* 
	 * 리터럴의 타입과 접미사 -> 변수에 타입이 있는 것처럼 리터럴에도 타입이 있다.
	 * 1. 논리형(접미사x) : false, true
	 * 2. 정수형(long-l또는L, int-x) : 123, 0b0101(2진수리터럴), 077(8진수), 0xFF(16진수), 100L(롱타입)
	 * 				l,L 헷갈리므로 대문자L 추천
	 * 3. 실수형(float-f, double-d) : 3.14, 3.0e8, 1.4f(float리터럴), ox1.0p-1(p는 보통 제곱을 의미)
	 * 4. 문자형(접미사x) : 'A', '1', '\n'
	 * 5. 문자열(접미사x) : "ABC", "123", "A", "true"
	 * 
	 * long, float 리터럴 신경쓰기
	 */
		
		//boolean, char, int, double
		
		boolean val1 = true; //논리형 true or false
		System.out.println(val1);
		
		int val2 = 0b1000; //정수형 b=binary 1000은 2진법 = 8
		System.out.println(val2);
		
		int val3 = 077; //정수형 8진법
		System.out.println(val3);
		
		int val4 = 0xFF; //정수형 대소문자 구분x
		System.out.println(val4);
		
		float val5 = 123.456f; //실수형 더블리터럴 f붙여야 함
		System.out.println(val5);
		
		double val6 = 123.456; //실수형 d는 필요없음
		System.out.println(val6);
		
		double val7 = .1; //0.1에서 0빼도됨
		System.out.println(val7);
		
		long val9 = 10;
		System.out.println(val9);
		
		// float val10 = 10.1; 뒤에 f 없으면 double로 인식해서 오류 뜸 
		float val10 = 10.1f;
		System.out.println(val10);
		
		// int val11 = 100L; L리터럴이 int보다 커서 오류뜸
		int val11 = 100;
		System.out.println(val11);
		
		// 문자에서 char type 48, 65, 97숫자 중요
		// 그 중 가장 중요한 숫자 65
		/* ASCII (American Standard Code for Information Interchange) 미국 국립 표준 협회
		 * 영문 알파벳을 사용하는 대표 문자 인코딩
		 * Decimal = 10진수
		 * Hexadecimal = 16 
		 * Binary = 2
		 * Octal = 8
		 * 
		 * 0 ~ 127 까지 Decimal 총 128개 ASCII table (7비트)
		 * Decimal 48 = Char 0
		 * Decimal 65 = Char A
		 * Decimal 97 = Char a
		 */
		
		char val12 = 65;
		System.out.println(val12);
		
		char val13 = 48;
		System.out.println(val13);
		
		char val14 = 97;
		System.out.println(val14);
	}

}
