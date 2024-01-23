import java.util.Scanner;
import java.util.TreeSet;

public class q1
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();

        TreeSet<Integer> uniqueIntegers = new TreeSet<>();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            uniqueIntegers.add(scanner.nextInt());
        }

        System.out.println("\nIntegers in sorted order (without duplicates):");
        for (int integer : uniqueIntegers) {
            System.out.println(integer);
        }
    }
}
