package a220111;

public class Ch4_05 {//다음의 for 문을 while문으로 변경하시오
	public static void main(String[] args) {
//		for(int i=0; i<=10; i++) {
//			for(int j=0; j<=i; j++)
//				System.out.print("*");
//			System.out.println();
//		}
		// for 순서 
		// 1 초기식 2조건식 3 문장 4증감식 그다음에 다시 2조건식 . . . 
		
		int i = 0;
		while (i <= 10 ) {
			int j = 0;
			while (j <= i){
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++; 
		}
	}
}
