class linque
{node front=null ,rear=null;
    class node
    {
        int data;node next;
        public node(int d)
        {
            data=d;next=null;
        }
    }
    public void enquefront(int d)
    {
node newnode=new node(d);
if(front==null&&rear==null)
{
    front=newnode;
    rear=newnode;
}
else{
    front.next=newnode;
    front =newnode;
}
System.out.println("element added in the queue in front "+front .data);

    }
    public void enquerear(int d)
    { node newnode=new node(d);
         rear.next=newnode;
         newnode= rear;
         System.out.println( "element added in rear "+newnode.data);
    }
    public void dequefront()
    {
        if(front ==null)
        System.out.println("queue is empty");
        if(front==rear)
        {
            front =null;
            rear=null;
        }
        
        front=front.next;
        
    }
    public void print()
    {
    node temp=front;
    while(temp!=null)
    {
      System.out.print("temp.data ");  
    }
    }
    public static void main(String[] args)
    {
linque s=new linque();
s.enquefront(5);
s.enquerear(6);
s.enquefront(7);
s.enquerear(9);
s.dequefront();
s.print();
    }
    
}