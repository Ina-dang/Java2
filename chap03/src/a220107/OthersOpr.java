package a220107;

public class OthersOpr {
	public static void main(String[] args) {
		/*
		 * 조건연산자 ?:
		 * 유일한 삼항연산자
		 * 
		 * 조건식 ? 식1 : 식2
		 *  
		 *  식의 최종결과는 언제나 boolean
		 *  연산자가 온다면 비교연산자, 논리연산자
		 *   
		 */
		int i = 5;
		
		//String result = i % 2 ==0 ? "짝수" : "홀수"
		System.out.println(i % 2 == 0 ? "짝수" : "홀수");
		// if 보다 짧은 형태
		
		
		int result2 = i > 0 ? 6 : i == 0 ? 0 : -1 ; //조건식이 true면 식1을 출력, false면 식2를 출력
													//i>0가 true면 1을 출력,false면 i를 출력 
//		int result3 = i > 0 ? 1 : (i==0 ? 0 : -1);
		System.out.println(result2);
		
		
		// 대입연산자 = op=
		// 대입연산자는 연산자들중에서 가장 낮은 우선순위, 오-왼 진행방향 
		/*
		 * 복합대입연산자 op=
		 * --> 다른 연산자(op)와 결합하여 사용
		 * 
		 */
		
		int i3 = 4;
		System.out.println(i3 += 5);
		System.out.println(i3 -= 5);
		System.out.println(i3 *= 5);
		System.out.println(i3 /= 5);
		System.out.println(i3 += 1);
		System.out.println(i3++);
		System.out.println(i3);
		
		String str = "ABCD";
		str += "가나다라";
		str += "1234";
		System.out.println(str);
				
				
	}
}
