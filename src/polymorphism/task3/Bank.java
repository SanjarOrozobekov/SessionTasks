package polymorphism.task3;

import java.util.Scanner;

public class Bank {
    private double balance;

    public Bank(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount){
        if(amount >0 && amount <= balance){
            balance -= amount;
            System.out.println("- " + amount + "\nЖаңы сумма: " + balance + "\n");
        }else {
            System.out.println("Сиздин баланста акча жетишсиз!!!\n");
        }
    }
    public void getBalance(){
        System.out.println("Сиздин баланста " + balance + " сом бар.\n");
    }
    public void bankMenu(Scanner scanner){
        boolean isTrue = true;
        while (true) {
            System.out.println("""
                                        Акча которуу үчүн 1ди басыңыз.
                                        Балансты текшерүү үчүн 2ни басыңыз.
                                        Чыгуу үчүн 3тү басыңыз.""");
            int knopka = scanner.nextInt();

            switch (knopka) {
                case 1:
                    System.out.println("""
                                                Кимге которосуз: 1.Asan Usonov
                                                                 2.Uson Asanov
                                                                 3.Ali Umarov
                                                                 4.Umar Aliev
                                                                 5.Ivan Ivanov""");
                    System.out.print("№: ");
                    int kimge = new Scanner(System.in).nextInt();
                    System.out.println(kimge);
                    switch (kimge) {
                        case 1:
                            System.out.println("Asan Usonov");
                            break;
                        case 2:
                            System.out.println("Uson Asanov");
                            break;
                        case 3:
                            System.out.println("Ali Umarov");
                            break;
                        case 4:
                            System.out.println("Umar Aliev");
                            break;
                        case 5:
                            System.out.println("Ivan Ivanov");
                            break;
                        default:
                            System.out.println("Мындай адам жок!");
                    }
                    System.out.println("Канча акча которосуз: ");
                    double amaunt = new Scanner(System.in).nextDouble();
                    withdraw(amaunt);

                    break;
                case 2:
                    getBalance();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Error!");
            }
        }
    }
}

