/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geoffreylgv.weather.java.web.services;

import com.geoffreylgv.weather.java.web.model.WeatherResponse;
import java.util.LinkedList;
import java.util.List;
import lombok.SneakyThrows;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
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

    private String API_URL = "https://api.openweathermap.org/data/2.5/weather?q=";
    private String API_KEY = "";

    //media data head type
    private void mediaDataHead(HttpRequestBase httpRequestBase) {
        httpRequestBase.setHeader("Accept", "application/json");
        httpRequestBase.setHeader("Content-type", "application/json;charset=UTF-8");
    }

    //api full url
    private String getFullUrl(String uri) {
        String url = API_URL + uri + "&appid=" + API_KEY;
        return url;
    }

    //get weather data response (all data)
    @SneakyThrows
    public List<WeatherResponse> getWeatherResponseByCity(String city) {
        List<WeatherResponse> weList = new LinkedList<>();

        HttpGet httpGet = new HttpGet(getFullUrl(city));

        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = httpClient.execute(httpGet);
        if (response.getStatusLine().getStatusCode() == 200) {

        }
        return weList;
    }
}
