package com.bridgelab.main;

import java.util.Scanner;
import java.lang.*;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Address Book System ");
        AddressBook addressBook = new AddressBook();

        addressBook.add();
        System.out.println("You have Entered following data");
        System.out.println(addressBook.contact);

        System.out.println("Enter 1 . Edit \n 2 . Delete \n press any key for exit");
        int op = sc.nextInt();
        sc.nextLine();
        switch (op){
            case 1:

                addressBook.editContact();
                System.out.println("You have Entered following data");
                System.out.println(addressBook.contact);
                System.out.println("Thank for Using Address book");
                break;
            case 2:
                addressBook.delete();
                System.out.println("Now data is :"+addressBook.contact);
                break;
            default:
                //System.out.println("Thanks for using \n you have address "+addressBook.contact);

           // System.exit(0);
                break;

        }


    }
}
