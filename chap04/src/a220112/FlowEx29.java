package a220112;

public class FlowEx29 {//업다운문제
	public static void main(String[] args) {
		for(int i = 1 ; i <= 100 ; i++) {
			System.out.printf("i = %d", i); //여기까지 하면 일단 i =1
			
			int tmp = i;
			
			do {
				// tmp %10이 3의 배수인지 확인(O)제외
				if(tmp %10 %3==0 && tmp %10 != 0)  //do 라서 일단 무조건 작동
					//1의자리수를 3으로 나눌 수 있는가 0,3,6,9라서 (&& 1의자리가 0이아닌거) 도 해줌
					// = 1의 자리가 3,6,9 일 때
					System.out.print("짝");
				
				// tmp /= 10은 tmp = tmp /10 과 동일
//								40 = 40  /10
			} 	while((tmp /= 10)!= 0);
				System.out.println();
		}
	}
}
