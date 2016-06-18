package CollectionsXTI;
import java.util.LinkedList;
import java.util.Queue;
public class CollectionsQueue {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		fila.add("Ricardo");
		fila.add("Sandra");
		fila.offer("Beatriz");
		
		//Atrav�s do Queue
		System.out.println(fila.peek()); // Veja quem � o primeiro da fila
		System.out.println(fila.poll()); // Remove o primeiro elemento da fila
		
		//Atrav�s de LinkedList
		LinkedList<String> flinked = (LinkedList<String>) fila;
		flinked.addFirst("Caio");
		flinked.addLast("Juliana");
		flinked.peekFirst();
		flinked.peekLast();
		flinked.pollFirst();
		flinked.pollLast();	
	}
}
