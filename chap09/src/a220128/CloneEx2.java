package a220128;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.ToString;

public class CloneEx2 {
	public static void main(String[] args){
		
		//밑에 캐치트라이 처리 후 
		Target1 t1 = new Target1(1, 2);
		Target1 t2 = (Target1)t1.clone(); //덮어주고 throws
		
		System.out.println(t1);
		System.out.println(t2);
		
		t1.x = 10;//주소값이 다르기때문에 복제 후 값바꾸면 t1만 바뀜
		System.out.println(t1);
		System.out.println(t2);
		//주석시켰던거 다시 가져왔음
		
		
		int[] arr1 = {1,2,3};
		int[] arr2 = arr1;
		int[] arr3 = arr1.clone();

		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		arr1[0] = 20;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2)); //단순복사
		System.out.println(Arrays.toString(arr3)); //클론
		
	}
}

@AllArgsConstructor
@ToString
class Target1 implements Cloneable{ //클론가능한 인터페이스 넣어줌
	int x;
	int y;
	//오버라이딩 해야함
	@Override //public으로 바꿔줘야함
//	public Object clone() throws CloneNotSupportedException {
	public Target1 clone() { //여기서 타겟하면 아까 Ex1처럼 line 11에 캐스팅 할 필요가 없다
		Target1 obj = null; //3.지역변수라 초기화 해줘야함
		try {//2. 트라이캐치 해줘야함
			obj = (Target1)super.clone();//1.분리하자 여기서캐스팅
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} 
		return obj;//0.예외처리하자
	
	}
	
	
}
