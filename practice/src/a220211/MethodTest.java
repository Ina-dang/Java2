package a220211;

public class MethodTest {
	public static void main(String[] args) {
		System.out.println(MyMath2.add(200, 100));
		MyMath2 mm = new MyMath2();
		mm.a = 200;
		mm.b = 100;
		
		System.out.println(mm.add());
	}
}

class MyMath2 {
	long a, b;
	
	long add() {
		return a + b;
	}
	
	static long add (long a, long b) {
		return a + b;
		
	}
}
