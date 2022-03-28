package a220117;

public class CallStackTest {
	public static void main(String[] args) {
		System.out.println("main 1");
		firstMethod(); //static메서드는 객체 생성없이 호출 가능 
		//main1 호출뒤에 fristMethod 클래스로 들어가서 /first1 second first2 main2/ 하고 main2
		System.out.println("main 2");
	}
	
	static void firstMethod() {
		System.out.println("first 1");
		secondMethod();
		System.out.println("first 2");
	}
	static void secondMethod() {
		System.out.println("second");
	}
}
