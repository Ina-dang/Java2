package a211231;

	// 변수(variable)란, 단 하나의 값을 저장할 수 있는 메모리 공간
	// 하나의 변수에 단 하나의 값만 저장할 수 있으므로, 새로운 값을 저장하면 기존의 값은 사라진다.
	/*
	 * 메모리
	 *  주기억장치 : RAM
	 *  보조기억장치 : HDD, SSD
	 */
	/* 
	 * 변수타입(variable type) : 정수형(소수점x), 실수형(소수점o), 문자형 -> 기본 타입
	 * 정수는 int , 나이(age)는 정수 -> 소수점x
	 */
	/*
	 * 변수의 초기화 : 변수 선언 이후에는 변수를 사용할 수 있으나 그 전에 반드시 변수를'초기화(initialization)'해야한다.
	 * --> 여러 pg이 공유하는 자원이므로 전에 다른 pg에 의해 저장된 쓰레기값이 남아있을 수 있기 때문
	 * 운영체제 : 컴퓨터를 사용하기 위해 작업을 관리하는 관리자 (각 디바이스가 가진 작업 관리)
	 * 
	 * 컴웨어 : 소규모 운영체제
	 * 
	 * = 오른쪽의 값을 왼쪽(변수)에 저장하라는 뜻
	 */
	public class Prev {
		public static void main(String[] args) { //main ctrl+space
			//int age; // age 이름의 변수를 int 타입으로 선언
			int age = 130; //25의 값을 정수(int)타입의 age변수를 선언 후 할당 (25를 저장, int age에)
			//Duplicate local variable age - 지역 변수 'age'를 중첩했다
			
			/*
			 * 
			 */
			
			/*
			 * int age;  //변수 선언 ----초기화 되지 않은 변수는 사용 불가
			 * age = 25; //변수 초기화 ->안하면 오류 뜸 (The local variable age may not have been initialized)
			 * 무튼 이렇게 따로 설정도 가능
			 */
			
			/*
			 * 변수 여러개는 ,로 선언 가능
			 * ex 
			 * int a;
			 * int b;
			 * int x = 0;
			 * int y = 0;
			 * 
			 * ↓가독성 좋게 변형하는 습관 들이기↓
			 * 
			 * int a, b;
			 * int x = 0, y = 0;
			 */
			
			System.out.println(age); //syso ctrl+space
			// println 이부분만 볼 수 있고 위의 지정값은 내부용
	}
}
