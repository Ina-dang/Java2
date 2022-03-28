package exception;
//익셉션을 상속받는 범위익셉션
public class RangeException extends RuntimeException{
	private int start;
	private int end;
	
	public RangeException() {}

	public RangeException(int start, int end) {
		super(String.format("값의 범위를 %d ~ %d로 지정하세요", start, end));
		this.start = start;
		this.end = end;
		
	} 

}

