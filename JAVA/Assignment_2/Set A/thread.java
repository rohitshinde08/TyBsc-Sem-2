import java.io.*;
import java.lang.String;
class thread extends Thread
{
      String msg=null;
      int n;
      thread (String msg, int n)
      {
	     this.msg=msg;
	     this.n=n;
      }
      public void run()
      {
             for (int i=1; i<n;i++)
                 System.out.println(msg+""+i+"times\n");
             System.out.println("\n");
      }
      public static void main(String a[])
      {
             int n=10;
             thread t1=new thread("Covid19",n);
             t1.start();
             thread t2=new thread("Lockdown  2020",n+10);
             t2.start();
             thread t3=new thread("Vaccine 2021",n+20);
             t3.start();
      }
}
