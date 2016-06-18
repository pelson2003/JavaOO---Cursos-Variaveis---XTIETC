package ThreadsXTI;
public class InterfaceRunnable implements Runnable{

	String palavra;
	long tempo;

	public InterfaceRunnable(String palavra, long tempo) {
		this.palavra = palavra;
		this.tempo = tempo;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(palavra);
				// Colocamos a thread para esperar x tempo
				Thread.sleep(tempo);
			}
		} catch (InterruptedException e) {
			return;
		}
	}

	public static void main(String[] args) {
		
		//Criação de 2 objetos Runnable
		Runnable ping= new InterfaceRunnable("ping", 1500);
		Runnable pong = new InterfaceRunnable("pong", 2000);
		
		//Criando 2 threads e inciando as mesmas
		new Thread(ping, "ping").start();
		new Thread(pong, "pong").start();
		
		System.out.println("ver threads");
	}
}
