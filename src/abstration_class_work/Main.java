package abstration_class_work;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //TODO LAPTOP
        Deviice laptop = new Laptop(1,"Apple","black","MacOS",50000,2020,"Processor","M1");
        laptop.addDevice(laptop);
        System.out.println("All devices: " + Arrays.toString(laptop.getallDevice()));
        System.out.println();
        System.out.println(laptop.getByID(1));

        laptop.updateDevice(1,new Laptop(1,"Acer","blue","Windows",40000,2017,"M","9"));
        System.out.println("All devices: " + Arrays.toString(laptop.getallDevice()));

        laptop.deleteDevice(1);
        System.out.println("All devices: " + Arrays.toString(laptop.getallDevice()));

        //TODO PHONE
        Deviice phone = new Phone("Samsung","red",1,"Android",50000,2024,"200 Mp",true);
        phone.addDevice(phone);
        System.out.println("All device: " + Arrays.toString(phone.getallDevice()));
        System.out.println();
        System.out.println(phone.getByID(1));

        phone.updateDevice(1,new Phone("Apple","white",1,"iOS",70000,2020,"200 mp",true));
        System.out.println("All device: " + Arrays.toString(phone.getallDevice()));

        phone.deleteDevice(1);
        System.out.println("All device: " + Arrays.toString(phone.getallDevice()));
    }
}
