package a220119;

//Deck class 시작
class Deck { //설계도보는데 Card타입이 보이넹 하면서 Card를 먼저적으러가야함
//	final int CARD_NUM = 52;   //52장
	final int CARD_NUM = Card.NUM_MAX * Card.KIND_MAX;
	
	Card cardArr[] = new Card[CARD_NUM]; //카드타입 cardArr배열 생성 인덱스에 52들어있음

	
	Deck() {
//		int i = 0; 		
//		for (int k = Card.KIND_MAX; k > 0 ; k--) { // 카드클래스 카드별 무늬의 수 k 가 0이 될때까지 1씩 감소
		for (int i = 0, k = Card.KIND_MAX; k > 0 ; k--) { // 카드클래스 카드별 무늬의 수 k 가 0이 될때까지 1씩 감소
			for (int n = 0; n < Card.NUM_MAX; n++) { // 0이 무늬별 카드의 수에 도달할 때까지 1씩증가
				cardArr[i++] = new Card(k, n+1);
				// cardArr[총52개 공간배열]에 k,n+1 담아줌
			}
		}
	}
	//카드타입으로 반환하는 인스턴스 메서드
	Card pick(int index) { // ==랜덤픽
		return cardArr[index]; //cardArr[] 특정인덱스 반환
	}
	
	Card pick() {
		int index = (int)(Math.random() * CARD_NUM);
		return pick(index); //pick을 이용ㅇ해서 위에 호출
//		return cardArr[index] 도 가능
	}
	
	
	void shuffle() { //랜덤뽑기 5-8
		for (int i = 0; i < cardArr.length; i++) {
			int r = (int)(Math.random() * CARD_NUM); 
		
		Card temp = cardArr[i];
		cardArr[i] = cardArr[r];
		cardArr[r] = temp;
		}
	}
}
//Deck 클래스 끝
