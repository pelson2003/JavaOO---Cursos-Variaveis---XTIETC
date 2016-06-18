package Calendario;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LocalDateTimeClass {

	public static void main(String[] args) {
	
	//Inicializando
	LocalDateTime orderDate;
	orderDate = LocalDateTime.now();
	
	//Default
	System.out.println(orderDate);
	
	//Formating
	String dDate=orderDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
	System.out.println("Format Date: " + dDate);
	}
	
	// Podemos pegar com o método OF de forma bem simples a data
	public LocalDate getLocalDate(){
		return LocalDate.of(1391, Month.JUNE, 28);
	}
	
	// Podemos pegar com o método OF de forma bem simples a hora
	public LocalTime getSampleLocalTime() {
		return LocalTime.of(13, 51);
	}
	
	// Podemos pegar com o método OF de forma bem simples o dia + hora
	public LocalDateTime getSampleLocalDateTime() {
		return LocalDateTime.of(1491, Month.JUNE, 28, 13, 51);
	}
	
	// juntar tudo em um metodo
	public LocalDateTime getTodayfromLocalDateTime(){
		return LocalDateTime.of(getLocalDate(), getSampleLocalTime());
	}
	
	// Voc
	public LocalDate getTodayFromLocalDateTime(){
		return LocalDateTime.now().toLocalDate();
	}
	
	// Vendo a Diferença entre Pais e Londers
	
	public int getDifferenceBeetweenParisandLondom(){
		ZonedDateTime paris = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		ZonedDateTime london = ZonedDateTime.now(ZoneId.of("Europe/London"));
		return paris.getHour()-london.getHour();
	}
	
	// Validando se hoje é depois de amanha
	
	public boolean isTodayAfterTomorrow() {
		LocalDate today = LocalDate.now();
		LocalDate tomorrow = today.plusDays(1);
		return tomorrow.isAfter(today);
	}

	// Pegando o ultimo dia do mês
	
	public DayOfWeek getLastDayofMonth(){
		return LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
	}
	
	// Longest day of year June 21st
	
	public int howManyDaysUntilLongestDayoftheYear() {
		LocalDate today = LocalDate.now();
		LocalDate longestDay = today.with(Month.JUNE).withDayOfMonth(21);
		return Period.between(today, longestDay).getDays();
		//return Period.between(today, longestDay).getYears()
	}
	
	public LocalDate createDateFromJavaUtilDate() {
		return new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

	}
	
	// Validar os ultimos dias de cada mes no ano com 2 opções
	
	public List<DayOfWeek> lastDaysofMonththisYear(int year) {
		List<DayOfWeek> list = new ArrayList<>();
		for(Month month : Month.values()) {
			DayOfWeek day = LocalDate.now().withYear(year)
					.with(month).with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
				list.add(day);
		}
		return list;	
	}
	
	public List<DayOfWeek> NewlastDaysofMonththisYear(int year) {
		
		return Stream.of(Month.values()).map(month -> LocalDate.now()
				.withYear(year)
				.with(month)
				.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek())
				.collect((Collectors.toList()));
	}
	
	// Parsing and Format
	
	// Retornar uma data simples
	public String formatSimpleDate(){
		return LocalDate.now().format(DateTimeFormatter.ISO_DATE);
	}
	
	// Retornar uma data com um formato MM/DD/yyyy
	public String formatMonthDayYear() {
		return LocalDate.now().format(DateTimeFormatter.ofPattern("MM/DD/yyyy"));
		//O tipo de formato mydou
	}
	
	public LocalDate parseLocalDate(String dateString) {
		return LocalDate.parse(dateString);
	}
}