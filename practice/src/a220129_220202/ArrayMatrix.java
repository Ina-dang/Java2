package a220129_220202;

public class ArrayMatrix { //행렬곱셈
	public static void main(String[] args) {
		int[][] m1 = {
						{1, 2, 3},
						{4, 5, 6},
		};
		
		int[][] m2 = {
						{1, 2},
						{3, 4},
						{5, 6}
		};
		
		final int ROW = m1.length; 		// m1의 행 길이
		final int COL = m2[0].length;	// m2의 열 길이
		final int M2_ROW = m2.length;	// m2의 행 길이
		
		int[][] m3 = new int[ROW][COL];
		
		//행렬곱 m1 x m2의 결과를 m3에 저장
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				for (int j2 = 0; j2 < M2_ROW; j2++) {
					m3[i][j] += m1[i][j2] * m2[j2][j];
				}
			}
		}
		//행렬 m3를 출력
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				System.out.printf("%3d ", m3[i][j]);
			}
			System.out.println();
		}
	} // main 끝
}
