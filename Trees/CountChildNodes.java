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

public class CountChildNodes {
	static Node root = null; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountChildNodes tree = new CountChildNodes();
		tree.root = new Node(1); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(5); 
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		int count = tree.countCN(root);
		System.out.println("Child Nodes are :"+count);
		
	}
	private int countCN(Node root) {
		// TODO Auto-generated method stub
		int count=0;
		Queue q = new LinkedList();
		q.add(root);
		while(!q.isEmpty())
		{
			Node temp = (Node) q.poll();
			if(temp.right==null && temp.left==null) {
				count++;
				continue;
			}
			if(temp.right!=null)
				q.add(temp.right);
			if(temp.left!=null)
				q.add(temp.left);
		}
		
		return count;
	}

}
