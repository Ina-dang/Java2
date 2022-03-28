package a220128;

import lombok.AllArgsConstructor;
import lombok.ToString;

public class CloneEx1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Target t1 = new Target(1, 2);
//		Target t2 = t1; //이렇게하면 주소까지 완벽하게복사됨
//		Target t2 = t1.clone; //그냥 부르면 오류뜸. protected라 오버라이딩 해줘야함
		Target t2 = (Target)t1.clone(); //덮어주고 throws
		
		System.out.println(t1);
		System.out.println(t2);
		
		t1.x = 10;//주소값이 다르기때문에 복제 후 값바꾸면 t1만 바뀜
		System.out.println(t1);
		System.out.println(t2);
	}
}

@AllArgsConstructor
@ToString
class Target implements Cloneable{ //클론가능한 인터페이스 넣어줌
	int x;
	int y;
	//오버라이딩 해야함
	@Override //public으로 바꿔줘야함
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	
	
}
