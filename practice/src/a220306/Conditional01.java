package a220306;

public class Conditional01 {
	public static void main(String[] args) {
		int x = 13;
		if (x >= 10 && x <=20) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		char ch = ' ';
		if (ch != ' ' && ch != '\n' ) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		//1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
		int sum = 0;
		for (int i = 0; i < 21; i++) {
			if (i%2!=0 && i%3!=0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
		int sum1 = 0;
		int totalSum = 0;
		for (int i = 0; i < 11; i++) {
			sum1 += i;
			System.out.println(sum1);
			totalSum += sum1;
		}
		System.out.println(sum1);
		System.out.println("totalSum" + totalSum);
		
		//1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 
		//몇까지 더해야 총합이 100이상이 되는지 구하시오.
		
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		for (int i = 0; i < 200; i++) {
				num3 += i;
			if (i%2==0) {
					sum -= i;
				}else sum += i;
			if (num3 >= 100) {
				System.out.println("합계가 100 이상입니다.");
				break;
			}
		}
		
		num3 = 0;
		int i;
		for (i = 1; num3 < 100 ; i++) {
			if (i%2==0) {
				num3 -= i;
			} else num3 += i;
		}
		System.out.println(i-1);
		System.out.println(num3);
	}
}
