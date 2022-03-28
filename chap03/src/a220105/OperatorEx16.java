package a220105;

public class OperatorEx16 { //rounding
	public static void main(String[] args) {
		float pi = 3.141592f;
//		float shortPi = (int) (pi * 1000) / 1000f; 		 //--> 반올림안하고 버림
		// 계산순서 (pi * 1000) = 3141.592f --> 형변환(float -> int) --> /1000f (다시 1000나누고 float로)
		// 3.141
		
		float shortPi = (int) (pi * 1000 + 0.5) / 1000f; //소수점 넷째자리 기준으로 반올림
		// 계산순서 (pi * 1000) = 3141.592f --> 3141.592f + 0.5 = 3142.092f 
		//  --> 형변환(float -> int) --> /1000f (다시 1000나누고 float로)
			System.out.println(shortPi);

		
		float shortPi1 = (int) (pi * 100 + .9) / 100f; //소수점 셋째자리 기준으로 올림
			System.out.println(shortPi1);

		
		// 올림 ceil
		// 내림 floor  
		
//		System.out.println(Math.PI); //더블타입 최대 15자리까지 나옴
//		Math. 으로 검색해보면 뭐가 많이 뜸
//		System.out.println(Math.ceil(pi)); //4.0 - double type
//		System.out.println(Math.floor(pi));//3.0 -      "
//		System.out.println(Math.round(pi));//3   -   int  type
	
	}
}
