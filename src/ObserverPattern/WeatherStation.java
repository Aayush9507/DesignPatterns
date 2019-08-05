package ObserverPattern;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();


        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
//        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

//        currentDisplay.display();

        weatherData.setMeasurements(80, 67,30.f);
        weatherData.setMeasurements(83, 63,27.f);
        weatherData.setMeasurements(76, 69,26.f);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(67,80);

        heatIndexDisplay.computeHeatIndex(67,80);


    }
}
