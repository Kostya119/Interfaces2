class Androids implements Smartphones, OperatingSystem {
    public void call() {
        System.out.println("Calling from an Android phone");
    }

    public void sms() {
        System.out.println("Sending SMS from an Android phone");
    }

    public void internet() {
        System.out.println("Browsing the internet on an Android phone");
    }

    public void displayOS() {
        System.out.println("Android OS");
    }
}