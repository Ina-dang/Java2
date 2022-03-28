package a220114;

import java.util.Arrays;

public class StringArrayEx {
	public static void main(String[] args) {
		
		/*
		 * String str : 참조자료형 class
		 * new String(); : 생성자(constructor)
		 */
		
//		String 객체 생성 방법
//		1. 큰따옴표 ""
//		2. new연산자 사용
		String str1 = "abc";
		String str2 = new String("abc"); //new ==> heap에 만드는게 원칙
		String str3 = "abc";
		String str4 = new String("abc");
		
		System.out.println(str1 == str2); //false
		System.out.println(str2 == str3); //false
		System.out.println(str1 == str3); //true ==> String을 new로 생성하지 않고 ""리터럴로 생성한 경우
										  //str1과 str3이 고유의 인스턴스를 공유하도록 interned됨
		System.out.println(str2 == str4); //false
		
		System.out.println(str1 == str2.intern()); //이렇게 하면 true로 나옴
		
		/*
		 * String literal 생성 시 해당 String 값은 Heap 영역 내 "String Constant Pool"에 저장되어 재사용되지만,
		 * new 연산자로 생성하면 같은 내용이라도 여러 개의 객체가 각각 Heap 영역을 차지하기 때문
		 * 
		 * 문자열 리터럴을 생성하면 상수풀에 등록함
		 * -> 동일한 문자열이 존재하면 재사용
		 */

		
//		//내가 만든 클래스들이 만들어 지는 이유
//		
//		int a = 10; //인트 리터럴에 10l은 들어가지않음 어지간한 기본자료들은 자신만의 값을 가진 리터럴이 있기 때문
//		int[] arr = {1, 2, 3};
//
////		참조 자료형은 고유의 리터럴이 존재 하지 않음. 
////		단, 배열 & 문자열은 제외
//		
//		
//		StringEx ex = new StringEx(); // 참조자료형은 new와 자기와 똑같은 이름의 
//		Review result = new Review();
		
//		저거 배우는 이유
		String[] strs = new String[3]; // null들어있음
		//				{} ==> new는 안써져있지만 그냥 생략되어있을 뿐 얘도 new임
		//			  = new String[3] {1,2,3} 이란 뜻 근데 같이 안적힘
		strs[0] = str1;
		strs[1] = str2;
		strs[2] = "abc"; //같은 문자 써져있으면 결국 같은 값들어감
		System.out.println(Arrays.toString(strs));
		System.out.println(strs[0] == strs[2]); //같은 주소값입니까 물어봄
		System.out.println("abc" == "abc"); //↑위에가 이말임 결국
		
	}
}
