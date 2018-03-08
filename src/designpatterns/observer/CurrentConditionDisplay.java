package designpatterns.observer;

public class CurrentConditionDisplay implements Observer,DisplayElement{
    
    private float temp;
    private float humidity;
    private float pressure;
    @Override
    public void display() {
        String s = "This is current conditions: temp: %s humidity: %s pressure: %s";
        System.out.println(String.format(s,temp, humidity,pressure));
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
    
    public CurrentConditionDisplay(Subject s) {
        s.registObserver(this);
    }
}
