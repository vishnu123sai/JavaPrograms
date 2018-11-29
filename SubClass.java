//package projejct1;

class Class2
{
	
	Class1 b;
	Class2(Class1 x)
	{
		this.b=x;
	}
	void dispay()
	{
		System.out.println(b.n);
		b.display();
	}
	
	
}
class Class1{
	static int n=20;
	static void  display()
	{
		System.out.println("the value of the n is "+ n);
	}
}

public class SubClass {
	 int a()
	{
		System.out.println("s");
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass s = new SubClass();
		Class1 c = new Class1();
		Class2 c2 = new Class2(c);
		c2.dispay(); // instance or non static methods or variables are called wiwth objects
		//c.display();
		//Class1.display();//staic methods and variables are called with class name
		
		//System.out.print(s.a());

	}

}
