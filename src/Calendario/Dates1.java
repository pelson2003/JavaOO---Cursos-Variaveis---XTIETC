package Calendario;
import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
public class Dates1 {
	public static void main(String[] args) {
		//java.util package
		Date d = new Date();
		System.out.println(d); // Full Current Date Format;
		
		// Using Gregorian Calendar you can add, sub,
		GregorianCalendar gc = new GregorianCalendar(2009,1,15);
		gc.add(GregorianCalendar.DATE, 1);
		
		// O método não possui uma saída amigavel então temos que transformar em date
		Date d2 = gc.getTime();
		//DateFormat df = DateFormat.getInstance();
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		String sd = df.format(d2);
		System.out.println(sd);
	}
}
