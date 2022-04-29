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
public class Main {

    private Long temp;
    private Long feels_like;
    private Long temp_min;
    private Long temp_max;
    private Long pressure;
    private Long humidity;
}
