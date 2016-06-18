package CollectionsXTI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
public class Collections {

	public static void main(String[] args) {
		
		//Método Básicos
		
		Collection<String> c = new ArrayList();
		c.add("a");
		c.add("e");
		c.add("i");
		System.out.println(c.toString());
		System.out.println(c.isEmpty());
		System.out.println(c.contains("a"));
		c.remove("a");
		System.out.println(c.toString());
		
		//Método Grupos

		Collection<String> c2 = Arrays.asList("o", "u");
		c.addAll(c2);
		System.out.println(c.toString());
		
		c.containsAll(c2);
		System.out.println(c.toString());
		
		c.removeAll(c2);
		System.out.println(c.toString());
		
		//Percorrer os elementos
		
		for(String string: c){
			System.out.println(string);
		}
		
		//Transformar uma coleção em array;
		
		String[] s = c.toArray(new String[c.size()]);
		System.out.println(Arrays.toString(s));
		
		//Limpa nossa coleçao
		c.clear();
	
	}
}
