package a220121.starcraft;

class Dropship extends Unit {

	@Override
	void move(int x, int y) { /* 지정된 위치로 이동 */
		System.out.println(getClass().getSimpleName() + "이 " + x + ", " + y + "좌표로 이동합니다");
	}
	void load() {System.out.println("선택된 대상을 태운다.");}
	void unload() {System.out.println("선택된 대상을 내린다.");}
}