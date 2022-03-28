package a220113;

public class Ch5_08r {
	
	public static void main(String[] args) {
		int[] answer  = { 1,4,4,3,1,4,4,2,1,3,2}; //3*** , 2**, 2**, 4****
		// 1, 2, 3, 4
		int[] counter = new int[4]; //인덱스 0,1,2,3 
		// [3, 2, 2, 4]
		
		
		// 1, 2, 3, 4 > 0, 1, 2, 3
		
		for (int i = 0; i < answer.length; i++) { //answer의 값을 각 방마다 할당
//			System.out.print(answer[i]-1); 
//			counter[answer[i]-1]++; 
//			// [0, 0, 0, 0]
//			// [1, 0, 0, 0]
//			// [0, 0, 1, 0]
//			// [0, 0, 2, 0]
//			// [0, 1, 2, 0] .. 이런식으로 반복했다는 뜻
			
			switch (answer[i]-1) {
			case 0:
				counter[0]++;
				break;
			case 1:
				counter[1]++;
				break;
			case 2:
				counter[2]++;
				break;
			case 3:
				counter[3]++;
				break;

			default:
				break;
			}
		}
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
