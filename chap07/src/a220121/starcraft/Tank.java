package a220121.starcraft;

class Tank extends Unit {

	@Override
	void move(int x, int y) { /* 지정된 위치로 이동 */
		System.out.println(getClass().getSimpleName() + "이 " + x + ", " + y + "좌표로 이동합니다");
	}

	void stimPack() {System.out.println("공격모드를 변환한다");}
} 