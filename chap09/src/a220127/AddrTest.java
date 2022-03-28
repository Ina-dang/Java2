package a220127;

import java.util.HashMap;

public class AddrTest {
	public static void main(String[] args) {
		Addr a0 = new Addr(2, "3길덩", "영등포");
		Addr a1 = new Addr(1, "1길덩", "영등포");
		Addr a2 = new Addr(2, "2길덩", "당산");
		Addr a3 = new Addr(1, "1길덩", "영등포");
		Addr a4 = new Addr(1, "3길덩", "영등포");
		
		
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2)); //false (불린타입으로나옴) 주소값이 다름
		System.out.println(a1.equals(a3)); //이퀄스 오버라이딩 함
		System.out.println(a1);
		System.out.println(a2);
		
		//무엇이 겹치면 같은걸로 할꺼냐 (이퀄스 오버라이딩)
//		System.out.println("abcd".equals(null));
		System.out.println("abcd".equals(a3));
		
		// ArrayList, HashMap
//		List > 순번통해 값 관리 > 인덱스 배열
//		Map  > 키를통해 값 관리
		
//		TreeMap<String, String> map = new TreeMap<String, String>();
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("가", "abcd");
		map.put("나", "1234");
		map.put("kor", "100");
		map.put("eng", "90");
		System.out.println(map);
		
		System.out.println(map.get("kor")); //이거 장바구니 주문내역으로 쓸 수 있으려나
		
		/*
		 * 해시 사용
		 * 
		 * 출생연도
		 * 
		 * 83 >> 0x100
		 * 93 94 >> 0x200
		 * 00 01 >> 0x300
		 * 
		 * f(94) >> 0x200
		 * 
		 * 너무 정교하면 빈공간이많이생기고
		 * 너무 느슨하면 다시 해시 들어가야함
		 * 
		 * 적절한 정도 찾기가 어렵
		 */
		
		System.out.println(a0);
		System.out.println(a1);
		System.out.println(a1.hashCode());
		System.out.println(String.format("%x", a1.hashCode()));
	}
}


class Addr { //address
	int no;
	String name;
	String addr;
	
	public Addr(int no, String name, String addr) {
		super();
		this.no = no;
		this.name = name;
		this.addr = addr;
	}

	@Override
	public boolean equals(Object obj) {
//		return no == ((Addr)obj).no ; 
//		return no == ((Addr)obj).no && name.equals(((Addr)obj).name); 
//		return obj != null && no == ((Addr)obj).no && name.equals(((Addr)obj).name); 
		return obj != null && obj instanceof Addr && no == ((Addr)obj).no && name.equals(((Addr)obj).name);
//		널체크 하고 인스턴스여부뭍고 그다음에 값체크 순서
	}
	
	
}
