import java.util.LinkedList;

public class GraphReprasentation {
	static int V;
	static LinkedList<Integer> arr[];
	GraphReprasentation(int V)
	{
		this.V=V;
		arr = new LinkedList[V];
		for(int i=0;i<V;i++)
		{
			arr[i]=new LinkedList<>();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter no of vertices :  5");
		int V = 5;
		GraphReprasentation g = new GraphReprasentation(V);
		addEdge(0, 1);
		addEdge(0, 4);
		addEdge(1, 2); 
        addEdge(1, 3); 
        addEdge(1, 4); 
        addEdge(4, 3); 
        addEdge(3, 4);
        
        display();

	}
	 private static void display() {
		// TODO Auto-generated method stub
		 for(int i=0;i<V;i++)
		 {
			
			//arr[i].get(j)
//			for(int j=0;j<arr[i].size();j++)
//			 {
//				 System.out.println(i+"->"+arr[i].get(j));
//				 
//			 }
			 
			 // for loop varity
			 for(Integer k : arr[i])
			 {
				 System.out.println(i+"->"+k);
			 }
		 }
		
	}
	static void addEdge(int i, int j) {
		// TODO Auto-generated method stub
		arr[i].add(j);
		
	}

}
