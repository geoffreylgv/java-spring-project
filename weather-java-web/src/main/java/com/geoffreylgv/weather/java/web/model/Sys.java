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
public class Sys {

    private Long id;
    private Long sunrise;
    private String country;
    private Long sunset;
}
