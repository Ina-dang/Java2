package a220117;

public class CardTest { //Ch6 CardTest 예제에서 Card 따로 클래스 파일 분리함
	
	public static void main(String[] args) { //입력값
		
		System.out.println("Card.width = " + Card.width); // 사전에 Card클래스에서 초기화 한 값이 출력
		System.out.println("Card.height = " + Card.height);
						// 클래스변수(static)는↑ 객체생성 없이 '클래스이름.클래스변수'로 직접 사용가능
		
		Card c1 = new Card();
		c1.kind = "Heart"; //Card 클래스의 인스턴스
		c1.number = 7;     //Card 클래스의 인스턴스 (각각 값을 관리)
		
		Card c2 = new Card();
		c2.kind = "Spade"; //인스턴스 변수의 값을 변경한다.
		c2.number = 4;
		
		System.out.printf("c1은 %s, %d이고 크기는(%d, %d)%n", c1.kind, c1.number, Card.width, Card.height);
		System.out.printf("c1은 %s, %d이고 크기는(%d, %d)%n", c2.kind, c2.number, Card.width, Card.height);
		
		System.out.println("c1의 width와 hight를 각각 50, 80 으로 변경합니다");
		c1.width = 50; //클래스 변수의 값을 변경한다
		c1.height = 80;
		
		System.out.printf("c1은 %s, %d이고 크기는(%d, %d)%n", c1.kind, c1.number, Card.width, Card.height);
		System.out.printf("c1은 %s, %d이고 크기는(%d, %d)%n", c2.kind, c2.number, Card.width, Card.height);
		
	}
}
