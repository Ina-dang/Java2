package a220125;

public class ExceptionEx3 {
	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		for (int i = 0; i < 10; i++) {
			try {
				result = number / (int)(Math.random() * 10);
				System.out.println(result);
			} catch (ArithmeticException e) { //아리스메틱익셉션 타입의 e 인스턴스
				System.out.println("0");
			}//try-catch 끝
		}//for끝
	}
}
