package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements Observable {
    int count = 0;
    List<Observer> observerList = new ArrayList<>();

    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(Observer::update);
    }

    @Override
    public void setData(Object count) {
        if ((int) this.count == 0) {
            notifyObservers();
        }
        this.count = (int) count;
    }

    @Override
    public int getData() {
        return count;
    }
}
