
public class ShortestPath {
	int vertices = 9;
    public static void main (String[] args) 
    { 
        /* Let us create the example graph discussed above */
       int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0}, 
                                  {4, 0, 8, 0, 0, 0, 0, 11, 0}, 
                                  {0, 8, 0, 7, 0, 4, 0, 0, 2}, 
                                  {0, 0, 7, 0, 9, 14, 0, 0, 0}, 
                                  {0, 0, 0, 9, 0, 10, 0, 0, 0}, 
                                  {0, 0, 4, 14, 10, 0, 2, 0, 0}, 
                                  {0, 0, 0, 0, 0, 2, 0, 1, 6}, 
                                  {8, 11, 0, 0, 0, 0, 1, 0, 7}, 
                                  {0, 0, 2, 0, 0, 0, 6, 7, 0} 
                                 }; 
        ShortestPath t = new ShortestPath(); 
        t.dijkstra(graph, 0,4); 
    }

	private void dijkstra(int[][] graph, int src,int dest) {
		// TODO Auto-generated method stub
		
		int dist[] = new int[vertices];
		boolean visited [] = new boolean[vertices];
		for(int i=0;i<vertices;i++)
		{
			dist[i]=Integer.MAX_VALUE;
			visited[i]=false;
		}
		dist[src]=0;
		for(int i=0;i<vertices;i++)
		{
			int min = minimum(dist,visited);
			visited[min]=true;
			
			for(int j=0;j<vertices;j++)
			{
				if(!visited[j]&&graph[min][j]!=0&&dist[min]+graph[min][j]<dist[j]&&dist[min]!=Integer.MAX_VALUE)
					dist[j]=dist[min]+graph[min][j];
			}
		}
		 //printSolution(dist, vertices);   // if we want source to all vertices we use this method.
		System.out.println(dist[dest]);   // if we want only sorce to destionation we use this 
		
	}
//    void printSolution(int dist[], int n) 
//    { 
//        System.out.println("Vertex   Distance from Source"); 
//        for (int i = 0; i < vertices; i++) 
//            System.out.println(i+" \t\t "+dist[i]); 
//    } 

	private int minimum(int[] dist, boolean[] visited) {
		// TODO Auto-generated method stub
		int index=-1;
		int min_value = Integer.MAX_VALUE;
		for(int i=0;i<vertices;i++)
		{
			if(visited[i]==false&&dist[i]<min_value)
			{
				min_value=dist[i];
				index=i;
			}
		}
		return index;
	} 

}
