package a220113;

public class Ch5_03 {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50}; //5개의 int 값을 저장할수 있는 int타입 배열 arr
		int sum = 0;
//			  초기화	조건식			증감식
		for (int i = 0; i < arr.length; i++) { //0부터 arr.length까지 1씩증가
			sum += arr[i]; //sum = sum + arr[i];
//			System.out.println(arr[i]);
		}
		
		System.out.println("sum=" + sum);
	}
}
