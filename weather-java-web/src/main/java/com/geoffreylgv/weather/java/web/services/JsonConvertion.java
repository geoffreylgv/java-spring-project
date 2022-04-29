/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geoffreylgv.weather.java.web.services;

import com.geoffreylgv.weather.java.web.model.Coord;
import com.geoffreylgv.weather.java.web.model.Main;
import com.geoffreylgv.weather.java.web.model.Sys;
import com.geoffreylgv.weather.java.web.model.Weather;
import com.geoffreylgv.weather.java.web.model.WeatherResponse;
import com.geoffreylgv.weather.java.web.model.Wind;
import com.github.openjson.JSONObject;
import java.text.ParseException;
import org.springframework.stereotype.Service;

/**
 *
 * @author geoffreylgv
 */
@Service
public class JsonConvertion {

    public Coord jsonToCoord(JSONObject jsonObject) throws ParseException {

        Coord c = new Coord();
        c.setLat(jsonObject.optLong("lat"));
        c.setLon(jsonObject.optLong("lon"));
        return c;
    }

    public Main jsonToMain(JSONObject jsonObject) throws ParseException {

        Main m = new Main();
        m.setFeels_like(jsonObject.optLong("feels_like"));
        m.setHumidity(jsonObject.optLong("humidity"));
        m.setPressure(jsonObject.optLong("pressure"));
        m.setTemp(jsonObject.optLong("temp"));
        m.setTemp_min(jsonObject.optLong("temp_min"));
        m.setTemp_min(jsonObject.optLong("temp_min"));
        return m;
    }

    public Sys jsonToSys(JSONObject jsonObject) {

        Sys s = new Sys();
        s.setId(jsonObject.optLong("id"));
        s.setCountry(jsonObject.optString("country"));
        s.setMessage(jsonObject.optLong("message"));
        s.setSunset(jsonObject.optLong("sunset"));
        s.setType(jsonObject.optLong("type"));
        return s;
    }

    public Weather jsonToWeather(JSONObject jsonObject) throws ParseException {

        Weather w = new Weather();
        w.setId(jsonObject.optLong("id"));
        w.setMain(jsonObject.optString("main"));
        w.setDescription(jsonObject.optString("description"));
        w.setIcon(jsonObject.optString("icon"));
        return w;
    }

    public Wind jsonToWind(JSONObject jsonObject) throws ParseException {

        Wind wi = new Wind();
        wi.setDeg(jsonObject.optLong("deg"));
        wi.setSpeed(jsonObject.optLong("speed"));
        return wi;
    }

    public WeatherResponse jsonToWeatherResponse(JSONObject jsonObject) throws ParseException {

        WeatherResponse wr = new WeatherResponse();
        wr.setId(jsonObject.optLong("id"));
        wr.setCod(jsonObject.optLong("cod"));
        wr.setName(jsonObject.optString("name"));
        wr.setTimezone(jsonObject.optLong("timezone"));
        wr.setDt(jsonObject.optLong("dt"));
        wr.setVisibility(jsonObject.optLong("visibility"));
        wr.setBase(jsonObject.optString("base"));
        wr.setWeather(jsonToWeather(jsonObject.getJSONObject("weather")));
        wr.setCoord(jsonToCoord(jsonObject.getJSONObject("coord")));
        wr.setMain(jsonToMain(jsonObject.getJSONObject("main")));
        wr.setWind(jsonToWind(jsonObject.getJSONObject("wind")));
        wr.setSys(jsonToSys(jsonObject.getJSONObject("sys")));
        return wr;

    }
}
