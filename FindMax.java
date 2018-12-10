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


public class FindMax 
{ 
	// Root of Binary Tree 
	static Node root=null; 
	int findMax(Node a)
	{
		int rVal=0,left=0,right=0,max=Integer.MIN_VALUE,i=0,j=0;
		if(a!=null) {
		rVal = a.key;
		left = findMax(a.left);
		right = findMax(a.right);
		if(left > right )
			max=left;
		else
			max= right;
		if(rVal > max)
			max = rVal;
		}
		return max;	
		
	}
	
 
	public static void main(String[] args) 
	{ 
		FindMax tree = new FindMax(); 
		tree.root = new Node(1); 
		tree.root.left = new Node(2); 
		tree.root.right = new Node(3); 
		tree.root.left.left = new Node(4); 
		tree.root.left.right = new Node(5); 
		int max = tree.findMax(root);
		System.out.println("Max :"+max);
	} 
} 
