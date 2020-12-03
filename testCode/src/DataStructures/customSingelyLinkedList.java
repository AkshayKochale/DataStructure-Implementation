
package DataStructures;

public class customSingelyLinkedList {

    
node head;

public void add(int i)
{
   node toadd= new node(i);
   node temp= head;
   
   
   if(head==null){
   head=toadd;
   return;
   }
   while(temp.add!=null)
   {

       temp=temp.add;

   }temp.add=toadd;

}

public void show()
{
    node temp=head;

    while(temp!=null)
    {
        System.out.print(" "+temp.data);
        temp=temp.add;  
    }

}

public void addAt(node index, int newVal)
{
    node ad= new node(index,newVal);
    node temp=head;
    node next;
    if(head==null){
        System.out.println("List is empty");
       }
     while(temp.add!=null){
     
     if(index==temp.add){
     temp.data=newVal;
     
     }
     
     }

}

    
    
    
 static class node{
 
  node add;
  int data;
  
  public node(int i){ data=i;}
  public node(node n, int i){add=n; data=i;}
 }   
    
}

  
