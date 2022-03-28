package a220118;

class Data { int x; }

class PrimitiveParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change (d.x)");
		System.out.println("main() : x = " + d.x);
	
//		change메서드의 매개변수가 참조형이라 값이아닌 값이 저장된 주소를 change메서드에게 넘겨주어서 값변경가능
		change(d); 
		System.out.println("After change (d)");
		System.out.println("main() : d.x = " + d.x);
	}
	
	//기본자료형 int
	static void change(int x) {
		x = 100;
		System.out.println("change() : x = " + x);	
		
	}	
	//참조자료형 Data
	static void change(Data d) { //change메서드 호출 후에 d.x의 값이 변경된 예제
		d.x = 1000;
		System.out.println("change() : d.x = " + d.x);		
	}	
//	//참조자료형 Data
//	static void change(Data data) { //change메서드 호출 후에 d.x의 값이 변경된 예제
//		data.x = 1000;
//		System.out.println("change() : d.x = " + d.x);		
//	}	
}
