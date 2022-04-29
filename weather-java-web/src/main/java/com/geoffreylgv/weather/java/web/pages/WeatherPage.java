/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geoffreylgv.weather.java.web.pages;

import com.geoffreylgv.weather.java.web.base.BasePage;
import com.geoffreylgv.weather.java.web.model.WeatherResponse;
import com.geoffreylgv.weather.java.web.services.WeatherResponseHttpClient;
import com.giffing.wicket.spring.boot.context.scan.WicketHomePage;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;

/**
 *
 * @author geoffreylgv
 */
@WicketHomePage
public class WeatherPage extends BasePage {

    private WeatherResponse weatherResponse;
    private WeatherResponseHttpClient wrhc;
    private WebMarkupContainer container;
    private FeedbackPanel feedback;

    public WeatherPage() {
        this.weatherResponse = new WeatherResponse();
        addComponent();
    }

    private void addComponent() {
        container = new WebMarkupContainer("container");
        feedback = new FeedbackPanel("feedback");
        container.setOutputMarkupId(true);
        feedback.setOutputMarkupId(true);

        Form form = new Form("searchForm", new CompoundPropertyModel(this));
        form.add(feedback);

    }

}
