package com.bridgelab.main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {
    Contacts contact = new Contacts();
    Scanner sc = new Scanner(System.in);
    ArrayList<Contacts> contactArrayList = new ArrayList<Contacts>();
    Map<String, Contacts> contactsMap = new HashMap<String, Contacts>();
    public void addlisttomap(){
        for(int i = 0; i < contactArrayList.size() ; i++) {
            contactsMap.put(contactArrayList.get(i).email, contactArrayList.get(i));
        }
        for (Map.Entry<String, Contacts> entry : contactsMap.entrySet()) {
            System.out.print(entry.getKey() + "\t\t\t\t" +
                    entry.getValue().getFirstName() + "\t\t\t\t\t" +
                    entry.getValue().getLastName() +"\t\t\t"+
                    entry.getValue().getAddress() +"\t\t\t\t"+
                    entry.getValue().getCity() +"\t\t\t\t\t"+
                    entry.getValue().getZipCode() +"\t\t\t\t\t"+
                    entry.getValue().getPhoneNumber() +"\t\t\t\t\t"+
                    entry.getValue().getEmail());
            System.out.println("\n-----------------------------------------------------------------------------------------------------------------");
        }
    }
    public void addContact() {
        System.out.println("Please Enter Following data....!");
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter last Name: ");
        String lastName = sc.nextLine();
        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        System.out.print("Enter City Name: ");
        String city = sc.nextLine();
        System.out.print("Enter State Name: ");
        String state = sc.nextLine();
        System.out.print("Enter zip code of your area: ");
        Long zipCode = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter Phone Number: ");
        Long phoneNum = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter EMail ID: ");
        String email = sc.nextLine();
        contactArrayList.add(new Contacts(firstName,lastName,address,city,state,zipCode,phoneNum,email));
    }

    public void editContact() {
        System.out.println("Enter First Name of Persion You want edit");
        String editName = sc.next();
        if (contactArrayList.isEmpty()){
            System.out.println("The AddressBook is Empty....!");
        }else{
            for (int i = 0; i < contactArrayList.size(); i++){
                String matcher = contactArrayList.get(i).getFirstName();
                if (matcher.equalsIgnoreCase(editName)){
                    System.out.print("Enter New First Name: ");
                    String firstName = sc.next();
                    System.out.print("Enter New Last Name: ");
                    String lastName = sc.next();
                    System.out.print("Enter New Address: ");
                    String address = sc.next();
                    System.out.print("Enter New City: ");
                    String city = sc.next();
                    System.out.print("Enter New State: ");
                    String state = sc.next();
                    System.out.print("Enter New Zip Code of area: ");
                    Long zipCode = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Enter New Mobile Number: ");
                    Long phoneNum = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Enter New Email Id: ");
                    String email = sc.nextLine();
                    contactArrayList.get(i).setFirstName(firstName);
                    contactArrayList.get(i).setLastName(lastName);
                    contactArrayList.get(i).setAddress(address);
                    contactArrayList.get(i).setCity(city);
                    contactArrayList.get(i).setState(state);
                    contactArrayList.get(i).setZipCode(zipCode);
                    contactArrayList.get(i).setPhoneNumber(phoneNum);
                    contactArrayList.get(i).setZipCode(zipCode);
                    System.out.println("Contact Update");
                }
                else {
                    System.out.println("Name Not Found try again!!!");
                }
            }
        }
    }
    public void deleteContact() {
        System.out.println("Enter First Name of Person for delete: ");
        String deleteName = sc.next();
        if(contactArrayList.isEmpty()){
            System.out.println("The AddressBook is Empty....!");
        }else{
            for (int i = 0; i < contactArrayList.size(); i++){
                String matcher = contactArrayList.get(i).getFirstName();
                if (matcher.equalsIgnoreCase(deleteName)){
                    contactArrayList.remove(i);
                    System.out.println("Contact Deleted Successfully...");
                }else {
                    System.out.println("Name Not Found");
                }
            }
        }
    }
    public void showContact(){
        System.out.println("Number of contacts is stored in directory: " + contactArrayList.size());
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        if (contactArrayList.isEmpty()){
            System.out.println("There no contacts available for show...");
        }else {
            System.out.println("ContactId" + " First Name\t\t\tLast Name\t\t\tAddress\t\t\tCity\t\t\tZip Code\t\t\tMobile Number\t\t\tEmail Id ");

            /*for (int i = 0; i < contactArrayList.size(); i++) {
                System.out.print((i + 1) + "\t\t" + contactArrayList.get(i).getFirstName() + "\t\t\t\t\t" +
                        contactArrayList.get(i).getLastName() +"\t\t\t"+
                        contactArrayList.get(i).getAddress() +"\t\t\t\t"+
                        contactArrayList.get(i).getCity() +"\t\t\t\t\t"+
                        contactArrayList.get(i).getZipCode() +"\t\t\t\t\t"+
                        contactArrayList.get(i).getPhoneNumber() +"\t\t\t\t\t"+
                        contactArrayList.get(i).getEmail());
                System.out.println("\n-----------------------------------------------------------------------------------------------------------------");
            }*/
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        addlisttomap();
    }
    public void getMenu() {
        System.out.println("------------------Menu For AddressBooK------------------");

        boolean exit = false;
        do{
            System.out.println("Choose Option from below \n1. Add Contacts \n2. Edit Contact \n3. Delete Contact \n4. View Contacts \n5. Exit ");
            System.out.print("->:");
            int op = sc.nextInt();
            sc.nextLine();
            switch (op){
                case 1:
                    addContact();
                    System.out.println("Contact added successfully....");
                    break;
                case 2:
                    editContact();
                    System.out.println("Contact edited successfully....");
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    showContact();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.print("Please Choose right option: ");

                    break;
            }
        }while(!exit);
    }
}