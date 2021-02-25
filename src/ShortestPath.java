import java.util.ArrayList;

public class ShortestPath {
	
	public ArrayList<Node> coordinates;
	
	private static class Node {
		private String name;
		private int[] dist;
		
		public Node(String n, int[] d) {
			this.name = n;
			this.dist = d;
		}
	}
	
	public static void printDist(Node n) {
		for(int i = 0; i < n.dist.length; i++) {
			System.out.print(n.dist[i]+ " ");
		}
		System.out.println("");
	}
	
	public static String[] findShortestPath(ArrayList<Node> n) {
		
		int[] visited = new int[n.size()];
		int[] totals = new int[n.size()];
		int start = 0;
		int tot = 0;
		
		return null;	
	}
	
	//Nodes and paths
	
	//   S  T  Y  X  Z
	//S  0 10  5 -1 -1
	//T -1  0  2  1 -1
	//Y -1  3  0  9  2
	//X -1 -1 -1  0  4
	//Z  7 -1 -1  6  0
	
	public static void main(String[] args) {
		
		ArrayList<Node> points = new ArrayList<Node>();
		
		int[] sD = {0, 10, 5, -1, -1};
		int[] tD = {-1, 0, 2,-1,-1};
		int[] yD = {-1,3,0,9,2};
		int[] xD = {-1,-1,-1,0,4};
		int[] zD = {7,-1,-1,6,0};
		
		points.add(new Node("S", sD));
		points.add(new Node("T", tD));
		points.add(new Node("Y", yD));
		points.add(new Node("X", xD));
		points.add(new Node("Z", zD));
		
		for (Node n : points) {
			System.out.println(n.name);
			printDist(n);
		}
		
		findShortestPath(points);
		
	}

	public void dijkstra(int[][] grid, int i) {
		// TODO Auto-generated method stub
		
	}
}
