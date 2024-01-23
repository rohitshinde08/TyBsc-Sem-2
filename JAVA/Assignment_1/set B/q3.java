import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class q3 
{
    public static void main(String[] args) 
    {
        
        Map<String, String> phonebook = new HashMap<>();

        
        loadDataFromFile(phonebook, "sample.txt");

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name or phone number: ");
        String userInput = scanner.nextLine().trim();

        
        if (userInput.matches("\\d+")) {
           
            String name = findNameByPhoneNumber(phonebook, userInput);
            if (name != null) {
                System.out.println("Name for phone number " + userInput + ": " + name);
            } else {
                System.out.println("No matching name found for phone number " + userInput);
            }
        } else {
            
            String phoneNumber = findPhoneNumberByName(phonebook, userInput);
            if (phoneNumber != null) {
                System.out.println("Phone number for name " + userInput + ": " + phoneNumber);
            } else {
                System.out.println("No matching phone number found for name " + userInput);
            }
        }

        
        scanner.close();
    }

    private static void loadDataFromFile(Map<String, String> phonebook, String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\t");
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    String phoneNumber = parts[1].trim();
                    phonebook.put(name, phoneNumber);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }

    private static String findPhoneNumberByName(Map<String, String> phonebook, String name) {
        return phonebook.get(name);
    }

    private static String findNameByPhoneNumber(Map<String, String> phonebook, String phoneNumber) {
        for (Map.Entry<String, String> entry : phonebook.entrySet()) {
            if (entry.getValue().equals(phoneNumber)) {
                return entry.getKey();
            }
        }
        return null;
    }
}
	

