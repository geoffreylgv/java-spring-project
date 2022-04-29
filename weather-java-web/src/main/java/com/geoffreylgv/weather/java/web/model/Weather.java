/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geoffreylgv.weather.java.web.model;

import java.io.Serializable;
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
public class Weather implements Serializable {

    private Long id;
    private String main;
    private String description;
    private String icon;
}
