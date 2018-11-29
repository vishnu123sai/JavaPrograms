package projejcts;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
//import java.util.Map;
import java.util.TreeSet;

//import javax.swing.text.html.HTMLDocument.Iterator;
//import java.util.Map;

public class Map {
	public static void main(String args[])
	{
		HashMap m = new HashMap();
		m.put(1, "vishnu");
		m.put(2, "sai");
		m.put(3, "vardhan");
		System.out.println(m);	
		System.out.println(m.get(1));
		System.out.println(m.put(2, "nayakam"));
		System.out.println(m.getOrDefault(4, "prashsanth"));
		System.out.println(m);
		System.out.println(m.entrySet().getClass());
		Set s = m.entrySet();
		HashMap m1= new HashMap();
		Set ss = new HashSet();
		Iterator i = s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next().getClass().getName().split("="));
			String[]  a = i.next().getClass().getName().split("=");
			for(int in=0;in<a.length;in++)
			{
				System.out.println(a[in]);
			}
		}
		
		
		
		}

}
