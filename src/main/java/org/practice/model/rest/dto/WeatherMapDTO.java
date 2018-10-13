package org.practice.model.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.practice.model.rest.common.Main;
import org.practice.model.rest.common.Weather;

import java.util.List;

/**
 * Created by estifen on 10/12/2018.
 */
public class WeatherMapDTO {

    private int id;
    private String name;

    @JsonProperty("weather")
    private List<Weather> weatherList;

    private Main main;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Weather> getWeatherList() {
        return weatherList;
    }

    public void setWeatherList(List<Weather> weatherList) {
        this.weatherList = weatherList;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }
}
