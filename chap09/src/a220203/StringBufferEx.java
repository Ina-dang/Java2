package a220203;

public class StringBufferEx {
	public static void main(String[] args) {
		String str = "a";
		str += "b";
		str += "c";
		str += "d";
		str += "e";
//		str.concat("f");
		str = str.concat("f");
		
		System.out.println(str); //abcde
		
		StringBuffer sb = new StringBuffer("a");
		sb.append("b").append("c").append("d").append("e"); // method chaining
		sb.append("f");
		System.out.println(sb);
		
		System.out.println(str.equals(sb.toString()));
		
	}
}
