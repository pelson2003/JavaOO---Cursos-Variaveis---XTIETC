package Demo6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {
	private Object lock1 = new Object();
	private Object lock2 = new Object();
	private Random random = new Random();
	public List<Integer> list1 = new ArrayList<Integer>();
	public List<Integer> list2 = new ArrayList<Integer>();

	public void stageOne() throws InterruptedException {
		synchronized (lock1) {
			Thread.sleep(1);
			list1.add(random.nextInt(100));
		}
	}

	public void stageTwo() throws InterruptedException {
		synchronized (lock2) {
			Thread.sleep(1);
			list1.add(random.nextInt(100));
		}
		;
	}

	public void process() throws InterruptedException {
		for (int i = 0; i < 100; i++) {
			stageOne();
			stageTwo();
		}
	}

	public void main() throws InterruptedException {
		System.out.println("Staring.....");
		long start = System.currentTimeMillis();

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					process();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				try {
					process();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		long end = System.currentTimeMillis();
		System.out.println("Time Take: " + (end - start));
		System.out.println("List1: " + list1.size() + " List2: " + list2.size());
	}

}
