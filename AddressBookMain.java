package com.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBookUc3 addressBookUc3 = new AddressBookUc3();
        Scanner sc = new Scanner(System.in);
        addressBookUc3.addContact();
        System.out.println("Entre y To Edit Contact");
        String choice = sc.nextLine();
        if (choice.equals("y") || choice.equals("y")){
            addressBookUc3.editContact();
        }
    }
}
