package tri;

import shape.Shape;
import shape.D2;

public class Tri extends Shape implements D2 {
	private int x;
	public Tri(int x, int y) { //얘는 x랑 와이니까 2개값필요
		super(y);
		this.x = x;
	}
	
	@Override
	public double getCircum() {
		return Math.sqrt(getI()*getI() + x*x) + getI() ;
				//빗변값구하기 geti제곱 x제곱에 루트씌움
	}
	@Override
	public double getArea() {
		return getI() * x / 2d;
		//getI가 현재 y로 쓰이고있음
	}	
}
