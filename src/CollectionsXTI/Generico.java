package CollectionsXTI;

import java.util.ArrayList;

// Criando uma classe que aceita um genérico
public class Generico <E> {

	E elemento;
	
	public void setElemento(E elemento){
		this.elemento = elemento;
	}
	
	public E getElemento(){
		return elemento;
	}
	
	public static void main(String[] args) {
		
		Generico<String> g = new Generico<>();
		g.setElemento("Lago Paranoá");
		g.setElemento("Lagoa Azul");
		System.out.println(g.getElemento().toUpperCase());		
	}
	
	//Qualquer tipo de number e FILHO de numbe
	public double somafilhos(ArrayList<? extends Number> lista) {
		double total = 0;
		for (Number number: lista){
			total += number.doubleValue();
		}
		return total;
	}
	
//	//Qualquer tipo de number e PAIS de number
//	public double somapais(ArrayList<? super Number> lista) {
//		double total = 0;
//		for (Number number: lista){
//			total += number.doubleValue();
//		}
//		return total;
//	}
}
