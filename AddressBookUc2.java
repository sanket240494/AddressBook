package com.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookUc2 {
    static ContactDetails person = new ContactDetails();
    static List<ContactDetails> contactDetailsList = new ArrayList<>();


    public static void addNewContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name : ");
        String firstName = sc.next();
        System.out.println("Enter Last Name : ");
        String lastName = sc.next();
        System.out.println("Enter Address : ");
        String address = sc.next();
        System.out.println("Enter City : ");
        String city = sc.next();
        System.out.println("Enter State : ");
        String state = sc.next();
        System.out.println("Enter ZipCode : ");
        int zipCode = sc.nextInt();
        System.out.println("Enter Mobile Number : ");
        long mobileNumber = sc.nextLong();
        System.out.println("Enter Email Id : ");
        String emailId = sc.next();
        person = new ContactDetails(firstName, lastName, address, city, state, zipCode, mobileNumber, emailId);
        contactDetailsList.add(person);
        printContact();
    }
    public static void printContact() {
        for (int i = 0; i < contactDetailsList.size(); i++) {
            person = contactDetailsList.get(i);
            System.out.println(" contact Details ");
            System.out.println("Name       : " + person.getFirstName() + " " + person.getLastName() + "\n"
                    + "Address      : " + person.getAddress() + "\n" + "City        :" + person.getCity() + "\n" + "State     : " + person.getState() + "\n"
                    + "ZipCode      : " + person.getZipCode() + "\n" + "MobileNumber        :" + person.getMobileNumber() + "\n"
                    + "EmailId     : " + person.getEmailId() + "\n");
        }
    }
    public static void main(String[] args) {
        addNewContact();
    }
}
