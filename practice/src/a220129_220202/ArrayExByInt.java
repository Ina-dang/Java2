package a220129_220202;

import java.util.Arrays;

public class ArrayExByInt {
	public static void main(String[] args) {
	System.out.println("=====배열 값 넣기=========");
//		int[] arr = new int[5];
		int[] arr = {10, 20, 30, 40, 50};
		int tmp = arr.length;
		
		System.out.println(tmp);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
			
	System.out.println("=======각 인덱스에 여러 값 넣기========");
			
		String[] arr1 = new String[5]; //이게 테이블 각각주문
		arr1[0] = "50, 40, 30"; // -> 스트링이랑 수량이 같이 안되자놔..
		arr1[1] = "40";
		arr1[2] = "30";
		arr1[3] = "20, 23, 25";
		arr1[4] = "10";

		for (int j = 0; j < arr1.length; j++) {
			System.out.println(arr1[j]);
		}
		
		Arrays.sort(arr1);
		System.out.println(arr1);//주소값
		System.out.println(Arrays.toString(arr1)); //==>50,40은 앞만 정렬해주네에
		
	System.out.println("=======sort정렬===============");
		
		int[] arr2 = {15, 12, 23, 49, 7};
		Arrays.sort(arr2);
		
		System.out.println(Arrays.toString(arr2));
		
	System.out.println("===for 배열복사===");
		
		int[] arr3 = new int[2];
		int[] tmp3 = new int[arr3.length*2]; //길이 두배인 배열 생성
		
		
		for (int i = 0; i < tmp3.length; i++) {
			System.out.println(Arrays.toString(tmp3));
		}
	
	System.out.println("===arraycopy 배열복사===");
		int[] arr4 = {3,4,5,6,7};
		int[] tmp4 = new int[arr4.length*2];
		
		System.arraycopy(arr4, 0, tmp4, 0, arr4.length);
//			System.arraycopy(arr4, 0, tmp4, 3, arr4.length); //덮어써짐
		System.out.println(Arrays.toString(tmp4));
		
	System.out.println("===총합과 평균 sum & avg===");
		int sum = 0;
		float average = 0f;
		
		int[] score = {100, 88, 24, 50, 90};
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		average = sum / (float)score.length; //계산결과를 float로 얻기위해 형변환
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
		
	System.out.println("=== 최대값 과 최소값 ===");
		int[] score1 = {79, 88, 91, 33, 100, 55, 96};
		 
		int max = score1[0];
		int min = score1[0];
		
		for (int i = 0; i < score1.length; i++) {
			if (score1[i] > max) {
				max = score1[i];
			} else if (score1[i] < min) {
				min = score1[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	System.out.println("===셔플(shuffle) 섞기===");
		int[] numArr = new int[10];
		
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i;
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for (int k = 0; k < 100; k++) {	
			int n = (int)(Math.random() * 10);
			int tmp1 = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp1;
		}
		for (int k = 0; k < numArr.length; k++) {
			System.out.print(numArr[k]);
		}
		
	System.out.println("===배열 셔플(shuffle) ===");
		int[] ball = new int[45];
		
		for (int k = 0; k < ball.length; k++) 
			ball[k] = k + 1 ;
			
		int temp = 0;
		int j = 0 ;
		
		for (int k = 0; k < 6; k++) {
			j = (int)(Math.random() * 45);
			temp = ball[k];
			ball[k] = ball[j];
			ball[j] = temp;
		}
		for (int k = 0; k < 6; k++) {
			System.out.printf("ball[%s]=%s%n", k, ball[k]);
		}
		
	System.out.println("===임의의 값으로 배열 채우기===");
		int[] code = { -4, -1, 3, 6, 11};
		int[] arr5 = new int[10];
		
		for (int i = 0; i < arr5.length; i++) {
			int tmp2 = (int)(Math.random() * code.length);
			arr5[i] = code[tmp2];
		}
		System.out.println(Arrays.toString(arr5));
	
	System.out.println("=== 배열 정렬 bubble sort 끝 ===");
		int[] numArr1 = new int[10];
		
		for (int i = 0; i < numArr1.length; i++) {
			System.out.print(numArr1[i] = (int)(Math.random() * 10));
		}
		System.out.println();
		
		for (int i = 0; i < numArr1.length - 1 ; i++) {
			boolean changed = false;
			
			for (int k = 0; k < numArr1.length - 1 -i; k++) {
				if(numArr1[k] > numArr1[k + 1]);{
					int temp1 = numArr1[k];
					numArr1[k] = numArr1[k + 1];
					numArr1[k + 1] = temp1;
					changed = true;
				}
		}
		if(!changed) break;
		
		for (int m = 0; m < numArr1.length; m++) {
			System.out.print(numArr1[m]);
		}	 
		System.out.println();
	}
	
	System.out.println("=== 빈도수 찾기 ===");
		int[] numArr2 = new int [10];
		int[] counter = new int[10];
		
		for (int i = 0; i < numArr2.length; i++) {
			numArr2[i] = (int)(Math.random() * 10);
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for (int i = 0; i <	numArr2.length; i++) {
			counter[numArr2[i]]++;
		}
		for (int i = 0; i < numArr2.length; i++) {
			System.out.println( i + "의 개수 :" + counter[i]);
		}
	}// main 메서드 끝
}// 클래스 끝
