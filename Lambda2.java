interface a
{
	int a = 10;
	void dis(int a);
}
public class Lambda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a l = (int a) ->
		{
			System.out.println("lambda Expression"+a);
		};
		l.dis(l.a);

	}

}
