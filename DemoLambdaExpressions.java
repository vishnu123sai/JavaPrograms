interface Test1
{
	void withDraw(int x);
}
interface Test2
{
	void balance(int x);
}
public class DemoLambdaExpressions{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Test1 t1 =(int y) ->
				{
				System.out.println("withdreaw \n"+y);
				};
				t1.withDraw(1000);
		Test2 t2 =(int x) ->{
			System.out.println("payment \n"+x);
				};
				t2.balance(1200);
	}

}
