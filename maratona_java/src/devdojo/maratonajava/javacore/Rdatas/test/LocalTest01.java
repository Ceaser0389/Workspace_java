package devdojo.maratonajava.javacore.Rdatas.test;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LocalTest01 {
   
	public static void main(String[] args) {
	
		 // pt-br
		Locale LocaleItaly = new Locale("it","IT");
		Locale LocaleCH = new Locale("it","CH");
		
		
		Calendar calender = Calendar.getInstance();
		
		DateFormat  df1 = DateFormat.getDateInstance(DateFormat.FULL,LocaleItaly);
		DateFormat  df2 = DateFormat.getDateInstance(DateFormat.FULL,LocaleCH);
		System.out.println("Italia " + df1.format(calender.getTime()));
		System.out.println("Suiça  " + df2.format(calender.getTime()));
		
		
		
		
   }
}
