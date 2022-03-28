package a220203;

public class MathTest {
	public static void main(String[] args) {
		//1라디안 = 180도 = PI
		System.out.println(Math.tan(Math.PI/2));
		System.out.println(Math.cos(Math.PI/4));
		System.out.println(Math.sin(Math.PI/4));
		System.out.println(Math.cos(Math.toRadians(45))); //몇도인지 쓸때는 이렇게 하면됨
	}
}
