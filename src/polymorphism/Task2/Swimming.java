package polymorphism.Task2;

public class Swimming extends Sport{
    public Swimming() {
    }

    public Swimming(String name, String category, int players) {
        super(name, category, players);
    }
    public void swim(){
        System.out.println(getName() + "Swim");
    }
}
