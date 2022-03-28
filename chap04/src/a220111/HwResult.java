package a220111;

public class HwResult {//220110윷놀이 숙제 쌤해설
	public static void main(String[] args) {
		// 윷놀이 경우의 수 16
		// how come? 4개막대기가 엎어졌냐 뒤집어졌냐 2^4 = 16
		// 0000 ~ 1111
		for(int i = 0 ; i < 20 ; i++) {
		//이렇게해서 반복문 만들어서 괄호에 넣어줘도됨
			int result = (int)(Math.random() * 16); // 0~15임 1부터 16아님!!
		// 0을 모로해도 됨 확률 배분 하셈
		switch (result) {
		case 0:
			System.out.println("'모'입니다");
			break;
		case 1:
			System.out.println("'윷'입니다");
			break;
		case 2: case 3: case 4: case 5:
			System.out.println("'도'입니다"); 
			// 확률을 추가하는게 아님 빽도같은경우 도 4개중에 1개만 빼서 빽도 만들면됨
			break;							  
		case 6: case 7: case 8: case 9:
			System.out.println("'걸'입니다");
			break;
		default:
			System.out.println("'개'입니다");
			break;
			}
		}
	}
}
