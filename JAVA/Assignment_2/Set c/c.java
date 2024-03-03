import java.util.*;
import java.lang.String;
class signal extends Thread
{
   
      int s;
      public signal (int s)
      {
             this.s=s; 
      }
      public void run()
      {
            if (s==1)
                System.out.println("SIGNAL :GREEN \n GO");
            if (s==2)
                System.out.println("SIGNAL :YELLOW \n PLEASE WAIT ");
            if (s==3)
                System.out.println("SIGNAL :RED \n STOP");
      }
} 

public class c 
{
       public static void main(String args[])
       {
               Scanner sc = new Scanner(System.in);
               System.out.println("1.GREEN\n2.YELLOW\n3.RED\n");
               int n=sc.nextInt();
               signal s1 = new signal(n);
               s1.start();
       }
}                         
  

