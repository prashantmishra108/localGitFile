package design.observerDesign;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> observers = new ArrayList<Observer>(); // Subject has a list of observers

    void addObserver(Observer o) {
        observers.add(o);
    }

    void notifyAll(Object someObject) {
        for(Observer o : observers) {
            o.update(someObject); // All Observers must update
        }
    }
}