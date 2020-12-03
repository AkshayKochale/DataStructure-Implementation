package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class customGraphWeight {
    
    int ver ;
    LinkedList<edge> adjList[];

    public customGraphWeight(int ver)
    {
        this.ver= ver;
        adjList= new LinkedList[ver];
        
        for(int i=0;i<ver;i++)
        {
            adjList[i]= new LinkedList<>();
        }
              
    }

    public void addEdge(int source ,int dest, int weight)
    {
        if(source!=dest){
        edge e= new edge(dest, weight);
        adjList[source].addFirst(e);
        edge e1= new edge(source, weight);
        adjList[dest].add(e1);
        }
    }
    
        public void show()
        {
            for(int i=0;i<ver;i++)
            {
                System.out.print(i+" connected to : ");
                for(int j=0;j<adjList[i].size();j++)
                {
                   System.out.print(adjList[i].get(j).dest+" with weight :"+adjList[i].get(j).weight+" "+"|" );
                }
                System.out.println("");
            }
        
        }
    
    
    
        static class edge
        {
            int dest;
            int weight;

        public edge(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
            
        }

        // need to learn in depth
        public void dijkstra()
        {
            List<Integer> li= new ArrayList();
            int len=adjList.length;
            boolean vis[]= new boolean[ver];
            int dis[]= new int[ver];
            dis[0]=0; 
//            for(int i=1;i<len;i++)
//            {
//                dis[i]=Integer.MAX_VALUE;
//            }
            int e=0;
            for(int i=0;i<ver;i++)
            {
                int min=minVer(dis, vis);
                vis[min]=true; 
                for(int j=0;j<ver-1;j++)
                {
                    if(vis[i]==false)
                    {
                        System.out.println("wor");
                   int newd=dis[min]+adjList[i].get(j).weight;
                   
                   if(newd>dis[j])
                    {
                        dis[j]=newd;
                    }
                    }
                    
                }
            }
//            System.out.println("value :"+i );
            System.out.println(Arrays.toString(dis));
            System.out.println(Arrays.toString(vis));
        }        
               
         
                        
        
        public int minVer(int[] dist, boolean vis[])
        {
            int minv=-1;
            for(int i=0;i<ver;i++)
            {
                
                if(vis[i]==false && (minv==-1 || dist[i]<dist[minv]))
                {
                   // vis[i]=true;
                minv=i;
                }
            }
        
        return minv;
        } 
            
            
        

        
        public List getEdge(int source)
        {
            List<Integer> ed= new ArrayList();

            for(int j=0;j<adjList[source].size();j++)
               {
                   ed.add(adjList[source].get(j).dest);
               }
            return ed;
        }
        
}
