package com.evelynkirschner.week_7;

import java.util.ArrayList;

class Contact {
    // instance fields
    protected String fullName, emailAddress;

    // Constructor
    public Contact(String name, String email) {
        this.fullName = name;
        this.emailAddress = email;
    }

    public void displayContact(){
        System.out.println("Contact Name: " + this.fullName + " email: " + this.emailAddress);
    }
}

class BusinessContact extends Contact {
    protected String phoneNumber;

    // Constructor
    public BusinessContact(String name, String email, String phone){
        super(name,email);
        this.phoneNumber = phone;
    }

    @Override
    public void displayContact(){
        System.out.println("Contact Name: " + this.fullName + " email: " + this.emailAddress +
                " phone number: " + this.phoneNumber );
    }
}

class ContactCollection {

    // instance field
    ArrayList<Contact> contactList = new ArrayList<Contact>();

    public void addContact( Contact newContact ){
        contactList.add(newContact);
    }
    public void displayContact() {
        for (Contact contact: contactList) {
            contact.displayContact();
        }
    }
}
public class Main {
    public static void main(String[] args)
    {
        // Showing Exercise 1
        System.out.println("Exercise 1");
        Contact contact = new Contact("Bob Jones", "bjones@gmail.com");
        BusinessContact bContact = new BusinessContact("Jim Jones", "jjones@hotmail.com", "614-555-1212");
        contact.displayContact();
        bContact.displayContact();

        // Exercise 2
        System.out.println("");
        System.out.println("Exercise 2");
        ContactCollection myContacts = new ContactCollection();
        myContacts.addContact( new Contact("John Doe", "jdoe@gmail.com") );
        myContacts.addContact(new BusinessContact("Jane Smith", "jsmith@hotmail.com", "614-555-1212"));
        myContacts.displayContact();
    }


}
