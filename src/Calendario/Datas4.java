package Calendario;

import java.util.Calendar;
import java.util.Date;

public class Datas4 {

	
	public static void main(String[] args) {
	
		//Data Base 01 de 1970
		
		//Quantos milisengundos tem desde a data base até hoje
		System.out.println(System.currentTimeMillis());
		
		//Pegar a data atual
		Date agora = new Date();
		System.out.println(agora);
		
		//Pode pagar os milesegundos no construtor e pegar a data
		Date data = new Date(1_000_000_000_000L);
		System.out.println(data);
		
		//Método DATE GET pega a data atual em milesegundos
		System.out.println(data.getTime());
		
		//Método DATE SET que definir um tempo em milesegundos
		data.setTime(1_000_000_000_000L);
		
		//Método DATE Compare, -1 menor, 0 se for igual, 1 se for maior
		System.out.println(data.compareTo(agora));
		
		// Devemos utilizar Calendar para manipular datas
		
		Calendar c = Calendar.getInstance();
		
		// Definindo uma data no formato desejado
		c.set(1980, Calendar.FEBRUARY, 12);
		
		// Pegando a data definida no formato desejado
		System.out.println(c.getTime());
		
		// GET - Usando o GET para pegar um campo especifico
		System.out.println(c.get(Calendar.YEAR)); // tras o ano
		System.out.println(c.get(Calendar.MONTH)); // tras o ano, onde Janeiro é 0
		System.out.println(c.get(Calendar.DAY_OF_MONTH)); // tras o ano, onde Janeiro é 0
		
		// SET - Usando o método SET para definir um campo da data
		c.set(Calendar.YEAR, 1972); // Altera o ano
		c.set(Calendar.MONTH, Calendar.MARCH); // Altera o ano
		c.set(Calendar.DAY_OF_MONTH, 15); // Altera o ano
		System.out.println(c.getTime());
		
		// CLEAR - Limpando Campos
		c.clear(Calendar.MINUTE); //Limpando os campos de segundos e minutos
		c.clear(Calendar.SECOND); //Limpando os campos de segundos e minutos
		System.out.println(c.getTime());
		
		// ADD - Adicionar e diminuir unidades de tempo
		
		c.add(Calendar.DAY_OF_MONTH,1);
		c.add(Calendar.YEAR,1);
		c.add(Calendar.MONTH,1);
		System.out.println(c.getTime());
		
		c.add(Calendar.DAY_OF_MONTH,-1);
		c.add(Calendar.YEAR,-1);
		c.add(Calendar.MONTH,-1);
		System.out.println(c.getTime());
		
		// ROLL - Você adiciona e remove mas nao altera tipos maiores
		// Se você tem o dia 10 e manda somar 40, ele não modifica o mês
		// ele soma 40 dias e coloca o dia como 20 
		
		//** Saudações com Bom Dia, com Boa Tarde ou Boa Noite **
		
		Calendar c1 = Calendar.getInstance();
		int hora = c1.get (Calendar.HOUR_OF_DAY);
		//If básico
	}
	
}
