package headfirst.designpatterns.ch02_observer;

/**
 * Observer
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}