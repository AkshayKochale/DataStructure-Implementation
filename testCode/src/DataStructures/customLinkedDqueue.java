
    package DataStructures;


    public class customLinkedDqueue {

    node head, tail;
    int countNo=0;
    // int a[]=new int[5];
    public void addLast(int i)
    {
        node toAdd= new node(i);

        if(head==null)
        {
            head=tail=toAdd;
       //       a[0]=toAdd.data;
            countNo++;
            return;
          //  head.prev=null;
        } 
        tail.next=toAdd;
        toAdd.prev=tail;
        tail=toAdd;

      // a[countNo]=i;
        countNo++;

    }


    public void addFirst(int i)
    {
        node first = new node(i);
    node temp= head;

    temp.prev=first;
    head=first;
    head.next=temp;

    }

    //replace is not completed problem with indexing    
    public void replace(int i,int j)
    {
        node e= new node(j);
        node temp= head;

        if(i==0)
        {
            temp.prev=e;
            head=e;
            head.next=temp.next;
        }

    }

    public void removefirst()
    {
    node temp= head;

    head=temp.next;
    head.prev=null;
    countNo--;
    }

    public void removeLast()
    {
    node temp= head;

    while(temp.next!=null)
    {
     temp= temp.next;
    }
    tail= temp.prev;
    temp.prev=null;
    tail.next= null;
    countNo--;
    }

    public void GetNoOfElements()
    {
        System.out.println(" nodes presents are :" +countNo);
    }

    public void show()
    {
     node temp= head;
     while(temp!=null)
     {
         System.out.print(" "+temp.data);
     temp= temp.next;
     }
        System.out.println("==============");

     //for(int i:a){System.out.print(" "+i);}
    }



    class node
    {
       int data;
       node prev,next;
       int index=0;
      public node(int i){ data=i;} 
      public node(int i ,int j)
      {
       data=j;
       index=i;
      }
    }

    }
