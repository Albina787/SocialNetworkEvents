public class FriendRequestSentEvent {
    private String fromUser;
    private String toUser;

    public FriendRequestSentEvent(String fromUser, String toUser) {
        this.fromUser = fromUser;
        this.toUser = toUser;
    }

    // Обработчик события 
    public void notifyUser() {
        System.out.println("Push-уведомление: " + fromUser + " отправил запрос в друзья " + toUser);
    }
}
