package Modifiers.task2;

import Inheritance.Task4.Chat;

public class Main {
    public static void main(String[] args) {
        Child child = new Child(70000);
        child.increaseSalary(67000);
        child.getSalary();
    }
}
//Task 2
//Employee деген класс тузунуз модификатор final болсун.
//        Полелер: salary(protected болсун)
//Мурастаган Manager деген child класс болсун
//Child класстын ичинде increaseSalary(double amount)
//default метод болсун) ал метод бизге зарплата кошуп
//бериши керек жана зарплатаны чыгырып берген метод
//болсун getSalary() деген
//Методдорду main’ден чакырып иштетиниздер
