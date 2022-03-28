package a220111;

public class HwResult1 { //윷놀이 두번째 해설
	public static void main(String[] args) {
//		int r1 = (int)(Math.random() * 2); // 0,1 
		// 윷 엎어라 뒤집어라
		
		for (int i = 0 ; i < 4 ; i++ ) {
		//↑ 를 4개를 만드는것 윷4개로 생각하고 따로따로 
		int r1 = (int)(Math.random() * 2); // 0,1 
		int r2 = (int)(Math.random() * 2); // 0,3하고싶으면 형태의 수 * 3 
		int r3 = (int)(Math.random() * 2); // 0,5 
		int r4 = (int)(Math.random() * 2); // 0,7
								  //↑경우의 수 갯수
										 //↑내가 원하는 형태의 수 조정
		
//		int r5 = (int)(Math.random() * 2) *7 +2 ; // 2,9 > 같은 값 찾기 >> 0,7 
										//0, 1 > 0, 7 > 2, 9
		
		
		//얘네 합하면 최저값 0 최대값 4
		//0 모 
		switch (r1+r2+r3+r4) {
		case 0:
			System.out.println("모");
			break;
		case 1:
			System.out.println("도");
			break;
		case 2:
			System.out.println("개");
			break;
		case 3:
			System.out.println("걸");
			break;
		case 4:
			System.out.println("윷");
			break;
		default:
			break;
			}
		}
	}
}
