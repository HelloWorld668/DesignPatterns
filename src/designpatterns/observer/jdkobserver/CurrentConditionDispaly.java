package designpatterns.observer.jdkobserver;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDispaly implements DisplayElement,Observer{
    Observable observable;
    private float temp;
    private float humidity;
    private float pressure;

    public CurrentConditionDispaly(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    
    @Override
    public void update(Observable o,Object arg) {
        if(o instanceof WeatherData) {
            WeatherData data = (WeatherData) o;
            this.temp = data.getTemp();
            this.humidity = data.getHumidity();
            this.pressure = data.getPressure();
            display();
        }
    }
    
    @Override
    public void display() {
        String s = "This is current conditions: temp: %s humidity: %s pressure: %s";
        System.out.println(String.format(s,temp, humidity,pressure));
    }
}
