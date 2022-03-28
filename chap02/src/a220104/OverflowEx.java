package a220104;

public class OverflowEx {
	public static void main(String[] args) {
		short sMin = -32768;
		short sMax = 32767;
		char cMin = 0;
		char cMax = 65535;
		
		System.out.println("==short 최소최대== (실수)");
		System.out.println("sMin   = " + sMin);
		System.out.println("sMin-1 = " + (short)(sMin-1));
		System.out.println("sMax   = " + sMax);
		System.out.println("sMax+1 = " + (short)(sMax+1));
		System.out.println("== char 최소최대== (정수)");
		System.out.println("Cmin   = " + (int)cMin);
		System.out.println("Cmin-1 = " + (int)--cMin);
		System.out.println("Cmax   = " + (int)cMax);
		System.out.println("Cmax+1 = " + (int)++cMax);

		System.out.println("=====================");
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE); //short 는 정수라 int 안적어도 되는데
		System.out.println((int)Character.MAX_VALUE); //char는 문자라 정수형변환 해줘야함
		System.out.println((int)Character.MIN_VALUE);
	}
}
