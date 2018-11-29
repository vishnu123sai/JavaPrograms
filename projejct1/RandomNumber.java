package projejct1;
import java.util.*;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		//int n = r.nextInt(50)+1;
//		for(int i=0;i<10;i++)
//		{
//			System.out.println(r.nextInt(10)+1);
//		}
		int a=r.nextInt(6)+1;
		int b=r.nextInt(6)+1;
		System.out.println(a+" "+b+" "+(	a+b));
		

	}

}
