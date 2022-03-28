package a220119;

//Card 클래스 시작
class Card { //카드클래스 보러가는데 다른 타입없네 이거부터
	//상수 6개 (큰 대문자 + _언더바연결)
	static final int KIND_MAX = 4;   //카드별 무늬의 수 (종류의 최대값)
	static final int NUM_MAX = 13;   //무늬별 카드 수 (카드 한 종류당 갯수)

	// 숫자 준 이유는 가치 순서 SPADE가 제일 가치높아서 4
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	
	//static final로 선언되어있어서 어떤 카드든지간에 ↑위에는 다 같은값을 지님 (클래스변수)
	
	//이건 카드 52장이 가져야 할 개별의 값을 관리하기위해 인스턴스 변수 필요
	int kind;
	int number;
	
	Card(){
		this(SPADE, 1); //첫번째값 이걸로 호출할거임 (기본값설정) Card c는 뉴카드스페이드 하면 이것부터나옴
	}
	//카드클래스 위에말고 밑에 얘부터 작성해야함
	Card(int kind, int number){ //호출당할 생성자 int 타입 kind와 int 타입 숫자 라서 
		this.kind = kind; 			
		this.number = number;
	}
	
	
	//인스턴스를 확인하라고 했을때 주소값 대신 대체될 문자열
	// (선언부 고정되어있음) public String toString으로 무조건 하고 return 스트링 해야함
	public String toString() {
//		String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"}; 
		String[] kinds = {"CLOVER", "HEART", "DIAMOND", "SPADE"}; 
//		String numbers = "0123456789XJQK"; //숫자 10은 X로
		String numbers = "A23456789XJQK"; //숫자 10은 X로
	
					// 문자열로 반환
//	return "Kind : " + kinds[this.kind] + ", number ; " + numbers.charAt(this.number);
//	return "Kind : " + kinds[kind-1] + ", number ; " + numbers.charAt(this.number-1);
	return String.format("(%s %c)", kinds[kind-1], numbers.charAt(number-1));
	} //String 클래스 끝
	
	
}
//Card 클래스 끝
