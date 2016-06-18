package Reflection;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class Reflexao {
	public static void main(String[] args) throws ClassNotFoundException {
		
		//Cria uma variável com o nome da classe
			String nome = "GarbageCollector.GarbageCollector";
		
		//Criar uma class a partir do nome da class
			Class classe = Class.forName(nome);
		
		//Pega o nome simples da classe
			System.out.println(classe.getSimpleName());
		
		//Pega os CAMPOS PUBLICOS da sua classe
			Field[] f = classe.getFields();
			for (Field field: f){
				System.out.println(field);
			}
			
		// Pega todos os METODOS da classe
			Method[] m = classe.getDeclaredMethods();
			for (Method methods: m){
				System.out.println(methods.getName());
			}
		
		// Pega todos os CONSTRUTORES da classe
			Constructor[] c = classe.getConstructors();
			for (Constructor constructor: c){
				System.out.println(constructor.getName());
			}
		
			
	}
}