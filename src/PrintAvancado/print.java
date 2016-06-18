package PrintAvancado;
import java.util.Calendar;
public class print {
	public static void main(String[] args) {
		
		//https://www.youtube.com/watch?v=gv7b9GheUyg
		
		// %d procura um inteiro
		System.out.printf("%d", 100);
		
		// %f procura um float ou double
		System.out.println();
		System.out.printf("%f", 10.1);
		
		// %c procura um caracter
		System.out.println();
		System.out.printf("%c", 'a');
		
		// %C procura um caracter e coloca em maisuculo
		System.out.println();
		System.out.printf("%C", 'a');
		
		// %s procura um string
		System.out.println();
		System.out.printf("%s", "string");
		
		// %S procura um string e coloca em Maiusculo
		System.out.println();
		System.out.printf("%S", "string");
		
		// %b procura um boolean ou uma condiçao e retorna
		System.out.println();
		System.out.printf("%b", 5<4);
				
		// %B procura um boolean ou uma condiçao e retorna em Maisculo
		System.out.println();
		System.out.printf("%B", 5<4);
		
		// %b ou %B, leva em consideração que null é falso
		System.out.println();
		System.out.printf("%b", null);
		
		// %b ou %B, leva em consideração que caso nao tenha condição é true
		System.out.println();
		System.out.printf("%b", "cow");
		
		// %e ou %E = cientific notation
		// %g ou %G = Decimal or Cientific Format
		// %o = transforma o número na para base 8
		// %X ou %x = transforma número em Hexadecimal
		// &a ou %A = Hexidecimal float point value
		
		// %n ou \n = quebra uma linha, muito util
		// && = você imprime o %
		// %h ou %H = imprime o Hashcode (IMPORTANTE)
		
		// Trabalhando com datas, bem importante
		
		System.out.println();
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		//%tb or &TB, ele pega uma ta
		
		
		// Exemplos Simples
		
		System.out.printf("%d%d%d%n", 1,2,3);
		System.out.printf("%d %c %s %n", 1,'c',"nelson"); // os espaços fazem diferença
		System.out.println("%% %n");
		
		// Composição do Comando printf
		// %[argument_index$][flags][width][.precision]f
		
		// Utilizando o PRECISION para casas decimais, que o default é 6
		
			// Você pode utilizar com números para casas decimais 
			double num = 10.1234;
			System.out.printf("%.1f%n",num);
			System.out.printf("%.2f%n",num);
			System.out.printf("%.3f%n",num);
			System.out.printf("%.4f%n",num);
			
			// Você também pode utilizar com strings, boolean, and hashcode
			System.out.printf("%.2s%n","hello");
			System.out.printf("%.3b%n","true");
			System.out.printf("%.2h%n","hello");
		
		// Utilizando o WIDTH para dizer o tamanho da saída
		// Setamos o tamanho MINIMO para nossa saida, você nao trunca valor
		
			System.out.printf("%8d%n",123);
			System.out.printf("%4d%5d%n", 123, 456);
		
		// Utilizando FLAGS everything except %n
		
			// Trabalhando com o - 
			// O sinal negativo alinha pela esquerda a saida
			
				System.out.printf("%-8d%n",123);
				System.out.printf("%-6s%5d%n","num =",456);
			
			//Trabalhando com o +
			//Garante queo sinal vai aparecer
			System.out.printf("%+d%n",123);
			System.out.printf("%+d%n",-123);
		
			//Trabalhando com o SPACE, que usamos _
			//ele coloca o _ se for positivo e o negativo não tem impacto
			//System.out.printf(" %_d%n",123);
			//System.out.printf(" %_d%n",-123);
		
			//Trabalhando com o 0 (zero), que usamos _
			//Você coloca zeros, completando o numero
			System.out.printf("%06d%n",-123);
			System.out.printf("%07.2f%n",123.12);
			
			//Trabalhando com o ,
			//Você usa a , para colocar o número no formato cheio 1,234,40
			
			System.out.printf("%,d%n",1234,12);
			System.out.printf("%,d%n",123332324,12);
			System.out.printf("%,015d%n",12345);
			
			//Trabalhando com o (
			//Especifica para numeros negativos, coloca parentes no numero negativo
			
			System.out.printf("%(d%n",123);
			System.out.printf("%(d%n",-123);
	
			//Trabalhando com o #
			//Somente funciona com Octual e Hexadecimal Number, Mostra a outra forma
			
		// Utilizando ARGUMENT
		// eu referencio como eu quero pegar os argumentos que estão vindo
		// voce usa o < para apontar que vai usar o do lado, veja os exemplos
			
		System.out.printf("%s %s %s %n","1","2","3");
		System.out.printf("%1$s %1$s %1$s %n","1","2","3");
		System.out.printf("%3$s %2$s %1$s %n","1","2","3");
	
		System.out.printf("%s %s %s %n","1","2","3");
		System.out.printf("%s %<s %<s %n","1","2","3");
		System.out.printf("%s %s %<s %n","1","2","3");
		System.out.printf("%2$s %s %<s %n","1","2","3");
		
	}

}
