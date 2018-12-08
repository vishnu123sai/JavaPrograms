package projejcts;
import java.util.*;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List al = new ArrayList();
		LinkedList llist = new LinkedList(al);
		Vector v = new Vector();
		Stack s = new Stack();
		//list Operations
		// ArrayList best suitable for retrival operations
//		System.out.println(llist);
//		llist = al;
//		al.add(1);
//		al.add("vishnu");
//		System.out.println(al.size());
//		al.add(2);
//		al.add(0, "Nayakam");
//		System.out.println(al);
//		System.out.println(al.get(0));
//		al.remove(1);
//		System.out.println(al);
//		System.out.println(al.subList(0, 2));// retruns subList
//		System.out.println(al.contains("Nayakam"));
//		System.out.println(llist);
//		System.out.println(al.equals(llist));
//		System.out.println(al.lastIndexOf(2)); // retruns last occurance if not found  returns -1
//		System.out.println(al.set(2, 3));
//		System.out.println(al);
//		al.set(1, 1);
//		System.out.println(al);
		
		
//============================================================================================
//=========================================================================================
		
		// Stack operations
		//Last In First Out
//		System.out.println(s.empty());
//		s.push(1);
//		s.push(2);
//		s.push(3);
//		System.out.println(s);
//		System.out.println(s.pop());// returns last pushed element and poped from stack
//		System.out.println(s);
//		s.push("vishnu");
//		s.push("sai");
//		s.add("Nayakam"); // push and add operations works as same
//		System.out.println(s);
//		s.pop();
//		System.out.println(s);
//		System.out.println(s.peek());
//		System.out.println(s);
//		System.out.println(s.size());
//		Enumeration e = s.elements();
//		while(e.hasMoreElements()) {
//			System.out.println(e.nextElement());
//		}
//		Iterator i = s.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
//		ListIterator li = s.listIterator();
//		while(li.hasNext())
//		{
//			System.out.println(li.next());
//		}
//		System.out.println(s.capacity());
//		s.insertElementAt("vardhan", 0);
//		System.out.println(s);
	//	s.search(1);
		
//========================================================================================
//==========================================================================================
		
		//Linked List operations
		llist.add(1);
		llist.add(2);
		llist.add(3);
		llist.add(4);
		System.out.println(llist);
		System.out.println(llist.contains(1));
		System.out.println(llist.get(1));
		System.out.println(llist.indexOf(4));
		System.out.println(llist.size());
		System.out.println(llist.remove(3));
		System.out.println(llist);
		System.out.println(llist.indexOf(1));
		System.out.println();
		llist.addFirst(1);
		System.out.println(llist);
		//Linked List willist have feature to append and remove elements from last and first hence it can use like stacks and queues
		System.out.println(llist.peek());
		System.out.println(llist.peekFirst());//peek == peekFirst
		System.out.println(llist.peekLast());
		System.out.println(llist);
		System.out.println(llist.pollFirst());// pollist is similar like  pop it willist remove the element from LinkedList from first
		System.out.println(llist);
		System.out.println(llist.pollLast());//pollist==pollistFirst removes and returns first elememt of llist
		System.out.println(llist);
		System.out.println(llist.element());
		llist.set(0, "vishnu");
		System.out.println(llist.element());// it willist return first element of the llist
		System.out.println(llist);
		Comparator c = null;
		llist.add(3);
		llist.set(0, 4);
		System.out.println(llist);
		llist.sort(c);
		System.out.println(llist);

//=================================================================================================
//=======================================================================================
		// vector operations
//		System.out.println(v.capacity());
//		v.add(1);
//		v.addElement(2);
//		v.add(3);
//		v.addElement(4);
//		System.out.println(v);
//		System.out.println(v.size());
//		System.out.println(v.firstElement()+"\n"+v.lastElement());
//		// the above method s are used to develop stacks and queues 
//		System.out.println(v.get(3));
//		
//		System.out.println(v.isEmpty());
//		v.addElement(5);
//		System.out.println(v);
//		v.add(0, "vishnu");
//		System.out.println(v);
		//Collections.
		
	}

}
