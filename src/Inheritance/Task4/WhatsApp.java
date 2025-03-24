package Inheritance.Task4;

public class WhatsApp extends Chat{
   private String use;
   private String devoloper;

    public WhatsApp(String use, String devoloper) {
    }

    public WhatsApp(String name, boolean isNew, int dateOfIssue, String designColour, String use, String devoloper) {
        super(name, isNew, dateOfIssue, designColour);
        this.use = use;
        this.devoloper = devoloper;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getDevoloper() {
        return devoloper;
    }

    public void setDevoloper(String devoloper) {
        this.devoloper = devoloper;
    }

    @Override
    public void getChatName() {
        super.getChatName();
    }

    @Override
    public void getIsNewChat() {
        super.getIsNewChat();
    }
    public void getWhatsApp(){
        System.out.println(getName() + " is " + use+ " to use. ");
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nUse: " + use +
                "\nDevoloper: " + devoloper;

    }
}
