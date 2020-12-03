    package DataStructures;

    public class customQueueUsingArrayList {

    customArrayList arr= new customArrayList();
    int a[]=arr.Array;
    int arrSize=5;
    int front=0;
    int rear=0;
    int i=0;
    
    public void enqueue(int val)
    {
        if(i<arrSize)
        {
            a[i]=val;
            i++;
            rear++;
        }
        else{System.out.println("cannot enter items more than 5");}

        }

    public void dqueue()
    {
        if(front ==0 && rear==0)
        {
            System.out.println("cannot remove items from empty queue");
        }   
        front ++;
      }

    public void getQueue()
    {
       for(int k=front;k<=rear-1;k++)
       {
           System.out.print(" "+a[k]);
       }
    }

    }
