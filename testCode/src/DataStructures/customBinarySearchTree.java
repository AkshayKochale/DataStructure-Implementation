package DataStructures;

import java.util.ArrayList;
import java.util.List;

public class customBinarySearchTree {

node root;
public void add(int add)
{
            node toAdd = new node(add);
            if(root == null)
            {
            root = toAdd;
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
            return;
            }
            }
            else
            {
            temp= temp.right;
            if(temp==null)
            {
            par.right=toAdd;
            return;
            }
            }
}

}
}
List<Integer>  l= new ArrayList();
public List inorder(node root)
{
    
           node temp= root;
        if(temp!=null)
        {
                inorder(temp.left);
                l.add(temp.data);
               // System.out.print(" "+temp.data); 
                inorder(temp.right);
       
        }
        return l;
}


public void preorder(node root)
{
    if(root!=null){
    System.out.print(" "+root.data);
    postorder(root.left);
    postorder(root.right);

}}

public void postorder(node root)
{

    if(root!=null){
    postorder(root.left);
    postorder(root.right);
    System.out.print(" "+root.data);
}}

public boolean find(int val){

        boolean check= false;
        node temp= root;

        if(root.data==val)
        {
            check= true;
        }
        else{

            while(temp!=null){
            if(temp.data>val)
            {
            if(temp.left== null){return check;}
            temp=temp.left;
            if(temp.data==val){check= true; return check;}

        }
        else
        {
            if(temp.right== null){return check;}
            temp= temp.right;

            if(temp.data==val){check= true; return check;}
            }
            if(temp.data==0){break;}

        } 
        }

        return check; 
}


        
        public node findCurrent(int val)
        {
            node temp= root;
            node cur = null;
            while(temp!=null)
            {
                 node par= temp;
                if(temp.data>val)
                {
                    if(temp.left==null){break;}
                    temp= temp.left;
                    if(temp.data==val)
                    {
                        cur= temp;
                    }
                }
                else
                {
                    if(temp.right==null)
                    {break;}
                temp=temp.right;
                if(temp.data==val)
                    {
                        cur= temp;
                    }
                }
                
            }
            if(cur==null){
                System.out.println("value you are looking "+val+" not present in this tree");
                 return root;
            }
            return cur;
        }
        
        
        public void delete(int val)
        {
            customBinarySearchTree cb= new customBinarySearchTree();
            node par=root;
            node temp= root;
            node cur = null;
            // condition if node to delete is root node
               if(root.data==val)
               {
                  temp=root;
                  
                  root=temp.right;
                  node temp2=root;
                  while(temp2.left!=null)
                  {
                   temp2= temp2.left;
                  }
                  temp2.left=temp.left;     
                   System.out.println("previous root is deleted ");
                   System.out.println("new root is :"+root.data);
                  
               }
               else{
            
               while(temp!=null)
            {
                if(temp.data>val)
                {
                    if(temp.left==null){break;}
                    if(temp.left.data==val || temp.right.data==val)
                    {
                        par= temp;
                    }
                    temp= temp.left;
                   if(temp.data==val)
                    {
                        cur= temp;
                    }
                }
                else
                {
                    if(temp.right==null)
                    {break;}
                    if(temp.left.data==val || temp.right.data==val)
                    {
                        par= temp;
                    }
                    temp=temp.right;

                    if(temp.data==val)
                        {
                        cur= temp;
                    }
                }
                
            }
               
           //// current process    
               
            
                if(cur==null){
                System.out.println("value you are looking "+val+" not present in this tree");
            }
            else{
                   node next=null;   
                if(cur.left!=null){
                    next=cur.left;}
                if(cur.right!=null){
                    next=cur.right;}    
               
                //condition for leaf node
                if(next==null)
                {
                    if(par.data>cur.data){
                    par.left=null;
                    }
                    else{
                    par.right=null;
                    }
                    System.out.println("number "+val +"is deleted");
                    System.out.println("which was leaf node");
                    
                }
                //condition for node with one child
                else if(cur.left!=null && cur.right==null ||
                        cur.left==null && cur.right!=null)
                        
                {
                          
                    if(par.data>cur.data)
                    {
                    par.left=next;    
                    }
                    else
                    {
                        par.right=next;
                    }
                    System.out.println("number "+val +"is deleted");
                    System.out.println("which had only one child node");
                    
                }
                // condition for node having 2 childs
                else
                {
                 temp= cur;
                 while(temp.right!=null)
                 {
                  temp= temp.right;
                 }
                   if(par.data>cur.data)
                   {
                       par.left=temp;
                       temp.left=cur.left;
                   }
                   else
                   {
                      
                      par.right=temp;
                       temp.right=cur.right;
                   }
                   System.out.println("number "+val +"is deleted");
                    System.out.println("which has 2 child node");
                    
                }
                
                }}
            }
            
        
        public void findAllLeaf(node root)
        {
           node temp= root;
           if(temp==null){return;}
            findAllLeaf(temp.left);
            if(temp.left==null && temp.right==null){
            System.out.print(temp.data);}
            findAllLeaf(temp.right);
           
        }
        
        
        public int position(node root ,int k)
        {
            customBinarySearchTree cb= new customBinarySearchTree();
            List<Integer> l1= new ArrayList();
            l1=cb.inorder(root);
            if(k>l1.size()){
                System.out.println("There is no such element present  ");
                return 0;
            }
            int pos=l1.get(k-1);
            return pos;
        }
        
        
        
        
            class node 
            {
                    node left, right;
                    int data;
                    public node(int data){ this.data=data;}
            }    
}

