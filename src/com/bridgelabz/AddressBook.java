package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    static Scanner sc = new Scanner(System.in);
    static List<Contacts>contactsList;
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        contactsList = new ArrayList<>();
        System.out.println("Add new Contact");
        System.out.print("Enter First Name : ");
        String firstName = sc.next();
        System.out.print("Enter Last Name : ");
        String lastName = sc.next();
        System.out.print("Enter Phone : ");
        String phoneNumber = sc.next();
        System.out.print("Enter Email : ");
        String email = sc.next();
        System.out.print("Enter City : ");
        String city = sc.next();
        System.out.print("Enter State : ");
        String state = sc.next();
        System.out.print("Enter Zip : ");
        String zipcode = sc.next();

        Contacts contacts = new Contacts(firstName,lastName,phoneNumber,email,city,state,zipcode);
        contactsList.add(contacts);
        System.out.println("Contact Added to the Address Book");
        System.out.println(contacts);
    }

}
class Contacts {
    String first_name,last_name,city,state,email,phone_number,zipcode;
    public Contacts(String first_name,String last_name,String phone_number,String email,String city,String state,String zipcode) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
        this.email = email;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }
    @Override
    public String toString() {
        return "First Name : '" + first_name + "', Last Name : '" + last_name + "', Phone Number : '" + phone_number + "', email ID : '" + email + "', City : '" + city + "', State : '" + state + "', Zipcode : '" + zipcode + "'";
    }
}
