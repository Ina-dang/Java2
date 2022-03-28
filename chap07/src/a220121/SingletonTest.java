package a220121;

import java.util.Calendar;

public class SingletonTest {
	//Singleton vs Prototype 인스턴스 생성방법차이
//	동일한주소를 여러번 언급하냐
//	각기 다른 주소의 인스턴스를 남길것이냐
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton);
		System.out.println(singleton2);
		singleton = null;
		Singleton singleton3 = Singleton.getInstance();
		System.out.println(singleton3);
		
		System.out.println(singleton == singleton3);
		System.out.println(singleton2 == singleton3);
		
		Prototype prototype = Prototype.getInstance();
		Prototype prototype2 = Prototype.getInstance();
		Prototype prototype3 = Prototype.getInstance();
		System.out.println(prototype);
		System.out.println(prototype2); 
		System.out.println(prototype3); //여기는 다 다른주소 생성됨

		System.out.println(prototype == prototype2);
		
		//캘린더
		Calendar calendar = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		
		System.out.println(calendar == calendar2);
	}
}

class Singleton{ //계속적으로 같은 주소를 줌
	// 클래스 겟터처럼 작동한다
		
	private static Singleton singleton = new Singleton();
	private Singleton() {}
		
	public static Singleton getInstance() {
		return singleton;
	}
}

class Prototype{
	private Prototype () {}
	
	public static Prototype getInstance() {
		return new Prototype();
	}
}
