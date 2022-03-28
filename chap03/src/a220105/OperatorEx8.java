package a220105;

public class OperatorEx8 {
	public static void main(String[] args) {
		int a = 1_000_000;		// 1,000,000	1백만
		int b = 2_000_000;		// 2,000,000	2백만
		
		long c = a * b; 		// a * b = 2,000,000,000,000 2조 나와야하는데
		
		System.out.println(c);  //-1454759936 나오는 이유는 a * b가 먼저 연산되고 난 후에 좌변 long 타입 c에 저장되기때문
		
		//long 결과를 알고싶으면
		
		long c1 = (long)a * b;
		
		System.out.println(c1);
		
		//==========산술연산 순서 주의==========================================
		int result1 = a * a / a; //100만 * 100만 부터 이미 오버플로우(-72379968) / 100만 
		int result2 = a / a * a; //100만 / 100만 = 1 에서 * 100만
		System.out.println(result1);
		System.out.println(result2);
		
		char ch = 91;
		System.out.println(ch++); //91 결과값 출력 | ++ch는 91에서 더해진 ch92값 출력
		System.out.println(ch++);
		System.out.println(ch++);
		System.out.println(ch++);
		System.out.println(ch++);
		System.out.println(ch++);
		System.out.println(ch++);
		
		//char ch3 = ' ';
		int ch3 = ' ';
		System.out.println(ch3);
	}
}
