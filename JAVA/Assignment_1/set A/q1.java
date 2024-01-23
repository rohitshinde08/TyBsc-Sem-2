import java.util.*;
import java.util.ArrayList;
public class q1
{
	public static void main (String []args)
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of city");
		int n=sc.nextInt();
		ArrayList a=new ArrayList<>();
		System.out.println("Enter the name of city :");
		for (i=0;i<n;i++)
			a.add(sc.next());
			System.out.println("Cities in arrayList are :");
		for (i=0;i<a.size();i++)
			System.out.println(a.get(i));
		a.clear();
		if (a.isEmpty())
			System.out.println("The arrayList is empty :");
		else
			System.out.println("Error");
		}
}
