//class Node 
//{ 
//	int key; 
//	Node left, right; 
//
//	public Node(int item) 
//	{ 
//		key = item; 
//		left = right = null; 
//	} 
//} 



// un comment the Node class before your starting  compiling


public class InsertionBST {
	static Node root = null;
	void insert(Node current)
	{
		Node temp = current;
		if(root == null)
			root = current;
		
		else
		{
			Node cur=root;
			Node p = null;
			while(cur!=null)
			{
				p=cur;
				if(cur.key<temp.key)
					cur=cur.right;
				else
					cur=cur.left;
			}
			if(p.key>temp.key)
				p.left=temp;
			else
				p.right=temp;
		}
	}
	void printPreorder(Node node) 
	{ 
		if (node == null) 
			return; 

		/* first print data of node */
		System.out.print(node.key + " "); 

		/* then recur on left sutree */
		printPreorder(node.left); 

		/* now recur on right subtree */
		printPreorder(node.right); 
	} 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InsertionBST tree = new InsertionBST();
		tree.root = new Node(1); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(5); 
		
		Node current = new Node(6);
		tree.insert(current);
		System.out.println("Preorder traversal of binary tree is "); 
		tree.printPreorder(root);

	}

}
