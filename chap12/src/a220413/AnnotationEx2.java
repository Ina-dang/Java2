package a220413;

import java.util.Date;

class NewClass {
	int newField;
	public int getNewField() {
		return newField;
	}
	
	@Deprecated
	int oldField;
	
	@Deprecated
	int getOldField() {return oldField;}
}

public class AnnotationEx2{
	public static void main(String[] args) {
		NewClass nc = new NewClass();
		
		nc.oldField = 10;
		System.out.println(nc.getOldField());
		
		@SuppressWarnings("deprecation")
		Date date = new Date(122, 3, 13);
		System.out.println(date);
	}
}
