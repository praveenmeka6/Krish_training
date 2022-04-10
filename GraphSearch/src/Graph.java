import java.util.*;

public class Graph {

    private HashMap<String, List<String>> adjeList = new HashMap<>();

    public void addEdge(String v,String w)
    {
        adjeList.putIfAbsent(v,new LinkedList<>());
        adjeList.get(v).add(w);
    }

    public void breadthFirst(String root) {
        Set<String> visited = new HashSet<>();

        Queue queue = new LinkedList();

        queue.add(root);

        while(!queue.isEmpty() ) {
            root = (String) queue.poll();
            System.out.print(root+" ");

            if(adjeList.get(root) == null){
                continue;
            }

            Iterator<String> i = adjeList.get(root).iterator();
            while (i.hasNext()) {
                String n = i.next();
                if(!visited.contains(n)){
                    visited.add(n);
                    queue.add(n);
                }
            }

        }
    }

    public void depthFirst(String root) {
        Set<String> visited = new HashSet<>();

        Stack stack = new Stack();

        stack.push(root);

        while(!stack.isEmpty() ) {
            root = (String) stack.pop();
            System.out.print(root+" ");

            if(adjeList.get(root) == null){
                continue;
            }

            Iterator<String> i = adjeList.get(root).iterator();
            while (i.hasNext()) {
                String n = i.next();
                if(!visited.contains(n)){
                    visited.add(n);
                    stack.push(n);
                }
            }

        }
    }

    public static void main(String args[])
    {
        Graph g = new Graph();

        g.addEdge("a","b");
        g.addEdge("a","c");
        g.addEdge("b","d");
        g.addEdge("c","e");
        g.addEdge("c","g");
        g.addEdge("e","f");
        g.addEdge("f","g");

        System.out.println("Breadth first search");
        g.breadthFirst("a");

        System.out.println("\nDepth first search");
        g.depthFirst("a");
    }
}
