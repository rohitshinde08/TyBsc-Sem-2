//c3
import java.util.*;
import java.lang.String;
class producer extends Thread
{
      String s;
      public sender (String s)
      {
             this.s; 
      }
      public void run()
      {
             try
             {
                synchronized (s)
                {
                        s.notify();
                }
             }
             catch(InterruptedException e)
             {
             }           
}
class receiver extends sender
{
      List list;
      int size;
      public consumer (List list,int size)
      {
             this.list=list;
             this.size=size; 
      }
      public void run()
      {
             try
             {
                synchronized (list)
                {
                              while (true)
                              {
                                    if (list.size()==0)
                                       list.wait();
                                    else
                                        consume();   
                              }
                }
             }
             catch (InterruptedException e){}
             
      }

public void consume() throws InterruptedException
{
       while (!list.isEmpty())
       {
             Thread.sleep(1000);
             System.out.println("Removed Element by Consumer :"+list.remove(0));
       }
       System.exit(0);
       
}
}
class a3
{
      public static void main(String args[])
      {
            Scanner sc = new Scanner(System.in);
            List list=new ArrayList();
            System.out.println("Enter buffer size : ");
            int n=sc.nextInt();
            producer p=new producer(list,n);
            consumer c=new consumer(list,n);
            p.start();
            c.start();
      }


}
