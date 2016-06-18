package Calendario;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datas5Formatacao {

	public static void main(String[] args) throws ParseException {
		
		Calendar c = Calendar.getInstance();
		c.set(1980, Calendar.FEBRUARY , 12);
		Date date = c.getTime();
		
		//Date Instance = Data
		//Time Instance = Horas
		//DateTime Instance = Completa
		
		// Formatação de Datas
		DateFormat f = DateFormat.getDateInstance();
		// Formato Padrão
		System.out.println(f.format(date));
		
		// Estilos usando DATEFORMAT Diferentes para trabalhar com Data
		
		// Estilos de DateFormat
		f = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("FULL: " + f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("LONG: " + f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("MEDIUM: " + f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("SHORT: " + f.format(date));
		
		// Estilos usando o PARSE, transforma um objeto em uma data
		
		Date dataparse = f.parse("12/02/1980");
		System.out.println("PARSE: " + dataparse);
		
		// Estilo com SIMPLEDATEFORMA
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Usando SingleDateFormat " + sdf.format(date));
		System.out.println("Usando SingleDateFormat e Parse: " + sdf.parse("10/10/2010"));
		
		// Formatação de Horas
		DateFormat t = DateFormat.getTimeInstance();
		// Formato Padrão
		System.out.println(t.format(date));
		
		
		// Formatação de Data e Horas
		DateFormat ft = DateFormat.getDateTimeInstance();
		// Formato Padrão
		System.out.println(ft.format(date));
			
	}
}
