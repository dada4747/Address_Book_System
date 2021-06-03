package com.bridgelab.main;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    public ArrayList<Contacts> contactList = new ArrayList<>();
    public void addContact(Contacts contact) {
        contactList.add(contact);
    }
    //method for search contact by name
    public int searchByName(String name) {
        for (Contacts contact : contactList)
            if (contact.getfName().equalsIgnoreCase(name))
                return contactList.indexOf(contact);
        return -1;
    }
    //method for edit contact
    public boolean editContact(String name, Contacts edit) {
        int index = searchByName(name);
        if (index == -1)
            return false;
        contactList.set(index, edit);
        return true;
    }
    //method for delete contact
    public boolean deleteContact(String name) {
        int index = searchByName(name);
        if (index == -1)
            return false;
        contactList.remove(index);
        return true;
    }
    //for showing output details
    @Override
    public String toString() {
        if (contactList.isEmpty())
            return "No contacts found!";
        String result = new String();
        for (int i = 0; i < contactList.size(); i++) {
            result += " " + contactList.get(i);
        }
        return result;
    }
    //method for adding details
    public static Contacts readContact() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        System.out.print("Enter City: ");
        String city = sc.nextLine();
        System.out.print("Enter State: ");
        String state = sc.nextLine();
        System.out.print("Enter Zip Code: ");
        Long zip = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter Phone Number: ");
        Long phoneNum = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter Email ID: ");
        String email = sc.nextLine();
        return new Contacts(firstName, lastName, address, city, state, zip, phoneNum, email);
    }
    //method for show option for contacts
    public static void addressBookOptions(AddressBook addressBook) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n-------------------------- Address Book Contact Option --------------------------");
            System.out.println("1. Add contact details");
            System.out.println("2. Edit contact details");
            System.out.println("3. Delete contact details");
            System.out.println("4. Show contacts details");
            System.out.println("5. Back to main menu");
            System.out.print("Enter Your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    addressBook.addContact(readContact());//call addcontact with passing method readcontact
                    break;
                case 2:
                    System.out.println("Enter First name to edit contact: ");
                    String name = sc.nextLine();
                    if (addressBook.searchByName(name) == -1) //call searchbyname method by passing first name value
                        System.out.println("Data Not Found....!");
                    else
                        addressBook.editContact(name, readContact()); //call edit method with name and method parameter
                    break;
                case 3:
                    System.out.println("Enter First name to delete contact: ");
                    name = sc.nextLine();
                    if (addressBook.searchByName(name) == -1)
                        System.out.println("Data Not Found....!");
                    else
                        addressBook.deleteContact(name); //call method for delete contact
                    break;
                case 4:
                    System.out.println(addressBook.toString()); //call tostring method for showing details
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
        }
    }
}