 class Box
{
	int l=1;
	int h=1;
	int w=1;
	Box(int a, int b, int c)
	{
		w=a;
		l=b;
		h=c;
	}
	Box(Box ob)
	{
		l=ob.l;
		w=ob.w;
		h=ob.h;
	}
	
	double vol() {
		System.out.println(w+""+l+""+h);
		return w*l*h;
	}
}
 class MyBox extends Box
{
//	int w,l,h;
	 double weight;
	MyBox(MyBox ob)
	{
		super(ob);
		weight=20;
	}
	 MyBox(int a, int b, int c, double d)
	{
		super(4,5,6);
//		w=a;
//		l=b;
//		h=c;
		weight=d;
		
	}

}
public class BoxDemo {
	public static void main(String args[])
	{
		MyBox mb = new MyBox(1,2,3,45.0);
		MyBox mb1 = new MyBox(mb);
		double vol =mb.vol();
		//System.out.println("volume :"+vol +"\n"+"weight"+mb.weight);
		//MyBox mb1 = new MyBox(mb);
		vol =mb1.vol();
		System.out.println("volume :"+vol +"\n"+"weight"+mb1.weight);
		//MyBox mb1 = new MyBox(mb);
	
	}
}
