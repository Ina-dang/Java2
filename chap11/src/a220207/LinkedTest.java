package a220207;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class LinkedTest {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		LinkedList<String> strings = new LinkedList<String>();
		
		strings.add("1길동");
		strings.add("2길동");
		strings.add("3길동");
		
		System.out.println(strings);
		
		System.out.println(strings.get(1));

		System.out.println(strings.remove(1));
		
		System.out.println(strings);
		
		System.out.println(strings.set(1, "4길동"));
		
		System.out.println(strings);
		
		// Stack, Queue
		
		Stack<String> stack = new Stack<String>();
		// 추가(add도되지만 push()사용) 삭제 (pop())
		System.out.println(stack.push("가"));
		stack.push("나");
		stack.push("다");
		
		System.out.println("stack >> " + stack);
		System.out.println("stack >> " + stack.pop());
		System.out.println("stack >> " + stack.pop());
		System.out.println("stack >> " + stack.pop());
		System.out.println("stack >> " + stack);
		
		
		Queue<String> queue = new LinkedList<String>();
		//Queue 인터페이스가 LinkedList에 의해 구현되었다
		// 추가 offer() 삭제 poll()
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		
		System.out.println("queue >> " +  queue);
		System.out.println("queue >> " +  queue.poll());
		System.out.println("queue >> " +  queue.poll());
		System.out.println("queue >> " +  queue.poll());
		System.out.println("queue >> " +  queue);
	}
}
