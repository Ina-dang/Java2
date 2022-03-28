package a220118;

public class FactorialTest {
	public static void main(String[] args) {
		int result = factorial(4); // !4 >> 4 * 3 * 2 * 1 //자기보다 작은숫자들 곱셈
		System.out.println(result);
		
		int result1 = factorial2(4);
		System.out.println(result);
	}
//factorial method == static method ==> 인스턴스를 생성하지 않고 직접 호출 가능
//	main method와 같은 클래스에 있기 때문에 static메서드를 호출할 때 클래스 이름 생략 가능
//	그래서 FactorialTest.factorial(4)대신 factorial(4)
	static int factorial(int n) {
		int result = 0;
		
		if ( n == 1) {
			result = 1;
		} else {
			result = n * factorial(n-1);
		}
		return result;		
	}
	
	//이게 더 효율적
	static int factorial2(int n) {
		int result1 = 1;
		for (int i = 1; i <= n; i++) {
			result1 *= i;			
		}
		return result1;
	}
}




