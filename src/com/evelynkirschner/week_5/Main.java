package com.evelynkirschner.week_5;

import java.util.TreeMap;
import java.util.Map;

class ContactInfo {
    // instance fields
    protected String fullName, emailAddress;

    // Constructor
    public ContactInfo(String name, String email) {
        this.fullName = name;
        this.emailAddress = email;
    }
}

class AddressBook {

    // instance fields
    private Map<String,ContactInfo> _addresses = new TreeMap<>();

    // constructor - not needed

    // Add a contact to the address book
    public void addContact(String contactName, ContactInfo newContact) {
        _addresses.put(contactName, newContact);
    }

    public String findContactEmail(String contactName) {
        ContactInfo person = _addresses.get(contactName);
        if ( person != null)
            return _addresses.get(contactName).emailAddress;
        else
            return "Contact is not in your address book!";
    }

}

public class Main {
    public static void main(String[] args) {
        AddressBook blackBook = new AddressBook();

        // Add some contacts:
        blackBook.addContact("John", new ContactInfo("John", "john@mail.com"));
        blackBook.addContact("David", new ContactInfo("David", "david@gmail.com"));
        blackBook.addContact("Paul", new ContactInfo("Paul", "paul@hotmail.com"));

        System.out.println( "David's email address is " + blackBook.findContactEmail("David"));
        System.out.println( "Andrew's email address is " + blackBook.findContactEmail("Andrew"));
    }
}
