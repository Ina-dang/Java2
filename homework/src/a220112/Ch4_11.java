package a220112;

public class Ch4_11 {//뭐 피보나치..?
		/*
		 * 
		 * 피보나치 수열 이해부터
		 * 앞에있는 두 수의 합이 결과를 반영한다
		 * 
		 */
	public static void main(String[] args) {
		//Fibonnaci 수열의 첫 두숫자를 1,1로
		int num1 = 1;
		int num2 = 0;
		int num3 = 0; 
//		System.out.print(num1+","+num2); / num1 1 num2 0으로 바꾸고 이거 프린트 안하고 아래 반복문 10번으로 하면 같은결과값나옴
		// num1 + num2 = 3
		/*
		 * a b c 
		 * 1 0 1
		 *   a b c
		 *   0 1 0
		 *     a b c
		 *     1 0 1
		 */
		
		for(int i = 0 ; i < 10 ; i++) { //원래는 1,0하고 8번이었다
			num3 = num2 + num1; 
			num1 = num2;
			num2 = num3;
			System.out.print(num3+",");
			// 코드넣어완성 결과 1,1,2,3,5,8,13,21,34,55 
		}
	}
}
