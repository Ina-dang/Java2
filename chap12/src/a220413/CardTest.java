package a220413;

public class CardTest {
	public static void main(String[] args) {
		Card card = new Card(Kind.CLOVER, Num.TWO);
		System.out.println(card);
		Card card2 = new Card(Kind.SPADE, Num.TWO);
		System.out.println(Kind.CLOVER.ordinal());
		System.out.println(Kind.SPADE.ordinal());
		System.out.println(card);
	}
}

class Card{
	Kind kind;
	Num number;
	
	public Card(Kind kind, Num number) {
		super();
		this.kind = kind;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Card [kind=" + kind + ", number=" + number + "]";
	}
	
	
}

enum Kind {CLOVER, HEART, DIAMOND, SPADE}
enum Num {TWO, THREE, FOUR, FIVE}