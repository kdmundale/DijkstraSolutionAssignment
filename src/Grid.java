
import java.util.Scanner;

public class Grid{
	
	static int V = 5; 
	
	static void setV(int n) {
		V=n;
	}
	
    int minDistance(int dist[], Boolean visited[]) { 
    	
        //  min value 
        int min = Integer.MAX_VALUE;
        int min_index = -1; 
        // finds the min distance from places not yet visited
        for (int v = 0; v < V; v++) 
            if (visited[v] == false && dist[v] <= min) { 
                min = dist[v]; 
                min_index = v; 
            } 
  
        return min_index; 
    } 
    
    // A utility function to print the constructed distance array 
    void print(int dist[], int n) {
    	
        System.out.println("Vertex   Distance from 0"); 
        for (int i = 0; i < V; i++) 
            System.out.println(i + "            " + dist[i]); 
    } 
    
   
    void dijkstra(int graph[][], int src) { 
    	//dist[i] will hold the shortest distance from src to i 
        int dist[] = new int[V]; 
  
        // visited[i]=true if been visited or its alredy in the path as the shortest way
        Boolean visited[] = new Boolean[V]; 
  
        // initiate the values
        for (int i = 0; i < V; i++) { 
            dist[i] = Integer.MAX_VALUE; 
            visited[i] = false; 
        } 
  
        // Distance of source vertex from itself is always 0 
        dist[src] = 0;
        
        // Find shortest path for all vertices 
        for (int count = 0; count < V - 1; count++) { 
            // Pick the minimum distance 
            // from points not yet visited 
            int u = minDistance(dist, visited);
            // Mark the picked vertex as processed 
            visited[u] = true; 
  
            // Update dist value of the point 
            for (int v = 0; v < V; v++) {
                // mark the v as visited only if it hasnt already been
                // and the path from source is smaller and it doesn't pass through a
            	// verticies you can't go to
                if (!visited[v] && graph[u][v] != 0 &&  dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v] && graph[u][v] !=-1 ) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        } 
        
        print(dist, V); 
    } 
  
  
	
	public static void printGrid(int[][] g) {
		
		for(int i=0; i< g[0].length;i++) {
			for (int j=0; j<g[0].length; j++) {
				System.out.print(g[i][j]+ " ");
				}
			System.out.println("");
			}
		}
	
	public static void main(String[] args) {
		
		System.out.println("How many points?");
		Scanner in = new Scanner(System.in);
		int myV = in.nextInt();
		setV(myV);
		int lineNo=1;
		int[][] g = new int[V][V]; 
		
		for (int i=0; i<V; i++) {
			System.out.println("enter each distance value for point " + lineNo+", one at a time:");
			for(int j=0; j<V;j++) {
				Scanner input = new Scanner(System.in);
				int x = input.nextInt();
				g[i][j]=x;
			}
			lineNo++;
		}
		
		
//		int[][] grid = new int[][] {{ 0,10, 5,-1,-1},
//									{-1, 0, 2, 1,-1},
//									{-1, 3, 0, 9, 2},
//									{-1,-1,-1, 0, 4},
//									{ 7,-1,-1, 6, 0}};
//		printGrid(g);
		printGrid(g);
		Grid t = new Grid(); 
        t.dijkstra(g, 0); 
	}	
	
}
