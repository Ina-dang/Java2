package a220108;

public class Ch3_05 {
	/*
	 * 아래는 변수 num의 값 중에서 일의 자리를 1로 바꾼느 코드이다. 
	 * 만일 변수 num의 값이 333이라면 331이 되고, 777이라면 771이 된다
	 * ()에 알맞은 코드를 넣으시오
	 */
	public static void main(String[] args) {
		int num = 777;
//		System.out.println((int)Math.ceil(num/10)*10+1);
		System.out.println(num/10*10+1);

		System.out.println(num - num%10+1);
	}
}
