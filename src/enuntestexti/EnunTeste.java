package enuntestexti;
public class EnunTeste {
	
	public static void main(String[] args) {
	
		//Enumeração sem Parametros, Peças de Xadres
		System.out.println(PeçasXadrez.BISPO);
	
		//Enumeração com Parametros, Medida
		System.out.println(Medida.MM);
		
		//Enumeração, pega o titulo do parametro
		System.out.println(Medida.MM.titulo);
	
		//Percorrendo os itens enumeração:
		for(Medida m: Medida.values()){
			System.out.println("Titulo: " + m + "");
			System.out.println("Constante: " + m.titulo + "");
		}
		//Testando o método andar, para exemplificar enun
		andar(Medida.MM, 10);
		andar(Medida.CM, 100);
		andar(Medida.M, 1000);
	}
	
	// Método para testar na prática o Enum
	public static void andar (Medida medida, int total){
		if(medida == Medida.MM){
			System.out.println("Voce andou: " + total + " milimetros");
		} else if (medida == Medida.CM) {
			System.out.println("Voce andou: " + total + " cm");
		} else if (medida == Medida.M) {
			System.out.println("Voce andou: " + total + " metros");
		} else {
			System.out.println("Nao sei o que voocê andou");
		}
	}
}
