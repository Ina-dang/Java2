package a220415;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RambdaTest {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Target());
		Thread thread2 = new Thread(new Target());
		
		thread1.start();
		thread2.start();
		System.out.println("end of main");
		
		Runnable runnable1 = new Target();
		Runnable runnable2 = new Runnable() {
			public void run() {
				System.out.println("runrun2");
			}
		};
		Runnable runnable3 = () -> {
			System.out.println("runrun3");
		};
		Runnable runnable4 = () -> System.out.println("runrun4"); //수식
		
		runnable2.run();
		runnable3.run();
		runnable4.run();
		
		Comparator<Integer> c = (o1, o2) -> o2 - o1;
		List<Integer> list = Arrays.asList(new Integer[] {5, 10, 2, 3, 6});
		list.sort((o1, o2) -> o2 - o1);
		System.out.println(list);
		
		
	}
}

class Target implements Runnable {

	@Override
	public void run() {
		for(int i = 0 ; i < 5 ; i ++) {
			System.out.println(Thread.currentThread().getName());
		}
		
	}
	
}