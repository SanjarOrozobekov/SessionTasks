package Modifiers.task1;

public class Main {
    public static void main(String[] args) {
        BankAccaunt bankAccaunt =new BankAccaunt("1234",5000);
        BankAccaunt.getBalance(bankAccaunt);
        BankAccaunt.deposit(bankAccaunt,578000);
        BankAccaunt.withdraw(bankAccaunt,450000);
        BankAccaunt.getBalance(bankAccaunt);
    }
}
//Task 1
//BankAccount деген класс тузунуз access модификатор
//default болсун.
//        Полелер: accoutNumber,balance (private болсун)
//Методдор(static болсун):
//deposit(double amount) баланска кошот
//withdraw(double amount) баланстан алат
//getBalance() балансты чыгарып берет
//Методдорду main’ден чакырып иштетиниздер
