import java.util.*;

class Articulation {

    static int time;

    static void addEdge(ArrayList<ArrayList<Integer> > adjList, int u, int v)
    {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    static void APUtil(ArrayList<ArrayList<Integer> > adjList, int u, boolean visited[], int disc[], int low[],
                       int parent, boolean isAP[])
    {
        int children = 0;

        visited[u] = true;

        disc[u] = low[u] = ++time;

        for (Integer v : adjList.get(u)) {

            if (!visited[v]) {
                children++;
                APUtil(adjList, v, visited, disc, low, u, isAP);

                low[u] = Math.min(low[u], low[v]);

                if (parent != -1 && low[v] >= disc[u])
                    isAP[u] = true;
            }

            else if (v != parent)
                low[u] = Math.min(low[u], disc[v]);
        }

        if (parent == -1 && children > 1)
            isAP[u] = true;
    }

    static void AP(ArrayList<ArrayList<Integer> > adjList, int V)
    {
        boolean[] visited = new boolean[V];
        int[] disc = new int[V];
        int[] low = new int[V];
        boolean[] isAP = new boolean[V];
        int time = 0, par = -1;

        for (int u = 0; u < V; u++)
            if (visited[u] == false)
                APUtil(adjList, u, visited, disc, low, par, isAP);

        for (int u = 0; u < V; u++)
            if (isAP[u] == true)
                System.out.print(u + " ");
        System.out.println();
    }

    public static void main(String[] args)
    {

        int V = 9;
        ArrayList<ArrayList<Integer> > adjList1 = new ArrayList<ArrayList<Integer> >(V);

        for (int i = 0; i < V; i++){
            adjList1.add(new ArrayList<Integer>());
        }

        addEdge(adjList1, 0, 1);
        addEdge(adjList1, 0, 3);
        addEdge(adjList1, 1, 2);
        addEdge(adjList1, 3, 2);
        addEdge(adjList1, 2, 4);
        addEdge(adjList1, 2, 5);
        addEdge(adjList1, 4, 5);
        addEdge(adjList1, 5, 6);
        addEdge(adjList1, 6, 7);
        addEdge(adjList1, 6, 8);
        addEdge(adjList1, 7, 8);

        System.out.println("Articulation points :");
        AP(adjList1, V);


    }
}