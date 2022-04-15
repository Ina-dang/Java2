package a220415;

import java.util.Arrays;
import java.util.List;

// 한개만 바라볼 때 사용가능한 추상
@FunctionalInterface
interface MyFunction {
	void run();
}

public class LambdaEx1 {
	static void execute (MyFunction f) {
		//매개변수의 타입이 MyFunction인 메서드
		f.run();
	}
	
	static MyFunction getMyFunction() {
		//반환타입이 My Function인 메서드
		MyFunction f = () -> System.out.println("f3.run()");
		return f;
	}
	
	public static void main(String[] args) {
		MyFunction f1 = () -> System.out.println("f1.run()");
		MyFunction f2 = new MyFunction() {
			//익명클래스로 run() 구현 퍼블릭 필수
			public void run() {
				System.out.println("f2.run()");
				
			}
		};
		MyFunction f3 = getMyFunction();
		
		f1.run();
		f2.run();
		f3.run();
		
		execute(f1);
		execute( () -> System.out.println("run()"));
		
		List<String> list = Arrays.asList("가","타","다","마","라","하","하","하");
		list.stream().distinct().limit(5).sorted().forEach(System.out::print);
		System.out.println();
		list.stream().distinct().limit(5).sorted().map(a -> a + a).forEach(System.out::print);
	}
}
	

