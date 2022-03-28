package a220111;

public class Ch4_02 {//1부터 20까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합을 구하시오
	public static void main(String[] args) {
//		int sum = 0;
//		
//		for(int i = 0; i <=20; i++) {
//			if(i%2!=0 && i%3!=0)
//				sum += i;
//		}
//		System.out.println("sum="+sum);
		
		//쌤 풀이
		int sum = 0; //저장공간
		for(int i = 1; i <=20 ; i++) { //20까지
			if( i % 2 != 0 && i % 3!=0)// !(i % 3 == 0 || i % 3==0) 도 같은말이라고 한다
				//벤다이어그램으로 
			System.out.println(i);
			sum += i;
		}
		System.out.println(sum); //프린트
	}
}
