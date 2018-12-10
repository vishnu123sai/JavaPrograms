import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class QueueOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque q = new LinkedList();
		Queue qq = new LinkedList();
		q.addLast(1);
		q.addLast(2);
		q.addLast(3);
		qq.add(1);
		qq.add(2);
		qq.add(3);
		Iterator i = q.iterator();
//		for(Object l  : q)
//		{
//			System.out.println(l);
//		}
		System.out.println(q.pop());
		System.out.println(qq.poll());
		
	}

}
