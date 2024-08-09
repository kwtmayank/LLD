package patterns.observer;

public class Main {
    public static void main(String[] args) {
        Observable stockObservable = new IphoneObservable();
        Observer customer1 = new EmailObserver("cust1@abc.com", stockObservable);
        Observer customer2 = new SMSObserver("785421", stockObservable);
        Observer customer3 = new EmailObserver("cust2@abc.com", stockObservable);
        Observer customer4 = new SMSObserver("245424", stockObservable);

        stockObservable.add(customer1);
        stockObservable.add(customer2);
        stockObservable.add(customer3);
        stockObservable.add(customer4);

        stockObservable.setData((int) 10);
        stockObservable.setData((int) 0);
        stockObservable.setData((int) 10);
    }
}
