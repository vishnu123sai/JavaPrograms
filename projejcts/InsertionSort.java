package projejcts;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a[] = new int [7];
		for(int i=0;i<a.length;i++)
			a[i]=s.nextInt();
		
		for(int i=1;i<a.length;i++)
		{
			int temp = a[i];
			int j;
			//j will start from i 
			//if j starts from j-1  we need to take care of ArrayOutOfBound -1
			// every time we are getting the value which is greater than the temp in left hand side we move the element to right side.
			for(j=i-1;j>=0 ;j--)
			{
				if(a[j]>temp)
					a[j+1]=a[j];
			}
			//as j-- occurs we need to place the temp value in a[j+1] 
			//- after all iteration if inner loop
			a[j+1]=temp;
		}
	
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	}
}
