package que1;

import java.util.*;

public class Main {

    static ArrayList<Contact> contacts = new ArrayList<>();
    static HashMap<String, Contact> map = new HashMap<>();
    static HashSet<String> phoneSet = new HashSet<>();
    
    static void addContact(String name, String phone, String email) {

        if (phoneSet.contains(phone)) {
            System.out.println("Duplicate phone number! Contact not added.");
            return;
        }

        Contact c = new Contact(name, phone, email);

        contacts.add(c);
        map.put(name, c);
        phoneSet.add(phone);

        System.out.println("Contact Added Successfully.");
    }

    static void searchContact(String name) {

        if (map.containsKey(name)) {
            System.out.println(map.get(name));
        } else {
            System.out.println("Contact Not Found.");
        }
    }

    static void deleteContact(String name) {

        if (!map.containsKey(name)) {
            System.out.println("Contact Not Found.");
            return;
        }

        Contact c = map.get(name);

        contacts.remove(c);
        phoneSet.remove(c.phone);
        map.remove(name);

        System.out.println("Contact Deleted.");
    }

    static void displayContacts() {

        Collections.sort(contacts, (a, b) -> a.name.compareTo(b.name));

        System.out.println("\nContact List:");

        for (Contact c : contacts) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {

        addContact("Krishna", "9876543210", "krishna@gmail.com");
        addContact("Amit", "9123456789", "amit@gmail.com");
        addContact("Rahul", "9988776655", "rahul@gmail.com");

        addContact("Rohit", "9876543210", "rohit@gmail.com");

        System.out.println("\nSearch:");
        searchContact("Amit");

        System.out.println("\nDelete:");
        deleteContact("Rahul");

        displayContacts();
    }
}