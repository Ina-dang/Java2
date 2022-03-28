package a220211;

public class ClassTest {
	public static void main(String[] args) {
		Data data = new Data();
		data.x = 10;
		System.out.println("main() : x = " + data.x);
		
		change(data.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + data.x);
	}
	
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x ); 
	}
}

class Data { int x; }



