package a220118;

public class WhatIsThis {
	public static void main(String[] args) {
		WhatIsThis isThis = new WhatIsThis(); //인스턴스 생성
		//인스턴스에는 주소가 존재
		System.out.println(isThis); //세 개 다 같은 주소값출력
		isThis.printWhatIsThis();
		System.out.println(isThis.getWhatIsThis());
	}
	
	WhatIsThis getWhatIsThis() {//This 리턴하고 리턴타입 클래스
		return this; //미래에 생성될 객체
	}
	
	void printWhatIsThis() { //void니까 별도 리턴 없음.
		System.out.println(this);
	}
//	static void sm() {
//		System.out.println(this); //클래스 변수에서는 this안됨
//	}
}
