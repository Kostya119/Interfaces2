public class Main {
    public static void main(String[] args) {
        Smartphones androidPhone = new Androids();
        Smartphones iPhone = new iPhones();
        OperatingSystem androidOS = new Androids();
        OperatingSystem iOS = new iPhones();

        androidPhone.call();
        androidPhone.sms();
        androidPhone.internet();

        iPhone.call();
        iPhone.sms();
        iPhone.internet();

        androidOS.displayOS();
        iOS.displayOS();
    }
}