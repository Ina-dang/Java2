package a220108;

public class Ch3_07 {
	/*
	 * 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하듣 코드이다.
	 * 변환 공식이 'C = 5 / 9 x (F - 32)' 라고 할 때, (0)에 알맞은 코드를 넣으시오
	 * 단, 변환 결과값은 소수점 셋째자리에서 반올림해야한다
	 * (Math.round()를 사용하지 않고 처리할 것)
	 */
	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = (int)(5/9f * (fahrenheit-32)*100 + 0.5)/100f;
						
		System.out.println("Fahrenheit : " + fahrenheit);
		System.out.println("Celcius : " + celcius);
		
		//선생님 답 또같음~!
	}
}
