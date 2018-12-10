package Trees;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
//
//class Node 
//{ 
//	int key; 
//	Node left, right; 
//
//	public Node(int item) 
//	{ 
//		key = item; 
//		left = right = null; 	
//		} 
//	} 


//un comment the Node class before your starting  compiling

public class ReverseLevelOredr {
	static Node root = null; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseLevelOredr tree = new ReverseLevelOredr();
		tree.root = new Node(1); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(5); 
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		
		tree.reverseLevelOredr(root);
		
}
	private void reverseLevelOredr(Node root) {
		// TODO Auto-generated method stub
		Deque q = new LinkedList();
		Stack s = new Stack();
		q.addLast(root);
		while(!q.isEmpty())
		{
			Node temp = (Node) q.pop();
			s.push(temp);
			if(temp.right!=null)
				q.addLast(temp.right);
			if(temp.left!=null)
				q.addLast(temp.left);	
		}
		while(!s.isEmpty())
		{
			Node temp = (Node) s.pop();
			System.out.println(temp.key);
		}
		
	}

}
