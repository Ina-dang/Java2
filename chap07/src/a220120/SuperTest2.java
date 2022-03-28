package a220120;

class SuperTest2 {
	public static void main(String[] args) {
		Child1 c = new Child1();
		c.method(); //메서드호출
		
	}
}	
	
class GrandParent1 {
	int x = 5;
}

class Parent1 extends GrandParent1{
	int x=30;
}


class Child1 extends Parent1{ //상속관계
	int x = 20;
		
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x); //extends한 대상까지만 감(GrandParent값 까지 안감)
	}
}

