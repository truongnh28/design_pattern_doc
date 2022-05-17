package ObserverPatterm;

public class Main {
    public static void main (String []args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(1, 3, 4);
        weatherData.setMeasurements(3, 2, 1);
    }
}
