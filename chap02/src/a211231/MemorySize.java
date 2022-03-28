package a211231;

public class MemorySize {
	public static void main(String[] args) {
		// 1000 = 10^3 → 사람이 생각
		// 1024 = 2^10 → 컴퓨터가 해석
		
		// long 타입은 뒤에 L 붙여줘야함
		long size = 23_617_085_440L;
		
		double humanUnit = 1000;
		double comUnit = 1024;
		
		System.out.println(size / humanUnit / humanUnit / humanUnit + "GB");
		System.out.println(size / comUnit / comUnit / comUnit + "GB");
		
	}
}
