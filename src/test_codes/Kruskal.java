package test_codes;

public class Kruskal {

    static class Edge {
        int src, dest, weight;

        Edge(int s, int d, int w) {
            src = s;
            dest = d;
            weight = w;
        }
    }

    static int find(int parent[], int i) {
        if (parent[i] == i)
            return i;
        return find(parent, parent[i]);
    }

    static void union(int parent[], int x, int y) {
        int xset = find(parent, x);
        int yset = find(parent, y);
        parent[xset] = yset;
    }

    public static void main(String[] args) {

        int V = 4;

        Edge edges[] = {
                new Edge(0, 1, 10),
                new Edge(0, 2, 6),
                new Edge(0, 3, 5),
                new Edge(1, 3, 15),
                new Edge(2, 3, 4)
        };

        // Sort edges by weight
        for (int i = 0; i < edges.length - 1; i++) {
            for (int j = 0; j < edges.length - i - 1; j++) {
                if (edges[j].weight > edges[j + 1].weight) {
                    Edge temp = edges[j];
                    edges[j] = edges[j + 1];
                    edges[j + 1] = temp;
                }
            }
        }

        int parent[] = new int[V];

        for (int i = 0; i < V; i++)
            parent[i] = i;

        System.out.println("Edges in Minimum Spanning Tree:");

        int count = 0;
        int i = 0;

        while (count < V - 1) {

            Edge next = edges[i++];

            int x = find(parent, next.src);
            int y = find(parent, next.dest);

            if (x != y) {
                System.out.println(
                        next.src + " - " +
                                next.dest + " : " +
                                next.weight);

                union(parent, x, y);
                count++;
            }
        }
    }
}
