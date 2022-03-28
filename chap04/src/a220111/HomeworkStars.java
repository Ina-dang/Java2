package a220111;

public class HomeworkStars {
	//5*5마름모 구현법 과제 
	/*
	 *      *
	 *     ***
	 *    *****
	 *     ***
	 *      *
	 */
	//FlowEx16참고
	public static void main(String[] args) {
		int cnt = 5;
		for(int i= 0;  i < cnt;  i++ ) {
			for(int j = 0 ; j < cnt; j++) {
				boolean b2 = i == 2 || j ==2 || (i > 0 && i < 4) && (j > 0 && j < 4)  ; 
				if (b2) {
					System.out.printf("[%d,%d]", i,j);
				}
				else {
					System.out.printf("     ");
				}
			}
			System.out.println(""); 
		}
	}
}

//		for(int i= 0;  i < 5;  i++ ) {
//			for(int j = 0 ; j < 5; j++) {
////				boolean b = i == 2 ; //if보다 boolean으로 넣으면 나중에 바꾸기 쉽다
////				boolean b1 = j == 2 ; 
//				boolean b2 = i == 2 || j ==2 || (i > 0 && i < 4) && (j > 0 && j < 4)  ; 
//				if (b2) {
//					System.out.printf("[%d,%d]", i,j);
////				} else if (b1) {
////					System.out.printf("[%d,%d]", i,j);
////				} else if (b2) {
////					System.out.printf("[%d,%d]", i,j);
//				}
//				else {
//					System.out.printf("     ");
//				}
//			}
//			System.out.println(""); //이게 되네;;