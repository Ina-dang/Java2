package a220208;

import java.util.Arrays;
import java.util.Comparator;

public class ComTest {
	public static void main(String[] args) {
		
		String[] strs = {"가", "가a", "나", "ㅋ"};
		
		Arrays.sort(strs);
		
		System.out.println(strs);
		
		Addr[] addrs = {new Addr(3, "라"), new Addr(1, "가"), new Addr(2, "하")};
		System.out.println(Arrays.toString(addrs));
	
		Comparator<Addr> comparator = new Comparator<Addr>() {
			@Override
			public int compare(Addr o1, Addr o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}
		};
		
		Arrays.sort(addrs);
		Arrays.sort(addrs, comparator); //Comparator내에 있는 기준으로 정렬하겠다는 뜻
		System.out.println(Arrays.toString(addrs));
	}
}

class Addr implements Comparable<Addr>{
	int no;
	String name;
	double coords;
	public Addr(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	
	@Override
	public int compareTo(Addr o) {
		// TODO Auto-generated method stub
//		return no - o.no; //숫자 오름차순
//		return -(no - o.no); //숫자 내림차순 ==> 전체 부호를 거꾸로 바꾼다
//		return -name.compareTo(o.name);
//		return new Integer(no).compareTo(new Integer(o.no));
		return (int)(coords - o.coords);
	}

	@Override
	public String toString() {
		return "Addr [no=" + no + ", name=" + name + "]";
	}
}

class MyAddr extends Addr {

	public MyAddr(int no, String name) {
		super(no, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Addr o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	
	
}