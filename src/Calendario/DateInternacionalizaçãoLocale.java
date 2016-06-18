package Calendario;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
public class DateInternacionalizaçãoLocale {
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		c.set(1980, Calendar.MONTH, 12);
		Date date = c.getTime();
		
		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(f.format(date));
		
		//** Usando o Locale para informar o local que você está
		
		Locale localepadrao = Locale.getDefault();
		System.out.println(localepadrao);
		
		// Codigo pela ISO639(lingua) , ISO3166 (pais)
		Locale Portugal = new Locale("pt", "PT");
		DateFormat flocale = DateFormat.getDateInstance(DateFormat.FULL, Portugal);
		System.out.println(flocale.format(date));
		
		Locale India = new Locale("hi", "IN");
		DateFormat findia = DateFormat.getDateInstance(DateFormat.FULL, India);
		System.out.println(findia.format(date));
	}
}
