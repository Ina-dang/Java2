package a220203;

import java.io.UnsupportedEncodingException;

public class StringGetBytesEx {
	public static void main(String[] args) {
		
		String str = "안녕하세요";
		
		byte[] bytes1 = str.getBytes();
		
		System.out.println("bytes2.length : " + bytes1.length);
		
		String str1 = new String(bytes1);
		System.out.println("bytes->String : " + str1);
		
		try {
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length : " + bytes3.length);
			String str3 = new String(bytes3, "EUC-KR");
			System.out.println(str3);
			System.out.println("bytes->String : " + str3);
			
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length : " + bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println(str2);
			System.out.println("bytes->String : " + str2);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
