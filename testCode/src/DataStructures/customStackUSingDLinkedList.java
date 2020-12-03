        package DataStructures;

        public class customStackUSingDLinkedList {


        node head ,tail;

        public void push(int i)
        {
            node toPush=new node(i);
            //node temp=head;
            if(head==null)
            {
                head=tail=toPush;

            }
            tail.nextAdd=toPush;
            toPush.prevAdd=tail;
            tail=toPush;




        }
        public void pop()
        {
            node temp=head;
            while(temp.nextAdd!=null)
            {
            temp=temp.nextAdd;
            }
            tail=temp.prevAdd;
           tail.nextAdd=null;

        }

        public int peek()
        {

               return tail.data; 

        }


        public void show()
        {
        node temp= head;
        while(temp!=null)
        {
            System.out.print(" "+temp.data);
            temp= temp.nextAdd;

        }

        }

        static class node
        {
           int data;
           node nextAdd;
           node prevAdd;

           public node(int data)
           {
           this.data=data;
           this.nextAdd=this.prevAdd=null;

           }


        }


        }
