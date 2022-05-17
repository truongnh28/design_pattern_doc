package ObserverPatterm;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temp;
    private float hum;
    private float pres;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData sub) {
        this.weatherData = sub;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println(temp + " " + hum + " " + pres);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.hum = humidity;
        this.pres = pressure;
        display();
    }
}
