package a220113;

public class MiniHwResult {
	public static void main(String[] args) {
		//소수 구하기
		/*
		 * 약수 : 1보다 큰 자연수 중 "자기자신의 숫자 이하"인 숫자 중 "나누어 떨어지는 숫자"
		 * 			= 자신의 숫자 이하의 자연수(1보다 큰 정수) 중 나누어 떨어지는 숫자
		 * 
		 * 나누어 떨어진다 = 자신의 숫자와 그 숫자를 나누었을 때 0이 되는 것
		 * 
		 */
		/*
		 * 소수 : 1과 자기 자신만으로 나누어 떨어지는 숫자
		 * 		
		 */
		
		System.out.println(6%1);
		System.out.println(6%2);
		System.out.println(6%3);
		System.out.println(6%4);
		System.out.println(6%5);
		System.out.println(6%6);
		System.out.println("===============");
		
		//30번의 소수를 만날때까지

		for(int num = 2, cnt = 0 ; cnt < 30 ; num++) { //변수를 지정해주는게 좋음. 
			boolean flag = false;
			
			for (int i = 2; i < num ; i++) {
				if( num % i==0 ) {
			//System.out.printf("숫자 %d는 %d로 나누었을 때 나머지가 %d%n",num,i,num%i);
					flag = true;
					break;
				}
			}
			if(!flag) {
				cnt++;
				System.out.println(num + "은(는)" + (flag ? "소수아님" : "소수"));
			}
		}
	}
}
