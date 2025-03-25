package class_work;

import java.util.Arrays;

public class Laptop extends Deviice{
    private String processor;
    private String RAM;

    public Laptop(int id,String brand, String colour,  String operatingSystem, int price, int yearOflssue, String processor, String RAM) {
        super(brand, colour, id, operatingSystem, price, yearOflssue);
        this.processor = processor;
        this.RAM = RAM;
    }


    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }
    //TODO CRUD
    Deviice [] laptops = new Laptop[10];
    int laptopCount = 0;

    @Override
    public void addDevice(Deviice deviice) {
        laptops[laptopCount++] = deviice;
    }

    @Override
    public Deviice[] getallDevice() {
        return laptops;
    }

    @Override
    public Deviice getByID(int id) {
        for (Deviice laptop : laptops) {
            if(laptop.getId() == id)
                return laptop;

        }
        return null;
    }

    @Override
    public void updateDevice(int id, Deviice deviice) {
        Deviice laptop = getByID(id);
        laptop.setBrand(deviice.getBrand());
        laptop.setOperatingSystem(deviice.getOperatingSystem());
        laptop.setColour(deviice.getColour());
        laptop.setPrice(deviice.getPrice());
        System.out.println("Success");
    }

    @Override
    public void deleteDevice(int id) {
        int index = -1;
        for (int i = 0; i < laptops.length ; i++) {
            if(laptops[i].getId() == id){
                index = i;
                break;
            }
        }
        Deviice[] newDewice = new Laptop[laptops.length - 1];
        for (int i = 0; i < index; i++) {
            newDewice[i] = laptops[i];
        }
        for (int i = index; i < newDewice.length ; i++) {
            newDewice[i] = laptops[i+1];
        }
        laptops = newDewice;
    }

    @Override
    public String toString() {
        return "Laptop: " +
                super.toString()+
                ", Processor:" + processor +
                ", RAM: " + RAM;

    }
}
