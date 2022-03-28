package a220114;

public class Ex07Shuffle { //shuffle
	public static void main(String[] args) {
		int[] numArr = new int[10];
//		System.out.println(numArr[0]); 0~9 인덱스 까지 다 값 0들어가있음
		
		for (int i = 0; i < numArr.length; i++) { //0을 인덱스10까지 1씩증가
			numArr[i] = i; //배열을 0~9의 숫자로 초기화한다.
			System.out.print(numArr[i]);			
		}
		System.out.println();
		
		for (int i = 0; i < numArr.length; i++) { //0~9까지 갯수 번 돈다 
			int n = (int)(Math.random() * 10); //0~9중의 한 값을 임의로 얻는다.
			int tmp = numArr[0]; //임시변수
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		for (int  i= 0; i < numArr.length ; i++) {
			System.out.print(numArr[i]);
		}
	}
}
