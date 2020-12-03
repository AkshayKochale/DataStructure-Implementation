package DataStructures;

public class customStackUsingArrayList {

    customArrayList arr= new customArrayList();
    int a[]=arr.Array;
int top=0;
public void push(int i)
    {
        if(top<=4){
        a[top]=i;
        top++;
        }
        else{System.out.println("cannot add value to this Stack bitch");}
    }
    
public void peek()
  {
        for(int i:a){System.out.print(" "+i);}
 }

public boolean isEmpty()
 {
   if( top>0) return false;
 return true;
}

public void pop()
{
    if(isEmpty()){System.out.println("cannot remove item for this stack"); }else{
    if(top<=0){System.out.println("cannot remove item for this stack");}
    a[top-1]=0;
    top--;}
   // System.out.println(""+top);
    
    
}

}
