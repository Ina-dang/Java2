package a220118;

class Data1{
	int value;
}

class Data2{
	int value;
	
//	Data2(){
//		//오버로딩 하면 complie error 사라짐
//	}
	
	Data2(int x){
		value = x;
	}
	
}

public class ConstructorTest {
	public static void main(String[] args) {
		Data1 d1 = new Data1(); //생성자는 new에 의해서 호출. 배열빼고 싹다 생성자라고 생각하셈
		System.out.println(d1);
//		Data2 d2 = new Data2(); //compile error 생성
		Data2 data2_2 = new Data2(5);
		
		String str = new String();
		System.out.println(str); //아무것도안나옴
		String str2 = new String("abcd");
		System.out.println(str2);
		String str3 = new String(new char[] {'a', 'b', 'c', 'd'});
		System.out.println(str3);
	}
}
