package NumberFormatParseInternacionaliza��o;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatParseInternacionaliza��o {

	public static void main(String[] args) throws ParseException {
		
		// Utilizando NumberFormat para formatar n�meros
		
		double saldo = 123_345.232;
		NumberFormat f = NumberFormat.getInstance();
		
		// Formata��o Gen�rica
		
		System.out.println("Generico: " + f.format(saldo));
		
		// Formatar como Inteiro
		
		f = NumberFormat.getIntegerInstance();
		System.out.println("Inteiro: " + f.format(saldo));
		
		// Formatar como Percentuais
		
		f = NumberFormat.getPercentInstance();
		System.out.println("Percentuais: " + f.format(0.25));
		
		// Formatar de Moedas
		
		f = NumberFormat.getCurrencyInstance();
		System.out.println("Currency: " + f.format(saldo));
		
		// Podemos definir as casas decimais
		
		f.setMaximumFractionDigits(1);
		System.out.println("Curremcy com 1 casa decimal: " + f.format(saldo));
		
		f.setMaximumFractionDigits(4);
		System.out.println("Curremcy com 4 casa decimal: " + f.format(saldo));

		// Internacionaliza��o para os US
		
		f = NumberFormat.getCurrencyInstance(Locale.GERMAN);
		System.out.println("Curremcy com 4 casa decimal: " + f.format(saldo));
	
		// Utiliza��o de parse
	
		System.out.println("Parsando " + f.parse("� 123.345,23"));
			
	}
}
