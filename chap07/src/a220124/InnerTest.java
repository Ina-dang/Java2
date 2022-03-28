package a220124;

import java.util.Arrays;
import java.util.Comparator;

public class InnerTest {
	public static void main(String[] args) {
		// 인스턴스 클래스
		// static 클래스
		// 지역 클래스
		// 익명 클래스
		
		//지역클래스
		class Local {
			
		}
		// 인스턴스 변수는 인스턴스를 생성해야한다
		Inner inner = new InnerTest().new Inner(); //이런식으로
		Outer.Inner inner2 = new Outer().new Inner(); 
		Outer.Sinner inSinner = new Outer.Sinner(); //Outer.Sinner가 클ㄽ
		
		//정렬
		Integer[] arr = {3, 5, 2, 1, 4};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 - o1;
			}		
		});
		System.out.println(Arrays.toString(arr));
	} 
	
	
	int i;
//	얘네 주석처리하면 Inner ineer =어쩌구 오류뜸 == 다른 클래스일때는 접근 어려움
//		Outer.Inner inner2 = new Outer().new Inner(); 로 해야됨

	//인스턴스클래스
	class Inner {
		//InterTest클래스밑에 선언부 임
		
	}
	
	//static 클래스
	static class Sinner {
		
	}
	
}

class Outer {
//인스턴스클래스
	class Inner {
		//InterTest클래스밑에 선언부 임
		
	}
	
//static 클래스
	static class Sinner {
		
	}
	
}
