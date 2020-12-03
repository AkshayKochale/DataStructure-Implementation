
package DataStructures;

public class TestCode {

    public static void main(String[] args) {
  
        TestCode o= new TestCode();
    
         customGraphWeight gg= new customGraphWeight(6);
         
        gg.addEdge(0, 1, 4);
        gg.addEdge(0, 2, 5);
        gg.addEdge(1, 4, 3);
        gg.addEdge(4, 3, 6);
        gg.addEdge(3, 5, 5);
        gg.addEdge(1, 3, 7);
        gg.addEdge(2, 3, 8);
        gg.show();
        gg.dijkstra();
    }
    
    }
