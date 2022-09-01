package com.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookUc4 {
    ContactDetails person = new ContactDetails();
    List<ContactDetails> contactDetailsList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addContact() {
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
    public void editContact() {
        System.out.println("Enter the first name of Person to edit contact");
        String firstName = sc.next();
        if (firstName.equalsIgnoreCase(person.getFirstName())) {
            addContact();
        } else {
            System.out.println("The Entred First Name Is Not match");
            editContact();
        }
    }
    public void deleteContact() {
        System.out.println("Enter The First nme of person To delete Contact");
        String deleteName = sc.next();
        if (deleteName.equalsIgnoreCase(person.getFirstName())) {
            System.out.println("Deleted " + person.getFirstName() + " details");
            person = null;

        } else {
            System.out.println("The Entred First name Is Not Match");
            deleteContact();
        }
    }
    public void printContact() {
        for (int i = 0; i < contactDetailsList.size(); i++) {
            person = contactDetailsList.get(i);
            System.out.println(" contact Details ");
            System.out.println("Name       : " + person.getFirstName() + " " + person.getLastName() + "\n"
                    + "Address      : " + person.getAddress() + "\n" + "City        :" + person.getCity() + "\n" + "State     : " + person.getState() + "\n"
                    + "ZipCode      : " + person.getZipCode() + "\n" + "MobileNumber        :" + person.getMobileNumber() + "\n"
                    + "EmailId     : " + person.getEmailId() + "\n");
        }
    }
}

