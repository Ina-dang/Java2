package a220111;

public class Ch4_04 {//1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오
	public static void main(String[] args) {
		/*
		 * 규칙찾기
		 * 
		 * 짝수마다 음수부호가 붙는다
		 * 합계를 하는건 얘도 sum이 필요한다
		 * 몇까지 더해야 총합이 100이되는가
		 * 반복문의 종결은 100이 초과되었을때
		 * 
		 *for(;;) 처럼 중간 조건식이 비어있으면 infinity loop가 된다 
		 */
		
		int sum = 0;
		int i   = 0;
		for(i = 1; sum < 10 ; i++) {
			sum += i % 2==0 ? -i : i; //sum += i 를 2로 나누었을때 떨어지면(짝수) ? 음수 : 양수
			System.out.println(i + " :: " + sum);
		}	
		System.out.printf("i 값이 %d 이상이 되었을 때 10을 넘어감", i-1);
	}
}
