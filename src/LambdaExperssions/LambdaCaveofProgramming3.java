package LambdaExperssions;

interface Executable3 {
	int execute(int a);
}

interface StringExecutable3 {
	int execute(String a);
}

class Runner3 {
	public void run(Executable3 e) {
		System.out.println();
		int value = e.execute(12);
		System.out.println("Returnvalue is " + value);
	}
	
	public void run(StringExecutable3 e) {
		System.out.println();
		int value = e.execute("string");
		System.out.println("Returnvalue is " + value);
	}
}

public class LambdaCaveofProgramming3 {
	
	public static void main(String[] args) {
		
		
		//Exemplo 4 : Old process
		Runner3 runner = new Runner3();
		runner.run(new Executable3() {
			@Override
			public int execute(int a) {
				System.out.println("Hello There");
				return 7 + a;
			}
		});
		
		//Exemplo 4 : Lambda Opção 1
		runner.run((int a) -> {
			System.out.println("This is code passed in a Lambda Experrion");
			System.out.println("Helllo There.");
			return 8;
		});
		
		//Exemplo 4 : Lambda Opção 2
		runner.run((int a) -> 8);
	
	}
	
}
