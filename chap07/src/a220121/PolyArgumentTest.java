package a220121;

import java.util.Arrays;

public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		System.out.println(b);
		b.buy(new Tv());
		System.out.println(b);
		b.buy(new Computer());
		System.out.println(b);
		b.buy(new Audio());
		System.out.println(b);
		b.summary();
		
	Product product = new Product(10) {};
		//선언부만 작성하고 구현부는 작성하는대로 남겨둔다
	}
}

abstract class Product {
	int price;
	int bonusPoint;
	
	Product (int price) {
		this.price = price;
		bonusPoint = (int)(price/10d);		
	}

	Product(){}
	
	@Override
	public String toString() {
		return getClass().getSimpleName(); 
	}	
}

class Tv extends Product {Tv(){	super(100);	} }
class Computer extends Product {Computer(){	super(200);	} }
class Audio extends Product { Audio() { super(50); } }	


class Buyer {
	int money = 1000;
	int bonusPoint;
	Product[] item = new Product[10]; //구입한 제품을 저장하기 위한 배열
	int i; 
	
	void buy(Product p) { //실제 구매할 대상의 조상클래스
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p; // 상품넣으면 여기배열에 값이 들어감 
		System.out.println( p + "을/를 구입했습니다");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		for (int i = 0; i < this.i; i++) {
//			if (item [i] == null) {
//				break;
//			}
			sum += item[i].price; //상품배열에있는 가격만 가져와서 더하구
			itemList += item[i] + ", "; //상품배열에서  상품 이름추가
		}
		
		System.out.println("구입하신 물품의 총 금액은" + sum + "입니다");
//		System.out.println("구입하신 제품은 " + Arrays.toString(item) + "입니다"); //null값도 나옴
		System.out.println("구입하신 제품은 " + itemList + "입니다");
	}

	
	@Override
	public String toString() {
		return String.format(" [남은돈=%s, bonusPoint=%s]", money, bonusPoint); //main메서드에서 출력할때 
	}
}
