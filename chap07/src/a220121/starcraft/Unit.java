package a220121.starcraft;

abstract public class Unit {
	int x, y;
	
	abstract void move(int x, int y); //몸통 만들자마자 컴파일 오류뜸
//	void stop() {/*현재 위치에 정지*/}	
	void stop() {System.out.println(getClass().getSimpleName() + "멈춤");
	}
	
}


