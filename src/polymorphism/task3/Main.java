package polymorphism.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String basePassword = "1234";
        System.out.print("On/Off: ");
        String on = new Scanner(System.in).nextLine();
        if (on.equalsIgnoreCase("On")) {
            System.out.println("Телефон күйдү! ");
            System.out.println("Кодду жазыңыз: ");
            String password = new Scanner(System.in).nextLine();
            if (password.equalsIgnoreCase(basePassword)) {
                System.out.println("КОШ КЕЛИҢИЗ!");

                while (true) {
                    System.out.println("    МЕНЮ   ");
                    System.out.println("1.Калькульятор");
                    System.out.println("2.Банк");
                    System.out.println("3.Заметка");
                    int prilojenia = new Scanner(System.in).nextInt();
                    switch (prilojenia) {
                        case 1: {
                            boolean isTrue = true;
                            while (isTrue) {
                                System.out.println("1.Кирүү");
                                System.out.println("2.Менюга кайтуу");
                                int colExit = new Scanner(System.in).nextInt();
                                switch (colExit) {
                                    case 1:
                                        Calculator.Calculate();
                                        break;
                                    case 2:
                                        isTrue = false;
                                        break;
                                    default:
                                        System.out.println("1 же 2 !");
                                }
                            }
                        }
                        break;
                        case 2: {
                            Bank bank = new Bank(10000);
                            bank.bankMenu(scanner);
                            break;
                        }
                        case 3:
                            Notes notes = new Notes(10);
                            notes.notesMenu(scanner);
                            break;
                    }
                }
            } else {
                System.out.println("Error!");
            }
        } else if (on.equalsIgnoreCase("Off")) {
            System.out.println("Телефон өчтү");
        }
    }
}

//TASK 3
//Озунуздун телефонунузду тузунуз.
//Телефонунузда томондогу мумкунчулуктор болсун : заметки,
//        банк приложения, калькулятор .
//        -Заметкиге озунуз каалаганча текст турундо маалыматтарды
//сактай алыныз жаnа аларды озгортуп очуруп колдонунуз.
//-Bank приложенияда озунуздун балансынызды текшеруу, башка
//адамдын картасына акча которуу мумкунчулуктору болсун
//-Калькулятордо болсо сандарды кошуп, алып, кобойтуп, боло
//алыныз.
//        Эскертуу, кандай полелер жана кандай методдор болот озубуз
//ойлонобуз ар бир студенттин тапшырмасы уникалдуу болсун!