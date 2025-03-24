package Modifiers.task2;

public class Child extends Employee {
    public Child(double salary) {
        super(salary);
    }
    void increaseSalary(double amount){
        salary += amount;
    }
    void getSalary(){
        System.out.println("Salary: " + salary);
    }
}
