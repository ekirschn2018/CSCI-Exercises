package com.evelynkirschner.Week_9;

abstract class Contact {
    private String name;

    Contact( String name ){
        this.name = name;
    }

    abstract public void contact();
}

class ContactEmail extends Contact {
    private String email;

    ContactEmail( String name, String email){
        super(name);
        this.email = email;
    }

    @Override
    public void contact() {
        System.out.println("Emailing " + email);
    }
}

class ContactPhone extends Contact {
    private String phone;

    ContactPhone( String name, String phone){
        super(name);
        this.phone = phone;
    }

    @Override
    public void contact(){
        System.out.println("Calling " + phone);
    }
}
public class Main {

    public static void main(String[] args) {

        ContactPhone callJoe = new ContactPhone("Joe", "614-555-1212");
        ContactEmail emailJoe = new ContactEmail("Joe", "joe@mail.com");

        callJoe.contact();
        emailJoe.contact();
    }

}
