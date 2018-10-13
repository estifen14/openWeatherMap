package org.practice.service.impl;

import org.practice.enumeration.Location;
import org.practice.model.rest.WeatherLog;
import org.practice.model.rest.common.Weather;
import org.practice.model.rest.dto.WeatherMapDTO;
import org.practice.repository.WeatherLogRepository;
import org.practice.service.WeatherService;
import org.practice.util.MessageConverterUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by estifen on 10/12/2018.
 */
@Service
public class WeatherServiceImpl implements WeatherService{

    @Autowired
    private WeatherLogRepository weatherLogRepository;

    @Override
    public WeatherMapDTO getWeatherMap(Location location) {
        RestTemplate rest = new RestTemplate();

        MessageConverterUtil.setMessageConverter(rest);
        Map<String, Location> map = new HashMap<String, Location>();
        map.put("location", location);

        ResponseEntity<WeatherMapDTO> responseEntity = rest.exchange(
                "http://api.openweathermap.org/data/2.5/weather?q={location}&appid=9364fc1efcffc4a9c8c7e0625ed567dd"
                , HttpMethod.GET
                ,null
                ,WeatherMapDTO.class
                ,map
        );
        WeatherMapDTO weatherMapDTO = responseEntity.getBody();
        saveWeatherLog(weatherMapDTO);

        return weatherMapDTO;
    }

    private void saveWeatherLog(WeatherMapDTO weatherMapDTO){
        WeatherLog weatherLog = buildWeatherLog(weatherMapDTO);

        weatherLogRepository.save(weatherLog);
    }

    private WeatherLog buildWeatherLog(WeatherMapDTO weatherMapDTO){
        WeatherLog weatherLog = new WeatherLog();
        Weather weather = weatherMapDTO.getWeatherList().get(0);
        weatherLog.setLocation(weatherMapDTO.getName());
        weatherLog.setResponseId(weatherMapDTO.getId());
        weatherLog.setActualWeather(weather.getDescription());
        weatherLog.getTemperature();
        weatherLog.setDtimeInserted(new Date());

        return weatherLog;
    }
}
