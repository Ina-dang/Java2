package a220108;

public class Ch3_02_ { //ch3/Exercise3_2
	public static void main(String[] args) {
		int numOfApples = 121;		// 사과의 개수
		int sizeOfBucket = 10;		// 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0);	
									// 모든 사과를 담는데 필요한 바구니의 수
						 // 주석안에 알맞은 코드를 넣기
		System.out.println("필요한 바구니의 수 :" + numOfBucket);
		
		
		//해석 보는데도 이해가 안감
		
		/*
		 * 선생님 해설
		 * 
		 * 사과수 바구니수
		 *  118     12
		 *  119     12
		 *  120     12
		 *  121     13
		 *  122     13
		 *  123     13
		 */
		int numOfBucket1 = numOfApples % sizeOfBucket == 0 ? numOfApples/sizeOfBucket : numOfApples/sizeOfBucket + 1;
		System.out.println(numOfBucket1);

		//이렇게 그냥 올림 해버려도 된다
		int numOfBucket2 = (numOfApples + 9) / 10;
		System.out.println(numOfBucket2);
		
		//이렇게도 할 수 있다
		int numOfBucket3 = (numOfApples -1) / 10 + 1;
		System.out.println(numOfBucket3);
	}
}
