import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SentenseSplit_Sort {
	public static void main(String args[])
	{
		String sen ="How I want a drink alcoholic of course after the heavy lectures involving Quantum Mechanic";
		sen=sen.toLowerCase();
		String s [] = sen.split(" ");
		for(String i : s)
		{
			System.out.println(i);
		}
		List l = Arrays.asList(s);
		System.out.println(l);
		Comparator c = null;
		//Comparator c=null;
		Collections.sort(l, c);
		System.out.println(l);
		System.out.println(Collections.max(l));
		Set s1 = new LinkedHashSet();
		
	
	}

}
