package projejct1;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class ArraySum {
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5,6};
		int b[]= {3,2,1,4,3,6,7,3,5,6,7,8};
		int sum=7;
		int ab = Arrays.binarySearch(a, 6);
		System.out.println("ab ="+ab);
		int c[] = Arrays.copyOf(a, 10);
		for(int i =0;i<c.length;i++)
			System.out.print(c[i]+" ");
		
		
		
		//complexity(O(n2))		
		
		//for (int i=0;i<a.length;i++)
//		{
//			for (int j=0;j<b.length;j++)
//			{
//				if (a[i]+b[j]==sum)
//					System.out.println(a[i]+" "+b[j]);
//			}
//		}
			
		System.out.println();
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
