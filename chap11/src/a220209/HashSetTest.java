package a220209;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		Set<Addr> addrs = new HashSet<Addr>();
		
		String str = new String("고길동");
		Addr addr = new Addr(1, "고길동");
		Addr addr2 = new Addr(1, "고길동");

		
		addrs.add(addr);
		addrs.add(addr2);
		addrs.add(new Addr(2, "김길동"));
		
		addrs.forEach(System.out::println); //한 줄씩 출력
	}
}

class Addr {
	int no;
	String name;
	public Addr(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	
	
	@Override
	public int hashCode() { //no는 wrapper했을때 어차피 1 은 1이라 그대로 no 사용
//		return (no + name).hashCode(); ==> 이렇게도 사용가능 하지만 조금 불안함 
		return no + name.hashCode();
	}



	@Override
	public boolean equals(Object obj) {

		Addr a = (Addr)obj;
		System.out.println(a.name);
		return 
				obj != null && //null이 아니어야하고
				obj instanceof Addr && //Addr타입이어야하고
				no == ((Addr)obj).no && //비교대상이랑 no값이 같아야하고 
				name.equals(((Addr)obj).name); //비교대상이랑 name 값이 같아야한다
	}

	@Override
	public String toString() { //이거없으면 참조형 주소만 나옴 ㅠ
		return String.format("Addr [no=%s, name=%s]", no, name);
	}
}
