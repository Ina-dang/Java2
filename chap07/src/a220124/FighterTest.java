package a220124;

import java.util.stream.Collectors;

public class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if (f instanceof Unit)
			System.out.println("f는 Unit클래스의 자손입니다.");
		if (f instanceof Fightable)
			System.out.println("f는 Fightable인터클래스를 구현했습니다.");
		if (f instanceof Movable)
			System.out.println("f는 Movable인터페이스를 구현했습니다.");
		if (f instanceof Attackable)
			System.out.println("f는 Attackable인터페이스를 구현했습니다.");
		if (f instanceof Object)
			System.out.println("f는 Object클래스의 자손입니다.");
		
		//다형성에 의해 구현 가능해짐
		Unit unit = new Fighter();
		unit.currentHP = 10; // 컴파일러가 유닛타입으로 인식해서 x,y,hp 세개만 사용가능
	
		Fightable fightable = new Fighter(); 
		fightable.attack(f); //유닛인스턴스사용. 
		Attackable attackable = new Fighter();  //attack 메서드 호출가능
		attackable.attack(f); 
		Movable movable = new Fighter(); //move 메서드 호출가능
		movable.move(1, 2);
		
		
		
	}
}
interface Fightable extends Movable, Attackable {}
interface Movable { void move(int x, int y);} //각기 자기값의 추상메서드를 가지고있음
interface Attackable { void attack(Unit u); } //각기 자기값의 추상메서드를 가지고있음

class Fighter extends Unit implements Fightable {
	public void move(int x, int y) {/* 내용생략 */}
	public void attack(Unit u) {/* 내용생략 */}
}

class Unit {
	int currentHP;
	int x;
	int y;
}

