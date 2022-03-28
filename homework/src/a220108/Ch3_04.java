package a220108;

public class Ch3_04 {
	/*
	 * 아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다.
	 * 만일 변수 num의 값이 '456'이라면 '400'이되고, '111'이라면 '100'이된다. 
	 * ()안에 알맞은 코드를 넣으시오.
	 */
	public static void main(String[] args) {
		int num = 1754;
//		System.out.println((int)Math.ceil(num/100)*100);
		System.out.println(num/100*100); //--> 원했던 답
		
		
		//선생님 답
		System.out.println(num - num%100);
	}

}
