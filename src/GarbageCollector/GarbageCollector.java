package GarbageCollector;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollector {
	
	public static long carregarMemoria(){
		List<Integer> list = new ArrayList<>();
		for(int i=0; i < 100_000; i++){
			list.add(i);
		}
		// Validar memória livre durante o método.
		return Runtime.getRuntime().freeMemory();
	}
	
	
	public static void main(String[] args) {
		
		int MB = 1_048_576; // Total de Bytes em 1 MByte
		
		Runtime rt = Runtime.getRuntime();
			
		//Estamos dividindo porque a resposta é em bytes e queremos saber em MBytes
		double maxmemory = rt.maxMemory()/MB;
		System.out.println("Maximo de Memória: " + maxmemory);
		
		//Vamos rodar o método e ver quanto de memória usamos
		double memoriautilizada = maxmemory - carregarMemoria()/MB;
		System.out.println("Mémoria utilizada: " + memoriautilizada);
	
		//Limpando os objetos.
		//Força a finalização dos objetos
		rt.runFinalization();
		//Força o Garbage Collector
		rt.gc();

		//Estamos dividindo porque a resposta é em bytes e queremos saber em MBytes
		double maxmemory2 = rt.maxMemory()/MB;
		System.out.println("Maximo de Memória após limpeza: " + maxmemory2);

			
	}

}
