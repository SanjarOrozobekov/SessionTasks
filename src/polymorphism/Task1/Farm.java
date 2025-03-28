package polymorphism.Task1;

import java.util.Arrays;

public class Farm {
    private String address;
    private Cow[] cows;
    private Horse[] horses;
    private Sheep[] sheeps;
    private String ownerName;

    public Farm() {
    }

    public Farm(String address, Cow[] cows, Horse[] horses, Sheep[] sheeps, String ownerName) {
        this.address = address;
        this.cows = cows;
        this.horses = horses;
        this.sheeps = sheeps;
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public Sheep[] getSheeps() {
        return sheeps;
    }

    public void setSheeps(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "class_work.polymorphism.task3.Task1.Farm| " +
                "Address: " + address +"\n"+
                "Cows: " + Arrays.toString(cows) + "\n"+
                "Horses: " + Arrays.toString(horses) + "\n"+
                "Sheeps: " + Arrays.toString(sheeps) +"\n"+
                "Owner Name: " + ownerName;

    }
}
