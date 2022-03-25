package Beginner.object.equals;

import java.util.Arrays;
import java.util.Objects;

public class Contact {

    int id =0;
    String name = "";
    String phone = "";
    String[] a = new String[5];


    public Contact(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact contact = (Contact) o;
        return id == contact.id && Objects.equals(name, contact.name) && Objects.equals(phone, contact.phone) && Arrays.equals(a, contact.a);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, name, phone);
        result = 31 * result + Arrays.hashCode(a);
        return result;
    }
}
