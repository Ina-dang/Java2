package a220407;

public class ThreadSync {
	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		
		Worker worker = new Worker(counter);
		Worker worker1 = new Worker(counter);
		worker.start();
		worker1.start();
		worker.join();
		worker1.join();
		
		
		//일단 줘
		System.out.println(counter.count);
	}
}

class Worker extends Thread {
	Counter counter;

	public Worker(Counter counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		int i = 0;
		for (i = 0; i < 100000; i++) {
			counter.increase();
		}
		System.out.println(getName() + "의 i 값 :: " + i);
	}
}

class Counter {
	int count;
	void increase () {
		count++;
	}
}
