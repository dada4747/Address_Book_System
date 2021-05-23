package com.bridgelab.main;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Address Book System ");
        AddressBook addressBook = new AddressBook();

        addressBook.add();
        System.out.println("You have Entered following data");
        System.out.println(addressBook.contact);

        System.out.println("Enter Y/y to edit ");
        String op = sc.nextLine();

        if(op.equals("y") || op.equals("Y")){
            addressBook.editContact();
            System.out.println("You have Entered following data");
            System.out.println(addressBook.contact);
            System.out.println("Thank for Using Address book");
        }else {
            System.out.println("Thanks for using ");
        }

    }
}
