/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geoffreylgv.weather.java.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author geoffreylgv
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherResponse {

    private Long id;
    private Long cod;
    private String name;
    private Long timezone;
    /*private Long dt;
    private Long visibility;
    private String base;*/
    private Weather weather;
/*    private Coord coord;
    private Main main;*/
    private Wind wind;
    private Sys sys;
}
