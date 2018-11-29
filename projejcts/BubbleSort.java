package projejcts;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int a[] = new int [7];
		for(int i=0;i<a.length;i++)
			a[i]=s.nextInt();
		
		
		//decending oredr 
		
		
//		for(int i= a.length-1;i>0;i--) {
//			for(int j = 0;j<i;j++)
//			{
//				if(a[j]<a[j+1])
//					swap(a,j,j+1);
//			}
//		}
		
		
		
		//ascending order
		
		for(int i= a.length-1;i>0;i--) {
		for(int j = 0;j<i;j++)
		{
			if(a[j]>a[j+1])
				swap(a,j,j+1);
		}
	}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	 static void swap(int[] a, int j, int i) {
		// TODO Auto-generated method stub
		 int temp = a[i];
		 a[i]=a[j];
		 a[j]=temp;
		
	}

}
