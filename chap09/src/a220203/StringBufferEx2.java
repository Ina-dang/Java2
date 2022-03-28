package a220203;

public class StringBufferEx2 {
	public static void main(String[] args) {
		//성능 테스트
		String str = new String();
		
		long start = 0;
		long end = 0;
		
//		start = System.currentTimeMillis(); //현재시간 long으로 반환
//		
//		for (int i = 0; i < 100000; i++) {
//			str += "0";			
//		}
//		
//		end = System.currentTimeMillis();
//		
//		System.out.println(end - start + "ms");
		
//		StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder();
		
		start = System.currentTimeMillis(); //현재시간 long으로 반환
		
		for (int i = 0; i < 100000000; i++) {
//			str += "0";	
			sb.append("0");
		}
		
		end = System.currentTimeMillis();
		
		System.out.println(end - start + "ms");
		
	}
}
