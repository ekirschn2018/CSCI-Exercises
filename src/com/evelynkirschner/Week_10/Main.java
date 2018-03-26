package com.evelynkirschner.Week_10;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

class ContactEmail {
    private String name, email;

    ContactEmail(String name, String email){
        this.name = name;
        this.email = email;
    }

    public void display(){
        System.out.println("Name: " + name + " Email address: " + email);
    }
}

class ContactList implements Iterable<ContactEmail> {
    List<ContactEmail> list = new ArrayList<>();

    public void add(ContactEmail c){
        list.add(c);
    }

    @Override
    public Iterator<ContactEmail> iterator() {
        return list.iterator();
    }
}
public class Main {

    public static void main(String[] args) {
        ContactList contactList = new ContactList();

        // add some items
        contactList.add(new ContactEmail("John", "john@mail.com"));
        contactList.add(new ContactEmail("Jane", "jane@gmail.com"));
        contactList.add(new ContactEmail("Greg", "greg@aol.com"));
        contactList.add(new ContactEmail("Emily", "emily@juno.com"));

        // iterate through and print
        for (ContactEmail c: contactList) {
            c.display();
        }
    }
}

