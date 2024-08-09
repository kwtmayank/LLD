package patterns.observer;

public class SMSObserver implements Observer {

    Observable observable;
    String mobile;

    public SMSObserver(String mobile, Observable observable) {
        this.observable = observable;
        this.mobile = mobile;
    }

    @Override
    public void update() {
        System.out.println("Send SMS notification to " + mobile);
    }
}
