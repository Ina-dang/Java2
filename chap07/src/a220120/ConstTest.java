package a220120;

public class ConstTest { //super() 조상 클래스 생성자 예시
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.x);
		
		A a = new B(); //--> polymorphism
		System.out.println(a); 
		System.out.println(a.x);
		System.out.println(a.y);
//		System.out.println(a.z); //B 인스턴스인데 접근이 안됨 ==> 컴파일러가 ' 너선언을 A로해서 오류'라고 내뱉음
								 //컴파일러와 런의 시점차이
//		System.out.println((B)a.z); //. 이 더 우선순위가 더 빨라서 형변환이 안됨
		System.out.println(((B)a).z); //괄호 쳐서 우선순위 정해줘야함
	
	}
}

class A {
	int x;
	int y;
	
	A() {
		this(3, 1);
	}
	
//	A(){ super(); }
	A(int x, int y){
//		super(); // 생성자의 첫줄에 this()나 super();가 없으면 컴파일러가 기본생성자를 만들러간다
		this.x = x;
		this.y = y;
		System.out.println(x + ", " + y + "로 초기화됨");
	}
}

class B extends A {
	int z = 10;
	B() {
		this(1); 
	}
	B(int x) {
		super(1, 3);
	}
	B(int x, int y) {
//		super();
//		this.x = x;
//		this.y = y;
	}
}
