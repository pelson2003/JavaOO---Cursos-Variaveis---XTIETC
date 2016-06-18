package LambdaExperssions;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
public class FaturaDAO {
	public List<LambdaExperssions> buscarFaturasVencidas() {
		//List<LambdaExperssions> faturasVencidas = new ArrayList<>();
		LambdaExperssions f1 = new LambdaExperssions("joao@joao.com", 350.0, LocalDate.now().minusDays(3));
		LambdaExperssions f2 = new LambdaExperssions("maria@joao.com", 350.0, LocalDate.now().minusMonths(2).minusDays(2));	
		LambdaExperssions f3 = new LambdaExperssions("jose@joao.com", 350.0, LocalDate.now().minusDays(5));	
		return Arrays.asList(f1,f2,f3);		
	}
}
