package designpatterns.observer;

public class Door {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        new CurrentConditionDisplay(weatherData);
        
        weatherData.setMeasurements(1f, 2f, 3f);
        weatherData.setMeasurements(2f, 2f, 3f);
    }
}
