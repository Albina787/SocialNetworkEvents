public class FriendRequestAcceptedEvent {
    private String fromUser;
    private String toUser;

    public FriendRequestAcceptedEvent(String fromUser, String toUser) {
        this.fromUser = fromUser;
        this.toUser = toUser;
    }

    // Обработчик события 
    public void logEvent() {
        System.out.println("Лог: " + toUser + " принял запрос в друзья от " + fromUser);
    }
}
