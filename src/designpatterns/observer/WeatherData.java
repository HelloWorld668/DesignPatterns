package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    
    private float temp;
    private float humidity;
    private float pressure;
    private List<Observer> list = new ArrayList<>();
    
    @Override
    public void registObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        list.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : list) {
            observer.update(temp, humidity, pressure);
        }
    }
    
    public void measurementsChanged() {
        notifyObserver();
    }
    
    public void setMeasurements(float temp,float humidity,float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }
}
