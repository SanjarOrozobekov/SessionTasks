package class_work;

public class Phone extends Deviice{
    private String kamera;
    private boolean isSupport5G;

    public Phone(String brand, String colour, int id, String operatingSystem, int price, int yearOflssue, String kamera, boolean isSupport5G) {
        super(brand, colour, id, operatingSystem, price, yearOflssue);
        this.kamera = kamera;
        this.isSupport5G = isSupport5G;
    }

    public String getKamera() {
        return kamera;
    }

    public void setKamera(String kamera) {
        this.kamera = kamera;
    }

    public boolean isSupport5G() {
        return isSupport5G;
    }

    public void setSupport5G(boolean support5G) {
        isSupport5G = support5G;
    }
    Deviice[] phones = new Phone[10];
    int phoneCount = 0;

    @Override
    public void addDevice(Deviice deviice) {
        phones[phoneCount++] = deviice;
    }

    @Override
    public Deviice[] getallDevice() {
        return phones;
    }

    @Override
    public Deviice getByID(int id) {
        for (Deviice phone : phones) {
            if(phone.getId() == id)
            return phone;
        }
        return null;
    }

    @Override
    public void updateDevice(int id, Deviice deviice) {
        Deviice phone = getByID(id);
        phone.setBrand(deviice.getBrand());
        phone.setPrice(deviice.getPrice());
        phone.setColour(deviice.getColour());
        phone.setOperatingSystem(deviice.getOperatingSystem());
        System.out.println("Success");
    }

    @Override
    public void deleteDevice(int id) {
        int index = -1;
        for (int i = 0; i < phones.length; i++) {
            if (phones[i].getId() == id) {
                index = i;
                break;
            }
        }
        Deviice[] newPhones = new Phone[phones.length-1];
        for (int i = 0; i < index; i++) {
            newPhones[i]=phones[i+1];
        }
        phones=newPhones;
    }
    @Override
    public String toString() {
        return "Phone: " +
                super.toString()+
                ", Is Support 5G: " + isSupport5G +
                ", Kamera: " + kamera;
    }
}
