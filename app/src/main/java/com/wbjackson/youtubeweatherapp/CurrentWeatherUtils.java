package com.wbjackson.youtubeweatherapp;

import android.support.annotation.DrawableRes;

/**
 * Utility class that returns the proper icon given a {@link CurrentWeather#conditionId}
 * mapping created with the assistance of https://erikflowers.github.io/weather-icons/api-list.html
 */
public class CurrentWeatherUtils {

    @DrawableRes
    public static int getWeatherIconResId(final int weatherConditionId) {
        switch (weatherConditionId) {
            case 200:
            case 201:
            case 202:
            case 210:
            case 211:
            case 212:
            case 221:
            case 230:
            case 231:
            case 232:
                return R.drawable.ic_wi_thunderstorm;
            case 300:
            case 301:
            case 302:
            case 310:
            case 311:
            case 312:
            case 313:
            case 314:
            case 321:
                return R.drawable.ic_wi_sprinkle;
            case 500:
            case 501:
            case 502:
            case 503:
            case 504:
            case 511:
            case 520:
            case 521:
            case 522:
            case 531:
            case 701:
                return R.drawable.ic_wi_rain;
            case 600:
            case 601:
            case 602:
            case 611:
            case 612:
            case 613:
            case 615:
            case 616:
            case 620:
            case 621:
            case 622:
                return R.drawable.ic_wi_snow;
            case 711:
                return R.drawable.ic_wi_smoke;
            case 721:
                return R.drawable.ic_wi_day_haze;
            case 731:
            case 761:
            case 762:
                return R.drawable.ic_wi_dust;
            case 741:
                return R.drawable.ic_wi_fog;
            case 771:
                return R.drawable.ic_wi_cloudy_gusts;
            case 781:
                return R.drawable.ic_wi_tornado;
            case 800:
                return R.drawable.ic_wi_day_sunny;
            case 801:
            case 802:
            case 803:
            case 804:
                return R.drawable.ic_wi_cloudy;
            default:
                return R.drawable.ic_wi_alien;
        }
    }
}
