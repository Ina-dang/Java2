package a220107;

public class ShortEval {
	public static void main(String[] args) {
		// && & 
		// || |
		
		//앞만 계산 = 효율적
		System.out.println(true  && true);
		System.out.println(false || true);
		System.out.println(true  && false);
		System.out.println(false || false);
		//뒤도 다 계산
		System.out.println(true  & true); 
		System.out.println(false & true);
		System.out.println(true  & false);
		System.out.println(false & false);
		
		int i = 0;
//		System.out.println(i != 0 &  10 / i > 10); //에러뜸 - 얘는 10/i(0)을 계산하려 들어서 오류뜸 NaN
		//
		System.out.println(i != 0 && 10 / i > 10); //false . &&는 좌변이 false면 false 뿜음 - 불필요한 연산 안함
		System.out.println(i == 0 || 10 / i > 10); //true .  ||는 좌변이  true면  true 뿜음 - 불필요한 연산 안함
		
		//효율적 연산을 위해 && || 두개 씩 쓰는거
	}
}
