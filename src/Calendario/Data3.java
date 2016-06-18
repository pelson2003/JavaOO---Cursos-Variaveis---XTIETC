package Calendario;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Data3 {
	public static void main(String[] args) {	
		Date date = new Date();
		System.out.println(date.toString());
		System.out.println(date.getTime());
		System.out.println(date.getMonth()); // January = 0(zero)
		System.out.println(date.getYear()); // Adicionar 900 ao ano
		System.out.println(date.getDay());  // Monday = 1
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());	
		SimpleDateFormat sdf = new SimpleDateFormat("E yyyy/MM/dd HH:mm:ss");
		System.out.println(sdf.format(date));
	}
}
