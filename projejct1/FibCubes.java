package projejct1;

public class FibCubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		System.out.print(a+" "+(int)Math.pow(a, 3)+" "+b+" "+(int)Math.pow(b, 3)+" ");
		for(int i=2;i<5;i++) {
			int c=a+b;
			a=b;
			b=c;
			System.out.print(c+" "+(int)Math.pow(c, 3)+" ");
			
		}

	}

}
