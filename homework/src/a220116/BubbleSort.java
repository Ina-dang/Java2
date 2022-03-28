package a220116;

public class BubbleSort { //버블정렬
	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int)(Math.random() * 10));
		}
		System.out.println();
		
		for (int i = 0; i < numArr.length-1; i++) { //outer loop -1인이유는 -1안하면 length 보다 많은 수 비교해서 오류뜸
			boolean changed = false;
			
			for (int j = 0; j < numArr.length-1-i; j++) { 
				if(numArr[j] > numArr[j+1]) { 
				int temp = numArr[j];
				numArr[j] = numArr[j+1];   // =====================> 이 부분 잘 정렬하기
				numArr[j+1] = temp;
				changed = true;
				}
			} //end for j
			if (!changed)  break;{
				for (int k = 0; k < numArr.length; k++) {
					System.out.print(numArr[k]);
				}
			System.out.println();
			}
		}
	}
}
