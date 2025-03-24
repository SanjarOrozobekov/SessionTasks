package Modifiers.task1;

class BankAccaunt {
    private String accauntNumber;
    private double balance;

    public BankAccaunt(String accauntNumber, double balance) {
        this.accauntNumber = accauntNumber;
        this.balance = balance;
    }

    public static void deposit(BankAccaunt accaunt,double amount){
        if(amount > 0 ){
            accaunt.balance += amount;
            System.out.println(amount + " сом салынды.\nЖаңы сумма: " + accaunt.balance);
        }else {
            System.out.println("Туура эмес сумма!!!");
        }
    }
    public static void withdraw(BankAccaunt accaunt,double amount){
        if(amount >0 && amount <= accaunt.balance){
            accaunt.balance -= amount;
            //System.out.println(amount + " сом алынды.\nЖаңы сумма: " + accaunt.balance);
        }else {
            System.out.println("Акча жетишсиз!!!");
        }
    }
    public static void getBalance(BankAccaunt accaunt){
        System.out.println("Сиздин баланста " + accaunt.balance + " сом бар.");
    }
}
