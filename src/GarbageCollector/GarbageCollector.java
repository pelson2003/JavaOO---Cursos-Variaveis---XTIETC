package GarbageCollector;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollector {
	
	public static long carregarMemoria(){
		List<Integer> list = new ArrayList<>();
		for(int i=0; i < 100_000; i++){
			list.add(i);
		}
		// Validar mem�ria livre durante o m�todo.
		return Runtime.getRuntime().freeMemory();
	}
	
	
	public static void main(String[] args) {
		
		int MB = 1_048_576; // Total de Bytes em 1 MByte
		
		Runtime rt = Runtime.getRuntime();
			
		//Estamos dividindo porque a resposta � em bytes e queremos saber em MBytes
		double maxmemory = rt.maxMemory()/MB;
		System.out.println("Maximo de Mem�ria: " + maxmemory);
		
		//Vamos rodar o m�todo e ver quanto de mem�ria usamos
		double memoriautilizada = maxmemory - carregarMemoria()/MB;
		System.out.println("M�moria utilizada: " + memoriautilizada);
	
		//Limpando os objetos.
		//For�a a finaliza��o dos objetos
		rt.runFinalization();
		//For�a o Garbage Collector
		rt.gc();

		//Estamos dividindo porque a resposta � em bytes e queremos saber em MBytes
		double maxmemory2 = rt.maxMemory()/MB;
		System.out.println("Maximo de Mem�ria ap�s limpeza: " + maxmemory2);

			
	}

}
