package enuntestexti;
public class EnunTeste {
	
	public static void main(String[] args) {
	
		//Enumera��o sem Parametros, Pe�as de Xadres
		System.out.println(Pe�asXadrez.BISPO);
	
		//Enumera��o com Parametros, Medida
		System.out.println(Medida.MM);
		
		//Enumera��o, pega o titulo do parametro
		System.out.println(Medida.MM.titulo);
	
		//Percorrendo os itens enumera��o:
		for(Medida m: Medida.values()){
			System.out.println("Titulo: " + m + "");
			System.out.println("Constante: " + m.titulo + "");
		}
		//Testando o m�todo andar, para exemplificar enun
		andar(Medida.MM, 10);
		andar(Medida.CM, 100);
		andar(Medida.M, 1000);
	}
	
	// M�todo para testar na pr�tica o Enum
	public static void andar (Medida medida, int total){
		if(medida == Medida.MM){
			System.out.println("Voce andou: " + total + " milimetros");
		} else if (medida == Medida.CM) {
			System.out.println("Voce andou: " + total + " cm");
		} else if (medida == Medida.M) {
			System.out.println("Voce andou: " + total + " metros");
		} else {
			System.out.println("Nao sei o que vooc� andou");
		}
	}
}
