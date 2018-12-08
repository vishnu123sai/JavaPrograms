import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Jan, 3 , 2010";
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM, d , yyyy", Locale.ENGLISH);
		LocalDate date = LocalDate.parse(string, formatter);
		System.out.println(date); 
	}

}
//