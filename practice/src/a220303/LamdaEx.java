package a220303;

public class LamdaEx { 
	public static void main(String[] args) {
		// Func 타입의 인스턴스
		Func func = new FuncImpl();
		func.run(10);

		Func func2 = getFunc();
		func2.run(20);
		
		Func func3 = new Func() {
			@Override
			public void run(int i) {
				// TODO Auto-generated method stub
				System.out.println("anony.run() ::" + i);
			}
		};
		func3.run(30);
		
		Func func4 = (int i) -> {System.out.println("lambda.run() ::" + i);};
		func4.run(40);
		
		Func func5 = i -> System.out.println("lambda.run() ::" + i);
		func5.run(50);
		//Func 안에 타입이 딱 한 개 일때만가능
		
		System.out.println(func); //구현
		System.out.println(func2); //지역클래스 $
		System.out.println(func3); //익명클래스 $
		System.out.println(func4); //$$람다
		System.out.println(func5); //$$람다
		
		Object o1 = new FuncImpl();
		Object o2 = getFunc();
		Object o3 = new FuncImpl() {
			public void run(int i) {
				System.out.println("대충쓰");
			}
		};
//		Object o4 = i -> System.out.println("lambda.run() ::" + i); //에러
		Object o5 = (Func)i -> System.out.println("lambda.run() ::" + i); //캐스팅하면 됨
		
		int num = 10;
		Object o6 = (Func)i -> System.out.println("lambda.run() ::" + i + num); //캐스팅하면 됨
		((Func)o6).run(20);
	}

	static Func getFunc() {
		class Inner implements Func { 
			public void run(int i) {
				System.out.println(i);
			}
		}
		return new Inner();
	}
}

@FunctionalInterface 
interface Func {
	void run (int i);
	//메서드 자체를 한 개만 넣을 수 있다
	//void run (int i);넣으면 람다가 에러남. 어떤걸 호출할지 몰라서
}

class FuncImpl implements Func {
	public void run(int i) {
		System.out.println(i);
	}
}