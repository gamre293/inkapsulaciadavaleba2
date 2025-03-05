import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhonebookApp {
    private static final int MAX_CONTACTS = 30;
    private static List<PhoneContact> contacts;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        contacts = Data.loadContacts();
        while (true) {
            System.out.println("\nPhonebook Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. View Contacts");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addContact();
                case 2 -> editContact();
                case 3 -> deleteContact();
                case 4 -> viewContacts();
                case 5 -> {
                    System.out.println("Exiting Phonebook...");
                    return;
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }

    private static void addContact() {
        if (contacts.size() >= MAX_CONTACTS) {
            System.out.println("Phonebook is full! Cannot add more contacts.");
            return;
        }

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        contacts.add(new PhoneContact(firstName, lastName, phoneNumber, email));
        Data.saveContacts(contacts);
        System.out.println("Contact added successfully!");
    }

    private static void editContact() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }

        viewContacts();
        System.out.print("Enter contact number to edit: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // consume newline

        if (index < 0 || index >= contacts.size()) {
            System.out.println("Invalid contact number!");
            return;
        }

        PhoneContact contact = contacts.get(index);
        System.out.print("New First Name (" + contact.getFirstName() + "): ");
        String firstName = scanner.nextLine();
        System.out.print("New Last Name (" + contact.getLastName() + "): ");
        String lastName = scanner.nextLine();
        System.out.print("New Phone Number (" + contact.getPhoneNumber() + "): ");
        String phoneNumber = scanner.nextLine();
        System.out.print("New Email (" + contact.getEmail() + "): ");
        String email = scanner.nextLine();

        if (!firstName.isEmpty()) contact.setFirstName(firstName);
        if (!lastName.isEmpty()) contact.setLastName(lastName);
        if (!phoneNumber.isEmpty()) contact.setPhoneNumber(phoneNumber);
        if (!email.isEmpty()) contact.setEmail(email);

        Data.saveContacts(contacts);
        System.out.println("Contact updated successfully!");
    }

    private static void deleteContact() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }

        viewContacts();
        System.out.print("Enter contact number to delete: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // consume newline

        if (index < 0 || index >= contacts.size()) {
            System.out.println("Invalid contact number!");
            return;
        }

        contacts.remove(index);
        Data.saveContacts(contacts);
        System.out.println("Contact deleted successfully!");
    }

    private static void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }

        System.out.println("\nPhonebook Contacts:");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i + 1) + ". " + contacts.get(i));
        }
    }
}
