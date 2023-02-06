package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    static Scanner sc = new Scanner(System.in);
    static List<Contacts> contactsList;

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        contactsList = new ArrayList<>();
        showMenu();
    }

    static void showMenu() {
        System.out.println("Please select the option");
        System.out.println("1. Show All Contact");
        System.out.println("2. Add a New Contact");
        System.out.println("3. Update a Contact");
        System.out.println("4. Delete a Contact");
        System.out.println("5. Exit");
        int selection = sc.nextInt();
        selectionFunction(selection);
    }

    static void selectionFunction(int selection) {
        switch (selection) {
            case 1 -> showContact();
            case 2 -> addContact();
            case 3 -> updateContact();
            case 4 -> deleteContact();
            case 5 -> System.exit(0);
            default -> showMenu();
        }
    }

    static void showContact() {
        System.out.println("Contacts");
        int count = 1;
        for (Contacts contacts : contactsList) {
            System.out.println("Contact no." + count + ". " + contacts);
            count++;
        }
        showMenu();
    }

    static void addContact() {
        System.out.println("Add a New Contact");
        System.out.print("Enter First Name : ");
        String first_name = sc.next();
        System.out.print("Enter Last Name : ");
        String last_name = sc.next();
        System.out.print("Enter Phone : ");
        String phone_number = sc.next();
        System.out.print("Enter Email : ");
        String email = sc.next();
        System.out.print("Enter City : ");
        String city = sc.next();
        System.out.print("Enter State : ");
        String state = sc.next();
        System.out.print("Enter Zip : ");
        String zipcode = sc.next();

        Contacts contacts = new Contacts(first_name, last_name, phone_number, email, city, state, zipcode);
        contactsList.add(contacts);
        System.out.println("Contact Added to the Address Book");
        System.out.println(contacts);
        showMenu();
    }

    static void updateContact() {
        System.out.println("Enter the name of the Person to update the contact details");
        String name = sc.next();
        for (Contacts contacts : contactsList) {
            if (contacts.first_name.equals(name)) {
                System.out.println("Enter First Name : ");
                String first_name = sc.next();
                System.out.println("Enter Last Name : ");
                String last_name = sc.next();
                System.out.println("Enter Phone Number : ");
                String phone_number = sc.next();
                System.out.println("Enter email ID : ");
                String email = sc.next();
                System.out.println("Enter City: ");
                String city = sc.next();
                System.out.println("Enter State : ");
                String state = sc.next();
                System.out.println("Enter Zipcode : ");
                String zipcode = sc.next();
                contacts.setFirstname(first_name);
                contacts.setLastname(last_name);
                contacts.setPhone(phone_number);
                contacts.setEmail(email);
                contacts.setCity(city);
                contacts.setState(state);
                contacts.setZipcode(zipcode);
                System.out.println("Contact Updated in the Address Book");
            }
        }
        showMenu();
    }

    static void deleteContact() {
        System.out.println("Enter the name of the Person to Delete the contact details");
        String name = sc.next();
        for (Contacts contacts : contactsList) {
            if (contacts.first_name.equals(name)) {
                contactsList.remove(contacts);
                System.out.println(name + " is deleted from the Address Book");
            }
        }
        showMenu();
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

    public void setFirstname(String first_name) {
        this.first_name = first_name;
    }

    public void setLastname(String last_name) {
        this.last_name = last_name;
    }

    public void setPhone(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "First Name : '" + first_name + "', Last Name : '" + last_name + "', Phone Number : '" + phone_number + "', email ID : '" + email + "', City : '" + city + "', State : '" + state + "', Zipcode : '" + zipcode + "'";
    }
}