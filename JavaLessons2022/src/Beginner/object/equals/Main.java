package Beginner.object.equals;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Contact contact = new Contact(124,"Vasiliy","+380681234136");
        Contact contact2 = new Contact(124,"Vasiliy","+380681234136");

//        ArrayList<Contact> contacts = new ArrayList<>();
        HashSet<Contact> contacts = new HashSet<>();
        contacts.add(contact);
        contacts.add(contact2);
//        System.out.println(contacts.contains(contact2));
//        System.out.println(contacts.indexOf(contact2));
//       contacts.remove(contact2);
        System.out.println(contacts.size());
//        System.out.println(contact.hashCode());
//        System.out.println(contact2.hashCode());
//
//        System.out.println(contact.equals(contact2));
    }
}
