package CollectionsXTI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class CollectionsUtil {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("guarana");
		list.add("manga");
		list.add("coco");
		list.add("acai");
		list.add("banana");
		list.add("uva");
		System.out.println(list);
		
		Collections.sort(list); // Alfabetica
		Collections.reverse(list); // Inverte
		Collections.shuffle(list); // Embaralha
		Collections.addAll(list, "Cupuaçu", "Laranja", "guarana"); // Aumenta
		Collections.frequency(list, "guarana");
		
		List<String> listteste = Arrays.asList("Acerola", "Graviola");
		//Valida se na lista principal tem os elementos da lista securndária
		boolean d = Collections.disjoint(list, listteste);
		
		Collections.sort(list);
		// Pesquiza
		Collections.binarySearch(list, "Guarana");
		
		// Substitui tudo
		Collections.fill(list, "Açai");
		
		// Transforma uma Coleção em final, sem modificação
		Collections.unmodifiableCollection(list);	
	}
}
