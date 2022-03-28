package a220121;

public class CastingTest1 {
	public static void main(String[] args) {
		Car car = null; //예외처리 할 때 많이 씀
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.drive();
		fe.water();
		car = fe;		// car = (Car)fe;에서 형변환이 생략된 형태다.
//		car.water();		// 컴파일에러. Car타입의 참조변수로는 water()를 호출할 수 없다.
		((FireEngine)car).water();		// car 먼저 캐스팅 하면 쓸 수 있음
		fe2 = (FireEngine)car; // 자손타입 ← 조상타입
		fe2.water();
		fe2.stop();

		System.out.println("=================");
		
		Car car2 = new Car(); // 카 인스턴스 생성
//		car2 = fe;
		System.out.println(fe instanceof Car);			//true 
		System.out.println(fe instanceof FireEngine);	//true	== 얘는 자기타입 캐스팅
		//카타입 인스턴스오브냐 소방차 인스턴스오브냐 == 형변환 되냐? 
		
		System.out.println(car2 instanceof Car);		//true == 얘는 자기타입 캐스팅
		System.out.println(car2 instanceof FireEngine);	//false
		
		System.out.println(car.getClass().getName());
		System.out.println(car.getClass().getSimpleName());
		System.out.println(car.getClass().getCanonicalName());
		System.out.println(car2);
		System.out.println(car2.getClass().getName());
		
	}
}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrr~");
	}
	
	void stop() {
		System.out.println("stop !!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!!");
	}
	
}
