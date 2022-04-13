package a220411;

import java.util.ArrayList;
import java.util.List;

public class GeneTest {
	public static void main(String[] args) {
		Box1 box1 = new Box1();
		box1.setItem(1);
		
		//오브젝트타입을 인트로 하려해서 오류뜸
//		int result = box1.getItem(); 
		int result = (int) box1.getItem(); //형변환 
		System.out.println(result);
		
		box1.setItem("홍길동");
		String str = (String) box1.getItem();
		System.out.println(str);
		
		box1.setItem(box1);
		System.out.println(((Box1) ((Box1) ((Box1) box1.getItem()).getItem()).getItem()).getItem());
		
		//box2
		Box2<String> box2 = new Box2<>();
		box2.setItem("고길동"); //파라미터 스트링으로 고정됨
//		String str2 = box2.getItem();
//		box2.setItem(10+"");
//		result = Integer.parseInt(box2.getItem());
//		System.out.println(result);
		
		Box2<Object> box22 = new Box2<>();
		Box2 box23 = new Box2();
		Box2<?> box24 = new Box2<>();
//		box24.setItem();
		
		List<String> list = new ArrayList<String>();
		list.add("가");
		list.add("나");
		list.add("다");
		
		List<?> list2 = new ArrayList<>(list);
		//이건 add 안됨
//		list2.add("가");
		//읽기는 됨
		list2.forEach(System.out::println);
	}
}

class Box1 {
	private Object item;

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
}

class Box2<T>{
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}