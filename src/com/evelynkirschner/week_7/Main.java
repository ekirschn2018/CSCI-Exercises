package com.evelynkirschner.week_7;

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

public class Main {
    public static void main(String[] args)
    {
        Contact contact = new Contact("Bob Jones", "bjones@gmail.com");
        BusinessContact bContact = new BusinessContact("Jim Jones", "jjones@hotmail.com", "614-555-1212");
        contact.displayContact();
        bContact.displayContact();
    }


}
