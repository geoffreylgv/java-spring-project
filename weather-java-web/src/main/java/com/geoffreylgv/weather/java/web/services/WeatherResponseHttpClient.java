/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geoffreylgv.weather.java.web.services;

import com.geoffreylgv.weather.java.web.model.Main;
import com.geoffreylgv.weather.java.web.model.Sys;
import com.geoffreylgv.weather.java.web.model.WeatherResponse;
import com.github.openjson.JSONObject;
import java.util.logging.Logger;
import lombok.SneakyThrows;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author geoffreylgv
 */
@Service
public class WeatherResponseHttpClient {

    @Autowired
    private JsonConvertion jsonConvertion;

    private static final Logger LOG = Logger.getLogger(WeatherResponseHttpClient.class.getName());

    private String API_URL = "https://api.openweathermap.org/data/2.5/weather?q=";
    private String API_KEY = "";

    //media data head type
    private void mediaDataHead(HttpRequestBase httpRequestBase) {
        httpRequestBase.setHeader("Accept", "application/json");
        httpRequestBase.setHeader("Content-type", "application/json;charset=UTF-8");
    }

    //api full url
    private String getFullUrl(String uri) {
        String url = API_URL + uri + "&units=metric&appid=" + API_KEY;
        return url;
    }

    //get weather data response (all data)
    @SneakyThrows
    public WeatherResponse getWeatherResponseByCity(String city) {
        WeatherResponse weatherResponse = new WeatherResponse();
        Main main = new Main();
        Sys sys = new Sys();

        HttpGet httpGet = new HttpGet(getFullUrl(city));

        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = httpClient.execute(httpGet);
        if (response.getStatusLine().getStatusCode() == 200) {
            HttpEntity entity = response.getEntity();
            JSONObject jsonObject = new JSONObject(EntityUtils.toString(entity));
            weatherResponse = jsonConvertion.jsonToWeatherResponse(jsonObject);
        }
        return weatherResponse;
    }
}
