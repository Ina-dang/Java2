package a220118;

public class MemberCall {
	int i; //인스턴스 변수
	static int si; //클래스 변수
	
	int i2 = si;
//	static int si2= i2; //클래스 변수에 인스턴스 변수 불가
	
	int i3 = i;
	static int si3 = si; //얘넨 같은거라 상호간 호출 가넝
	
	
	void m() { //인스턴스 메서드
//		m(); //재귀호출
		sm(); //인스턴스 메서드에서 클래스 메서드 가넝
		si = 10; 
	}
	
	static void sm() { //클래스 메서드
//		m(); // 클래스 메서드에서 인스턴스 메서드 호출 불가
//		i = 10; // 인스턴스 변수 사용 불가
		
		/*
		 * 클래스 변수의 초기화 : 클래스 처음 로딩될 때 단 한번
		 * 인스턴스 변수 초기화 : 인스턴스 생성될 때마다 각 인스턴스 별로 초기화
		 */
		
	}
}
	
