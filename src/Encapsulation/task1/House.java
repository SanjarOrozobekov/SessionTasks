package Encapsulation.task1;

public class House {
    private String address;
    private int numberOfRooms;
    private double area;

    public House(String address, int numberOfRooms, double area) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void calculatePrice(int priceOfQuadrat){
        System.out.println("\nPrice: " + area * priceOfQuadrat + "$");
    }

    @Override
    public String toString() {
        return " House" +
                "\nAddress: " + address +
                "\nNumberOfRooms: " + numberOfRooms +
                "\nArea: " + area;
    }
}
