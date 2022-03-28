package a220117;

public class Student {
	//학생 데이터(필드; 멤버변수)
	String stuNum;
	String name;
	int kor;
	int eng;
	int math;
	
	//메서드
	int sum = kor + eng + math;
	float avr = (int)(sum * 100 + 0.5)/100f ; //소수정 둘째자리까지

}
 //클래스 잘되나 확인하려면 여따 메인메서드 만들어서 확인해봐두 됨