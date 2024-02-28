package Nontifikasi;

public class Main {
    public static void main(String[] args) {
        String emailPenerima = "panduprwk05@gmail.com";
        String nomerHp = "+6282143408625";
        String mobileId = "android-192387";

        emailNotification emailNotif = new emailNotification();
        SmsNontifikasi smsNotif = new SmsNontifikasi();
        PushNontifikasi pushNotif = new PushNontifikasi();

        String message = "Halo namaku pandu";
        
        emailNotif.sendMessage(emailPenerima, message);
        smsNotif.sendMessage(nomerHp, message);
        pushNotif.sendMessage(mobileId, message);
    }
}