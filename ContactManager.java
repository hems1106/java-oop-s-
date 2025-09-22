import java.util.ArrayList;
import java.util.Scanner;

public class ContactManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> contacts = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Contact Management System ---");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            if (choice == 1) {
                System.out.print("Enter contact name to add: ");
                String name = sc.nextLine();
                contacts.add(name);
                System.out.print("Enter phone number: ");
                String phone = sc.nextLine();
                 contacts.add(phone);
                System.out.println("Contact added.");
            } else if (choice == 2) {
                System.out.println("Contact List:");
                for (String name : contacts) {
                    System.out.println("- " + name);
                }
                if (contacts.isEmpty()) {
                    System.out.println("No contacts found.");
                }
            } else if (choice == 3) {
                System.out.print("Enter name to search: ");
                String search = sc.nextLine();
                boolean found = false;
                for (String name : contacts) {
                    if (name.toLowerCase().contains(search.toLowerCase())) {
                        System.out.println("Found: " + name);
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Contact not found.");
                }
            } else if (choice == 4) {
                System.out.print("Enter name to update: ");
                String oldName = sc.nextLine();
                if (contacts.contains(oldName)) {
                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();
                    int index = contacts.indexOf(oldName);
                    contacts.set(index, newName);
                    System.out.println("Contact updated.");
                } else {
                    System.out.println("Contact not found.");
                }
            } else if (choice == 5) {
                System.out.print("Enter name to delete: ");
                String deleteName = sc.nextLine();
                if (contacts.remove(deleteName)) {
                    System.out.println("Contact deleted.");
                } else {
                    System.out.println("Contact not found.");
                }
            } else if (choice == 6) {
                System.out.println("Exiting program.");
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }

        sc.close();
    }
}
