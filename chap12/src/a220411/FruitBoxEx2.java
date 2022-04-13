package a220411;

public class FruitBoxEx2 {
	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<>();
//		FruitBox<Toy> toyBox = new FruitBox<>();
	}
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {
	// ?
	
}