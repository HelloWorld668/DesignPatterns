package designpatterns.observer.jdkobserver;

public class Door {
    public static void main(String[] args) {
        WeatherData data = new WeatherData();
        
        CurrentConditionDispaly conditionDispaly = new CurrentConditionDispaly(data);
        
        data.setMeasurements(1f, 2f, 3f);
        
        data.setMeasurements(3f, 2f, 3f);
    }
}
