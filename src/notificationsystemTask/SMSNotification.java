package notificationsystemTask;

public class SMSNotification implements  Notification{
    @Override
    public String send(String message) {
        return "Sms notification"+message;
    }
}
