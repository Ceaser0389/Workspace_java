package devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTmeFormatterTes01 {

	public static void main(String[] args) {
		
		
		LocalDate date = LocalDate.now();
		
		String s1= date.format(DateTimeFormatter.BASIC_ISO_DATE);
		String s2 = date.format(DateTimeFormatter.ISO_DATE);
		String s3 = date.format(DateTimeFormatter.ISO_DATE);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		LocalDate parse1 = LocalDate.parse("20210219", DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(parse1);
		
		
		LocalDateTime now = LocalDateTime.now();
		String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(s4);
		
		
		
	}
	

}
