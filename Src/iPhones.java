class iPhones implements Smartphones, OperatingSystem {
    public void call() {
        System.out.println("Calling from an iPhone");
    }

    public void sms() {
        System.out.println("Sending SMS from an iPhone");
    }

    public void internet() {
        System.out.println("Browsing the internet on an iPhone");
    }

    public void displayOS() {
        System.out.println("iOS");
    }
}