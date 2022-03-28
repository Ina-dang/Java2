package a220110;

public class Switch {
/*
 * switch 단점
 * 1. 동등비교연산자만 가능 (==)
 * 
 * 범위연산 없을 때 하는게 젤 좋다
 * 스위치도 중첩가능함
 * 
 * switch 순서
 * 1. 조건식을 계산한다
 * 2. 조건식의 결과와 일치하는 case문으로 이동한다
 * 3. 이후의 문장들을 수행한다
 * 4. break문이나 switch문의 끝을 만나면 switch문 전체를 빠져나간다
 */
	public static void main(String[] args) {
		int val = 1;
		switch (val) { //key에는 변수
		case 1:    //value에는 실제 값
			System.out.println("case 1");
			break;
		case 2:    
			System.out.println("case 2");
			break; //break 없으면 계속 나옴
		case 3:    
			System.out.println("case 3");
			break;
		default:  //default 없으면 외의 값 출력시 아무것도 안뜸
			System.out.println("case 4");
			break;
		}
		
		int grant = 1;
		switch (grant) {
		case 7:
			System.out.println("작성 권한 취득");
			break;
		case 5:
			System.out.println("실행 권한 취득");
			break;
		case 4:
			System.out.println("읽기 권한 취득");
			break;
		default:
			System.out.println("권한 없음");
			break;
		}
	}
}
