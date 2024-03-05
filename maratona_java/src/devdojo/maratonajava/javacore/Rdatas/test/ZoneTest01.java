package devdojo.maratonajava.javacore.Rdatas.test;


import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Map;

public class ZoneTest01 {

	public static void main(String[] args) {
		
		
		Map<String,String> shortIds = ZoneId.SHORT_IDS;
		
		System.out.println(shortIds);
		System.out.println(ZoneId.systemDefault());
		
		ZoneId tokyoZone = ZoneId.of("Asia/Tokio");
		System.out.println(tokyoZone);
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		ZonedDateTime zonedDateTime = now.atZone(tokyoZone);
		System.out.println(zonedDateTime);
		
		Instant nowInstant = Instant.now();
		System.out.println(nowInstant);
		
		ZonedDateTime zoneDateTime2 = nowInstant.atZone(tokyoZone);
		System.out.println(zoneDateTime2);
		
		System.out.println(ZoneOffset.MIN);
		System.out.println(ZoneOffset.MAX);
		
		ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
		OffsetDateTime offsetDateTime = now.atOffset(offsetManaus);
		System.out.println(offsetDateTime);
		
			

		
	}

}
