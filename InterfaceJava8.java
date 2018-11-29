interface Java8
{
	static void m()
	{
		System.out.println("vishnu");
	}
	default void m1()
	{
		System.out.println("sai");
	}
}
//from java8 onwards
//interface can have static and default methods which can have method body

// if we ant to access the static method of interface call it by class name.
//if we want to access the default method implement the interface and create the object
//-  for the class which implements the interface and call the method with object.


public class InterfaceJava8 implements Java8{

	public static void main(String args[])
	{
		InterfaceJava8 j = new InterfaceJava8();
		Java8.m();
		j.m1();
	}
}

