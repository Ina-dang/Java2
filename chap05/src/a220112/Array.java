package a220112;

public class Array { //배열
	static int value;
	
	public static void main(String[] args) {
		
//		int result = 0;
		int i = 10;
		System.out.println(value);
		int [] score = new int [5]; //배열 선언
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);

		score[2] = 100;
		score[3] = 50;
		System.out.println("============");
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);

		System.out.println("============");
		for( i = 0; i < 5; i++) { //위에 인트 선언 있어서 int 뺐음
			System.out.println(score[1]);
		}
			
		System.out.println("============");
		for( i = 0; i < score.length; i++) { //위에 인트 선언 있어서 int 뺐음
						//score의 길이
			System.out.println(score[i]);
		}
		
			// [I@ 뒤에 숫자로 된 주소나옴		
			// score 타입 ? int []
			// score [0]타입 ? int
	}
}
