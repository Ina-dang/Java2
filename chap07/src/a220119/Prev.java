package a220119;

public class Prev {
	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();

	System.out.println(parent.age);
	System.out.println(child.age);

//	System.out.println(parent.name);//이건안됨
	System.out.println(child.name);
	
	GrandChild grandChild = new GrandChild();
	System.out.println(grandChild.age);
	System.out.println(grandChild.name);
	}
}

class Parent {
	int age;
}

// Child & Child2 에서 공통적으로 추가해야할 멤버(멤버변수나 메서드)가 있다면 공통인 Parent에 추가하는게 나음

class Child extends Parent{
	String name;
}

class Child2 extends Parent{
	//Child2로 만들 수 있는 필드의 개수 1개 (Parent클래스 int age;)
}

class GrandChild extends Child{
//	indirect superclass : Child
//	direct superclass	: Parent
	
	//Parent에서 지우면 extends에서도 다지워짐 
	
}
