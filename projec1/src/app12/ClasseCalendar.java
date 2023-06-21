package app12;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ClasseCalendar {

	public static void main(String[] args) {
	
		Calendar agoraComCalendar = Calendar.getInstance();
		Date agoraComDate = new Date();
		
		System.out.println("agora com calendar: " + agoraComCalendar);
		System.out.println();
		System.out.println("agora com date: " + agoraComDate);
		
		System.out.println("===============================================");
		

		DateFormat formatador = new SimpleDateFormat("dd/mm/yyyy");
		
		String agoraComCalendarFormatado = formatador.format(
				agoraComCalendar.getTime());
		
		String agoraComDateFormatado = formatador.format(agoraComDate);
		
		System.out.println("agora com calendar: " + agoraComCalendarFormatado);
		System.out.println("agora com date: " + agoraComDateFormatado);
		
	}

}
