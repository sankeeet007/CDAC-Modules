package in.cdac.Graph;

import java.util.Queue;
import java.util.LinkedList;



public class AdjacencyMatrix implements Graph{
	int adjMat[][];
	int vertexCount;
	boolean isDirected;
	
	public AdjacencyMatrix(int n, boolean isDirected) {
		this.isDirected = isDirected;

		vertexCount = n;
		
		adjMat = new int[vertexCount][];
		
		// Initializing Adjacency Matrix
		for(int i=0; i<vertexCount; i++) {
			adjMat[i] = new int[vertexCount];
			
			// setting all cells to 0
			for(int j=0; j<vertexCount; j++) {
				adjMat[i][j] = 0;
			}
		}
	}

	@Override
	public void addEdge(int u, int v) {
		addEdge(u, v, 1);
	}

	@Override
	public void addEdge(int u, int v, int w) {
		adjMat[u][v] = w;
		
		if(!isDirected) {
			adjMat[v][u] = w;
		}
	}

	@Override
	public void BFS(int startVertex) {
		System.out.println("BFS Traversal starts from " + startVertex + ":");
		boolean[] isVisited = new boolean[vertexCount];
		
		Queue<Integer> q = new LinkedList<>();
		q.add(startVertex);
		while(!q.isEmpty()) {
			int vi = q.remove();
			if (isVisited[vi]) {
				continue;
			}
			
			isVisited[vi] = true;
			System.out.print(vi + " ");
			for(int vj = 0; vj < vertexCount; vj++) {
				if((adjMat[vi][vj] != 0) && (!isVisited[vj])) {
					q.add(vj);
				}
			}
		}
		System.out.println("");
	}

	@Override
	public void DFS(int startVertex) {
		boolean[] isVisited = new boolean[vertexCount];
		System.out.println("DFS Traversal starts from " + startVertex + ":");
		dfsRecursive(startVertex, isVisited);
		System.out.println();
		
	}
	
	private void dfsRecursive(int curr, boolean[] isVisited) {
		isVisited[curr] = true;
		System.out.print(curr + " ");
		for(int i = 0; i < vertexCount; i++) {
			if((adjMat[curr][i] != 0) && (!isVisited[i])) {
				dfsRecursive(i, isVisited);
			}
		}
	}
	
	@Override
	public void dijkstraShortestPath(int startVertex, int destVertex) {

	}
}
