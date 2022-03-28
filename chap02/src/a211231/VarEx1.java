package a211231;

public class VarEx1 {
	public static void main(String[] args) {
		int year = 2022; //2022를 int year로 선언 후 저장
		int age = 30; // 30을 int(정수형) age로 선언 후 할당
		
		System.out.println(age);
		System.out.println(year);
		
		/*
		 * 연산자의 우선순위
		 * *+-/ '사칙연산자'라고 불리며 우선순위 중간
		 * = '대입연산자' 라고 불리며 우선순위 낮음
		 */
		
		year = age + 2000; //변수 age의 값에 2000을 더해서 변수 year에 저장
		age = age + 1; //변수 age에 저장된 값을 1증가시킨다.
				
		System.out.println(year);
		System.out.println(age);
		
		age = year + 3000;
		
		System.out.println(age);
		
		int a = 0;
		a = a + 3 * 2;
		System.out.println(a);		
	}
}
