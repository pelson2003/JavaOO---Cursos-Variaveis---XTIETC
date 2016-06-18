package LambdaExperssions;

import java.util.List;

public class Exemplo {

	public static void main(String[] args) {
		List<LambdaExperssions> faturasvencidas = new FaturaDAO().buscarFaturasVencidas();
		
		EnviadordeEmail enviadorEmail = new EnviadordeEmail();
		
		
		// Vers�es Anteriores
		
			for (LambdaExperssions f: faturasvencidas){
					enviadorEmail.enviar(f.getEmailDevedor(), f.resumo());
					
			}
				
		// Utilizando o Lambda
		
		// Op��o 1
			faturasvencidas.forEach((LambdaExperssions f) -> {
				enviadorEmail.enviar(f.getEmailDevedor(), f.resumo());
				f.setNotificacaoEnviada(true);
			});
		
		// Op��o 2
			faturasvencidas.forEach(f -> {
				enviadorEmail.enviar(f.getEmailDevedor(), f.resumo());
			});
		
		//Op��o 3
			faturasvencidas.forEach(f -> enviadorEmail.enviar(f.getEmailDevedor(), f.resumo()));
		

	}

}
