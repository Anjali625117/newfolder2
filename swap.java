class swap
{ static int []arr={0,0,1,0,1,0,1,0,1,0,1,0,1,0,1};
public static void swapp()
{
    int low=0,high=14;
    while(low<high)
    {
        while(arr[low]==0)
       { low++;
       }
        while(arr[high]==1)
    {    high--;
    }
        if(low<high)
        {
            arr[low]=0;
            arr[high]=1;
            low++;high--;
        }
        
    }
}
public static void print()
{
    int i=0;
    while(i<arr.length)
    {
        System.out.print(arr[i]+" ");
        i++;
    }
}
    public static void main(String []args)
    {
swapp(); 
print();
    }
}