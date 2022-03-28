package a220126;

public class ExceptionEx5 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try{
			System.out.println(3);
			throw new NullPointerException(); //컴파일전부터 명시적으로 예외 유발
//			System.out.println(4);
		} catch (ArithmeticException e) { //나를 호출한 메서드로 던지는게 목적
			System.out.println(5);
//		} finally {
//			System.out.println(0/0); //런타임 중 예외
		}
		System.out.println(6);
	}
}
