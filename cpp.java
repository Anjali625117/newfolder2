class cpp
{      int []arr={0,0,0,1,1,0,1,0,1,0,1,0,1,0};

    public  void sort()
    {
     int i=0, c=0;
     while(i<arr.length)
     {
       if(arr[i]==0)
       c++;
       i++;
     }
     i=0;
     while(i<c)
     {
         arr[i]=0;
         i++;
     }
    i=c; 
     while(i<arr.length)
     {
         arr[i]=1;i++;
     }
    }
    public void print()
    { int i=0;
        while(i<14)
        {
            System.out.print(arr[i]+" ");
            i++;
        }
    }
    public static void main(String[]args)
    {
     cpp c=new cpp(); 
     c.sort();
     c.print();
    }

    
}