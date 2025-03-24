package Inheritance.Task4;

public class Instagram extends Chat {
    private String authors;
    private String developer;

    public Instagram() {
    }

    public Instagram(String name, boolean isNew, int dateOfIssue, String designColour, String authors, String developer) {
        super(name, isNew, dateOfIssue, designColour);
        this.authors = authors;
        this.developer = developer;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    @Override
    public void getChatName() {
        super.getChatName();
    }

    @Override
    public void getIsNewChat() {
        super.getIsNewChat();
    }

    public void getInstagram(){
        System.out.println(authors + " is authors Instagram");
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nAuthors: " + authors +
                "\nDeveloper: " + developer;
    }
}
