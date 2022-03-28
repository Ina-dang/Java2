package a220113;

public class ArrayEx3 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1; //값을 1,2,3,4,5로 초기화
		}	
			System.out.println("[변경전]");
			System.out.println("arr.length:" + arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"]:" + arr[i]);
			//여기까지하면 arr[4]:5까지 출력
		}
		
		int[] tmp = new int[arr.length*2]; //임시 배열 -> 기존배열 *2 생성
		
		for (int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i]; //가져온 값 한번 순환
		}
		arr = tmp; //tmp에 저장된 값을 arr에 저장한다. (덮어씀)
	
		System.out.println("[변경후]");
		System.out.println("arr.length:" + arr.length); //arr을 호출했지만 주소가 tmp로 되어있으므로 10칸이 나온다
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"]:" + arr[i]);
		}
		//한번 더 할때는 int 값 선언 안함. 중복선언 오류뜸
			tmp = new int[arr.length*2]; //임시 배열 -> 기존배열 *2 생성
		
		for (int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i]; //가져온 값 한번 순환
		}
		arr = tmp; //tmp에 저장된 값을 arr에 저장한다. (덮어씀)
		
		System.out.println("[변경후]");
		System.out.println("arr.length:" + arr.length); //arr을 호출했지만 주소가 tmp로 되어있으므로 10칸이 나온다
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"]:" + arr[i]);
		}
		
		System.out.println("==============");
		//배열의 복사 for문을 arraycopy()로 바꿔보자
//		System.arraycopy(src, srcPos, dest, destPos, length);;
		/*
		 * src     : 소스 (원시) . 원본파일
		 * srcPos  : 소스포지션
		 * dest    : 타겟. 대상. 도착지
		 * destPos : 도착위치
		 * length  : 길이
		 */
		
		tmp = new int[arr.length*2]; //임시 배열 -> 기존배열 *2 생성
		
		for (int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i]; //가져온 값 한번 순환
		}
		arr = tmp; //tmp에 저장된 값을 arr에 저장한다. (덮어씀)
		
		System.out.println("[변경후]");
		System.out.println("arr.length:" + arr.length); //arr을 호출했지만 주소가 tmp로 되어있으므로 10칸이 나온다
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"]:" + arr[i]);
		}
		
	}
}
