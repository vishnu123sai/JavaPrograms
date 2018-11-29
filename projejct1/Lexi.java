package projejct1;
import java.util.*;
public class Lexi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//welcometojava
		String a [] = {"wel","elc","lco","com","ome","mej","eja","jav","ava"};
		SortedSet<String> s = new TreeSet<String>();
//		 for(int i=0;i<a.length;i++)
//			 s.add(a[i]);
//		 System.out.println(s);
//[ava, com, eja, elc, jav, lco, mej, ome, wel]
		String large=a[0],small=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(large.compareTo(a[i])<0)
				large=a[i];
			if(small.compareTo(a[i])>0)
				small=a[i];
		}
	
		System.out.println(large+"      "+small);

	}

}
