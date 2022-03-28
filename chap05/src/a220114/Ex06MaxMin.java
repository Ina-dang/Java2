package a220114;

public class Ex06MaxMin { //최대값과 최소값 구하기
	public static void main(String[] args) {
		int[] score = { 79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0] ; //배열의 첫 번째 값으로 최대값을 초기화 한다.
		int min = score[0] ; //배열의 첫 번째 값으로 최소값을 초기화 한다.
		
//		System.out.println(score[0]); // 79
		
		// 선정된 값과 그 다음 값을 하나 하나씩 비교해서 그 값이 크면 갈아끼움
		for (int i = 1; i < score.length; i++) { // 0부터 score.length까지 1씩증가 
			// 시작위치가 1이라서 6번. 0부터하면 79랑 79비교라 인덱스1인 88부터 78랑 88비교를 함
			if (score[i] > max) { // score인덱스가 score[0]보다 크면
				max = score[i];   // i인덱스 최대값을 max에 교체
//				[0]79 < [1]88 => 88로 변경
//				[1]88 < [2]91 => 91로 변경
//				[2]91 > [3]33 => else if로 진행
				
			} else if(score[i] < min) { //score 가 score[0]값보다 작으면
				min = score[i];			//i인덱스 값을 min에 교체
//				[0]79 > [3]33 => min [3]33으로 변경
			}
			//이런식으로 [7]까지 교체
		}
		
		System.out.println("최대값 :" + max);
		System.out.println("최소값 :" + min);
	}
}
