package org.practice.controller;

import org.practice.enumeration.Location;
import org.practice.model.rest.dto.WeatherMapDTO;
import org.practice.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by estifen on 10/12/2018.
 */

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private WeatherService weatherService;

    @RequestMapping(method = RequestMethod.GET)
    public String getWeather(Model model){
        List<WeatherMapDTO> weatherMapDTOs = new ArrayList<WeatherMapDTO>();
        weatherMapDTOs.add(weatherService.getWeatherMap(Location.LONDON));
        weatherMapDTOs.add(weatherService.getWeatherMap(Location.SAN_FRANCISCO));
        weatherMapDTOs.add(weatherService.getWeatherMap(Location.PRAGUE));
        model.addAttribute("weatherMaps", weatherMapDTOs);
        return "home";
    }
}
