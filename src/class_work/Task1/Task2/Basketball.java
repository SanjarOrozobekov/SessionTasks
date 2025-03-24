package class_work.Task1.Task2;

public class Basketball extends Sport{
    public Basketball() {
    }

    public Basketball(String teamName, String category, int players) {
        super(teamName, category, players);
    }

    public void throwBall(){
        System.out.println(getName() + "throw ball");
    }
}
