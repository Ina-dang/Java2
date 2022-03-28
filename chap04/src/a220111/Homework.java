package a220111;

public class Homework {
// 제품ID를 난수로 뽑아내기
//	총 20자리. 15자리의 숫자와 5자리의 알파벳 난수
	public static void main(String[] args) {
	
	for(int i = 0; i<15; i++) {
		int num  = (int)(Math.random() *  9    );
										//↑경우의 수 갯수
											//↑내가 원하는 형태의 수 조정
	
		switch (num) {
			case 0:
				System.out.print('0');
				break;
			case 1:
				System.out.print('1');
				break;
			case 2:
				System.out.print('2');
				break;
			case 3:
				System.out.print('3');
				break;
			case 4:
				System.out.print('4');
				break;
			case 5:
				System.out.print('5');
				break;
			case 6:
				System.out.print('6');
				break;
			case 7:
				System.out.print('7');
				break;
			case 8:
				System.out.print('8');
				break;
			case 9:
				System.out.print('9');
				break;
			default:
				break;
			}//어휴 이걸 알파벳은 어케하냐
		}
	int num1 = (int)(Math.random() *  26);
		//A-Z 65-90 에서 1개 골라낼 수 있게 어케한담
		char ch = 90;
		System.out.print(ch);
		//아 뭔가 65++1하면 될것가튼딩..
		switch (num1) {
		case 1:
			System.out.println('A');
			break;

		default:
			break;
		}
		
		//charAt? 
		//주사위 생각해보자아
	}
}
