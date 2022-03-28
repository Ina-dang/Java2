package a220117;

public class MyMathTest1 {
	//메인메서드는 os가 jvm시켜서 프로그램 실행시 자동적으로 호출된다
	
				 //반환타입이 void이므로 생략가능. 컴파일러가 자동추가	
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		System.out.println("add(5L, 3L) = " + result1); 	  // long result = a+b; return a + b

		if (result1 == 8) {
				return;
			//해당 메서드 내에서 return키워드를 만나면 그즉시종료
		}
		
		long result2 = mm.subtract(5L, 3L);
		System.out.println("soubtract(5L, 3L) = " + result2); // long result2 = return a - b
		long result3 = mm.multiply(5L, 3L);
		System.out.println("multiply(5L, 3L) = " + result3);  // long result3 = return a * b
		double result4 = mm.divide(5L, 3L);
		System.out.println("divide(5L, 3L) = " + result4);    // double result4 = return a / b
		
	}
	
	int max(int a, int b) {
		if (a < b) {
			return a;
		}
		return b;
	}
	
	int abs(int x) {
		//절대값 : 양수로 와도 양수리턴, 음수로 와도 양수리턴
		if(x < 0 ) return -x;
		return x;
	}
}
	

