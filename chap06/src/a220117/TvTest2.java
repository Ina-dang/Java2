package a220117;

class Tv {
	// Tv의 속성(멤버변수)
	String color;			// 색상
	boolean power;			// 전원상태(on/off)
	int channel; 			// 채널
	
	// Tv의 기능(메서드) ==> 입력 반환값 아무것도 없음
	void power()		{ power = !power; }  // TV를 켜거나 끄는 기능을 하는 메서드
	void channelUp()	{ ++channel; }		 // TV의 채널을 높이는 기능을 하는 메서드
	void channelDown()	{ --channel; }		 // TV의 채널을 낮추는 기능을 하는 메서드
	
}

public class TvTest2 {
	public static void main(String[] args) {
		Tv t1 = new Tv();	// Tv t1; 과 t1 = new Tv();를 한 문장으로 가능
		Tv t2 = new Tv();	
		// t1과 t2는 서로 다른 주소를 가지고있다. 
		
		// int 타입의 기본 타입은 0 그렇기 때문에 둘다 처음 값 0으로 나옴
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		t2 = t1; //t1의 값이 t2로 간다 -> t1의 주소를 공유한다
		
		t1.channel = 7 ; // channel의 값을 7로 한다
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		
		
		//t1의 채널값만 바꿈
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		t2.channel = 10 ; // t2만 적었지만 이미 t1과 t2은 같은 주소를 공유중이므로 t1,t2의 값 모두 바뀐다
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
	}
}
