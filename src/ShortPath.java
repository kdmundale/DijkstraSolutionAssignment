
public class ShortPath {
	
static int V = 5; 
	
	static void setV(int n) {
		V=n;
	}
	
    int minDistance(int dist[], Boolean sptSet[]) { 
    	
        // Initialize min value 
        int min = Integer.MAX_VALUE;
        int min_index = -1; 
  
        for (int v = 0; v < V; v++) 
            if (sptSet[v] == false && dist[v] <= min) { 
                min = dist[v]; 
                min_index = v; 
            } 
  
        return min_index; 
    } 

}
