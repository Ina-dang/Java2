package a220112;

public class ArrayPrac {
	public static void main(String[] args) {
		int [] arr = new int [5];
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = (i + 1) * 4;
			System.out.println(arr[i]);
		}
		/*
		 * .
		 * .
		 * . 배열 길이 부족ㅎ 5개보다 더필요하게됨
		 * . 을 대비하여 처음부터 넉넉하게 만드셈
		 * .
		 * 
		 */
		int [] tmp = new int[arr.length*2]; // 기존 배열보다 길이가 2배인 배열 생성
		
		for(int i = 0; i < tmp.length; i++) {
			tmp[i] = arr[i]; // arr[i]의 값 (i + 1) * 4 를 tmp[i]에 저장
							
		tmp = arr; // 주소 연결이 tmp 로 바뀜 책처럼 쓰면 배정안되는디..?
//		arr = tmp;
		
		System.out.println(tmp[i]);
		// arr 배열은 더 이상 사용할 수 없고 JVM가비지 컬렉터에 의해서 자동적으로 메모리에서 제거된다
		}			
	}
}
