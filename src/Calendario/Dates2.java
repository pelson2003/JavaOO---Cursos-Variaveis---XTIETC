package Calendario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class Dates2 {
	public static void main(String[] args) throws ParseException {
		// Date d = new Date("2010-01-01"); // Método Depreciado problemas de Internacionalizar
		Date d = new Date();
		System.out.println(d); // Data de hoje no formato da JVM
		// Criando um tipo de data no formato que você deseja
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		d= sdf.parse("15/08/1974");
		System.out.println(sdf.format(d));
		// Usando Locale para internacionalização
		Locale local = new Locale("pt", "BR");
		d= sdf.parse("15/08/1974");
		System.out.println(sdf.format(d));
	}
}
