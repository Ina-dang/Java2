package a220111;

public class FlowEx13 {
	public static void main(String[] args) {
		// 1 : 1 = 2^0
		// 2 : 2 = 2^1
		// 3 : 4 = 2^2
		// 4 : 8 = 2^3
		// .
		// .
		// 30 : 2^29
		// 2^30 - 1 = 1024 * 1024 * 1024 - 1
		
		int sum = 0;
		// 합계라고 하는 변수를 만든다. 계산 순서 중요
		
		for(int i = 1; i <= 10 ; i++) {
			//  i : 1 sum : 0
			//  i : 2 sum : 1
			//  i : 3 sum : 3
			sum += i ; // sum = sum + 1
			//  i : 1 sum : 1
			//  i : 2 sum : 3
			//  i : 3 sum : 6
//			이런식으로 진행
			
			System.out.printf("1부터 %2d 까지의 합 : %2d%n", i, sum);
		}
		// 구구단쓰할때 필요
		
		// 1 ~ 10000 합계 (10000+1)*5000
		// 1 ~ 10 합계
		// 1 + 10
		// 2 + 9
		// 3 + 8
		// 4 + 7 
		// .
		// .
		// .
		// 1 + 10 
		// 11 * 5
		
		
	}
}
