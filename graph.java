import java.util.*;

class Graph {
	// A utility function to add an edge in an
	// undirected graph.
	static void addEdge(List<List<Integer>> adj, int u, int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}

	// A utility function to do DFS of graph
	// recursively from a given vertex u.
	static void DFSUtil(int u, List<List<Integer>> adj, boolean[] visited) {
		visited[u] = true;
		System.out.print(u + " ");
		for (int i = 0; i < adj.get(u).size(); i++) {
			if (!visited[adj.get(u).get(i)]) {
				DFSUtil(adj.get(u).get(i), adj, visited);
			}
		}
	}

	// This function does DFSUtil() for all
	// unvisited vertices.
	static void DFS(List<List<Integer>> adj, int V) {
		boolean[] visited = new boolean[V];
		for (int u = 0; u < V; u++) {
			if (!visited[u]) {
				DFSUtil(u, adj, visited);
			}
		}
	}

	public static void main(String[] args) {
		int V = 5;

		// The below line may not work on all
		// compilers. If it does not work on
		// your compiler, please replace it with
		// following
		// List<List<Integer>> adj = new ArrayList<>(V);
		List<List<Integer>> adj = new ArrayList<>(V);

		for (int i = 0; i < V; i++) {
			adj.add(new ArrayList<Integer>());
		}

		// Vertex numbers should be from 0 to 4.
		addEdge(adj, 0, 1);
		addEdge(adj, 0, 4);
		addEdge(adj, 1, 2);
		addEdge(adj, 1, 3);
		addEdge(adj, 1, 4);
		addEdge(adj, 2, 3);
		addEdge(adj, 3, 4);
		DFS(adj, V);
	}
}
// this code is contributed by devendrasalunke
