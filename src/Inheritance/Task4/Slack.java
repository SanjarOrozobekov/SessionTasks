package Inheritance.Task4;

public class Slack extends Chat{
    private String priceCompany;
    private String author;

    public Slack(String priceCompany, String author) {
        this.priceCompany = priceCompany;
        this.author = author;
    }

    public Slack(String name, boolean isNew, int dateOfIssue, String designColour, String priceCompany, String author) {
        super(name, isNew, dateOfIssue, designColour);
        this.priceCompany = priceCompany;
        this.author = author;
    }

    public String getPriceCompany() {
        return priceCompany;
    }

    public void setPriceCompany(String priceCompany) {
        this.priceCompany = priceCompany;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void getChatName() {
        super.getChatName();
    }

    @Override
    public void getIsNewChat() {
        super.getIsNewChat();
    }
    public void getSlack(){
        System.out.println(author + " is author Slack");
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nPriceCompany: " + priceCompany +
                "\nAuthor: " + author;
    }
}
