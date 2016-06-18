package LambdaExperssions;

interface Executable {
	int execute();
}


class Runner {
	public void run(Executable e) {
		System.out.println();
		int value = e.execute();
		System.out.println("Returnvalue is " + value);
	}
}

public class LambdaCaveofProgramming {
	
	public static void main(String[] args) {
		
		
		//Exemplo 1 : Old process
		Runner runner = new Runner();
		runner.run(new Executable() {
			@Override
			public int execute() {
				System.out.println("Hello There");
				return 7;
			}
		});
		
		//Exemplo 1 : Lambda Opção 2
		runner.run(() -> {
			return 8;
		});
		
		
		
		
		
		
		
		
	}
	
}
