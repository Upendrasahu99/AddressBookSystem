package com.bridgelabz;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Contacts contacts = new Contacts("Anil", "Kumar", "9996663331", "anilk@gmail.com", "Delhi", "New Delhi", "100001");
        System.out.println("First Name : " + contacts.first_name);
        System.out.println("Last Name : " + contacts.last_name);
        System.out.println("Phone Number : " + contacts.phone_number);
        System.out.println("email ID : " + contacts.email);
        System.out.println("City : " + contacts.city);
        System.out.println("State : " + contacts.state);
        System.out.println("Zipcode : " + contacts.zipcode);
    }
}

class Contacts {
    String first_name, last_name, city, state, email, phone_number, zipcode;

    public Contacts(String first_name, String last_name, String phone_number, String email, String city, String state, String zipcode) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
        this.email = email;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }
}
