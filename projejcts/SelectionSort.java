package projejcts;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int a[] = new int [7];
		for(int i=0;i<a.length;i++)
			a[i]=s.nextInt();
		
		for(int i=0;i<a.length-1;i++)
		{
			int small=i;
			for(int j=i+1;j<i;j++)
			{
				if(a[j]<a[small])
					small =j;
				
			}
			swap(a,i,small);
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	 static void swap(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		 int temp = a[i];
		 a[i]=a[j];
		 a[j]=temp;
		
	}
}
