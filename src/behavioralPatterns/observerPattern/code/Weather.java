package behavioralPatterns.observerPattern.code;

import java.util.ArrayList;
import java.util.List;

public class Weather implements Subject {
    private List<Observer> observers;

    private double temperature;
    private double humidity;
    private double pressure;

    public Weather() {
        this.temperature = 25.50;
        this.humidity = 26.00;
        this.pressure = 27.15;
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(this));
    }

    public void weatherChanged() {
        notifyObservers();
    }

    public void setWeather(double temperature, double humidity, double pressure) {
        boolean changeFlag = false;
        if (this.temperature != temperature || this.humidity != humidity || this.pressure != pressure)
            changeFlag = true;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        if (changeFlag) weatherChanged();
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "the temperature is " + this.temperature + "\r\n" +
                "the humidity is " + this.humidity + "\r\n" +
                "the pressure is " + this.pressure;
    }
}
