package a220103;

public class StringEx {
	public static void main(String[] args) {
		String name = "Ja" + "va";
		String str = name + 8.0;
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + "" );
		System.out.println("" + 7 + 7);
		
		System.out.println(str + "버전");
		
		// -------------------------
		System.out.println(7 + "7");
		System.out.println(7 + '7'); //'7'은 ASCII로 인식돼서 55로 해석
		
		
	}
}
