package a220114;

class Tv { // = 클래스를 만든다 == 내가 정의한 자료형을 만든다
//				클래스의 설계   >> 사용자 정의 자료형
	
	// Tv의 속성(멤버변수)										초기화값
	String color;						// 색상					==> null 			 (구조체)
	boolean power;						// 전원상태(on/off)		==> false		=====각각의 저장공간
	int channel;						// 채널					==> 0
	
	// Tv의 기능(메서드)
	void power() {power = !power;}		// TV를 켜거나 끄는 기능을 하는 메서드
	void channelUp() {++channel;}		// TV의 채널을 높이는 기능을 하는 메서드
	void channelDown() {--channel;}		// TV의 채널을 낮추는 기능을 하는 메서드
} 

public class TvTest { //↓메인 메서드가 있는녀석으로 제목 해야 정상작동 
	public static void main(String[] args) {
		
		
		// Tv t 를 클래스와 인스턴스라고 생각하면됨 
//		Tv t = new Tv(); 				// 합치면 이렇게 씀
//	클래스 참조변수 인스턴스
		Tv t;							// TV인스턴스를 참조하기 위한 변수 t를 선언; 여기가 시작점
		t = new Tv();					// TV인스턴스 생성
		
		System.out.println(t); //주소출력
		// . ~의
		t.channel = 7;					// TV인스턴스의 멤버변수 channel의 값을 7로 한다
		t.channelUp();				// TV인스턴스의 메서드 channelDown()을 호출한다
		System.out.println("현재 채널은 " + t.channel + " 입니다.");
		
	}
}
// 자료를 저장하기위해 사용하는 방법 > 자료구조
// 변수 > 배열 > 구조체 
// 
//		(각각의 공간에 들어가기위해 인덱스를 통해 구분)
// 				(각각의 저장공간을 이름을 통해 구분 )
// 구조체 : 클래스를 만들었는데 데이터 만 있을 때 (메서드가 없음)
// 이제 여기에 메서드가 들어가면 클래스가 됨 
// 클래스 : 구조체 + 기능 