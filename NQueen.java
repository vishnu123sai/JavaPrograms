import java.io.*;
import java.lang.*;
class NQueen
{
public static void main(String args[])throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the value of n");
	int n=Integer.parseInt(br.readLine());
	int x[]=new int[n];
	queens(0,n,x);
	System.out.println(-1);
}

public static void queens(int i,int n,int x[])
{
	for(int j=0;j<n;j++)
	{
		if(isPlace(i,j,x)==1)
		{
			x[i]=j;
			if(i==n-1)
			{
				System.out.println();
				for(int l=0;l<n;l++)
				{
					System.out.println(l+","+x[l]);
				}
				System.exit(0);
			}
			else
			{
				//System.out.println(i+","+x[i]);
				queens(i+1,n,x);
			}
		}
	}
	
}
public static int isPlace(int i,int j,int x[])
{
	//i=row
	//j=column
	for (int k=0;k<i;k++)
	{
		if(x[k]==j)
			return -1;
		if(Math.abs(x[k]-j)==Math.abs(i-k))
			return -1;
	}
	return 1;
}
}