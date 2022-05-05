class oueue1
{ int front,=-1,rear=-1,max=10;int temp;
int[]arr=new int[10];
boolean isEmpty()
{
    if(front==-1)
    return true ;
    else 
    return false;
}   
boolean isFull()
{
    if(rear==max-1)
    return true;
    else 
    return false;
}                                                
    public void enque(int item)
    {if(isFull)
        System.out.println(" queue is full because rear has reached the max size");
        else
        {
            rear++;
            arr[rear]=item;
            System.out.println("element added in the queue is"+item);
        }

    }
    public int fronti()
    {
        if(front==-1){
        System.out.println("empty queue no value present at front");
        return;
        }
        else
        return arr[front];
    }
    public int reari()
    {
        if (rear==-1){
        System.out.println("no value at rear ,queue is empty");
        return ;
    }
    else 
    return arr[rear];
}
    public void deque()
    {
        if(isEmpty())
        System.out.println("the Quueue is empty");
        else{
         temp=arr[front];
         if(rear==front)
         {
             System.out.println("the deleted item was the last element of the queue");
             front=rear=-1;
         }
        front++;
        System.out.println(" element deleted from the queue is "+temp);

        }
        
    }

    public static void main(String[] aggs)
    {
oueue1 q=new oueue1();
q.enque(1);
q.enque(2);
q.enque(3);
q.enque(4);
q.enque(5);
q.enque(7);
q.deque();

    }
}