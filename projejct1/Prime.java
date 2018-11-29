package projejct1;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<100;i++)
		{
			int cnt=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					cnt++;
			}
			if (cnt ==1)
					System.out.println(i+" is prime number");
		}

	}

}
