//package shape;
//
//public class ShapeTestMe {
//	public static void main(String[] args) {
//		Shape[] shapes = new Shape[6];
//		
//		shapes[0] = new Circle();
//		shapes[1] = new Square();
//		shapes[2] = new Triangle();
//		shapes[3] = new Pringles();
//		shapes[4] = new Hexahedron();
//		shapes[5] = new TriangularPrism();
//		
//		System.out.println(shapes[5]);
//		
//	}
//}
//
////interface perimeterable {void perimeter (int a, int b);}
////interface areable {final double a = 3.14;}
//
//abstract class Shape { // 부모클래스
//	int x; //x값
//	int y; //y값
//	double PI = 3.14;
//	
//	public Shape() {}
//	public Shape(int x, int y, double PI) {
//		this.x = x;
//		this.y = y;
//		this.PI = PI;
//		
//	}
//	public abstract void perimeter();
//	public abstract void area();
//	
//	
//}
//
//class Circle extends Shape {
//
//	@Override
//	public void area() {
//		// TODO Auto-generated method stub
//			
//	}
//
//	@Override
//	public void perimeter() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}
//
//class Square extends Shape {
//	@Override
//	public void area() {
//		// TODO Auto-generated method stub
//			
//	}
//
//	@Override
//	public void perimeter() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	}
//class Triangle extends Shape {
//
//	@Override
//	public void area() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void perimeter() {
//		// TODO Auto-generated method stub
//		
//	}
//}
//class Pringles extends Shape {
//
//	@Override
//	public void area() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void perimeter() {
//		// TODO Auto-generated method stub
//		
//	}
//}
//class Hexahedron extends Shape {
//
//	@Override
//	public void area() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void perimeter() {
//		// TODO Auto-generated method stub
//		
//	}
//}
//class TriangularPrism extends Shape {
//
//	@Override
//	public void area() {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void perimeter() {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//}
//
//
////shape : 도형
//// 하위 클래스 제작 ( 2차원 도형, 3차원 도형 )
//// 2차원도형 : 원, 사각형, 직각삼각형
////		기능 : 둘레, 넓이값 계산
//
//// 3차원도형 : 원기둥, 육면체, 삼각기둥 
////		기능 : 겉넓이, 부피 계산
//
//
//
////최종적으로 
///*
// * 
// * Shape[] shapes = new Shape[6];
// * 이 각각에 
// * shapes[0] = new Circle(5);
// * 이런식으로 써클은 반지름값들감
// * 
// */
//
//// 적절한 형태의 추상클래스, 인터페이스 다 써서 만들기
//// 공통점 찾아서 상속 만드는건가?
//
