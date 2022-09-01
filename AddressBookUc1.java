package com.addressbook;

public class AddressBookUc1 {
    private class Contact {
        String firstName, lastName, address, city, state, emailId;
        int zipCode;
        long mobileNumber;

    }
    public void printContact() {
        Contact person = new Contact();
        person.firstName = "Sanket";
        person.lastName = "Ladke";
        person.address = "Vitthal Wadi";
        person.city = "Wani";
        person.state = "Maharastra";
        person.zipCode = 445304;
        person.mobileNumber = 1234567890;
        person.emailId = "sanketladke007@gmail.com";
        System.out.println("Contact Details");
        System.out.println("Name    :  " + person.firstName + " " + person.lastName + "\n" + "Address   : " + person.address + "\n"
                + "City :  " + person.city + "\n" + "State  :" + person.state + "\n" + "ZipCode : " + person.zipCode + "\n"
                + "Mobile Number    : " + person.mobileNumber + "\n" + "EmailId : " + person.emailId + "\n");

    }
    public static void main(String[] args) {
        AddressBookUc1 addressBookUc1 = new AddressBookUc1();
        addressBookUc1.printContact();
    }
}
