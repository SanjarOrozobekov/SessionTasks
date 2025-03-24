package Inheritance.Task4;

public class Telegram extends Chat {
    private String author;
    private String security;

    public Telegram(String author, String security) {
    }

    public Telegram(String name, boolean isNew, int dateOfIssue, String designColour, String author, String security) {
        super(name, isNew, dateOfIssue, designColour);
        this.author = author;
        this.security = security;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    @Override
    public void getChatName() {
        super.getChatName();
    }

    @Override
    public void getIsNewChat() {
        super.getIsNewChat();
    }
    public void getTelegram(){
        System.out.println("Telegram has " + security + " security");
    }

    @Override
    public String toString() {
        return super.toString()+
                "Author: " + author +
                "Security: " + security;
    }
}
