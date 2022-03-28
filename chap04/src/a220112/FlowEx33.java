package a220112;

public class FlowEx33 {
	public static void main(String[] args) {
		
		//for 문에 Loop1이라는 이름을 붙였다.
//		Loop1 : for(int i = 2; i <=9 ; i++) {
//				for(int j = 1; j <=9 ; j++) {
//					if (j == 5)
//						break Loop1;
////						break;
////						continue Loop1;
////						continue;
//					System.out.println(i + "*" + j + "=" + i*j);
//				} // end of for i
//				System.out.println();
//		} // end of the Loop1
		
//==================다른 출력 법=========================================		
		
		outer : 
			for(int i = 2; i <=9 ; i++) {
			for(int j = 1; j <=9 ; j++) {
				if (j == 5)
//					break;
//					break outer;
	//				continue;
					continue outer;
				System.out.printf("%d * %d = %d%n",i, j, i*j);
			} // end of for i
			System.out.println();
		} // end of the Loop1
	}
}
