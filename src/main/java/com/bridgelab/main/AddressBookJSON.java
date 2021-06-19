package com.bridgelab.main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;


import static com.bridgelab.main.AddressBook.contactList;

public class AddressBookJSON {
    public static void writeDataToJSon() throws IOException {
        {
            Path filePath = Paths.get("Contacts.json");
            Gson gson = new Gson();
            String json = gson.toJson(contactList);
            FileWriter writer = new FileWriter(String.valueOf(filePath));
            writer.write(json);
            writer.close();
        }
    }

    // Read from JSON
    public static void readDataFromJson() throws IOException {
        ArrayList<Contacts> contactList = null;
        Path filePath = Paths.get("Contacts.json");
        try (Reader reader = Files.newBufferedReader(filePath);) {
            Gson gson = new Gson();
            contactList = new ArrayList<Contacts>(Arrays.asList(gson.fromJson(reader, Contacts[].class)));
            for (Contacts contact : contactList) {
                System.out.println("Firstname : " + contact.getfName());
                System.out.println("Lastname : " + contact.getlName());
                System.out.println("Address : " + contact.getAddress());
                System.out.println("City : " + contact.getCity());
                System.out.println("State : " + contact.getState());
                System.out.println("Zip Code : " + contact.getZip());
                System.out.println("Phone number : " + contact.getPhone());
                System.out.println("Email : " + contact.getEmail());
            }
        }
    }
}
