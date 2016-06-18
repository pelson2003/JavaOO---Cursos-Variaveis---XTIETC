package Demo7;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
class Process implements Runnable {
	private int id;
	public Process(int id) throws InterruptedException {
		this.id = id;
		System.out.println("Starting: " + id);
		Thread.sleep(5000);
		System.out.println("Completed: " + id);
	}
	public void run() {
		System.out.println();
	}
}
public class App {
	public static void main(String[] args) throws InterruptedException {
		// ThreadPool
		ExecutorService executor = Executors.newFixedThreadPool(2);
		for (int i = 0; i < 5; i++) {
			executor.submit(new Process(i));
		}
		executor.shutdown();
		System.out.println("All Submitted");
		executor.awaitTermination(1, TimeUnit.DAYS);
		System.out.println("All completed");
	}
}
