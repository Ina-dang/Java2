package a220114;

public class Ex10BubbleSort { //정렬하기(sort)
	
//	 0(n^2) :
//	버블 정렬 = 회차당 마지막 인덱스 값부터 정렬 완료
	public static void main(String[] args) {
		int[] numArr = new int[5];
		
		for (int i = 0; i < numArr.length; i++) { //0부터 numArr.length까지 1씩증가
			System.out.print(numArr[i] = (int)(Math.random() * 10));
		}  //여기까지하면 첫번째 랜덤 숫자 length생성
		
		System.out.println();
		
//		numArr = new int[] {1,9,0,8,1}; // 랜덤없고 내가 변수지정해서 통제
//		for (int i = 0; i < numArr.length; i++) {
//			System.out.print(numArr[i]);
//		}  
//		
//		System.out.println();
		
		
		
		
		
//		i == 0;
//		[1, 9, 0, 8, 1]
		/*
		 * 1 과 9 비교후 1이 더 적으니 그대로 9로 비교 이동
		 * 9와 0 비교후 0이 더 적으니 
		 * 1, 9, 0, 8, 1 에서 
		 * 1, 0, 9, 
		 * 그다음에 9와 8 다시비교 후 8이 더 적으니
		 * 1, 0, 8, 9 
		 * 그다음에 9와 1 다시 비교 후 1이 더 적으니 또 자리이동
		 * 1, 0, 8, 1, 9
		 *   
		 */
//		i == 1;
//		[1, 0, 8, 1, 9]
		/*
		 * 1과 0 비교 후 0이 더 적으니 0이 앞으로 
		 * 아까처럼 ㄱㄱ
		 */

// 		오름차순 으로 하려면 0, 1, 1, 8, 9  		
		
		for (int i = 0; i < numArr.length -1 ; i++) { 
							//-1 안적으면 0-4번 인덱스중 마지막 4번인덱스가 5번이랑 비교하려 해서 에러뜸
			boolean changed = false; //자리바꿈이 발생했는지를 체크한다.
			
			for (int j = 0; j < numArr.length-1-i; j++) {
				// ******
				if (numArr[j] > numArr[j + 1]) { //옆의 값이 작으면 서로 바꾼다.
				// ******
					
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true; //자리 바꿈이 발생했으니 changed를 true로.					
			}
		}
			if (!changed) break; //자리바꿈이 없으면 반복문을 벗어난다.
			
		for (int k = 0; k < numArr.length; k++) {
			System.out.print(numArr[k]); //정렬된 결과를 출력한다.
		}
			System.out.println();
		}
	}
}
