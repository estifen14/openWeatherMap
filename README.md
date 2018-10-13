# openWeatherMap
REST for openweathermap API

***************************************************
#For Database use mysql and follow step below
***************************************************
1. in mysql database create database named "weathermap"
2. change username and password in application.properties
3. copy script below and run in weathermap database:

create table weather_log(
    id int auto_increment primary key
    ,response_id int
    ,location varchar(50)
    ,actual_weather varchar(100)
    ,temperature varchar(50)
    ,datetime_inserted date
);