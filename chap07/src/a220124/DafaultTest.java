package a220124;

public class DafaultTest {
	public static void main(String[] args) {
		A a= new Test();
		a.m();
		
		B b = new Test();
		b.m();
		
		System.out.println(A.i); //인스턴스상수 x 클래스 상수라 나옴
		System.out.println(B.i); //클래스 상수라 나옴
//		System.out.println(C.i); //모호하다고 나온다
		
		a.dm();
		
		Test t = new Test();
		t.dm();
		
		t.m2();
	}
}

interface A {
	int i = 10;	
	void m();	
	
	default void dm() {
		//구현부 있게 하는 메서드 
		//인터페이스는 구상메서드 문법적으로 못쓰므로 여기엔 default 붙일거
		System.out.println("A.dm()");
	}
}

interface B {
	int i = 20;
	void m();
	default void dm() {
		System.out.println("B.dm()");
	}
}

interface C extends A,B {
	
	default void dm() {
		B.super.dm();
	}
	void m2();
}

interface D extends C {
	default void m2() {
		System.out.println("D.m2()");
	}
}

class Test implements D {
	
	@Override
	public void m() {
		System.out.println("Test.m()");
	}
}