
public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
		for(int i=1;i<=100;i++)
		{
			if(i%3==0 || i%5==0)
			{
				System.out.print(i+" ");
				total=total+i;
			}
		}
		System.out.println();
		System.out.println(total);

	}

}
