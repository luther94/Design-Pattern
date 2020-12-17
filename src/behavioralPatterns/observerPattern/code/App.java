package behavioralPatterns.observerPattern.code;

public class App {
    public static void main(String[] args) {
        Weather weather = new Weather();

        Meteorologist meteorologist1 = new Meteorologist();
        Meteorologist meteorologist2 = new Meteorologist();
        weather.registerObserver(meteorologist1);
        weather.registerObserver(meteorologist2);

        weather.setWeather(25.05, 24.00, 16.10);
    }
}
