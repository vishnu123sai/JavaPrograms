package Trees;

import java.util.LinkedList;
import java.util.Queue;

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


public class IdenticalTress {
	public static void main(String args[])
	{
		//CountFullNodesN tree = new CountFullNodesN();
		//LevelOrderTraversal tree1 = new LevelOrderTraversal();
		
		// above two objects are created using previous problems 
		// we taking just "Tress" from there object
		
		// hence root is static we call it by class name
		
		IdenticalTress it = new IdenticalTress();
		boolean val = it.identicalTressCheck(CountFullNodesN.root,LevelOrderTraversal.root);
		System.out.println(val);
	}

	private boolean identicalTressCheck(Node root, Node root2) {
		// TODO Auto-generated method stub
		Queue q1 = new LinkedList();
		Queue q2 = new LinkedList();
		boolean value =false;
		q1.add(root);
		q2.add(root2);
		System.out.println(root.key+"   "+root2.key);
		while(!q1.isEmpty() && !q2.isEmpty())
		{
			Node n1 = (Node) q1.peek();
			Node n2 = (Node) q2.peek();
			System.out.println(n1.key+"   "+n2.key);
			if(n1.key != n2.key)
				return false;
			q1.poll();q2.poll();
			if(n1.right!=null && n2.right!=null)
			{
				q1.add(n1.right);
				q2.add(n2.right);
			}
			else if(n1.right!=null || n2.right!=null)
				return false;
			if(n1.left!=null && n2.left!=null)
			{
				q1.add(n1.left);
				q2.add(n2.left);
			}
			else if(n1.left!=null || n2.left!=null)
				return false;
	
		}
		
		return true;
		
		
	}

}
