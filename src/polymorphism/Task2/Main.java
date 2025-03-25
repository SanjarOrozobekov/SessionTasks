package polymorphism.Task2;

public class Main {
    public static void main(String[] args) {
        Football football = new Football("Real Madrid","profi",11);
        football.getPlayers();
        Swimming swimming = new Swimming("USA","amateurish",4);
        swimming.swim();
        Basketball basketball = new Basketball("Lakers","profi",5);
        basketball.throwBall();

        Sport[] sports = {football};
    }
}
