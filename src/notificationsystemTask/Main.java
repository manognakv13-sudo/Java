package notificationsystemTask;

public class Main {

    public void EmailNotification(EmailNotifaction emailNotifaction, SMSNotification smsNotification){
        System.out.println(emailNotifaction.send("  alert: hiring happenning"));

        System.out.println(smsNotification.send("  battery dying!! charge it NOW^"));
    }

    public static void main(String[] args) {
        EmailNotifaction emailNotifaction = new EmailNotifaction();
        SMSNotification smsNotification = new SMSNotification();
        Main main = new Main();
        main.EmailNotification(emailNotifaction, smsNotification);
    }
}
