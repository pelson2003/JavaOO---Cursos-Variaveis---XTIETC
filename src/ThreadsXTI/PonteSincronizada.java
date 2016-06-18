package ThreadsXTI;
public class PonteSincronizada implements Ponte {

	private int valor = -1;
	private boolean ocupada = false;
	
	@Override
	public synchronized void set(int valor) throws InterruptedException {
		
		while(ocupada) {
			System.out.println("Ponte Cheia. Produtor deve aguardar");
			wait(); // Thread deve aguardar. Ponte Ocupada. Temos Produ��o.
		}
		
		System.out.println("Produtor Produziu: " + valor);
		this.valor = valor;
		
		ocupada = true;
		
		notifyAll(); // Notifica as threads que o status que define andamento ou n�o mudou 
	
	}

	@Override
	public synchronized int get() throws InterruptedException {	
		
		while(!ocupada){
			System.out.println("Ponte Vazia. Consumidor deve aguardar");
			wait(); // Thread deve aguardar. Ponte Ocupada. Temos Produ��o.
		}
		
		System.err.println("Consumidor consumiu: " + valor);
		
		ocupada = false;
		
		notifyAll(); // Notifica as threads que o status que define andamento ou n�o mudou 
		
		return valor;
	}
}
