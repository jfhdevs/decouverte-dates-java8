package co.simplon.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DecouverteDates {

	public DecouverteDates() {
		super();
	}

	public boolean estInferieurDateCourante(LocalDate date) throws ParseException {
		return date.isBefore(LocalDate.now());
	} // estInferieurDateCourante

	public LocalDate construireDate(String chaineFournie) {
		return LocalDate.parse(chaineFournie, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	} // construireDate

	public LocalDateTime augmenterDate(LocalDateTime dateInitiale, int nombreJours,
			int nombreHeures, int nombreMinutes) {
		return dateInitiale.plusDays(nombreJours).plusHours(nombreHeures).plusMinutes(nombreMinutes);
	} // augmenterDate

	public String formaterUneDate(LocalDate date) {
		return date.format(DateTimeFormatter.ofPattern("dd_MM_yyyy"));
	} // formaterUneDate

	public String formaterUneHeure(LocalTime time) {
		return time.format(DateTimeFormatter.ofPattern("HH'h'mm'min'ss'sec'"));
	} // formaterUneHeure
	
	public String formaterDateEnFrancais(LocalDate date) {
System.out.println(date.format(DateTimeFormatter.ofPattern(" dd LLL yyyy")));
		
		return date.format(DateTimeFormatter.ofLocalizedDate( FormatStyle.FULL ).withLocale(Locale.FRANCE));
	} // formaterDateEnFrancais
}
