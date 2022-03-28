package a220117;

public class MyMathTest {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		
		System.out.println("add(5L, 3L) = " + result1); 	  // long result = a+b; return a + b
		System.out.println("soubtract(5L, 3L) = " + result2); // long result2 = return a - b
		System.out.println("multiply(5L, 3L) = " + result3);  // long result3 = return a * b
		System.out.println("divide(5L, 3L) = " + result4);    // double result4 = return a / b
	}
}
	

