package drill08;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Drill0804 {
	public static void main(String args) {
		displayDate();
	}
	
	public static void displayDate() {
		LocalDate now = LocalDate.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		String formatDate = now.format(format);
		
		System.out.println(formatDate);
	}

}
