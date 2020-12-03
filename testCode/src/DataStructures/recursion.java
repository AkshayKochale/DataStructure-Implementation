package DataStructures;


public class recursion {

// code to return addition if n natural numbers
    
    public int add(int n)
    {
        if(n<=0){return 0;}
        return n+add(n-1);
        
    }

  // code to return factorial of number n
    
    public int fact(int n)
    {
    
    if(n<=1){return 1;}
    return n*fact(n-1);
    }

    // code to print number at fibonnaci series for given position.
    // need to find out most optimize solution
    public int fibbo(int n)
    {
       // int count=0;
       // int arr[]=new int[n+1];
        if(n==1 || n==2){return 1;}
        //count++;
    return fibbo(n-1)+fibbo(n-2);
    
    }
  
    

// code for calculating power of given number->'a' power->'b'
    // 2 ways normal and fast power
    public int pow(int a, int b)
    {
         
    if (b==0){return 1;}
    return pow(a,b-1)* a;
    }
    
    public int fpow(int a, int b)
    {
        if(b==0){return 1;}
        if(b%2==0)
        {
            return fpow(a*a,b/2);
        }
        else{
            return a*fpow(a,b-1); 
            }
    
    }
    
    //find all possible path in n*m grid
    public  int path(int n, int m)
    {
        if(n==1||m==1){return 1;}
    return path(n,m-1)+path(n-1,m);
    }
    
    
    //color flood fill problem
    
    public void cf(int a[][] , int r, int c, int nex, int pre )
    {
        int row=a.length;
        int col=a[0].length;
        
        if(r<0||r>=row|| c<0||c>=col){return;}
        if(a[r][c]!=pre){return;}
        a[r][c]=nex;
        cf(a,r-1,c,nex,pre);
        cf(a,r,c-1,nex,pre);
        cf(a,r+1,c,nex,pre);
        cf(a,r,c+1,nex,pre);
      }
    
    //printing 2d array for matrix problem;
    
    public void print(int as[][]){
    
        for(int i=0;i<=as.length-1;i++)
        {
            for(int j=0;j<=as[0].length-1;j++)
            {
                System.out.print(as[i][j]);
            }
            System.out.println("");
        }
    }
    
    
    // print all possible permutation of string
    public void  perm(String s, int l, int r)
    {
        if(l==r){System.out.println(s); return;}
        for(int i=l;i<=r;i++)
        {
            s=interch(s, l, i);
            perm(s, l+1, r);
            s=interch(s, l, i);
        }
    
    }
    public static String interch(String s, int a, int b)
    {
        char c[]=s.toCharArray();
        char temp=c[a];
        c[a]=c[b];
        c[b]=temp;
        
        return String.valueOf(c);
    }
    
    // Binary search using recursion to search any element in given array
      public int Binarysearch(int a[],int start, int end, int n)
    {
      
        int m=(start+end)/2;
        if(a[m]==n){return m;}
        else if(a[m]<n)
        {
            start=m+1;
            return Binarysearch(a,start,end,n);
        }
        else
        {
            end=m-1;
           return Binarysearch(a,start,end,n);
        }
         
    }
    
}



