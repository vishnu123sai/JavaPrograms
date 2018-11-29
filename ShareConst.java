import java.util.Random;
import java.util.*;
interface Const
{
	int No =0;
	int Yes=1;
}
class Question implements Const
{
	Random r = new Random();
	int ask()
	{
		int prob = (int) (100*r.nextDouble());
		if(prob>50)
			return Yes;
		else
			return No;
	}
}

class Answer implements Const
{
	static void answer(int results)
	{
		switch(results)
		{
		case Yes :System.out.println(-4 + 1/2 + 2*-3 + 5.0);
			break;
		case No: System.out.println(-4 + 1/2 + 2*-3 + 5.0);
		break;
			
		}
	}
}
public class ShareConst {
	public static void main(String args[])
	{
		Question q = new Question();
		//Answer a = new Answer();
		//int res =q.ask();
//		a.answer(res);
		
		Answer.answer(q.ask());
//		res =q.ask();
//		a.answer(res);
//		res =q.ask();
//		a.answer(res);
//		 res =q.ask();
//		a.answer(res);
	}


}
