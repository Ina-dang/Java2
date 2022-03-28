package a220129_220202;

public class ArrayByMultiDimensional {
	public static void main(String[] args) {
		
	System.out.println("====2차원 배열 ===");
		int[][] score = {
							{ 100, 100, 100 },
							{ 20, 20, 20 },
							{ 30, 30, 30 },
							{ 40, 40, 40 }
						};
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
			}
		}
		
		for (int[] tmp : score) {
			for ( int i : tmp) {
				sum+=i;
			}
		}
		System.out.println("sum =" + sum);
		
	System.out.println("====2차원 배열2 ===");
		int[][] score1 = {
							{ 100, 100, 100 },
							{ 20, 20, 20 },
							{ 30, 30, 30 },
							{ 40, 40, 40 },
							{ 50, 50, 50 }
						 };
		int korTotal = 0, engTotal = 0, mathTotal = 0;
		
		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("==============================");
		
		for (int i = 0; i < score1.length; i++) {
			int sum1 = 0;
			float avg1 = 0.0f;
			
			korTotal += score1[i][0];
			engTotal += score1[i][1];
			mathTotal += score1[i][2];
			System.out.printf("%3d", i+1);
			
			for (int j = 0; j < score1[i].length; j++) {
				sum1 += score1[i][j];
				System.out.printf("%5d", score1[i][j]);
			}
			
			avg1 = sum1 / (float)score1[i].length; //평균계산
			System.out.printf("%5d %5.1f%n", sum1, avg1);
		}
		System.out.println("================================");
		System.out.printf("총점:%3d %4d %4d%n", korTotal, engTotal, mathTotal );
	}
}
