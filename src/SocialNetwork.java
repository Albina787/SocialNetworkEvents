public class SocialNetwork {
    public static void main(String[] args) {
        // Пользователь "Альбіна" отправляет запрос другу "Володимир"
        FriendRequestSentEvent sent = new FriendRequestSentEvent("Альбіна", "Володимир");
        sent.notifyUser();

        // "Володимир" подтверждает запрос
        FriendRequestAcceptedEvent accepted = new FriendRequestAcceptedEvent("Альбіна", "Володимир");
        accepted.logEvent();
    }
}
