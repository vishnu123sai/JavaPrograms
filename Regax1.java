import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regax1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "ad";
		System.out.println(a.matches("a."));
		Pattern p = Pattern.compile("(0|1)?(\\1)");
		Matcher m =p.matcher("11");
		System.out.println(m.find()+m.group(1)+m.group(1).equals("1"));

	}

}
