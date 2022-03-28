package a220113;

public class ArrayEx1 {
	public static void main(String[] args) {
		int[] score = new int[5];
		/*
		 * int[] = score;
		 * score = new int[5];
		 */
		int k = 1;
		
		score[0]   = 50;
		score[1]   = 60;
		score[k+1] = 70; // score[2] = 70 이라는 뜻
		score[3]   = 80;
		score[4]   = 90;
		
		//  i*10 + 50 의 패턴을 찾아내기
		
		int tmp = score[k+2] + score[4]; //score[3] + score[4]
		
		for(int i=0; i < 5; i++) {
			System.out.printf("score[%d]:%d%n",i,score[i]);
		}
		System.out.printf("tmp:%d%n", tmp); //안에 들어가있으면 얘도 5번 나옴
//		System.out.printf("score[%d]:%d%n", 7, score[7]);
	}
}
