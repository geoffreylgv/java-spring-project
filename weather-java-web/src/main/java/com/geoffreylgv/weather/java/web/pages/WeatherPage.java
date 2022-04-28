/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geoffreylgv.weather.java.web.pages;

import com.geoffreylgv.weather.java.web.base.BasePage;
import com.geoffreylgv.weather.java.web.services.WeatherResponseHttpClient;
import com.giffing.wicket.spring.boot.context.scan.WicketHomePage;
import org.apache.wicket.markup.html.WebMarkupContainer;

/**
 *
 * @author geoffreylgv
 */
@WicketHomePage
public class WeatherPage extends BasePage {

    private WeatherResponseHttpClient wrhc;
    private WebMarkupContainer container;

    public WeatherPage() {
        addComponent();
    }

    private void addComponent() {

    }

}
