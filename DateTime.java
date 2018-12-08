import java.time.*;
import java.util.Scanner;
public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		System.out.println(date);
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println(date.of(2018, Month.MAY ,9));
		System.out.println(time.of(11,12));
		System.out.println(time.of(11,12).getHour());
		Scanner s = new Scanner(System.in);
		String datee = s.nextLine();//21st Mar 2018
		

	}

}
