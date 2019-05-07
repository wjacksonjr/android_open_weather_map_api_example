package com.wbjackson.youtubeweatherapp;

public class CurrentWeather {
    final String location;
    final int conditionId;
    final String weatherCondition;
    final double tempKelvin;

    public CurrentWeather(final String location,
                          final int conditionId,
                          final String weatherCondition,
                          final double tempKelvin) {
        this.location = location;
        this.conditionId = conditionId;
        this.weatherCondition = weatherCondition;
        this.tempKelvin = tempKelvin;
    }

    public int getTempFahrenheit() {
        return (int) (tempKelvin * 9/5 - 459.67);
    }
}
