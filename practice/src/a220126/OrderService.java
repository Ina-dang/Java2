package a220126;

import java.util.Scanner;

public class OrderService {
	private static int admin_password = 1111; // 직원 비밀번호 초기값
	public static void main(String[] args) {
		System.out.println("주문확인 메뉴입니다");

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("비밀번호를 입력해주세요 > ");
		int tmp_pw = Integer.parseInt(scanner.nextLine());
		if(tmp_pw == admin_password) {
			System.out.println("직원 확인 했습니다.");
		} else {
		System.out.println("올바른 비밀번호가 아닙니다.");
		}
//		public void orderHistory() { //주문내역
//			
//		}
//		
//		public void calculate() { //영업관리 1.마감정산 2.준비금등록
//			
//			System.out.print("비밀번호를 입력해주세요 > ");
//			int tmp_pw = Integer.parseInt(scanner.nextLine());
//			if(tmp_pw == admin_password) {
//				System.out.println("직원 확인 했습니다.");
//			}
//		}
//		public void revenue() { //매출현황(수입) 1.전일매출(상품별,시간대별) 2.현매출(") 
//			
	}
}

	




//	//스캐너 유틸 때 따로빼서 공통으로 쓰려나
//	private static String nextLine(String input) {
//	Scanner scanner = new Scanner(System.in);
//	return scanner.nextLine();
//	}
//	private static int nextInt(String input) {
//		return Integer.parseInt(nextLine(input));
//	}
	
	
// 매출현황
	/*
	나현쓰
	- 주문 확인
	- 영업 관리
	- 매출 현황
	
	주문확인도 매출현황도 
	List<E> extends Collection<E> 
	public ArrayList() {
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }
    +학생데이터 끌어오기 응용
	
	products class 내
	상품 코드는 고유번호로 (String code; ==> 001부터시작)
	상품 이름은 String
	상품 가격은 int
	
	코드를 int cnt(수량)이랑 묶어서 멤버변수. 이게 장바구니에 들어갈 품목(merchandise aka mecd)
	승종이가하는 장바구니(cart)에 mecd가 들어가게됨
	
	 findBy를 사용해서 products class 에 있는 품목코드 춥춥? 
	 무엇을 가져와야하는가 장바구니를 findBy 해야하나?
	 
	 private 무언가 findBy(무언가) {
	 	무언가의 orderHistory = null;
		if(테이블에 맞게 적으면? 어떻게적지) {
			전체내역출력
		}
	 }
	 
	- 생성자로 포맷을 만들어놔야하나?
		 public 장바구니?프로덕트? (주문히스토리, sum){
		 어쩌구저쩌구
		 }
	어쨋든 findBy를 사용해서 나는 주문확인에서 테이블 별 주문 내역 이랑 그에따른 총금액을 표시해야한다.
	 
	 3. 주문확인
	 주문확인 메뉴입니다. 현재 착석중인 테이블 번호를 입력하세요 >>
	 1번 테이블의 총 주문 내역입니다.
	 마지막 주문 진로1
	 이전주문 참이슬1
	 이전주문 참이슬1
	 이전주문 참이슬1
	 이전주문 참이슬1 어묵탕1 닭똥집1 맥주500cc 4
	 
	주문내역 없을 시 "주문 이력이 없습니다" 출력
	 
	 주문내역과함께 " 총금액 : 0000000원 " 출력 후
	 
	 1. 메인으로 2. 더치페이계산
	 
	 2.더치페이계산 선택 시
	 더치페이할 인원 수를 입력하세요 >>
	 
	 1번테이블 총 금액 000000원 
	 4명이 인당 지불할 금액 0000원
	 
	 출력 후
	 
	 1. 메인으로 2. 다시 계산
	 
	 이런식으로 표현되어야함	
	 */