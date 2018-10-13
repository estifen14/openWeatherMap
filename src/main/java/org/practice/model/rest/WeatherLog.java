package org.practice.model.rest;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by estifen on 10/12/2018.
 */

@Entity
@Table(name = "WEATHER_LOG")
public class WeatherLog {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "RESPONSE_ID")
    private int responseId;

    @Column(name = "LOCATION")
    private String location;

    @Column(name = "ACTUAL_WEATHER")
    private String actualWeather;

    @Column(name = "TEMPERATURE")
    private double temperature;

    @Column(name = "DATETIME_INSERTED")
    private Date dtimeInserted;public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getResponseId() {
        return responseId;
    }

    public void setResponseId(int responseId) {
        this.responseId = responseId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getActualWeather() {
        return actualWeather;
    }

    public void setActualWeather(String actualWeather) {
        this.actualWeather = actualWeather;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Date getDtimeInserted() {
        return dtimeInserted;
    }

    public void setDtimeInserted(Date dtimeInserted) {
        this.dtimeInserted = dtimeInserted;
    }
}
