package Inheritance.Task5;

public class Student {
    private String fullName;
    private String phoneNumber;
    private String address;
    private long bankaccount;

    public Student() {
    }

    public Student(String fullName, String phoneNumber, String address, long bankaccount) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.bankaccount = bankaccount;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(long bankaccount) {
        this.bankaccount = bankaccount;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", bankaccount=" + bankaccount +
                '}';
    }
}
