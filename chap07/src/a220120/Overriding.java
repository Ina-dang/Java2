package a220120;

public class Overriding {
  //조상클래스로부터 상속받은 메서드의 내용을 변경하는것
// 클래스 메서드 x 인스턴스 메서드에서만가능
	class Point{ 
		int x;
		int y;
		
		String getLocation() {
			return "x : " + x + ",y : " + y;
		}
	}
	class Point3D extends Point{
		int z;

		
		String getLocation() {
			return super.getLocation() + ", z : " + z; //조상의 메서드 호출
//			return "x : " + x + ",y : " + y + ", z : " + z;
		}
	}
	
	//////////////////
	
	class Parent {
		void parentMethod() {}
	}
	
	class Child extends Parent {
		void perentMethod() {} //오버라이딩
		void parentMethod(int i) {} // 오버로딩
		
		void childMethod() {}	// 먼저정의
		void ChildMethod(int i) {} // 정의된걸 오버로딩
//		void childMethod() {}	// 중복정의라 오류뜸
		
	}	
}
