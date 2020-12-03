
package DataStructures;

public class customArrayTable {

    node arr[]= new node[16];
    
    node head;
    
    // need to clear whole concept
    public boolean add(String key, int data)
    {
    
        boolean check= false;
            node toAdd = new node(data);
            customArrayTable o= new customArrayTable();
            int pos=o.hashFunction(key)%10;

            if(arr[pos]==null )
            {
                arr[pos]=toAdd;
                head=arr[pos];
                 check=true;
                 return check;
            }
             //if(arr[pos]==head )
            
                node temp= head;
                while(temp.next!=null)
                {
                    temp= temp.next;
                    
                }temp.next=toAdd;
               // arr[pos]=toAdd;
                check=true;
                
            
            return check ;
            }

    
    
    
    
    
    public void show()
    {
     
//        
//        for(int i=0;i<=arr.length-1;i++)
//        {
//            System.out.println(arr[i]);
//        }
//        
        
//        
//          node temp= head;
//            while(temp!=null)
//            {
//                    System.out.print(temp.data);
//     
//                temp= temp.next;
//            }
        
            for(node n: arr)
            {
                if(n== null){System.out.println("Null");}
                else{
                    System.out.print(n.data);
                    while(n.next!=null)
                    {
                        
                        System.out.println(n.data);
                    }
                    System.out.println("");
                
                
                }
                
                           
            }
    
    }
    
    
    
    
    

    
    
    
    public int hashFunction(String key){
    
        int i=0;int hash=0;
        if(key.length()==0){
          
        return 0;}
        hash= (key.charAt(i)+31*key.length())*8;
        
        
    return hash;
    }

    
}

class node
{
    int data;
    node next;
    
    node(int data){ this.data=data;}

}


