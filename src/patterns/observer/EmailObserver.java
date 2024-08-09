package patterns.observer;

public class EmailObserver implements Observer {

    Observable stockObservable;
    String email;

    public EmailObserver(String email, Observable observable) {
        this.stockObservable = observable;
        this.email = email;
    }

    @Override
    public void update() {
        System.out.println("mail sent to "+email);
    }
}
