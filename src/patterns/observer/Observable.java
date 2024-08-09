package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public interface Observable {

    void add(Observer observer);

    void remove(Observer observer);

    void notifyObservers();

    void setData(Object data);

    int getData();


}
