package notificationsystemTask;

public class EmailNotifaction implements Notification {

    @Override
    public String send(String message) {
       return "EmailNotification"+message;
    }
}

