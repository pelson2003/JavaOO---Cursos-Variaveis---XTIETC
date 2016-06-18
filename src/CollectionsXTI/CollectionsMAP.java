package CollectionsXTI;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class CollectionsMAP {

	public static void main(String[] args) {
		
		Map<String, String> pais = new HashMap<>();
		pais.put("BR", "Brasil");
		pais.put("RU", "Russia");
		pais.put("IN", "India");
		pais.put("CN", "China");
		
		pais.containsKey("BR");
		pais.containsValue("China");
		pais.get("CN");
		pais.remove("CN");
		
		pais.keySet();
		
		Set<String> keys = pais.keySet();
		for(String key:keys) {
			System.out.println(key + ": " + pais.get(key));
		}
	}
}
