package a220126;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		String[] menu = {"", "1.메뉴선택", "2.장바구니", "3.주문확인", "4.종업원호출"};
//		boolean flag = true; 
		
		System.out.println("원하는 항목의 번호를 입력하세요 ");
		System.out.println("1.메뉴선택 2.장바구니 3.주문확인 4.종업원호출 ");
			
		int num; //출력번호
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp);
				
		// 여기서 이제 service항목 에서 어떤부분 맡아서 나눌지 정해서 작업해온후에 
		// service 항목 합치고 여기다 void들 넣기
				
		switch (num) {
		case 1:
			System.out.println("메뉴선택");
			break;
//		===> 메뉴선택 들어가서 메뉴를 고르면 거기서 장바구니/주문 하고 주문확인화면까지 출력
			
		case 2:
			System.out.println("장바구니 / 주문");
			break;
//		===> 장바구니담겨있는 항목 ==> 주문하시겠습니까? 네 니오 ==> 주문완료 ==> pos에 전달
			//이거 종업원 한테 어케 전달시키지?
			
		case 3:
			System.out.println("주문확인");
			break;
//		===> 주문확인 1.주문내역확인 2. 계산서확인 
			// 최근순으로 마지막주문/이전주문 & 시간 & 메뉴 & 수량
			// 계산서 총 내역추루루룩 하고 1.메인으로 2.더치페이계산 
			// 더치페이 인원수 / 총n명 더치페이 : 1인당 가격은 **원 입니다.
			
		case 4:
			System.out.println("종업원호출");
			break;
//		===> 종업원 호출 메뉴입니다 
//			1.물 2.얼음 3.물수건 4.식기셋팅 5.종업원
			//이거 종업원 한테 어케 전달시키지?

		default:
			System.out.println("올바른 번호를 입력해 주세요");
			break;
		}
	}
}
