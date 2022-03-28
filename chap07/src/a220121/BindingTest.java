package a220121;

public class BindingTest {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		System.out.println(A.si);
		System.out.println(B.si);
		A.sm();
		B.sm();
		
		//다형성적용
		
		a = b; //A a = new B;
		System.out.println(a.i);
		System.out.println(b.i);
		
		a.m();
		b.m();
		
		//동적바인딩(Dynamic Binding)
		//멤버변수가 조상 자손 클래스 중복 정의된경우 각 클래스에 선언된 멤버변수 사용
		//인스턴스 메서드는 중복선언 한 경우(오버라이딩) 실제 인스턴스의 멤버(메서드)를 호출
		//인스턴스 메서드는 실행시 인스턴스에 의해 결정됨
	}
}

class A { 
	int i = 10;
	static int si = 20;
	
	void m() {
		System.out.println("A.m()");  
	}
	
	static void sm() {
		System.out.println("A.sm()");  
	}
}

class B extends A {
	int i = 30;
	static int si = 40;
	
	void m() {
		System.out.println("B.m()");  
	}
	
	static void sm() {
		System.out.println("B.sm()");  
	}
}
