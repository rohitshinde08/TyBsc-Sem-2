import java.util.*;
import java.util.ArrayList;
public class q2
{
	public static void main (String []args)
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of friends");
		int n=sc.nextInt();
		LinkedList a=new LinkedList<>();
		System.out.println("Enter the name of friends :");
		for (i=0;i<n;i++)
			a.add(sc.next());
			System.out.println("Frineds :");
				
		for (i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
	}
}
