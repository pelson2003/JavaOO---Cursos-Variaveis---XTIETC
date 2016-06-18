package CollectionsXTI;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class CollectionSet {
	public static void main(String[] args) {
		
		String[] cores = {"verde", "amarelo", "azul", "branco", "azul", "amarelo", "verde"};
		
		List<String> listduplicados = Arrays.asList(cores);
		System.out.println("List: " + listduplicados);
		
		Set<String> setsemduplicados = new HashSet<>(listduplicados);	
		System.out.println("Set: " + setsemduplicados);	
	}
}
