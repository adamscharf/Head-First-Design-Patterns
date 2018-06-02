package headfirst.designpatterns.ch02_observer;

import java.util.ArrayList;

/**
 * Subject
 */
public interface Subject {
    private observers ArrayList<Observer>;

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}