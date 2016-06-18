package LambdaExperssions;

import java.util.List;

public class Exemplo {

	public static void main(String[] args) {
		List<LambdaExperssions> faturasvencidas = new FaturaDAO().buscarFaturasVencidas();
		
		EnviadordeEmail enviadorEmail = new EnviadordeEmail();
		
		
		// Versões Anteriores
		
			for (LambdaExperssions f: faturasvencidas){
					enviadorEmail.enviar(f.getEmailDevedor(), f.resumo());
					
			}
				
		// Utilizando o Lambda
		
		// Opção 1
			faturasvencidas.forEach((LambdaExperssions f) -> {
				enviadorEmail.enviar(f.getEmailDevedor(), f.resumo());
				f.setNotificacaoEnviada(true);
			});
		
		// Opção 2
			faturasvencidas.forEach(f -> {
				enviadorEmail.enviar(f.getEmailDevedor(), f.resumo());
			});
		
		//Opção 3
			faturasvencidas.forEach(f -> enviadorEmail.enviar(f.getEmailDevedor(), f.resumo()));
		

	}

}
