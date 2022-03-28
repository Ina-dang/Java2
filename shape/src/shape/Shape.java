package shape;

abstract public class Shape {
		private int i; //아무거나해도 상관없음 여기에 접근제어자 붙일거임 코드가 상하로 좀 길어질건데 상관없음
		
//		public Shape() {} //이거안만들어도됨 사실 기본생성자 필수라고했는데
		
		public Shape(int i) { //i를 생성하는 기본생성자와 추가생성자 만 있는 형태로 해보겠음 그럼 하위 클래스들이 어떤식으로 동작해야하는가
			super();
			this.i = i;
		}

		protected int getI() { //사실 겟아이 셋아이 퍼블릭 안하는게좋음 i라는 이름을 썼다는거니까 노출안시키려고 했으니까 프로텍티드 하는게좋음
			return i;
		}

		protected void setI(int i) {
			this.i = i;
		}

		//공통 넓이값
		abstract public double getArea(); //겟에어리어라는 추상메서드 생성 => 넓이값
	
}
