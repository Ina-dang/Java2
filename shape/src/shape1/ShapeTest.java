package shape1;
import circle.*;
import shape.*;
import tri.*;
import cylinder.*;
import prizm.*;


public class ShapeTest {
	public static void main(String[] args) {
//		//원 계산확인
//		Circle circle = new Circle(3);
//		circle.getArea();
//		circle.getCircum();
//		System.out.println(circle.getArea());
//		System.out.println(circle.getCircum());
//		
//		//삼각형 계산확인
//		Tri tri = new Tri(3,4);
//		tri.getArea();
//		tri.getCircum();
//		System.out.println(tri.getArea());
//		System.out.println(tri.getCircum());
//		
//		//원기둥 계산확인
//		Cylinder cylinder = new Cylinder(3, 4);
//		System.out.println(cylinder.getArea());
//		System.out.println(cylinder.getVolume());
//		
//		//삼각통 계산확인
//		Prizm prizm = new Prizm(3, 4, 5);
//		System.out.println(prizm.getArea());
//		System.out.println(prizm.getVolume());
//		
//		circle.setR(5);
//		System.out.println(circle.getR());
//		System.out.println(circle.getArea());
//		System.out.println(circle.getCircum());
		
		Shape[] shapes = new Shape[4];
		shapes[0] = new Circle(3);
		shapes[1] = new Tri(3,4);
		shapes[2] = new Cylinder(3,4);
		shapes[3] = new Prizm(3,4,5);
		
		for (Shape s : shapes) {
			System.out.println(s.getClass().getSimpleName() + "의 넓이는" + s.getArea());
			if(s instanceof D2) {
				System.out.println(s.getClass().getSimpleName() + "의 둘레는" + ((D2)s).getCircum());
			}
			if(s instanceof D3) {
				System.out.println(s.getClass().getSimpleName() + "의 둘레는" + ((D3)s).getVolume());
			}
		}
	}
}
//shape : 도형 하위 클래스 제작 ( 2차원 도형, 3차원 도형 )
//2차원도형 : 원, 사각형, 직각삼각형 >> 기능 : 둘레, 넓이값 계산
/* 원 : r(반지름 하나로 둘레 넓이 구할 수 있음)
 * 직사각형 : x, y 있으면 둘레 넓이 구할 수 있음
 * 직각삼각형 : x, y 
 * 
 * 필요한 필드갯수 찾으면 됨
 * 다 인트니까 그러면 조상은 인트하나면 되겠네? 라는 생각으로 가보자
 * 
 * 접근제어자까지 죄다 고려할거다 
 * 
 */

//3차원도형 : 원기둥, 육면체, 삼각기둥	기능 : 겉넓이, 부피 계산
/*
 * 
 */


//3차원 2차원 둘의 공통점을 찾아야함
// 공통점이라하면 넓이 구하기 아닌가
// 원과 원기둥의 관계는 뭐로 설명할건가 
//원과원기둥은 상속이아니라 has 인 포함관계로

//적절한 형태의 추상클래스, 인터페이스 다 써서 만들기
//공통점 찾아서 상속 만드는건가?