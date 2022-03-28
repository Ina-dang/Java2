package prizm;

import shape.Shape;
import shape.D3;
import tri.Tri;

public class Prizm extends Shape implements D3 {
	private Tri tri; //초기에 뉴트라이앵글 안됨 생성할때 가능

	public Prizm(int x, int y, int z) {
		super(z);
		tri = new Tri(x, y);
	}
	
	// 원기둥이랑 공식같아서 나중에는 저 tri도 제어하려고 할거임
	@Override
	public double getVolume() {
		return tri.getArea() * getI();
	}

	@Override
	public double getArea() {
		return tri.getArea() * 2 + tri.getCircum() * getI();
	}	
	
}
