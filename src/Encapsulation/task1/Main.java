package Encapsulation.task1;

public class Main {
    public static void main(String[] args) {
        House house = new House("Ahunbaev 10",2,67.89);
        System.out.println(house.toString());
        house.calculatePrice(950);
    }
}
//House деген класс тузунуз поле катары
//address,numberOfRooms анан area деген
//поляларды алсын.
//Ичинде конструктор жана getter & setter
//тузуп полелерге доступ алабыз.
//Класстын ичине calculatePrice()деген
//метод тузобуз ал метод бизге уйдун
//аянтынын жана ар бир квадрат метрдин
//баасынын негизинде уйдун баасын чыгарып
//бериш керек
