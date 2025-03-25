package polymorphism.Task2;

public class Football extends Sport{
    public Football() {
    }

    public Football(String teamName, String category, int players) {
        super(teamName, category, players);
    }

    public void kickBall(){
        System.out.println(getName() + "Kick Ball");
    }
}
