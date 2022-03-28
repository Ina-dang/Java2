package a220121.starcraft;

public class AbstractTest {
	public static void main(String[] args) {
		
//		Unit u = new Unit();
		//추상클래스는 추상메서드때문에 인스턴스화 안되고 오버라읻하면 개번거로움
		//그래서 구현되어있는 자손으로 구현하는게 더 편함
		Unit u1 = new Marine();
		Unit u2 = new Tank();
		
		Unit[] group = new Unit[4];
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new Marine();
		group[3] = new Dropship();
		
		for(Unit u : group ) {
//			if (u instanceof Tank) { //공통 조상없으면 이렇게해야함
//				((Tank)u).move(10, 20);
//			} 
//			else if(u instanceof Marine) {
//				((Marine)u).move(10, 20);
//			}
			u.move(10, 20); // 공통 조상있어서 그냥 이렇게 하면됨
		} //이게 더 간편함
		
		
		//동적바인딩(Dynamic Binding)
		//멤버변수가 조상 자손 클래스 중복 정의된경우 각 클래스에 선언된 멤버변수 사용
		//인스턴스 메서드는 중복선언 한 경우(오버라이딩) 실제 인스턴스의 멤버(메서드)를 호출
		
//		
//		for (int i = 0; i < group.length; i++) {
//			group[i].move(100, 200);
//		}
	}
}

