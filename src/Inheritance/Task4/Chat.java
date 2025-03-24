package Inheritance.Task4;

import java.time.LocalDate;

public class Chat {
    private String name;
    private boolean isNew;
    private int dateOfIssue;
    private String designColour;

    public Chat() {
    }

    public Chat(String name, boolean isNew, int dateOfIssue, String designColour) {
        this.name = name;
        this.isNew = isNew;
        this.dateOfIssue = dateOfIssue;
        this.designColour = designColour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public int getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(int dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public String getDesignColour() {
        return designColour;
    }

    public void setDesignColour(String designColour) {
        this.designColour = designColour;
    }
    public void getChatName(){
        System.out.println("Name: " + name + ", " + "Colour: " + designColour);
    }
    public void getIsNewChat(){
        if(2025-dateOfIssue <=5){
            System.out.println("Is new: " + isNew);
        }else {
            System.out.println("Is new: " +false);
        }
    }

    @Override
    public String toString() {
        return "   Name: " + name +
                "\nDate Of Issue: " + dateOfIssue +
                "\nDesign Colour: " + designColour;
    }
}
