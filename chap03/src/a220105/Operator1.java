package a220105;

import java.util.*;

public class Operator1 { //p97~ 산술연산자~
	public static void main(String[] args) {
		
		// 두 정수를 입력 받아 사칙연산 결과를 출력하시오 - 선생님
		int a = 10;
		int b = 4;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요>>"); //입력할 수 있는 메시지를 줄때는 println말고 print로
		a = Integer.parseInt(scanner.nextLine());
		
		System.out.print("두번째 수를 입력하세요>>");
		String input = scanner.nextLine();
		b = Integer.parseInt(input);

		System.out.printf("%d + %d = %d%n", a, b, a + b);
		System.out.printf("%d - %d = %d%n", a, b, a - b);
		System.out.printf("%d * %d = %d%n", a, b, a * b);
		System.out.printf("%d / %d = %d%n", a, b, a / b);
		System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b); 
		
		// 두 정수를 입력 받아 사칙연산 결과를 출력하시오 - 와타시가한거
		/*Scanner scanner = new Scanner(System.in);
		
		System.out.print("두 정수를 입력 받아 사칙연산 결과를 출력하시오");
		String input = scanner.nextLine();
		int a = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환
		int b = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환
		int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환
		
		System.out.println("입력내용 :" + input);
		System.out.printf("num=%d + %d = %d%n", num, a, b, a - b);
		*/
				
		
		System.out.println("=====================================================");
		
		// 9 / 4 = 2 . . 1  | 1 + 2 * 4 = 9
		// 제수 0
		
		//나눗셈할때 제수(나누는수)가 0이 되는경우 
		// 8 / 2 = 4 		| 4 * 2 = 8
		
//		System.out.println(3/0); Exception in thread "main" java.lang.ArithmeticException: / by zero ㅇ오류뜸
		
		//실수간 연산은 약간의 허용이 있음
		System.out.println(3/0d); // 피제수가 0이 아닌경우 Infinity		(d, f둘다) 
		System.out.println(0/0f); // 피제수가 0일 경우	   Not a Number (숫자는 맞는데 정의할 수 없을 때)
		
		//java에서 실수 자료형 잘 안써서 거의 볼 일 없음
		
		byte a1 = 10;
		byte b1 = 30;
//		byte c1 = a1 + b1; 컴파일 에러가 발생한다. 명시적으로 형변환 필요
//						 a,b 
		byte c1 = (byte)(a1 * b1);
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		
		scanner.close();
		
	}
}
