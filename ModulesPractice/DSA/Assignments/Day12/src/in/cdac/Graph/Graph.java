package in.cdac.Graph;

public interface Graph {
	public void addEdge(int u, int v);
	public void addEdge(int u, int v, int w);
	public void BFS(int startVertex);
	public void DFS(int startVertex);
	public boolean isConnected(int startVertex);
	public int connectedComponentCount();
	public void dijkstraShortestPath(int startVertex, int destVertex);
	
}
