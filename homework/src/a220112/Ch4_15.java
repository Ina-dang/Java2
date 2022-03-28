package a220112;

public class Ch4_15 { 
	/*
	 * 회문수 구하는 프로그램 : 거꾸로해도 이효리;
	 */
	public static void main(String[] args) {
		int number = 12321;
		int tmp = number; //number 변수를 거꾸로 변환해서 답을 변수
		
		int result =0;
		
		while(tmp !=0) {
			result = result * 10 + tmp % 10;
			tmp /= 10;
		}
		
		// 123
		// 321 -> 이건 회문수가 아님
		
		// 규칙 각 문장의 일의 자리를 가져온다 
		// 123은 3부터 3 2 1 순으로 가져오고
		// 321은 1부터 1 2 3 순으로 가져오고
		
		// 숫자 일의자리에서 가져오고 10곱하고 다시 일의자리에서 가져오고 10 곱해주고
		
		// 반복문을 바로 입력하는 것보다는 이거를 하나하나씩 직접 적어보는게 나음

		//원래 있던값에 10먼저 곱하고 1의자리 더하기
		
		
//		result = result * 10 + tmp % 10; //12321에서 1 가져옴	 	
//		tmp /= 10;		  //12321 = 12321 / 10 		=> 1232
//		System.out.printf("%d \t %d%n" , result, tmp);
//		
//		
//		result = result * 10 + tmp % 10;     //1232 에서 2 가져옴
//		tmp /= 10;        //1232  = 1232  / 10		=> 123
//		System.out.printf("%d \t %d%n" , result, tmp);
		
		
		if(number == result) {
			System.out.println(number + "는 회문수 입니다.");
		}else {
			System.out.println(number + "는 회문수가 아닙니다.");
		}
	}
}
