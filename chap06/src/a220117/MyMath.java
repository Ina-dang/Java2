package a220117;

public class MyMath { //순서가 중요한 예제
	
		long add(long a, long b) {
			long result = a+b;
			return result;
//		return a+b;
		}
		
		long subtract(long a, long b) { return a - b; }
		long multiply(long a, long b) { return a * b; }
		double divide(double a, double b) {
			return a / b;
		}
}// 멤버변수 없고 다 메서드로 구성되어있음
