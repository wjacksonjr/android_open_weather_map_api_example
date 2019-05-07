# Android Open Weather Map API Example

### Overview
This is a sample Android weather application built for my YouTube channel. A link to the video where this app was built can be found [here](http://youtube.com). This example includes a data model, making network calls using Android [Volley](https://developer.android.com/training/volley) and a utility class.

### Setup Steps
1. Download or clone this project
2. Import into Android Studio
3. Create a Open Weather Map API account [here](https://home.openweathermap.org/users/sign_up) if you don't have one
4. Create an Open Weather Map API key and add it to the project inside of the file CurrentWeatherService.java replace the API_KEY static variable value with your API key

```
public class CurrentWeatherService {

    private static final String TAG = CurrentWeatherService.class.getSimpleName();

    private static final String URL = "https://api.openweathermap.org/data/2.5/weather";
    private static final String CURRENT_WEATHER_TAG = "CURRENT_WEATHER";
    private static final String API_KEY = "YOUR API KEY HERE"; <--- INSERT API KEY HERE

    private RequestQueue queue;
...    
```
5. Run the app on an emulator or device (ensure you have a network connection)
6. PROFIT!

## Weather Icons Information
The icons used in this project were downloaded from [here](https://erikflowers.github.io/weather-icons/) and the mapping from weather icon to Open Weather Map API condition id was found [here](https://erikflowers.github.io/weather-icons/api-list.html)
