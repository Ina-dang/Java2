package cylinder;

import shape.Shape;
import circle.Circle;
import shape.D3;

public class Cylinder extends Shape implements D3 { 
	//class Cylinder extends Shape3D { 
		//원기둥은 2차원 도형을 가지고있다 정도. 그러니까 원을 가지고있어야지
		//얘는 조상클래스 직접적으로 상속받진않음 대신 얘는 

		private Circle circle;

		public Cylinder(int r, int z) { //반지름, z의 높이값
			super(z); //씰린더사용을위한 인스턴스생성
			circle = new Circle(r); //써클값 사용을 위한 인스턴스생성

		}
		
		@Override
		public double getVolume() {
			return circle.getArea() * getI();
		}

		@Override
		public double getArea() {
			return circle.getArea() * 2 + circle.getCircum() * getI();
		}	
	}