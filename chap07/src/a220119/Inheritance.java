package a220119;

public class Inheritance {
/*
 * 상속 (inheritance)
 * 기존의 클래스를 재사용하여 새로운 클래스 작성
 * 
 */
	
	// 자바에서 상속을 구현하는 방법
	// 새로 작성하고자 하는 클래스의 이름뒤에 extends 상속받고자하는 클래스 
	
	/*
	 * 조상클래스 : parent class, super class, base class
	 * 자손클래스 : child class, sub class, derived class
	 * 
	 */
	
	class Parent{
		int age;
	}
	
	class Child extends Parent{}
	
	// 자손은 조상의 모든 멤버를 상속받기 때문에 조상클래스를 포함한다고 생각할 수 있다
	// 위 예시는 Child클래스에 자동적으로 age라는 멤버변수가 추가된다
	
	
	/*
	 * 생성자와 초기화 블럭은 상속되지 않는다. 멤버만 상속된다
	 * 자손클래스의 멤버 개수는 조상 클래스보다 항상 같거나 많다
	 */
	
	
}
