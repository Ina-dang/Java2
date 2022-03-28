package a220105;

import java.util.*; // Scanner 클래스 사용하기위해 추가
public class ScannerPrac {
	public static void main(String[] args) {
			
	Scanner scanner = new Scanner(System.in); // Scanner클래스 객체 생성
	
//	int a = ' ';
//	int b = ' ';
//	int c ; //선언만 해도됨
	
	System.out.print("첫번째 숫자를 입력하세요");
	String input = new String(scanner.nextLine());
	int a = Integer.parseInt(input); // int 입력하면 중복선언이라 지워야함. (위에 선언이 없으면 int 입력)

	System.out.print("두번째 숫자를 입력하세요");
	String input1 = scanner.nextLine();
	int b = Integer.parseInt(input1);
	
	System.out.print("세번째 숫자를 입력하세요");
	int c = Integer.parseInt(scanner.nextLine());
	
	System.out.printf("%d + %d + %d = %d%n", a, b, c, a + b + c);
	System.out.printf("%d - %d - %d = %d%n", a, b, c, a - b - c);
	System.out.printf("%d * %d + %d = %d%n", a, b, c, a * b + c);

	
	//일반 기본 메서드는 알아서 종료됨
	// 참조 타입 특히 io 계열은 overhead(부하정도)가 심해서 자원을 사용한다고 인스턴스를 생성했을때 자원을 종료할때 명시적으로 해줘야함
	// 이걸 안쓴다고해서 엄청 큰문제가 생기진 않음 (우리가 실행한건 금방 실행했다가 금방 꺼지는거니까)
	// 근데 서버처럼 지속적으로 동작해야하는 한번실행하고 버리는게아니라 계속켜져있어야하는거는
	// 꺼줘야함. 비슷한 애들이 있음 나중에 또 배움
	
//	System.out.printf("%d / %d = %d%n", a, b, a / b);
//	System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b); 
	
	System.out.println("숫자를 입력하세요");
	int d = Integer.parseInt(scanner.nextLine());
	
	System.out.println(d % 2 == 0 ? "짝수" : "홀수");
	
	scanner.close();	
	}
}
