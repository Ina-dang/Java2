package a220306;

public class Conditional15 {
	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		
		int result =0;
		
		while (tmp !=0) {
			result = result*10 + tmp%10;
			tmp /= 10;
			System.out.println(tmp);
		}
		
		if (number == result) {
			System.out.println(number + "는 회문수 입니다.");
		} else {
			System.out.println(number + "는 회문수가 아닙니다.");
		}
	}
}
