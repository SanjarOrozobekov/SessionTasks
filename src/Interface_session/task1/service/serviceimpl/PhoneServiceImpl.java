package Interface_session.task1.service.serviceimpl;

import Interface_session.task1.database.Database;
import Interface_session.task1.models.Contact;
import Interface_session.task1.models.Phone;
import Interface_session.task1.service.PhoneIntervice;

import java.util.Scanner;

public class PhoneServiceImpl implements PhoneIntervice {
    @Override
    public String turnOn(String command, Phone phone) {
        if(command.equalsIgnoreCase("ON")){
            System.out.println("Please write password: ");
            if(phone.getPassword().equals(new Scanner(System.in).nextLine())) {
                return "Phone on";
            }
        }
        return "Incorect password! Try again!";
    }

    @Override
    public Contact call(String name) {
        for (Contact contact : Database.contacts) {
            if(contact.getFullName().equals(name)){
                return contact;
            }
        }
        return null;
    }

    @Override
    public Contact call(long phoneNumber) {
        for (Contact contact : Database.contacts) {
            if(contact.getPhoneNumber() == phoneNumber){
                return contact;
            }
        }
        return null;
    }

    @Override
    public Contact updateContact(String oldName, String newName) {
        for (Contact contact : Database.contacts) {
            if(contact.getFullName().equals(oldName)){
                contact.setFullName(newName);
                return contact;
            }
        }
        return null;
    }

    @Override
    public Contact[] getAllContact() {
        return Database.contacts;
    }
}
