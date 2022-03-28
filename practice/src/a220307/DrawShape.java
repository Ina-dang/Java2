package a220307;
	
public class DrawShape {
	public static void main(String[] args) {
		Point[] p = { new Point(100, 400),
					  new Point(140,  50),
					  new Point(200, 100)
		};
		Triangle t = new Triangle(p);
		t.draw();
		
		Circle c = new Circle(new Point(150, 150), 50);
		c.draw();
	}
}

class Shape {
	String color = "black";
	void draw() {
		System.out.printf("[color=%s]", color);
	}
}

class Point {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	Point(){
		this(0,0);
	}
	
	String getXY() {
		return "("+x+","+y+")";
	}
}

class Circle extends Shape {
	Point center; //원점좌표
	int r; //반지름
	
	Circle() {
		this(new Point(0,0), 100);
	}

	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
	
	void draw() {
		System.out.printf("[center = (%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
	}
}

class Triangle extends Shape {
	Point[] p = new Point[3];
	//3개의 Point인스턴스를 담을 배열 생성

	public Triangle(Point[] p) {
		this.p = p;
	}
	
	void draw() {
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}
	
	
	
}