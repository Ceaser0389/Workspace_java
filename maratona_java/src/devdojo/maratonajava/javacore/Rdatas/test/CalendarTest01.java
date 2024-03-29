package devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {

	public static void main(String[] args) {
		
		
		// Calendar c = new Calendar(); /// ela é uma interface não dá p instanciar
		
		Calendar c = Calendar.getInstance();
		
		if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
			System.out.println("Domigão é o primeiro dia da semana");
		};
		
		
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		c.add(Calendar.DAY_OF_MONTH,2);

		c.add(Calendar.HOUR,2);
		c.roll(Calendar.HOUR,12);
		
		Date data  = c.getTime();

		System.out.println(data);

	}

}
