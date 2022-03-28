package a220129_220202;

public class ArrayExByString {
	public static void main(String[] args) {
	System.out.println("=== String 배열 ===");
		String[] names = {"kim", "Park", "Yi"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("names["+i+"]:" + names[i]);
		}
		
		String tmp = names[2];
		System.out.println("tmp :" + tmp);
		names[0] = "Yu";
		
		for (String str : names)
			System.out.println(str);
		
	System.out.println("=== 2진수로 변환 ===");
		char[] hex = {'C', 'A', 'F', 'E'};
		String[] binary = { "0000", "0001", "0010", "0011",
							"0100", "0101", "0110", "0111",
							"1000", "1001", "1010", "1011",
							"1100", "1101", "1110", "1111"};
		
		String result = "";
		
		for (int i = 0; i < hex.length; i++) {
			if(hex[i] >= '0' && hex[i] <= '9') {
				result += binary[hex[i]-'0'];
			} else {
				result += binary[hex[i]-'A'+10];
			}
		}
		System.out.println("hex :" + new String(hex));
		System.out.println("binary :" + result);
		
	System.out.println("=== char배열과 String클래스의 변환 ===");
		String src = "ABCDE";
		
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			System.out.println("src.charAt("+i+"):" + ch);
		}
			
		//String을 char[]로 변환
		char[] chArr = src.toCharArray();
		
		//char배열(char[])을 출력
		System.out.println(chArr);
		
	System.out.println("=== char배열과 String클래스의 변환 2 ===");
		String source = "SOSHELP";
		String[] morse = {".-", "-...", "-.-", "-..", ".",
						"..-.", "--.", "....", "..", ".---",
						"-.-", ".-..", "--", "-.", "---", ".--.",
						"--.-", ".-.", "-.", "---", ".--.", "--.-",
						".-.", "...", "-", "..-", "...-", ".--", "-..-",
						"-.--", "--.." };
		String result1 = "";
		
		for (int i = 0; i < source.length(); i++) {
			result1 += morse[source.charAt(i)-'A'];
		}
		System.out.println("source : " + source);
		System.out.println("morse : " + result);

	System.out.println("=== 커맨드 라인을 통해 입력받기 ===");
		System.out.println("매개변수의 개수 : " + args.length);
		for (int i = 0; i < args.length; i++) {	
			System.out.println("args [" + i + "] = \"" + args[i] + "\"");
		}
	
	System.out.println("=== 커맨드 라인을 통해 입력받기 ===");
		if (args.length != 3 ) {
			System.out.println("usage : java ArrayEx17 NUM1 OP NUM2");
			System.exit(0);
		}
		int num1 = Integer.parseInt(args[0]);
		char op = args[1].charAt(0);
		int num2 = Integer.parseInt(args[2]);
		int result2 = 0;
		
		switch (op) {
		case '+' :
			result2 = num1 + num2;
			break;
		case '-' :
			result2 = num1 - num2;
			break;
		case 'x' :
			result2 = num1 * num2;
			break;
		case '/' :
			result2 = num1 / num2;
			break;
		default:
			System.out.println("지원되지 않는 연산입니다");
		}
		System.out.println("결과:" + result2);
	}
}
