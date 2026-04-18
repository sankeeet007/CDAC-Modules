package in.cdac.Graph;

public class GraphMain {
	public static void main(String[] args) {
		
		System.out.println("*********************** ADJACENCY MATRIX **********************");
	
		Graph adjMatGraph = new AdjacencyMatrix(5, false);
		adjMatGraph.addEdge(0, 1);
		adjMatGraph.addEdge(1, 2);	
		adjMatGraph.addEdge(2, 3);
		adjMatGraph.addEdge(3, 4);
		adjMatGraph.addEdge(4, 1);
		adjMatGraph.addEdge(4, 2);
		
//		adjMatGraph.addEdge(0, 1);
//		adjMatGraph.addEdge(1, 3);	
//		adjMatGraph.addEdge(0, 2);
//		adjMatGraph.addEdge(0, 3);		
		
		adjMatGraph.BFS(0);
		adjMatGraph.DFS(0);
		
		
		
		System.out.println("*********************** ADJACENCY list **********************");
		
		Graph adjLiGraph = new AdjacencyList(5, false);
		
		adjLiGraph.addEdge(0, 1);
		adjLiGraph.addEdge(1, 2);	
		adjLiGraph.addEdge(2, 3);
		adjLiGraph.addEdge(3, 4);
		adjLiGraph.addEdge(4, 1);
		adjLiGraph.addEdge(4, 2);
		
		adjLiGraph.DFS(0);
		adjLiGraph.BFS(0);
	}
}
