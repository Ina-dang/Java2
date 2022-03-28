package a220119;

class Point { //Point class 설계도 
	int x;
	int y;
	
	Point(){}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Circle1{
	int x; //x 좌표
	int y; //y 좌표
	int r; //반지름
}

class Circle{

	Point c; // Point 타입 멤버변수사용 => 포함관계라고 부름
	
	int r;
	Circle(){}
	Circle(int x, int y, int r){
		c = new Point(x,y); //포함관계
		c.x    = x;
		c.y    = y;
		this.r = r;
	}
}

public class CircleTest {
	public static void main(String[] args) {
		//Circle 타입의 인스턴스 객체 생성
		Circle circle = new Circle(10,20,30);
			//생성자를 사용해서 3개의 int 타입 받게 적용 (생성자 원하는 클래스안에 생성)
		
		//이 원의 x좌표는?? y좌표는?? 반지름은??입니다 출력
		System.out.printf("이 원의 x좌표는 %s y좌표는 %s 반지름은 %s 입니다.", circle.c.x, circle.c.y, circle.r);
	}


}
