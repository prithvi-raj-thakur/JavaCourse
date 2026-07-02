package test_codes;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    static final int V = 5;

    static void bfs(int graph[][], int start) {

        boolean visited[] = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {

            int node = queue.poll();
            System.out.print(node + " ");

            for (int i = 0; i < V; i++) {

                if (graph[node][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
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

        System.out.println("BFS Traversal:");
        bfs(graph, 0);
    }
}
