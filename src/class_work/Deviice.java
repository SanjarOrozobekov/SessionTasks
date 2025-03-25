package class_work;

public abstract class Deviice {
    private int id;
    private String brand;
    private int price;
    private String operatingSystem;
    private String colour;
    private int yearOflssue;

    public Deviice(String brand, String colour, int id, String operatingSystem, int price, int yearOflssue) {
        this.brand = brand;
        this.colour = colour;
        this.id = id;
        this.operatingSystem = operatingSystem;
        this.price = price;
        this.yearOflssue = yearOflssue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYearOflssue() {
        return yearOflssue;
    }

    public void setYearOflssue(int yearOflssue) {
        this.yearOflssue = yearOflssue;
    }

    public abstract void addDevice(Deviice deviice);

    public abstract Deviice[] getallDevice();

    public abstract Deviice getByID(int id);

    public abstract void updateDevice(int id,Deviice deviice);

    public abstract void deleteDevice(int id);

    @Override
    public String toString() {
        return
                "  Brand: " + brand +
                ", Id: " + id +
                ", Price: " + price +
                ", OperatingSystem: " + operatingSystem +
                ", Colour: " + colour +
                ", YearOflssue: " + yearOflssue;

    }
}
