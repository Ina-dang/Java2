package circle;

import shape.Shape;
import shape.D2;

public class Circle extends Shape implements D2 {
//get I 를 프로텍트로 써야함

		 //현재 생성자가 아무것도 정의되어있지않은 기본생성자만 있음 그렇기때문에 얘도 추가생성자 호출해줘야함 
			// 서클에 관련된걸 수퍼에서
			public Circle(int r) { //int i이름다르게준거
				super(r); //서클에서 r 요청
			}	

		//생성했으니 구현해야지
			@Override
			public double getCircum() {
				return 2 * Math.PI * getI();
			}

			@Override
			public double getArea() {
				// TODO Auto-generated method stub
				return getI() * getI() * Math.PI;
			}
			
	//서클에서 반지름 값변경하려면 직접 값 입력하면됨
	public void setR ( int r) {
		setI(r);
	}
	public int getR() {
		return getI();
	}
}

