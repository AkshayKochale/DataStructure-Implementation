
package DataStructures;


public class customMap {

    
    String KeyArr[]= new String[100];
    keySetter head, tail;
    int count=0;    
    
    
    public void put(String kVal,int dVal)
    {
        keySetter toAdd= new keySetter(kVal, dVal);

          if(head==null)
            {
                head = tail= toAdd;
                KeyArr[count]=head.key;
                count++;
            }
          else{ 
              if(keyTest(kVal)){
                keySetter temp= head;     
                while(temp.next!=null)
                     {
                            temp=temp.next;
                     }
                        temp.next=toAdd;
                        tail=toAdd;
                        KeyArr[count]=tail.key;
                        count++;
                    }
          } 
           
    }
    
    
    public boolean keyTest(String k)
    {
        boolean check=true;
        for(int i=0;i<=KeyArr.length-1;i++)
        {
            
            if( KeyArr[i]==k)
            {
                check=false;
            } 
            if(check==false){break;}
        }
        
        return check;
    }
    
    // this functionality needs to add --: array index removing problem
    public void remove(String k)
    {
        
    
    }
    
    
    public void show()
    {
    
        keySetter temp=head;
        System.out.println("head :" + head.val+"  tail :" +tail.val);        
        System.out.println("==========");  
        for(int i=0; i<=KeyArr.length-1;i++)
        {
            
            if(KeyArr[i]==null){break;}
            System.out.println(KeyArr[i] +":"+head.val);
            head=head.next;
        }
        
      }

    
    
    
    
     public static class keySetter
     {
     String key;
     int val;
     keySetter next;

        public keySetter(String key, int val) {
            this.key = key;
            this.val = val;
        }
     
     
     
     }

    
}
