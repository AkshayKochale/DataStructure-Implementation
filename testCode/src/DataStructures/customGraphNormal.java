package DataStructures;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;




public class customGraphNormal {
    
    int ver;
 
    LinkedList<Integer> adjList[];
    String adjMatrix[][];
     //for Adjustancy list
    public customGraphNormal(int ver)
    {
        
        this.ver= ver;
        adjList= new LinkedList[ver];
        for(int i=0;i<ver;i++)
        {
            adjList[i]= new LinkedList<>();
        
        }
    }
    
    //for adjustancy Matrix
        
    public customGraphNormal(int ver, int x,int weight)
    {
        this.ver= ver;
        
        adjMatrix= new String[ver][ver];
    }
    
    
    public boolean addEdge(int source ,int dest)
    {
        
        adjList[source].add(dest);
        adjList[dest].add(source);
        
        
//           adjMatrix[source][dest]=weight+"";
//           adjMatrix[dest][source]=weight+"";
           return true;
    }
    
    public void print()
    {
        for(int i=0;i<ver;i++)
        {
            System.out.print("vertices for "+i+" :");
            for(int j=0;j<adjList[i].size();j++)
            {
                System.out.print(adjList[i].get(j) );
            }
            System.out.println("");
        }
    }
    
    
    public void printM()
    {
        
        for(int i=1;i<ver;i++)
        {
            System.out.print(i+" :");
            for(int j=1;j<ver;j++)
            {
                   
                System.out.print(adjMatrix[i][j]+" ");
            
            }
                System.out.println("");
        }
    }
    
    public void bfs(int start)
    {
        boolean vis[]= new boolean[ver];
        Queue<Integer> list= new LinkedList();
        
        list.add(start);
        vis[start]=true;
        
        while(list.isEmpty()==false)
        {            
            int cur=list.poll();
            System.out.print(cur+" " );
            for(int i:adjList[cur])
            {
                
                if(vis[i]==false)
                {
                    vis[i]=true;
                    list.add(i);
                    
                }
            }
          
        }
        
    }

 public void dfs(int start)
 {
     boolean vis[]= new boolean[ver];
     Stack<Integer> list= new Stack<>();
     list.push(start);
     vis[start]=true;
     
     while(list.isEmpty()==false)
     {
         int cur=list.pop();
         System.out.print(cur+" ");
         for(int n:adjList[cur])
         {
                     
             if(vis[n]==false)
             {
                 vis[n]=true;
                 list.push(n);
                }
         }
     }
 }
 //shortest path from single source to destination
 public void bfsShortPath(int source ,int dest)
 {
     Queue<Integer> list= new LinkedList<>();
     boolean vis[]= new boolean[ver];
     int par[]= new int[ver];
     int dis[]=new int[ver];
     list.add(source);
     dis[source]=0;
     while(list.isEmpty()==false)
     {
         
         int  cur= list.poll();
        // System.out.println(cur+":"+dis[cur]+"path :"+par[cur]);
         for(int n:adjList[cur])
         {
             if(vis[n]==false)
             {
                 vis[n]=true;
                 list.add(n);
                 par[n]=cur;
                 dis[n]=dis[cur]+1;
                 
             }
         }
         
     }
        printBfs(par, source, dest,dis[dest]);
     }   
     
 //utility function for bfs shortest path
 public List getParentList(int[] par,int source, int dest,int dis)
     {
         List<Integer> list= new ArrayList();
         int d=dest;
         while(par[d]!=source)
     {
         int pre=par[d];
          list.add(pre);
         d=pre;
        }
      return list;
     }
     
 
 //utility function for bfs shortest path
 public void printBfs(int[] par,int source, int dest,int dis)
 {
      List parentList=getParentList(par, source, dest, dis);
     System.out.print("shortest path is :");
      System.out.print(source+" ");
     for(int i=parentList.size()-1;i>=0;i--)
     {
         System.out.print(parentList.get(i)+" ");
     }
      System.out.println(dest+" ");
      System.out.println("distance from "+source +" to "+dest+" : "+dis);
     
 }
 
 
}

