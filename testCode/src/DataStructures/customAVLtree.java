package DataStructures;

import java.util.ArrayList;
import java.util.List;


public class customAVLtree {

    node root;
    
    public int height(node cur)
    {
        if(root==null)
        {
            return 0;
        }
      return root.height; 
    }
    
    
    List l= new ArrayList();
     public void findAllLeaf(node root)
        {
            
           node temp= root;
           if(temp==null){return ;}
            findAllLeaf(temp.left);
            if(temp.left==null && temp.right==null){
            //l.add(temp.data);
                System.out.println(temp.data);
            }
            findAllLeaf(temp.right);
           
        }
 
    
    public int max(int a, int b)
    {
        return (a>b)?a:b;
    }

    
    public node left(node root)
    {
        node temp= root;
        root= temp.left;
        root.right=temp;
        
        root.height=max(height(root.left),height(root.right))+1;
        temp.height= max(height(temp.left),height(temp.right))+1;
        return root;
    }

    public node right(node root)
    {
        node temp= root;
        root= temp.right;
        root.left=temp;
        
        root.height=max(height(root.left),height(root.right))+1;
        temp.height= max(height(temp.left),height(temp.right))+1;
        return root;
        
    }

    public node leftright(node root)
    {
        node temp=root;
        root=temp.left.right;
        root.left=temp.left;
        root.right=temp;
         root.height=max(height(root.left),height(root.right))+1;
        temp.height= max(height(temp.left),height(temp.right))+1;
        return root;
       
    }
    
    public node rightleft(node root)
    {
        node temp= root;
        root=temp.right.left;
        root.right=temp.right;
        root.left=temp;
         root.height=max(height(root.left),height(root.right))+1;
        temp.height= max(height(temp.left),height(temp.right))+1;
        return root;
       
    }
    
    public int balanceFact(node root)
    {
            node temp=root;
            int x,y;
            if(root==null){return 0;}
            x=height(root.left);
            y=height(root.right);
            return x-y;
    }
 
    
    //check function is not working 
    //values are added but not able to form avl trees
    //only binary tree formed need to add rotations
    public node insert(node n ,int data)
    {
        boolean b= false;
        node toAdd= new node(data);
        
        if(root==null)
        {
            root=toAdd;
            return root;
        }
        else
        {
            node temp= root;
            
 
            while(true)
            {
            node par=temp;
            if(toAdd.data<par.data)
            {
                temp=temp.left;
                if(temp==null)
                 {
                    par.left=toAdd; 
                    node val=check(root,root.data);
                    return val;
                 }
            }
            else
             {
                temp= temp.right;
                if(temp==null)
                {
                    par.right=toAdd;
                    node val=check(root,root.data);
                    return val;
                 }
             }
            }
        }
        
        
    }
    public node check(node n,int data)
    {
        boolean c= false;
        
     n.height=max(height(n.left),height(n.right))+1;
       int p=balanceFact(n);
            
       if(p>1 && data<n.left.data)
       {
           return right(root);
       }
       
       if(p<-1 && data>n.right.data)
       {
           return left(root);
       }
      
        if(p>1 && data>n.left.data)
       {
           
           return leftright(root);
       }
        
        if(p<-1 && data<n.right.data)
       {
           return rightleft(root);
       }
       
       return n;
    }
    
   public void postorder(node root)
        {

            if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(" "+root.data);
            }
        } 
   
   
public class node
{
    node left, right;
    int data, height;
    
    public node(int data)
    {
        this.data= data;
        height=1;   
    }
    
}    

}
