package Inheritance.Task4;

public class Main {
    public static void main(String[] args) {
        Instagram instagram = new Instagram("Instagram",true,2010,"red","Kevin Systrom and Mike Krieger","Meta");
        //System.out.println(instagram.toString());
        instagram.getChatName();
        instagram.getIsNewChat();
        instagram.getInstagram();
        Telegram telegram = new Telegram("Telegram",true,2020,"blue","Pavel Durov","high");
        //System.out.println(telegram.toString());
        telegram.getChatName();
        telegram.getIsNewChat();
        telegram.getTelegram();
        WhatsApp whatsApp = new WhatsApp("WhatsApp",true,2009,"white","easy","Meta");
        //System.out.println(whatsApp.toString());
        whatsApp.getChatName();
        whatsApp.getIsNewChat();
        whatsApp.getWhatsApp();
        Slack slack = new Slack("Slack",true,2010,"white","$27,7 bilion","Stuart Butterfield");
        //System.out.println(slack.toString());
        slack.getChatName();
        slack.getIsNewChat();
        slack.getSlack();

        Chat[] chats = {instagram,telegram,whatsApp,slack};

        newChat(chats);
        for (Chat chat : chats) {
            System.out.println(chat.getName());
        }

    }
    public static void newChat(Chat[] chats){
        Chat count = null;
        for (Chat chat : chats) {
            if(chat.isNew()){
                if(count == null || chat.getDateOfIssue() > count.getDateOfIssue()){
                    count = chat;
                }
            }
        }
        if (count != null) {
            System.out.println("\nNew chat: " + count.getName() + "\n");
        } else {
            System.out.println("\nNo new chats!");
        }
    }
}


//chat деген класс тузунуз, полелери (name, isNew(boolean), dateOfIssue,
//designColor), methods:
//getChatName(){}; chat тын атын жана тусун чыгарып берсин.
//getIsNewChat(){}; эгерде акыркы 5 жылдын аралыгында чыкса true,
//болбосо false кайтарсын.
//Аларды мурастаган WhatsApp, Telegram, Instagram, Slack жана башкалар.
//Ар бир класста 2 ден уникалдуу полелери болсун жана parent class тын
//методторун переопределять этиши керек. Ар бир мурастап жаткан
//класстын озуно тиешелуу методу болсун, ошол гана класстын эмне
//кылып жатканын жана кандай озгочолуктору бар экенин кайтарып
//берчу.
//main ден ар бир класстын бир нече объектин тузуп баарын массивге
//салыныз. Метод тузунуз бизге параметрден келген чаттардын
//арасынан эн жаны чатты табып, анан чаттын атын жана “ эн жаны чат”
//деп консолго чыгарып берсин.
