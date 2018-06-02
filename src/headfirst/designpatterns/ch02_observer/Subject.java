package headfirst.designpatterns.ch02_observer;

import java.util.ArrayList;

/**
 * Subject
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}