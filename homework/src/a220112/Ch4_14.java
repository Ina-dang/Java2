package a220112;

public class Ch4_14 {
/*
 * 사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 몇번만에 숫자를 맞췄는지 알려줌
 * 1~100사이숫자
 */
	public static void main(String[] args) {
		{
			//1~100사이의 임의의 값을 얻어서 answer에 저장한다
			int answer = 0; //코드
			int input = 0 ; //사용자 입력을 저장할 공간
			int count = 0 ; //시도횟수를 세기위한 변수
			
			//화면으로 부터 사용자 입력을 받기 위해서 scanner 클래스 사용
			java.util.Scanner s = new java.util.Scanner(System.in);
			
			do {
				count++;
				System.out.print("1과 100사이의 값을 입력하세요 :");
				/*
				 * 알맞는 코드입력
				 */
			} while(true); //무한반복문
		}
	}
}
