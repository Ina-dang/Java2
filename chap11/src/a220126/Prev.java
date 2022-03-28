package a220126;

import java.util.ArrayList;

public class Prev {
	public static void main(String[] args) {
		//문자열을 하나만 쓰면 문자열을 쓰겠지만 문자열이 여러개면 지금은 배열을 썻지
//		String str = "abcd";
//		String[] strings = new String[10]; //이런식으로
		//그런데 배열단점. 길이가 제한되어 있다. 10칸이상하려면 수작업으로 배열로 늘여야함
		
		//그래서 대안
		//ArrayList<E> 꺽쇠안이 제너릭이라부르는데 위치 부름쓰
//		ArrayList<String> //난스트링타입을 쓰는 어레이리스트를 만들거야
		
		
		
		ArrayList<String> list = new ArrayList<String>();
//		strings[0] = list; //이렇게 배열은 특정 인덱스 값에 값을 넣어줬었는데 어레이리슽트는
//		list.set(0, str);//이렇게 set&that하면되는데 잘 안씀. 왜냐면 아웃오브바운드익셉션뜸
		
//		System.out.println(strings.length); //배열 알아보기위할때 
//		System.out.println(list.size()); // 배열은 처음엔 하나도 없다고 뜸
//		list.set(0, str);//이렇게 set&that하면되는데 잘 안씀. 왜냐면 아웃오브바운드익셉션뜸
//		list.add(str); //그래서 이렇게 넣어줘야함
//		System.out.println(list.size()); // 위에 하나추가했으니까 이제 1이라고뜸
		
		//그래서 이렇게 넣어줘야함
		list.add("가"); 
		list.add("나"); 
		list.add("다"); 
		list.add("라"); 
		
		System.out.println(list.size()); 
		System.out.println(list);
		
		//배열특정번째
//		System.out.println(strings[0]);
		//이거는
		System.out.println(list.get(0));
		
		list.set(2, "a"); //대치
		System.out.println(list);
		
		list.remove(2); //지우고 땡겨오기
		System.out.println(list);
		
		
		//순차형 어레이리스트
		//비순차형 잉크드? 링크드?
	}
}
