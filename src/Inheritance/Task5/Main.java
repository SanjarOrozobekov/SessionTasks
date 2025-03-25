package Inheritance.Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Student student1 = new Student("Sasha","+996700771707","Jal 13",30000);
        Student student2 = new Student("Aza","+996500000000","Jal 13",70000);
        Student student3 = new Student("Baha","+996505055055","Jal 13",40000);
        Student student4 = new Student("Asan","+996669966","Alma-Ata 23",20000);
        Student student5 = new Student("Ali","+996555123456","Alma-Ata 23",100000);
        Student student6 = new Student("Beka","+996669966","Alma-Ata 23",80000);

        Student[] students1 = {student1,student2,student3};
        Student[] students2 = {student4,student5,student6};

        Apartment apartment1 = new Apartment("apartment1", 30000, "Tunguch",students1);
        Apartment apartment2 = new Apartment("apartment2", 50000, "asanbai",students2);

        Apartment[] apartments = {apartment1,apartment2};
        System.out.print("write the apartment: ");
        String consoleTitle = new Scanner(System.in).nextLine();
        apartment1.getApartment(consoleTitle, apartments);

        System.out.println("student3.getPayPerMonth(apartments) = " + student3.getPayPerMonth(apartments));
        System.out.println("student3.liveIn(students1,apartments) = " + student3.liveIn(students1, apartments));
    }
}













// 1) ЭКИ КЛАСС ТУЗУНУЗ
//* APARTMENT (TITLE, PRICE, ADDRESS)
//* STUDENT ( FULLNAME, PHONENUMBER, ADDRESS,
//            BANKACCOUNT)
//* 2) APARTMENT КЛАССЫНА 2 ОБЬЕКТ, STUDENT КЛАССЫНА 6 ОБЬЕКТ ТУЗУП, АЛАРДЫН
//ПОЛЕЛЕРИН ТОЛТУРУНУЗ.
//        * (БИР КВАРТИРАНЫН ЖАНА 3 СТУДЕНТТИН АДРЕСТЕРИ ОКШОШ БОЛСУН, ЭКИНЧИ
//КВАРТИРАНЫН ЖАНА КАЛГАН 3 СТУДЕНТТЕРДИН АДРЕСТЕРИ ОКШОШ БОЛСУН)
//        * 3)СТУДЕНТЕРДИ ОЗУНЧО МАССИВГЕ, КВАРТИРАЛАРДЫ ОЗУНЧО МАССИВГЕ САЛЫНЫЗ.
//        * 4)КОНСОЛЬДОН КВАРТИРАНЫН АТЫН БЕРСЕНИЗ, ОШОЛ КВАРТИРАНЫ ЖАНА АНДА
//ЖАШАГАН СТУДЕНТТЕРДИ КОНСОЛЬГО ЧЫГАРА ТУРГАН МЕТОД ТУЗУНУЗ
//* 5)КВАРТИРА КЛАССЫНЫН ИЧИНДЕ БИР PAYPERMONTH(); ДЕГЕН МЕТОДУ БОЛСУН, АЛ МЕТОДАР БИР СТУДЕНКЕ КАНЧА СОМДОН КВАРТПЛАТА БЕРУУСУН ЧЫГАРСЫН.
//* 6)СТУДЕНТ КЛАССЫНЫН ИЧИНДЕ БИР LIVEIN(); ДЕГЕН МЕТОД БОЛСУН, АЛ МЕТОД
//СТУДЕНТТИН КАПЧЫГЫНА ЖАРАША АЛ КВАРТИРАДА КАНЧА АЙ ЖАШАЙ АЛУУСУН
//ЧЫГАРСЫН.
//* 7)СТУДЕНТ КЛАССЫНДА ДАГЫ БИР CHANGEINFO(); ДЕГЕН МЕТОД БОЛСУН АЛ МЕТОД
//СТУДЕНТТИН ДАННЫЙЛАРЫН ОЗГОРТУП БЕРСИН

