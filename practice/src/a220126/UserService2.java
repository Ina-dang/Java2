package a220126;

import java.util.Scanner;

public class UserService2 {
	static Scanner sc = new Scanner(System.in);

	public void menuChoice(){ 
		//메뉴관리 ==> 경보가들어올거
		System.out.println("메뉴 창입니다 >_0");
		System.out.println("1.시그니처 2.안주 3.주류");
	}

	public void cart(){
		//장바구니 ==> 승종이가들어올거
		System.out.println("장바구니 창입니다 >_0");
		System.out.println("주문내역출력");
	}

	public void cartHistory(){
		//주문확인 
		System.out.println("1.주문내역확인 2.더치페이");
		String input = sc.nextLine();
		int num = Integer.parseInt(input);
		
//		if (condition) {
//			
//		}

	}

	public void customers(){
		//종업원 호출 ==> 미숙님 들어올거
		System.out.println("종업원 호출 창입니다 >_0");
		System.out.println("1.물 2. 얼음 등등");
	}
}

class product {
	String no;
	String name;
	int price;
	
	public product(){
		
	}
	
	public product(String no, String name, int price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}
	
}

