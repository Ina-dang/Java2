package a220112;

public class Array2 {
	public static void main(String[] args) {
		// 배열의 값을 인덱스 [1] 값은 4 [2]는 8 12 16 20 로 구해보셈
		// 4 8 12 16 20
		// 1 2 3  4  5
		// 0 1 2  3  4  == i
		//이렇게 해두됨
//			score[0] = 4; 
//			score[1] = 4*2; 
//			score[2] = 4*3; 
//			score[3] = 4*4; 
//			score[4] = 4*5;
		int[] score = new int[5];
		for(int i = 0 ; i < score.length ; i++) {
			score[i] = (i + 1) * 4;
			
		System.out.println(score[i]);
		}
			

		int[] score2 = score; // score에 담겨있는 '주소'값을 int[]타입의 score2에 할당
		score2[3] = 100;
		
		for(int i = 0 ; i < score.length ; i++) {
			System.out.println(score[i]);
		}
		System.out.println(score);
		System.out.println(score);
//		new String("abcd"); // 생성하고 값을 안담음 --> 스레기
	}
}
