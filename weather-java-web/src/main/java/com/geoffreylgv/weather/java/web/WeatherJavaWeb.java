/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geoffreylgv.weather.java.web;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 *
 * @author geoffreylgv
 */
@SpringBootApplication
@EnableAsync
public class WeatherJavaWeb extends SpringBootServletInitializer {

    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder()
                .sources(WeatherJavaWeb.class)
                .run(args);

    }
}
