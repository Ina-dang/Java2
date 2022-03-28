package a220107;

public class FlowEx1 {
	public static void main(String[] args) {
		int x = 0;
		System.out.printf("x=%d 일 때, 참인 것은%n", x);
		
		if(x==0) System.out.println("x==0"); // 0 true
		if(x!=0) System.out.println("x!=0"); //   false
		if(!(x==0)) System.out.println("!(x==0)"); // false
		if(!(x!=0)) System.out.println("!(x!=0)"); // true
		
		x = ( x==0 ) ? x : 3 ;
		System.out.println(x);
		
		x = 1;
		System.out.printf("x=%d 일 때, 참인 것은%n", x);
		
		if(x==0) System.out.println("x==0"); // 1 false
		if(x!=0) System.out.println("x!=0"); //   true
		if(!(x==0)) System.out.println("!(x==0)"); // true
		if(!(x!=0)) System.out.println("!(x!=0)"); // false
		
		x = 10;
		System.out.printf("x=%d 일 때, 참인 것은%n", x);
		
		if(x>=0 || x<=12) {
			System.out.println("0입니다"); 
			System.out.print("이상입니다\n"); 
			System.out.printf("%d%s%d %n %s %n%d%s%d", 11,"        ",11," 추카포카",11,"        ",11); 
		}
	}
}
