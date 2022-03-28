package a220117;

// f(x)

// 1. y = f(x)
// x : 정의역(입력) y : 치역(출력)


public class Mathod { //메서드
	// 특정 작업을 수행하는 일련의 문장들을 하나로 묶은 것
	public static void main(String[] args) {
		
	double y = Math.sqrt(4); //입력값도 출력값도 있어야하는 메서드
	//    입             출
	System.out.println(y);
	
	y = f(10);
	System.out.println(y);
	}
	
	static int f(int i) { // 선언부
		return i * i;
	}
	
	
	
	// 메서드 선언
	
	/*
	 * 메서드는 크게 선언부와 구현부로 이루어져있다.
	 * 
	 */ 
	
	  int add (int x, int y) { //연산자 우선순위를 위한 괄호() 가 아닌경우 대부분 메서드호출
		  int result = x+y;
		  return result; //메서드 호출한 곳으로 값을 가진 후 다시 돌아감
		  
		  
	  
//		  Math.abs(x);
//		  "".substring(beginIndex, endIndex); 1 개값만 적으면 비긴인덱스 두개적으먄 비긴 엔드
		  
	  }        // 매서드는 변수선언과 달리 두 변수의 타입이 같아도 변수의 타입 생략 불가(int x,y)안됨
	   
	  
	  
	 /* 
	 * int : 반환타입(출력)
	 * add : 메서드이름
	 * ()  : 매개변수선언(입력)
	 */ 
	 
	  int add; // ==> 이거는 변수선언임
	 
	
}