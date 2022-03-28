package a220203;

public class KeyboardToStringEx {
	public static void main(String[] args) throws Exception {
		
		byte[] bytes = new byte[100];
		
		System.out.print("입력 : ");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes, 0, readByteNo-2); //enter
		System.out.println(str);
	}
}
