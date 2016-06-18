package LambdaExperssions;

interface Executable2 {
	int execute(int a);
}


class Runner2 {
	public void run(Executable2 e) {
		System.out.println();
		int value = e.execute(12);
		System.out.println("Returnvalue is " + value);
	}
}

public class LambdaCaveofProgramming2 {
	
	public static void main(String[] args) {
		
		
		//Exemplo 3 : Old process
		Runner2 runner = new Runner2();
		runner.run(new Executable2() {
			@Override
			public int execute(int a) {
				System.out.println("Hello There");
				return 7 + a;
			}
		});
		
		//Exemplo 3 : Lambda Opção 1
		runner.run((int a) -> {
			System.out.println("This is code passed in a Lambda Experrion");
			System.out.println("Helllo There.");
			return 8;
		});
		
		//Exemplo 3 : Lambda Opção 2
		runner.run((int a) -> 8);
	
	}
	
}
