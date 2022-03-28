package a220119;

import java.util.Arrays;

//출력 클래스
public class DeckTest { //이거적기전에 설계도확인
	public static void main(String[] args) {
		Deck d = new Deck(); 		//카드 Deck 타입의 변수 d 인스턴스 객체 생성
		System.out.println(Arrays.toString(d.cardArr));
//		d.shuffle();				//이거 있으면 ↓아래에 제일 위 아니고 한번 섞고 제일 위에 카드 선택함
		Card c = d.pick(0);  		//섞기전에 제일 위 카드 선택한다 (0부터 51번까지 52개카드 있음)
		System.out.println(c);		//System.out.println(c.toString());이랑 같다
		System.out.println();
		
		d.shuffle();				//섞섞
		System.out.println(Arrays.toString(d.cardArr));
		c = d.pick(0);				//pick
		System.out.println(c);		//System.out.println(c.toString());이랑 같다
		System.out.println();
		
		System.out.println(Arrays.toString(d.cardArr));
		c = d.pick();
		System.out.println(c);		//System.out.println(c.toString());이랑 같다
	}
	//Card타입 c 적으면 원래 주소값나와야하는데 Card class에 있는 toString 때문에 주소대신 값나옴 
}
