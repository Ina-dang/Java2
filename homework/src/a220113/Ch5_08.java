package a220113;

public class Ch5_08 {
	//다음은 배열 answer에 담긴 데이터를 읽고 
	//각 숫자의 개수를 세어서 
	//개수만큼 ‘*’을 찍어서 그래프를 그리는 프로그램이다. (1)~(2)에 알맞은 코드를 넣어서 완성하시오
	
//	이 코드 압축에 사용 함
	
//	0xffffff 0x000000 >> 24bit > 3byte * 160000 = 480Kbyte >> 너무커서 평균적으로 24k압축
//	git = 256
//	 손실  압축 = 대표적으로 .jpg
	
		
//	무손실 압축 = 원본상태랑 똑같
	
	
	public static void main(String[] args) {
		int[] answer  = { 1,4,4,3,1,4,4,2,1,3,2}; //3*** , 2**, 2**, 4****
//		1 3개 2 2개 3 2개 4 4개 = 11개
		//숫자를 총개수로도 출력하고 *모양으로도 출력
		
		int[] counter = new int[4]; //인덱스 0,1,2,3 
		
		
		for (int i = 0; i < answer.length; i++) { //answer의 값을 각 방마다 할당
//			System.out.printf("%d  \t",answer[0]);
			if (answer[i] == 1) { //answer i ==1이면
				counter[0] = counter[0] + 1; // 카운터 0방에 1씩 더해준다
			}
			if (answer[i] == 2) { //answer i ==2이면
				counter[1] = counter[1] + 1; 
			}
			if (answer[i] == 3) { //answer i ==3이면
				counter[2] = counter[2] + 1; 
			}
			if (answer[i] == 4) { //answer i ==4이면
				counter[3] = counter[3] + 1; 
			}
		}
		
		System.out.println();
		for (int i = 0; i < counter.length; i++) { 
			//index 속 값만큼 별 
			System.out.printf("%d", counter[i]); 
			for (int j = 0; j < counter[i]; j++) {
				System.out.printf("%s", "*"); 
			}

			System.out.println();
			
		}
	} 	
}
