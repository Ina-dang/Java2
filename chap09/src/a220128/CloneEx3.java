package a220128;

import lombok.AllArgsConstructor;
import lombok.ToString;

public class CloneEx3 {
	public static void main(String[] args){
		
		//밑에 캐치트라이 처리 후 
//		Target2 t1 = new Target1(1, 2);
		Target2 t1 = new Target2(1, 2, new int[] {5, 6, 7});
		Target2 t2 = (Target2)t1.clone(); //덮어주고 throws
		
		t1.x = 10;//주소값이 다르기때문에 복제 후 값바꾸면 t1만 바뀜
		t1.arr[0] = 50; //t1배열 0번째 인덱스 값 50으로
		System.out.println(t1);
		System.out.println(t2);
		//주석시켰던거 다시 가져왔음
		
		
//		int[] arr1 = {1,2,3};
//		int[] arr2 = arr1;
//		int[] arr3 = arr1.clone();
//
//		System.out.println(arr1);
//		System.out.println(arr2);
//		System.out.println(arr3);
//		System.out.println(Arrays.toString(arr1));
//		System.out.println(Arrays.toString(arr2));
//		System.out.println(Arrays.toString(arr3));
//		
//		arr1[0] = 20;
//		System.out.println(Arrays.toString(arr1));
//		System.out.println(Arrays.toString(arr2)); //단순복사
//		System.out.println(Arrays.toString(arr3)); //클론
		
		
	}
}

@AllArgsConstructor
@ToString
class Target2 implements Cloneable{ 
	int x;
	int y;
	int[] arr;

	@Override 
	public Target2 clone() { 
		Target2 obj = null; //3.지역변수라 초기화 해줘야함
		try {//2. 트라이캐치 해줘야함
			obj = (Target2)super.clone();//1.분리하자 여기서캐스팅
			obj.arr = arr.clone(); //##########깊은복사
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} 
		return obj;//0.예외처리하자
	}

	
	
}
