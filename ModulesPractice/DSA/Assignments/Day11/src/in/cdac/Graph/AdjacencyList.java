package in.cdac.Graph;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AdjacencyList implements Graph {
	class EdgeInfo {
		int adjVertex;
		int weight;
		
		public EdgeInfo(int v, int w) {
			adjVertex = v;
			weight = w;
		}
	}

	List<List<EdgeInfo>> adjList;
	int vertexCount;
	boolean isDirected;

	public AdjacencyList(int n, boolean isDirected) {
		this.isDirected = isDirected;
		
		vertexCount = n;
		
		adjList = new ArrayList<>(vertexCount);
		for (int i = 0; i < vertexCount; ++i) {
			adjList.add(new ArrayList<>());
		}
	}

	@Override
	public void addEdge(int u, int v) {
		addEdge(u, v, 1);
	}

	@Override
	public void addEdge(int u, int v, int w) {
		adjList.get(u).add(new EdgeInfo(v, w));

		if (!isDirected) {
			adjList.get(v).add(new EdgeInfo(u, w));
		}
	}

	private void dfsHelper(int startVertex, boolean[] isVisited) {
		if (isVisited[startVertex]) {
			return;
		}
		
		isVisited[startVertex] = true;
		System.out.print(startVertex + " ");
		
		for (EdgeInfo edgeInfo : adjList.get(startVertex)) {
			if (!isVisited[edgeInfo.adjVertex]) {
				dfsHelper(edgeInfo.adjVertex, isVisited);
			}
		}
	}

	@Override
	public void DFS(int startVertex) {
		System.out.println("DFS Traversal starts from " + startVertex + ":");
		
		boolean[] isVisited = new boolean[vertexCount];
		for (int i = 0; i < vertexCount; ++i) {
			isVisited[i] = false;
		}
		
		dfsHelper(startVertex, isVisited);
		System.out.println("");
	}

	@Override
	public void BFS(int startVertex) {
		boolean[] isVisited = new boolean[vertexCount];
		
		System.out.println("BFS Traversal starts from " + startVertex + ":");
		Queue<Integer> q = new LinkedList<Integer>();
		
		
		q.add(startVertex);
		
		while(!q.isEmpty()) {
			int vi = q.remove();
			if(isVisited[vi]) {
				continue;
			}
			
			isVisited[vi] = true;
			System.out.print(vi + " ");
			 for(EdgeInfo e : adjList.get(vi)){
				 int neighbor = e.adjVertex; 
				if((neighbor != 0) && (!isVisited[neighbor])){
					
					q.add(neighbor);
				}
			}
		}
		
	}

	@Override
	public void dijkstraShortestPath(int startVertex, int destVertex) {
	}
}
