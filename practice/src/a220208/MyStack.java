package a220208;

import java.util.EmptyStackException;
import java.util.Vector;

//컬렉션 프레임 웍
public class MyStack extends Vector<Object>{
	public Object push(Object item) {
		addElement(item);
		return item;
		
	}

	
	public Object pop() {
		Object object = peek();
		removeElementAt(size() - 1);
		return object;
	}
	
	public Object peek() {
		int len = size();
		
		if (len == 0) {
			throw new EmptyStackException();
		}
		return elementAt(len - 1);
	}
	
	public boolean empty() {
		return size() == 0;
	}
	
	public int search(Object o) {		
		int i = lastIndexOf(o);
				
		if (i >= 0) {
			return size() - i;
		}
		return - 1;
	} 
}



