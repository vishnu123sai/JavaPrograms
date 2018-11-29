package projejct1;

class SubClass
{
	static int a;
	static
	{
		System.out.println("static block from subclass");
		
	}
	{
		System.out.println("block from non static");
	}
	
}
public class SubClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass.a=23;
		System.out.println("this is main metho");
		SubClass.a=34;
	}
		static
		{
			System.out.println("this is main static");
		}
		

	

}
