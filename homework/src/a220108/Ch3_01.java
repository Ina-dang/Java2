package a220108;

public class Ch3_01 {
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A';
		
		System.out.println(1 + x <<33);
		System.out.println(y >= 5 || x < 0 && x > 2);
		System.out.println(y += 10 - x++);
		System.out.println(x+=2);
		System.out.println(!('A' <= c && c <= 'Z'));
		System.out.println('C'-c);
		System.out.println('5'-'0');
//		System.out.println(c+1);//산술연산이라 별도의 casting없이는 int타입으로 나옴
		System.out.println(c); 
		System.out.println(++c);
		System.out.println(c++); 
		System.out.println(c); 
	}
}
