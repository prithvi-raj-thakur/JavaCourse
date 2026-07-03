package test_codes;

public class DFS {

    static final int V = 5;

    static void dfs(int graph[][], boolean visited[], int node) {

        visited[node] = true;
        System.out.print(node + " ");

        for (int i = 0; i < V; i++) {
            if (graph[node][i] == 1 && !visited[i]) {
                dfs(graph, visited, i);
            }
        }
    }

    public static void main(String[] args) {

        int graph[][] = {
                {0,1,1,0,0},
                {1,0,0,1,1},
                {1,0,0,0,1},
                {0,1,0,0,0},
                {0,1,1,0,0}
        };

        boolean visited[] = new boolean[V];

        System.out.println("DFS Traversal:");
        dfs(graph, visited, 0);
    }
}
