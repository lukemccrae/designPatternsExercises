import java.util.ArrayList;

public class  WeatherStation {
  public static void main(String[] args) {

    //create a new weatherData
    WeatherData weatherData = new WeatherData();

    //create new CurrentConditionsDisplay
    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

  // StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
  // ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

  //set weather
  weatherData.setMeasurements(81, 65, 30.4f);
  weatherData.setMeasurements(65, 20, 10.4f);
  weatherData.setMeasurements(70, 45, 30.4f);

  }
}
