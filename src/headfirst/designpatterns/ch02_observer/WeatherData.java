package headfirst.designpatterns.ch02_observer;

import java.util.ArrayList;

/**
 * WeatherDa
 */
public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;
    
    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update(this.temperature, this.humidity, this.pressure);
        }
    }

    public void measurementsChanged() {
        this.notifyObservers();
    }

    /**
     * Updates each of the sensors
     * @param temperature the temperature to set
     * @param humidity the humidity to set
     * @param pressure the pressure to set
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}