package polymorphism.task3;

import java.util.Scanner;

public class Calculator {

    public static void Calculate(){
        System.out.print("Биринчи санды жазыңыз: ");
        double a = new Scanner(System.in).nextDouble();
        System.out.print("Экинчи санды жазыңыз: ");
        double b = new Scanner(System.in).nextDouble();

        System.out.print("Амалды жазыңыз (+,-,/,*,%): ");
        char c = new Scanner(System.in).nextLine().charAt(0);
        switch (c){
            case '+':
                System.out.println(a + " + " + b + " = "+ (a+b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = "+ (a-b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = "+ (a*b));
                break;
            case '/':
                System.out.println(a + " / " + b + " = " + (a/b));
                break;
            case '%':
                System.out.println(a + " % " + b + " = " + (a%b));
                break;
            default:
                System.out.println("Туура амлды жазыңыз!");
        }
    }
}
