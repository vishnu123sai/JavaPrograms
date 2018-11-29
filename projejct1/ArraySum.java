package projejct1;

import java.util.ArrayList;
import java.util.List;

public class ArraySum {
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5,6};
		int b[]= {3,2,1,4,3,6,7,3,5,6,7,8};
		int sum=7;

		
		//complexity(O(n2))	
		
		
		//for (int i=0;i<a.length;i++)
//		{
//			for (int j=0;j<b.length;j++)
//			{
//				if (a[i]+b[j]==sum)
//					System.out.println(a[i]+" "+b[j]);
//			}
//		}
			
		
//===============================================================================		
		//complexity O(n)
			
		ArrayList<Integer> l = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
			l.add(a[i]);
		for(int j=0;j<b.length;j++)
			if(l.contains((sum-b[j])))
			{
				System.out.println(b[j]+" "+(sum-b[j]));
			}
		
		
	}

}
