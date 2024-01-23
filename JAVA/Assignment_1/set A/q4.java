import java.util.HashMap;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> studentContacts = new HashMap<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add student");
            System.out.println("2. Display contact list");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.next();
                    System.out.print("Enter mobile number: ");
                    String mobileNumber = scanner.next();
                    studentContacts.put(mobileNumber, name);
                    System.out.println("Student added successfully!");
                    break;
                case 2:
                    if (studentContacts.isEmpty()) {
                        System.out.println("No student details available.");
                    } else {
                        System.out.println("\nContact list:");
                        for (String mobileNumbers : studentContacts.keySet()) {
                            String names = studentContacts.get(mobileNumbers);
                            System.out.println("Name: " + names + ", Mobile Number: " + mobileNumbers);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
