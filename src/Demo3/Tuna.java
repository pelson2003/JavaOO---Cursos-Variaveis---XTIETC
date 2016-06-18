package Demo3;
import java.util.Random;
public class Tuna implements Runnable {
	String name;
	int time;
	Random r = new Random();
	public Tuna(String x){
		name = x;
		// Na verdade ele escolhe um número randomico entre 0 e 999
		time = r.nextInt(999);		
	}
	public void run() {
		try{
			// \n pula linha e &s
			System.out.printf("%s us sleeping for %d\n", name, time);
			Thread.sleep(time);
			System.out.printf("%s is done\n", name);
		}catch(Exception e){	
		}	
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(new Tuna("Nelson Thread 1"));
		Thread t2 = new Thread(new Tuna("Nelson Thread 2"));
		Thread t3 = new Thread(new Tuna("Nelson Thread 3"));
		Thread t4 = new Thread(new Tuna("Nelson Thread 4"));
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}	
}
