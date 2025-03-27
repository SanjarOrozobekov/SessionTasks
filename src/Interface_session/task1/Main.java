package Interface_session.task1;

import Interface_session.task1.database.Database;
import Interface_session.task1.models.Phone;
import Interface_session.task1.service.PhoneIntervice;
import Interface_session.task1.service.serviceimpl.PhoneServiceImpl;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("IPhone", "Apple", "12345", Database.contacts);
        PhoneIntervice phoneIntervice = new PhoneServiceImpl();
                System.out.println("On/Off");
                System.out.println(phoneIntervice.turnOn(new Scanner(System.in).nextLine(), phone));
        System.out.println("""
                1.Позвонить по имя.
                2.Позвонить по номеру телефона.
                3.Изменить имя.
                4.Помотреть контакт.
                Введите цифру: 
                """);
        int knopka = new Scanner(System.in).nextInt();
        switch (knopka) {
            case 1: {
                System.out.println("Write name: ");
                System.out.println(phoneIntervice.call(new Scanner(System.in).nextLine()) + "gudok~~~~~~");
            }
            break;
            case 2: {
                System.out.println("Write phone number: ");
                System.out.println(phoneIntervice.call(new Scanner(System.in).nextLong()) + "gudok~~~~~");
            }
            break;
            case 3: {
                System.out.println("Write old and new name: ");
                System.out.println(phoneIntervice.updateContact(new Scanner(System.in).nextLine(), new Scanner(System.in).nextLine()));
            }
            break;
            case 4: {
                System.out.println(Arrays.toString(phoneIntervice.getAllContact()));
            }
            break;
        }
    }
}
