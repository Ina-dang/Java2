package a220112;

public class Ch4_10 {
	/*
	 * int 타입 변수 num이 있을때 각 자리의 합을 더한 결과를 출력하는 코드를 완성
	 * 만일 num이 12345면 1+2+3+4+5인 15출력
	 * 문자열 말고 숫자로만처리해야함
	 */
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		//12345 중 1의자리 5를 떼온다
		//1234  중 1의자리 4를 떼온다
		//123   중 1의자리 3을 떼온다
		//12    중 1의자리 2를 떼온다
		//1     중 1의자리 1을 떼온다
		
		for(; num !=0 ;) { //이렇게 i 안넣어도 된다. 안넣으면 조건식 만족할 때까지 그냥 계속 반복함
			sum += num % 10; //1의자리 나머지
			num /= 10;		// num = num/10
//			System.out.println(num);
						
		}
		System.out.println("sum="+sum); //15 나와야함
	}
}
