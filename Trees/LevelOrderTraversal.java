package Trees;
import java.util.Deque;
import java.util.LinkedList;
//
class Node 
{ 
	int key; 
	Node left, right; 

	public Node(int item) 
	{ 
		key = item; 
		left = right = null; 	
		} 
	} 





public class LevelOrderTraversal {
	static Node root = null; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LevelOrderTraversal tree = new LevelOrderTraversal();
		tree.root = new Node(1); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(5); 
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		
		tree.levelOrderTraversal(root);
		
}
	  void levelOrderTraversal(Node root) {
		// TODO Auto-generated method stub
		Deque q = new LinkedList();
		Node temp=root;
		while(temp!=null)
		{
			System.out.println(temp.key);
			if(temp.left!=null)
				q.addLast(temp.left);
			if(temp.right!=null)
				q.addLast(temp.right);
			if(q.isEmpty())
			    break;
			temp =  (Node) q.pop();
			
			
		}
	}
}
