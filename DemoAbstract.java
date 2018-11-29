abstract class Figure
{
	int a , b;
	Figure(int a, int b)
	{
		this.a = a ;
		this.b=b;
		
	}
	abstract void area();
}
class Rectangle extends Figure
{
	Rectangle(int a, int b)
	{
		super(a,b);
	}
	void area() {
		System.out.println(" R area"+a*b);
	}
}
class Triangle extends Figure
{
	Triangle(int a, int b)
	{
		super(a,b);
	}
	void area(){
		System.out.println(" T area"+(a*b)/2);
		
	}
}
public class DemoAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figure t = new Triangle(2,5);
		Rectangle r = new Rectangle(3,4);
		Figure f;
		t.area();
		r.area();
		

	}

}
