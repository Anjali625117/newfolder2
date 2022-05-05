 public class thread extends Thread  
{
  public void run()
  { int i;
  for(i=0;i<=4;i++)
  {try {
    Thread.sleep(1000);
    System.out.println(currentThread().getName()+" "+i );
  }
   catch (Exception e) { 
  System.out.print(e);
  }
}
  }
    public static void main(String[]args)
    { 
        int i;
       
        
        thread t2=new thread();
        thread t3=new thread();
        thread t1=new thread();
        
        t2.start();
        try {
          t2.join();
        } catch (Exception e) {
          System.out.println(e);
        }

        t1.start();
        try {
          t1.join();
        } catch (Exception e) {
          System.out.println(e);
        }
        t3.start();
  
        for( i=0;i<=5;i++)
        {
          try {
            Thread.sleep(1000);
            System.out.println(currentThread().getName()+" "+i );
          }
           catch (Exception e) { 
          System.out.print(e);
          }
  
  
 
  } 

}

    } 
