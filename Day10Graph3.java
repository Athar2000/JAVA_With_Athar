import java.util.*;
public class Day10Graph3 {
    static class Edge {
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }

    }
    public static void createeGraph(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
            graph[0].add(new Edge(0,2,10));
            graph[1].add(new Edge(1,3,0));
            graph[1].add(new Edge(2,0,4));
            graph[2].add(new Edge(2,1,5));
            graph[2].add(new Edge(2,3,7));
            graph[2].add(new Edge(2,3,3));
            graph[3],.add(new Edge(3,1,7));
            graph[3].add(new Edge(3,2,3));
        }
        public static void main(String args[]){
            int v=4;
            ArrayList<Edge>graph[] = new ArrayList[V];
            createeGraph(graph);
            //print 2's neighbours
            for(int i=0; i<graph[2].size();i++){
                Edge e =graph[2].get(i);
                System.out.println(e.dest+" "+e.wt);
            }
        }
    }
    
}
