package org.practice.service;

import org.practice.enumeration.Location;
import org.practice.model.rest.dto.WeatherMapDTO;

/**
 * Created by estifen on 10/12/2018.
 */
public interface WeatherService {

    /**
     * Returns WeatherMapDTO by using of location
     *
     * @param location city {@link Location}
     * @return WeatherMapDTO by using of location
     */
    WeatherMapDTO getWeatherMap(Location location);
}
