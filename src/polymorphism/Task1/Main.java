package polymorphism.Task1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Sheep sheep1 = new Sheep("Sheep1",2,"White",40);
        Sheep sheep2 = new Sheep("Sheep2",4,"White",50);
        Sheep sheep3 = new Sheep("Sheep3",3,"White",43);
        Sheep sheep4 = new Sheep("Sheep4",1,"White",44);

        Cow cow1 = new Cow("Cow1",3,"Black",300);
        Cow cow2 = new Cow("Cow2",7,"Black",400);
        Cow cow3 = new Cow("Cow3",10,"Black",500);
        Cow cow4 = new Cow("Cow4",7,"Black",200);
        Cow cow5 = new Cow("Cow5",14,"Black",150);
        Cow cow6 = new Cow("Cow6",9,"Black",270);

        Horse horse1 = new Horse("Horse1",4,"Grown",500);
        Horse horse2 = new Horse("Horse2",7,"Grown",400);
        Horse horse3 = new Horse("Horse3",9,"Grown",600);

        Sheep[] sheeps = {sheep1,sheep2,sheep3};
        Sheep[] sheep = {sheep4};
        Cow[] cows = {cow1,cow2,cow3,cow4,cow5};
        Cow[] cow = {cow6};
        Horse[] horses = {horse1,horse2};
        Horse[] horse = {horse3};


        Farm farm1 = new Farm("Ysyk-Kol",cows,horses,sheeps,"Sanjar");
        Farm farm2 = new Farm("Naryn",cow,horse,sheep,"Ali");

        System.out.println(farm1);
        System.out.println(farm2);

    }
}