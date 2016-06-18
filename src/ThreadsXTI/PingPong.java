package ThreadsXTI;
public class PingPong extends Thread {

	String palavra;
	long tempo;

	public PingPong(String palavra, long tempo) {
		this.palavra = palavra;
		this.tempo = tempo;
	}

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
		// Criação de 2 Threads com NEW e pede para a java machine iniciar as
		// threads
		// A JAVA Machine chama o método run internamente
		new PingPong("ping", 1500).start();
		new PingPong("pong", 2000).start();
	}
}
