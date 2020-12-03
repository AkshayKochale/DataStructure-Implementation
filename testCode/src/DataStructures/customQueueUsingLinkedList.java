    package DataStructures;

    public class customQueueUsingLinkedList 
    {

    node  head;

    public void enqueue(int i)
    {
        node toAdd= new node(i);
        node temp=head;
        if(head==null)
        {
            head= toAdd;
            return;
        }
        while(temp.add!=null){
         temp= temp.add;
        }
        temp.add=toAdd;

    }

    public void dequeue()
    {

        node temp =head;
        head=temp.add;
        temp.add=null;

    }

       public void show()
       {
       node temp= head;

       while(temp !=null)
       {
           System.out.print(" "+temp.data);
           temp=temp.add;
       }


       }    


       class node{
     int data;
     node add;

     public node(int i){ data=i;}

     }
    }
