
public class TransposeOfMatrix {
	public static void main(String args[])
	{
		int a [][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		int b[][]=new int [4][4];
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				b[j][i]=a[i][j];
			}
		}
		System.out.println("-------given array  ------------\n");

		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println("-------transpose of an array ---------\n");

		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println("----------- Clock wise Rotation ------------\n");
		for(int i=0;i<4;i++)
		{
			for(int j=3;j>=0;j--)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println("-------Anti Clock wise Rotation ------------\n");
		for(int i=3;i>=0;i--)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

}
