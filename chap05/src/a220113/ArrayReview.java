package a220113;

import java.util.Arrays;

public class ArrayReview {
	/*
	 * 배열은 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
	 * 배열은 참조 자료형이다
	 * 배열은 같은 타입이다
	 * 배열은 생성과 동시에 자동적으로 자신의 타입에 해당하는 기본값으로 초기화됨
	 */
	
//	참조자료형의 기본값 : null
	
	public static void main(String[] args) {
//	  배열은 대괄호[]를 이용해서 만듦
//	  두 가지 방식이 있지만 타입의 뒤에 []를 넣는걸 추천한다
//	  이유 : 다차원 배열 때문에 
		int[] arr; 
//		int[][] arr2; //2차원 배열 
//		int[][][] arr3; //3차원 배열
//		
//		int[] arr4[]; //이것도 2차원배열
//		int arr5[][]; //이것도 2차원배열
//		

		
//		배열의 생성 결과는 주소다
//		생성된 주소 위치를 찾아가려면 배열의 인덱스(순번)을 찾아간다
//		0부터 시작하는 0이상의 정수 = 인트의 최댓값과 같지만 거기까지 쓸 일 없어
		
//		arr = new int[1];
//		
//		int l = arr.length;
//		System.out.println(l);
		
// =========배열의 길이==========a220112 ArrayPrac참고================================
		
//		1 int = 4byte * 20억
//		80억 byte = 8백만 kb = 8000 mb = 8gb
	
//		길이가 0인 메서드도 가능하다 main에 String[] args 여기도 0이라는뜻
		System.out.println(args.length);
		// = 주소만 있고 방이 없음
		// 0번 인덱스가 존재하려면 일단 방이 하나는 있어야함
		// 0,1,2,3,4 인덱스 방일때 방이 5개인거니까
		int[] array = new int[5]; //길이가 5인 int배열
//		int타입의 값이 들어가는 5칸짜리 배열을 생성한다
//		heap에 저장
//		주소값이나온다
//		array로 감
		array = null; //이렇게 하면 전에 있던 값은 gc로 간다
//		System.gc(); //수거해 가라고.. 근데 이거 안해도 알아서 수거해감
		
//		초기화 하세요하면 기본값을 이렇게 지정해 주는게 좋음
		int i = 0;
		String s = null; 
		
		String[] strs = new String[3]; //스트링 배열 3개 생성 
		System.out.println(strs[0]);
		System.out.println(strs[1]);
		System.out.println(strs[2]);
		//null로 생성된 걸 볼 수 있다
		
		
	/*
	 * int[] : 타입 (같은 타입만 가능)
	 * array : 배열이름
	 * new
	 * int   : 타입
	 * [숫자]    : 타입의 길이 	
	 */
		
		System.out.println(args.length); //이미 생성된 배열의 길이는 변하지 않는다
//		args.length = 10; // 배정 할 수 없다고 오류 뜸
		
		// 배열의 길이를 바꾸려면
//		1. 더 큰 배열을 새로 생성한다.
//		2. 기존 배열의 내용을 새로운 배열에 복사한다 (기존의 2배정도로)
		
		
		int[] array3 = new int[] {10, 15, 11, 12}; //값을 이렇게 직접 입력하면 길이를 안적어도 알 수 있다. (둘다는 안됨)
//		int[] array3 =           {10, 15, 11, 12}; //값을 이렇게 직접 입력하면 길이를 안적어도 알 수 있다. 
		for (int j = 0; j < array3.length; j++) {
			System.out.println(array3[j]);
		}	
		
//		선언, 할당 
//		int[] array3; ==> 선언
//		array3 = new int []; ==> 할당
//		int[] array3; ==> 선언
//		array3 = {10,11,12}; ==> 이건 길이 할당부분 생략 안된다. 
		
// =========배열의 출력==========for 사용===============================
	System.out.println("배열의출력=============================");
		
		int[] Arr4 = { 100, 95, 80, 70, 60,}; //배열은 뒤에 쉼표 붙어도 됨
		
		for (int j = 0; j < Arr4.length; j++) {
			System.out.println(Arr4 [j]);
					
		}
			System.out.println(Arrays.toString(Arr4)); //가로출력

			
			
	System.out.println("향상된 for문======p166=======================");
//	 for ( 타입 변수명 : 배열 또는 컬렉션 ) {
//	           // 반복할 문장
//	} 
			
// =========배열의 복사==========두가지방법===============================
	System.out.println("배열의 복사=============================");
			
//	a220112 ArrayPrac . p193
			
	}
}

