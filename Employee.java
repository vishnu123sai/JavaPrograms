class Calculate
{
	int bSal;
	float total;
	Calculate(int i)
	{
		this.bSal=i;
		 total=(float)(bSal+1000+3000+0.30*bSal);
	}
	
	
	
}
class IncrementSal
{
	Calculate x;
	static float incSal;
	IncrementSal(Calculate x)
	{
		this.x=x;
		IncrementSal.incSal =  x.total+(x.total * 0.20f);
	}
	
	
	
}
class Display
{
	IncrementSal y;
	Display(IncrementSal y)
	{
		this.y=y;
	}
	void dis()
	{
		System.out.println("basic salary is "+y.x.bSal);
		System.out.println("totalSal is "+y.x.total);
		System.out.println("incremented sal is "+y.incSal);
	}
	
}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate c = new Calculate(1000);
		IncrementSal i = new IncrementSal(c);
		Display d = new Display(i);
		d.dis();
	}

}
