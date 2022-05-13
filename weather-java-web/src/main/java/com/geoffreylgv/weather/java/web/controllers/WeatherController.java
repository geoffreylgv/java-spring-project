package com.geoffreylgv.weather.java.web.controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

import com.geoffreylgv.weather.java.web.model.*;
import com.geoffreylgv.weather.java.web.services.JsonConvertion;
import com.github.openjson.JSONArray;
import com.github.openjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import static org.springframework.http.HttpStatus.OK;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/weather")
public class WeatherController {

    @Autowired
    private JsonConvertion jsonConvertion;
    @GetMapping(path = "/current")
    @CrossOrigin(origins = "http://localhost:8080")
    public WeatherResponse current(@RequestParam String city) throws IOException {
        String content = "";
        String API_KEY = "";

        String url = "http://api.openweathermap.org/data/2.5/weather?q="+city+"&appid="+API_KEY;
        URL obj = new URL(url);

        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }


        in.close();
        content = response.toString();


        JSONObject jo = new JSONObject(content);
        //main
        JSONObject main = jo.getJSONObject("main");
        //system
        JSONObject sys = jo.getJSONObject("sys");
        //weather
        JSONArray jr = jo.getJSONArray("weather");
        JSONObject we = jr.getJSONObject(0);
        //wind
        JSONObject wind = jo.getJSONObject("wind");

        //creating object
        WeatherResponse wr = new WeatherResponse();
        Weather wa = new Weather();
        Wind wi = new Wind();
        Sys sy = new Sys();

        sy.setId(1l);
        sy.setCountry(sys.optString("country"));
        sy.setSunset(sys.optLong("sunset"));
        sy.setSunrise(sys.optLong("sunrise"));

        wi.setDeg(wind.optLong("deg"));
        wi.setSpeed(wind.optLong("speed"));

        wa.setId(we.optLong("id"));
        wa.setMain(we.optString("main"));
        wa.setDescription(we.optString("description"));
        wa.setIcon(we.optString("icon"));

        //set and return object wr : weatherResponse
        wr.setWeather(wa);
        wr.setWind(wi);
        wr.setSys(sy);
        wr.setId(1l);
        wr.setCod(jo.optLong("cod"));
        wr.setName(jo.optString("name"));
        wr.setTimezone(jo.optLong("timezone"));

        return wr;
    }
}
