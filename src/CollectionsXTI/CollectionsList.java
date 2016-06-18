package CollectionsXTI;
import java.util.ArrayList;
import java.util.List;
public class CollectionsList {

	public static void main(String[] args) {	
		List<String> list = new ArrayList();
		list.add("futebol");
		list.add("voley");
		list.add("natacao");
		list.add("hockey");
		list.add("basquete");
		list.add("tenis");
		list.add("boxe");
		list.add("futebol");
		
		System.out.println("veja o duplicado: " + list);
		
		for(int i=0; i < list.size(); i++){
			String esporte = list.get(i);
			list.set(i, esporte.toUpperCase()); //Recolocando em letra maiscula
		}
		System.out.println("veja o duplicado: " + list);
		
		//Localizando um emelemento;
		System.out.println(list.indexOf("BOXE"));
		System.out.println(list.subList(2,4));
		list.subList(2,4).clear();
	}
}
