package a220227;

public class MyMath {
	long add (long a , long b) {
		long result = a + b;
		return result;
	}
	long subtract(long a, long b ) { return a - b; };
	long multiply(long a, long b ) { return a * b; };
	double divide(double a, double b) {return a / b;};
	
	void gugu(int dan) {
		for (int i = 0 ; i <= 9 ; i ++) {
			System.out.printf("%d * %d = %d%n", dan, i , dan * i);
		}
		return; //반환타입이 void이므로 생략해도 컴파일러가 자동추가
	}
	
	public static void main(String[] args) {
		//MyMathg 클래스 add 호출을 위해서는 인스턴스를 생성후 참조변수 mm을 통해야함
		MyMath mm = new MyMath();
		long value = mm.add(3, 555555);
		System.out.println(value);
		
		long value1 = mm.subtract(55, 50);
		System.out.println(value1);
		
		long value2 = mm.multiply(3, 6);
		System.out.println(value2);
		
		double value4 = mm.divide(5L, 3L);
		System.out.println(value4);
		
		System.out.println();
	}
}
