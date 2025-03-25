package polymorphism.Task1;

public class Cow {
    private String name;
    private int age;
    private String colour;
    private int weight;

    public Cow() {
    }

    public Cow(String name, int age, String colour, int weight) {
        this.name = name;
        this.age = age;
        this.colour = colour;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "class_work.polymorphism.task3.Task1.Cow:" +
                "Name: " + name + " | " +
                "Age: " + age +" | " +
                "Colour: " + colour + " | " +
                "Weight: " + weight;
    }
}
